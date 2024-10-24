package BO;

import Entidades.CentroLaboratorio;
import Interfaces.ICentroLaboratorioDAO;
import Interfaces.ILaboratorioBO;
import Persistencias.PersistenciaException;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class LaboratorioBO implements ILaboratorioBO {

    private final ICentroLaboratorioDAO centroLaboratorioDAO;

    public LaboratorioBO(ICentroLaboratorioDAO centroLaboratorioDAO) {
        this.centroLaboratorioDAO = centroLaboratorioDAO;
    }

    @Override
    public List<CentroLaboratorio> obtenerCentros() throws BOException {
        try {
            return centroLaboratorioDAO.obtenerCentros(null); // Puedes agregar lógica de filtro
        } catch (PersistenciaException e) {
            throw new BOException("Error al obtener centros de laboratorio", e);
        }
    }

    @Override
    public List<CentroLaboratorio> buscarPorNombre(String nombre) throws BOException {
        try {
            return centroLaboratorioDAO.buscarporNombre(nombre, null);
        } catch (PersistenciaException e) {
            throw new BOException("Error al buscar centros de laboratorio por nombre", e);
        }
    }

    @Override
    public CentroLaboratorio consultar(Long id) throws BOException {
        try {
            return centroLaboratorioDAO.consultar(id);
        } catch (PersistenciaException e) {
            throw new BOException("Error al consultar centro de laboratorio con ID: " + id, e);
        }
    }

    @Override
    public void guardar(CentroLaboratorio cl) throws BOException {
        try {
            reglasNegocio(cl);  // Aplica reglas de negocio antes de guardar
            centroLaboratorioDAO.guardar(cl);
        } catch (PersistenciaException e) {
            throw new BOException("Error al guardar centro de laboratorio", e);
        }
    }

    @Override
    public void editar(Long id, CentroLaboratorio cl) throws BOException {
        try {
            centroLaboratorioDAO.editar(id, cl);
        } catch (PersistenciaException e) {
            throw new BOException("Error al editar centro de laboratorio", e);
        }
    }

    @Override
    public void eliminar(Long id) throws BOException {
        try {
            centroLaboratorioDAO.eliminar(id);
        } catch (PersistenciaException e) {
            throw new BOException("Error al eliminar centro de laboratorio", e);
        }
    }

    @Override
    public void reglasNegocio(CentroLaboratorio cl) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarEstudiante(CentroLaboratorio cl) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
