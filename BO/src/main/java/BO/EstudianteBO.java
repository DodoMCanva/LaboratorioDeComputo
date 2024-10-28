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

/**
 * Clase que implementa la lógica de negocio para manejar operaciones
 * relacionadas con estudiantes.
 * 
 * Equipo 3
 */
public class EstudianteBO implements IEstudianteBO {

    // Inicializa la instancia del DAO para manejar operaciones de base de datos relacionadas con estudiantes
    static IEstudianteDAO est = new EstudianteDAO();

    // Consultas
    @Override
    public List<EstudianteDTO> obtenerEstudiantes(Tabla Filtro) {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>(); // Lista para almacenar los DTO de estudiantes
        List<Estudiante> estudiantes = null; // Lista para almacenar las entidades de estudiantes
        try {
            // Obtiene la lista de estudiantes desde el DAO
            estudiantes = est.obtenerEstudiantes(Filtro);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convierte cada entidad de estudiante a DTO y lo añade a la lista
        for (Estudiante estudiante : estudiantes) {
            estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
        }
        return estudiantesDTO; // Devuelve la lista de DTOs
    }

    @Override
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla Filtro) {
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>(); // Lista para almacenar los DTO de estudiantes
        List<Estudiante> estudiantes = null; // Lista para almacenar las entidades de estudiantes
        try {
            // Busca estudiantes por nombre en el DAO
            estudiantes = est.buscarporNombre(nombre, Filtro);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convierte las entidades a DTO solo si la lista no es nula
        if (estudiantes != null) {
            for (Estudiante estudiante : estudiantes) {
                estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
            }
        }
        return estudiantesDTO; // Devuelve la lista de DTOs
    }

    @Override
    public EstudianteDTO consultar(Long id) {
        Estudiante estudiante = null; // Inicializa la entidad de estudiante
        try {
            // Consulta un estudiante por su ID en el DAO
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Convierte y devuelve el DTO si la entidad no es nula
        if (estudiante != null) {
            return convertirAEstudianteDTO(estudiante);
        } else {
            return null; // Devuelve null si el estudiante no fue encontrado
        }
    }

    // Modificaciones
    @Override
    public void guardar(EstudianteDTO estudiante) {
        // Convierte el DTO a la entidad correspondiente
        Estudiante estent = convertirAEstudiante(estudiante);
        try {
            // Guarda el estudiante en el DAO
            est.guardar(estent);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Long id, EstudianteDTO e) {
        // Convierte el DTO a la entidad
        Estudiante estudiante = convertirAEstudiante(e);
        estudiante.setId(id); // Establece el ID en la entidad
        try {
            // Llama al método editar del DAO
            est.editar(estudiante.getId(), estudiante);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Long id) {
        Estudiante estudiante = null; // Inicializa la entidad de estudiante
        try {
            // Consulta el estudiante a eliminar por su ID en el DAO
            estudiante = est.consultar(id);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Marca el estudiante como egresado y lo elimina si existe
        if (estudiante != null) {
            estudiante.setEstaEgresado(true);
            try {
                est.eliminar(estudiante.getId()); // Elimina el estudiante en el DAO
            } catch (PersistenciaException ex) {
                // Registra cualquier excepción que ocurra durante la persistencia
                Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean autenticarEstudiante(Long id) {
        try {
            // Consulta el estudiante por su ID en el DAO
            Estudiante estudiante = est.consultar(id);
            return estudiante != null; // Devuelve true si el estudiante existe
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la autenticación
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, "Error al autenticar estudiante", ex);
            return false; // Devuelve false en caso de error
        }

    }

    private EstudianteDTO convertirAEstudianteDTO(Estudiante estudiante) {
        EstudianteDTO dto = new EstudianteDTO(); // Crea un nuevo DTO de estudiante
        dto.setEstudiante_ID(estudiante.getId()); // Establece el ID del estudiante
        System.out.println(estudiante.getCarrera().getId()); // Imprime el ID de la carrera (para depuración)
        dto.setCarrera(convertirCarreraDTO(estudiante.getCarrera())); // Convierte y establece la carrera en el DTO
        dto.setNombre(estudiante.getNombreCompleto().getNombre()); // Establece el nombre
        dto.setApellidoPaterno(estudiante.getNombreCompleto().getApellidoPaterno()); // Establece el apellido paterno
        dto.setApellidoMaterno(estudiante.getNombreCompleto().getApellidoMaterno()); // Establece el apellido materno
        dto.setContraseña(estudiante.getContraseña()); // Establece la contraseña
        dto.setEstaEgresado(estudiante.isEstaEgresado()); // Establece el estado de egresado
        return dto; // Devuelve el DTO
    }

    private Estudiante convertirAEstudiante(EstudianteDTO dto) {
        Estudiante estudiante = new Estudiante(); // Crea una nueva entidad de estudiante
        estudiante.setId(dto.getEstudiante_ID()); // Establece el ID
        NombreCompleto nombreCompleto = new NombreCompleto(); // Crea una nueva entidad para el nombre completo
        nombreCompleto.setNombre(dto.getNombre()); // Establece el nombre
        nombreCompleto.setApellidoPaterno(dto.getApellidoPaterno()); // Establece el apellido paterno
        nombreCompleto.setApellidoMaterno(dto.getApellidoMaterno()); // Establece el apellido materno
        estudiante.setNombreCompleto(nombreCompleto); // Establece el nombre completo en la entidad
        estudiante.setContraseña(dto.getContraseña()); // Establece la contraseña
        estudiante.setEstaEgresado(dto.isEstaEgresado()); // Establece el estado de egresado
        estudiante.setCarrera(convertirCarrera(dto.getCarrera())); // Convierte y establece la carrera en la entidad
        return estudiante; // Devuelve la entidad
    }

    public Carrera convertirCarrera(CarreraDTO carreraDTO) {
        Carrera carrera = new Carrera(); // Crea una nueva entidad de carrera
        carrera.setId(carreraDTO.getCarrera_ID()); // Establece el ID de la carrera
        carrera.setNombre(carreraDTO.getNombre()); // Establece el nombre de la carrera
        carrera.setTiempo(carreraDTO.getTiempo()); // Establece el tiempo de la carrera
        return carrera; // Devuelve la entidad de carrera
    }

    public CarreraDTO convertirCarreraDTO(Carrera carrera) {
        CarreraDTO carreradto = new CarreraDTO(); // Crea un nuevo DTO de carrera
        carreradto.setCarrera_ID(carrera.getId()); // Establece el ID de la carrera
        carreradto.setNombre(carrera.getNombre()); // Establece el nombre de la carrera
        carreradto.setTiempo(carrera.getTiempo()); // Establece el tiempo de la carrera
        return carreradto; // Devuelve el DTO de carrera
    }
}
