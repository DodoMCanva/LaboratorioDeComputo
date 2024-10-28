package Interfaces;

import Entidades.CentroLaboratorio;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

/**
 * Interfaz DAO para CentroLaboratorio.
 *
 * @autor Equipo 3
 */
public interface ICentroLaboratorioDAO {

    // Consultas
    List<CentroLaboratorio> obtenerCentros(Tabla filtro) throws PersistenciaException;

   public List<CentroLaboratorio> buscarporNombre(String Nombre, Tabla filtro) throws PersistenciaException;

    CentroLaboratorio consultar(Long id) throws PersistenciaException;

    // Modificaciones
    void guardar(CentroLaboratorio cl) throws PersistenciaException;

    void editar(Long id, CentroLaboratorio cl) throws PersistenciaException;

    void eliminar(Long id) throws PersistenciaException;

}
