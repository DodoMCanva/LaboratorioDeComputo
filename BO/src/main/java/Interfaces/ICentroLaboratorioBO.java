package Interfaces;

import BO.BOException;
import DTOLabComputo.centroLabDTO;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public interface ICentroLaboratorioBO {
    //Consultas
    public List<centroLabDTO> obtenerLaboratoriosTabla(Tabla Filtro) throws BOException;
    
    public List<centroLabDTO> obtenerLaboratorio() throws BOException;
    
    public List<centroLabDTO> buscarporCampus(String Campus, Tabla Filtro) throws BOException;
    
    public centroLabDTO consultar(Long id) throws BOException;
    
    //Modificaciones
    public void guardar(centroLabDTO cl) throws BOException;
    
    public void editar(Long id, centroLabDTO cl) throws BOException;
    
    public void eliminar(Long id) throws BOException;
    
    //verificadores
    public void reglasNegocio(centroLabDTO cl) throws BOException;
    
}
