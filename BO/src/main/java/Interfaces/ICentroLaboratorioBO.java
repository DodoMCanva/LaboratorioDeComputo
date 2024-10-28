package Interfaces;

import BO.BOException;
import DTOLabComputo.centroLabDTO;
import java.util.List;
import utilerias.Tabla;

/**
 * Interfaz ICentroLaboratorioBO que define los métodos relacionados con la lógica de negocio para la entidad CentroLaboratorio.
 * Proporciona métodos para realizar consultas, modificaciones y verificar reglas de negocio.
 * 
 * @author Equipo 3
 */
public interface ICentroLaboratorioBO {
    
    // Consultas
    
    /**
     * Obtiene una lista de laboratorios en forma de tabla, aplicando los filtros especificados.
     * 
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos centroLabDTO que representan los laboratorios.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<centroLabDTO> obtenerLaboratoriosTabla(Tabla Filtro) throws BOException;
    
    /**
     * Obtiene todos los laboratorios.
     * 
     * @return Una lista de objetos centroLabDTO que representan todos los laboratorios.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<centroLabDTO> obtenerLaboratorio() throws BOException;
    
    /**
     * Busca laboratorios por su nombre aplicando filtros específicos.
     * 
     * @param Nombre El nombre del laboratorio a buscar.
     * @param Filtro Objeto de tipo Tabla que contiene los criterios de filtro.
     * @return Una lista de objetos centroLabDTO que coinciden con el nombre especificado.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public List<centroLabDTO> buscarporNombre(String Nombre, Tabla Filtro) throws BOException;
    
    /**
     * Consulta un laboratorio por su ID.
     * 
     * @param id El ID del laboratorio a consultar.
     * @return Un objeto centroLabDTO que representa el laboratorio consultado.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public centroLabDTO consultar(Long id) throws BOException;
    
    // Modificaciones
    
    /**
     * Guarda un nuevo laboratorio.
     * 
     * @param cl Objeto centroLabDTO que contiene la información del laboratorio a guardar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void guardar(centroLabDTO cl) throws BOException;
    
    /**
     * Edita la información de un laboratorio existente.
     * 
     * @param id El ID del laboratorio a editar.
     * @param cl Objeto centroLabDTO que contiene la nueva información del laboratorio.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void editar(Long id, centroLabDTO cl) throws BOException;
    
    /**
     * Elimina un laboratorio por su ID.
     * 
     * @param id El ID del laboratorio a eliminar.
     * @throws BOException Si ocurre un error durante la operación.
     */
    public void eliminar(Long id) throws BOException;
    
    // Verificadores
    
    /**
     * Verifica las reglas de negocio relacionadas con el laboratorio.
     * 
     * @param cl Objeto centroLabDTO que se va a validar.
     * @throws BOException Si ocurre un error durante la validación de las reglas de negocio.
     */
    public void reglasNegocio(centroLabDTO cl) throws BOException;
}

