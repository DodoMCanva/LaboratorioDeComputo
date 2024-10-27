package Interfaces;

import DTOLabComputo.centroLabDTO;
import Entidades.CentroLaboratorio;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public interface ICentroLaboratorioDAO {
    
    //Consultas
    public List<CentroLaboratorio> obtenerCentros(Tabla Filtro) throws PersistenciaException;

    public List<CentroLaboratorio> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException;

    public CentroLaboratorio consultar(Long id) throws PersistenciaException;
    
    //Modificaciones
    public void guardar(CentroLaboratorio cl) throws PersistenciaException;

    public void editar(Long id, CentroLaboratorio cl) throws PersistenciaException;

    public void eliminar(Long id) throws PersistenciaException;

    //verificadores
    public void reglasNegocio(CentroLaboratorio cl) throws PersistenciaException;

    public void autenticarEstudiante(CentroLaboratorio cl) throws PersistenciaException;
}
