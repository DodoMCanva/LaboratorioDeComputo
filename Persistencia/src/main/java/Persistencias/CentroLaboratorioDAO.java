package Persistencias;

import DTOLabComputo.centroLabDTO;
import Entidades.CentroLaboratorio;
import Entidades.Computadora;
import Interfaces.ICentroLaboratorioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import utilerias.Tabla;

/**
 * Implementación de ICentroLaboratorioDAO para gestionar operaciones de CentroLaboratorio en la base de datos.
 * @author Equipo 3
 */
public class CentroLaboratorioDAO implements ICentroLaboratorioDAO {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    @Override
    public List<CentroLaboratorio> obtenerCentros(Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT cl FROM CentroLaboratorio cl WHERE cl.estEliminado = false";
            TypedQuery<CentroLaboratorio> query = em.createQuery(jpql, CentroLaboratorio.class);
            query.setMaxResults(filtro.getLimite());
            query.setFirstResult(filtro.getPagina() * filtro.getLimite());
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException("Error al obtener centros de laboratorio", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public CentroLaboratorio consultar(Long id) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            CentroLaboratorio centroLaboratorio = em.find(CentroLaboratorio.class, id);
            if (centroLaboratorio == null) {
                throw new PersistenciaException("No se encontró el centro de laboratorio con ID: " + id);
            }
            return centroLaboratorio;
        } catch (PersistenciaException e) {
            throw new PersistenciaException("Error al consultar centro de laboratorio con ID: " + id, e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Modificaciones
    @Override
    public void guardar(CentroLaboratorio cl) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cl);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public void editar(Long id, CentroLaboratorio cl) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            CentroLaboratorio existente = consultar(id);
            if (existente != null) {
                existente.setNombre(cl.getNombre());
                existente.setHoraInicio(cl.getHoraInicio());
                existente.setHoraFin(cl.getHoraFin());
                existente.setCampus(cl.getCampus());
                em.merge(existente);
            } else {
                throw new PersistenciaException("No se encontró el centro de laboratorio con el ID: " + id);
            }
            em.getTransaction().commit();
        } catch (PersistenciaException e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al editar centro de laboratorio", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void eliminar(Long id) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            CentroLaboratorio cl = em.find(CentroLaboratorio.class, id);
            if (cl != null) {
                cl.setEstEliminado(true);
                em.merge(cl);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al eliminar centro de laboratorio con ID: " + id, e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    @Override
    public List<CentroLaboratorio> buscarporNombre(String nombre, Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT cl FROM CentroLaboratorio cl WHERE cl.nombre LIKE :nombre AND cl.estEliminado = false";
            TypedQuery<CentroLaboratorio> query = em.createQuery(jpql, CentroLaboratorio.class);
            query.setParameter("nombre", "%" + nombre + "%");
            query.setMaxResults(filtro.getLimite());
            query.setFirstResult(filtro.getPagina() * filtro.getLimite());
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar centros de laboratorio por nombre", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Convierte un centroLabDTO a una entidad CentroLaboratorio.
     * @param dto DTO de centro de laboratorio a convertir
     * @return CentroLaboratorio convertida
     */
    public CentroLaboratorio convertirDTOaEntidad(centroLabDTO dto) {
        CentroLaboratorio ent = new CentroLaboratorio();
        List<Computadora> computadoras = new ArrayList<>();
        ent.setCampus(dto.getCampus());
        ent.setNombre(dto.getNombre());
        ent.setEstEliminado(false);
        ent.setHoraInicio(dto.getHoraInicio());
        ent.setHoraFin(dto.getHoraFin());
        ent.setComputadoras(computadoras);
        return ent;
    }
}
