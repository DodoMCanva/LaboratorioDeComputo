package Persistencias;

import Entidades.CentroLaboratorio;
import Interfaces.ICentroLaboratorioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public class CentroLaboratorioDAO implements ICentroLaboratorioDAO {

    @PersistenceContext
    private EntityManager em;

    //Consultas
    @Override
    public List<CentroLaboratorio> obtenerCentros(Tabla Filtro) throws PersistenciaException {
        try {
            String jpql = "SELECT cl FROM CentroLab cl WHERE cl.estEliminado = false";
            TypedQuery<CentroLaboratorio> query = em.createQuery(jpql, CentroLaboratorio.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener centros de laboratorio", e);
        }
    }

    @Override
    public List<CentroLaboratorio> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException {
        try {
            String jpql = "SELECT cl FROM CentroLaboratorio cl WHERE cl.nombre LIKE :nombre AND cl.estEliminado = false";
            TypedQuery<CentroLaboratorio> query = em.createQuery(jpql, CentroLaboratorio.class);
            query.setParameter("nombre", "%" + nombre + "%");  // Busca por coincidencias parciales
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar centros de laboratorio por nombre", e);
        }
    }

    @Override
    public CentroLaboratorio consultar(Long id) throws PersistenciaException {
        try {
            return em.find(CentroLaboratorio.class, id);
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar centro de laboratorio con ID: " + id, e);
        }
    }

    //Modificaciones
    @Override
    public void guardar(CentroLaboratorio cl) throws PersistenciaException {
        try {
            if (cl.getId() == null) {
                em.persist(cl);
            } else {
                em.merge(cl);
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar centro de laboratorio", e);
        }
    }

    @Override
    public void editar(Long id, CentroLaboratorio cl) throws PersistenciaException {
        try {
            CentroLaboratorio existente = consultar(id);
            if (existente != null) {
                existente.setHoraInicio(cl.getHoraInicio());
                existente.setHoraFin(cl.getHoraFin());
                existente.setCampus(cl.getCampus());
                em.merge(existente);
            } else {
                throw new PersistenciaException("No se encontró el centro de laboratorio con el ID: " + id);
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al editar centro de laboratorio", e);
        }
    }

    @Override
    public void eliminar(Long id) throws PersistenciaException {
        try {
            CentroLaboratorio cl = consultar(id);
            if (cl != null) {
                cl.setEstEliminado(true);
                em.merge(cl);
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al eliminar centro de laboratorio con ID: " + id, e);
        }
    }
    
    //Verificaciones
    @Override
    public void reglasNegocio(CentroLaboratorio cl) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarEstudiante(CentroLaboratorio cl) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
