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
    public List<EstudianteDTO> obtenerEstudiantes(Tabla Filtro) {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = est.obtenerEstudiantes(Filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Estudiante estudiante : estudiantes) {
            estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
        }
        return estudiantesDTO;
    }

    @Override
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla Filtro) {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = est.buscarporNombre(nombre, Filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (estudiantes != null) {
            for (Estudiante estudiante : estudiantes) {
                estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
            }
        }
        return estudiantesDTO;
    }

    @Override
    public EstudianteDTO consultar(Long id) {
        Estudiante estudiante = null;
        try {
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (estudiante != null) {
            return convertirAEstudianteDTO(estudiante);
        } else {
            return null;
        }
    }

    // Modificaciones
    @Override
    public void guardar(EstudianteDTO estudiante) {
        Estudiante estent = convertirAEstudiante(estudiante);
        try {
            est.guardar(estent);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Long id, EstudianteDTO e) {
        Estudiante estudiante = convertirAEstudiante(e);
        estudiante.setId(id);
        try {
            est.editar(estudiante.getId(), estudiante);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Long id) {
        Estudiante estudiante = null;
        try {
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (estudiante != null) {
            estudiante.setEstaEgresado(true);
            try {
                est.eliminar(estudiante.getId());
            } catch (PersistenciaException ex) {
                Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Verificaciones
    @Override
    public void reglasNegocio(EstudianteDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarCliente(EstudianteDTO estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        EstudianteDTO dto = new EstudianteDTO();
        dto.setEstudiante_ID(estudiante.getId());
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
}