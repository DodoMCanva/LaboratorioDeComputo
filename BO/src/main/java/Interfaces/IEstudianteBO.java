package Interfaces;
import BO.BOException;
import DTOLabComputo.EstudianteDTO;
import java.util.List;
import utilerias.Tabla;

/**
 * Interfaz IEstudianteBO que define los métodos relacionados con la lógica de negocio para la entidad Estudiante.
 * Proporciona métodos para realizar consultas y modificaciones sobre los estudiantes.
 */
public interface IEstudianteBO {

    // Consultas

    /**
     * Obtiene una lista de estudiantes aplicando los filtros especificados.
     * 
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos EstudianteDTO que representan los estudiantes.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<EstudianteDTO> obtenerEstudiantes(Tabla Filtro) throws BOException;

    /**
     * Busca estudiantes por su nombre aplicando filtros específicos.
     * 
     * @param nombre El nombre del estudiante a buscar.
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos EstudianteDTO que coinciden con el nombre especificado.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException;

    /**
     * Consulta un estudiante por su ID.
     * 
     * @param id El ID del estudiante a consultar.
     * @return Un objeto EstudianteDTO que representa el estudiante consultado.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public EstudianteDTO consultar(Long id) throws BOException;

    // Modificaciones

    /**
     * Guarda un nuevo estudiante.
     * 
     * @param estudiante Objeto EstudianteDTO que contiene la información del estudiante a guardar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void guardar(EstudianteDTO estudiante) throws BOException;

    /**
     * Edita la información de un estudiante existente.
     * 
     * @param id El ID del estudiante a editar.
     * @param e Objeto EstudianteDTO que contiene la nueva información del estudiante.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void editar(Long id, EstudianteDTO e) throws BOException;

    /**
     * Elimina un estudiante por su ID.
     * 
     * @param id El ID del estudiante a eliminar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void eliminar(Long id) throws BOException;

    /**
     * Autentica un estudiante por su ID.
     * 
     * @param id El ID del estudiante a autenticar.
     * @return true si el estudiante existe, false en caso contrario.
     * @throws BOException Si ocurre un error durante la operación.
     */
    boolean autenticarEstudiante(Long id) throws BOException;
}

