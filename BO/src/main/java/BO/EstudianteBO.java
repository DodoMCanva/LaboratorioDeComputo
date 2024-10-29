package BO;

import DTOLabComputo.CarreraDTO;
import DTOLabComputo.EstudianteDTO;
import Entidades.Carrera;
import Entidades.Estudiante;
import Entidades.NombreCompleto;
import Interfaces.IEstudianteBO;
import Interfaces.IEstudianteDAO;
import Persistencias.EstudianteDAO;
import Persistencias.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilerias.Tabla;

public class EstudianteBO implements IEstudianteBO {

    static IEstudianteDAO est = new EstudianteDAO();

    // Consultas
    @Override
    public List<EstudianteDTO> obtenerEstudiantes(Tabla filtro) throws BOException {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = est.obtenerEstudiantes(filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al obtener estudiantes", ex);
        }
        if (estudiantes != null) {
            for (Estudiante estudiante : estudiantes) {
                estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
            }
        }
        return estudiantesDTO;
    }

    @Override
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla filtro) throws BOException {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = est.buscarporNombre(nombre, filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al buscar estudiantes por nombre", ex);
        }
        if (estudiantes != null) {
            for (Estudiante estudiante : estudiantes) {
                estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
            }
        }
        return estudiantesDTO;
    }

    @Override
    public EstudianteDTO consultar(Long id) throws BOException {
        Estudiante estudiante = null;
        try {
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al consultar estudiante", ex);
        }
        return estudiante != null ? convertirAEstudianteDTO(estudiante) : null;
    }
    
    @Override
    public EstudianteDTO buscarEstudiantePorNombre(String nombre) {
    List<Estudiante> estudiantes = null;
    try {
        estudiantes = est.buscarporNombre(nombre, null);
    } catch (PersistenciaException e) {
        e.printStackTrace();
        return null; // Manejo de errores
    }

    if (estudiantes != null && !estudiantes.isEmpty()) {
        // Convertir la entidad a DTO y devolverlo
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        Estudiante estudiante = estudiantes.get(0); // Tomar el primer estudiante
        estudianteDTO.setEstudiante_ID(estudiante.getId());
        estudianteDTO.setNombre(estudiante.getNombreCompleto().getNombre());
        return estudianteDTO;
    }

    return null; // Si no se encuentra ningún estudiante
}

    // Modificaciones
    @Override
    public void guardar(EstudianteDTO estudiante) throws BOException {
        Estudiante estent = convertirAEstudiante(estudiante);
        try {
            est.guardar(estent);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al guardar el estudiante", ex);
        }
    }

    @Override
    public void editar(Long id, EstudianteDTO e) throws BOException {
        Estudiante estudiante = convertirAEstudiante(e);
        estudiante.setId(id);
        try {
            est.editar(estudiante.getId(), estudiante);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al editar el estudiante", ex);
        }
    }

    @Override
    public void eliminar(Long id) throws BOException {
        Estudiante estudiante = null;
        try {
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al consultar estudiante para eliminar", ex);
        }
        if (estudiante != null) {
            estudiante.setEstaEgresado(true);
            try {
                est.eliminar(estudiante.getId());
            } catch (PersistenciaException ex) {
                Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
                throw new BOException("Error al eliminar el estudiante", ex);
            }
        }
    }

    @Override
    public boolean autenticarEstudiante(Long id) {
        try {
            Estudiante estudiante = est.consultar(id);
            return estudiante != null;
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, "Error al autenticar estudiante", ex);
            return false;
        }
    }

    @Override
    public void reglasNegocio(EstudianteDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        EstudianteDTO dto = new EstudianteDTO();
        dto.setEstudiante_ID(estudiante.getId());
        System.out.println(estudiante.getCarrera().getId());
        dto.setCarrera(convertirCarreraDTO(estudiante.getCarrera()));
        dto.setNombre(estudiante.getNombreCompleto().getNombre());
        dto.setApellidoPaterno(estudiante.getNombreCompleto().getApellidoPaterno());
        dto.setApellidoMaterno(estudiante.getNombreCompleto().getApellidoMaterno());
        dto.setContraseña(estudiante.getContraseña());
        dto.setEstaEgresado(estudiante.isEstaEgresado());
        return dto;
    }

    private Estudiante convertirAEstudiante(EstudianteDTO dto) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(dto.getEstudiante_ID());
        NombreCompleto nombreCompleto = new NombreCompleto();
        nombreCompleto.setNombre(dto.getNombre());
        nombreCompleto.setApellidoPaterno(dto.getApellidoPaterno());
        nombreCompleto.setApellidoMaterno(dto.getApellidoMaterno());
        estudiante.setNombreCompleto(nombreCompleto);
        estudiante.setContraseña(dto.getContraseña());
        estudiante.setEstaEgresado(dto.isEstaEgresado());
        estudiante.setCarrera(convertirCarrera(dto.getCarrera()));
        return estudiante;
    }

    public Carrera convertirCarrera(CarreraDTO carreraDTO) {
        Carrera carrera = new Carrera();
        carrera.setId(carreraDTO.getCarrera_ID());
        carrera.setNombre(carreraDTO.getNombre());
        carrera.setTiempo(carreraDTO.getTiempo());

        return carrera;
    }

    public CarreraDTO convertirCarreraDTO(Carrera carrera) {
        CarreraDTO carreradto = new CarreraDTO();
        carreradto.setCarrera_ID(carrera.getId());
        carreradto.setNombre(carrera.getNombre());
        carreradto.setTiempo(carrera.getTiempo());

        return carreradto;
    }
}
