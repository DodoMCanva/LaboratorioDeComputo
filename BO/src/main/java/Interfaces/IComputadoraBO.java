package Interfaces;

import BO.BOException;
import DTOLabComputo.computadoraDTO;
import java.util.List;
import utilerias.Tabla;

/**
 * Interfaz IComputadoraBO que define los métodos relacionados con la lógica de negocio para la entidad Computadora.
 * Proporciona métodos para realizar consultas y modificaciones sobre las computadoras.
 * 
 * @author Equipo 3
 */
public interface IComputadoraBO {

    // Consultas
    
    /**
     * Obtiene una lista de computadoras en forma de tabla, aplicando los filtros especificados y un ID de laboratorio.
     * 
     * @param id El ID del laboratorio del cual se obtienen las computadoras.
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos computadoraDTO que representan las computadoras.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<computadoraDTO> obtenerComputadorasTabla(Long id, Tabla Filtro) throws BOException;

    /**
     * Obtiene una lista de computadoras en forma de tabla seleccionadas, aplicando los filtros especificados y un ID de laboratorio.
     * 
     * @param id El ID del laboratorio del cual se obtienen las computadoras seleccionadas.
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos computadoraDTO que representan las computadoras seleccionadas.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<computadoraDTO> obtenerComputadorasTablaSeleccion(Long id, Tabla Filtro) throws BOException;

    /**
     * Busca computadoras por su nombre aplicando filtros específicos.
     * 
     * @param nombre El nombre de la computadora a buscar.
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos computadoraDTO que coinciden con el nombre especificado.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<computadoraDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException;

    /**
     * Consulta una computadora por su ID.
     * 
     * @param id El ID de la computadora a consultar.
     * @return Un objeto computadoraDTO que representa la computadora consultada.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public computadoraDTO consultar(Long id) throws BOException;

    // Modificaciones
    
    /**
     * Guarda una nueva computadora asociada a un laboratorio específico.
     * 
     * @param idcl El ID del laboratorio al que se asociará la nueva computadora.
     * @param Computadora Objeto computadoraDTO que contiene la información de la computadora a guardar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void guardar(Long idcl, computadoraDTO Computadora) throws BOException;

    /**
     * Edita la información de una computadora existente.
     * 
     * @param id El ID de la computadora a editar.
     * @param e Objeto computadoraDTO que contiene la nueva información de la computadora.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void editar(Long id, computadoraDTO e) throws BOException;

    /**
     * Elimina una computadora por su ID.
     * 
     * @param id El ID de la computadora a eliminar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void eliminar(Long id) throws BOException;
}
