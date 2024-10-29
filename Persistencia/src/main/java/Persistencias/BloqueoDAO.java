package Persistencias;

import Entidades.Bloqueo;
import Entidades.Estudiante;
import Interfaces.IBloqueoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import utilerias.Tabla;

/**
 *
 * @author Valeria
 */
public class BloqueoDAO implements IBloqueoDAO {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    @Override
    public List<Bloqueo> obtenerBloqueos(Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT bl FROM Bloqueo bl WHERE bl.estBloquedo = true";
            TypedQuery<Bloqueo> query = em.createQuery(jpql, Bloqueo.class);
            query.setMaxResults(filtro.getLimite());
            query.setFirstResult(filtro.getPagina() * filtro.getLimite());

            List<Bloqueo> resultados = query.getResultList();
            System.out.println("Número de bloqueos obtenidos: " + resultados.size()); // Depuración
            return resultados;
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener bloqueos", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public Bloqueo obtenerBloqueoPorEstudiante(Long idEstudiante) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            return em.find(Bloqueo.class, idEstudiante); // Suponiendo que el ID del bloqueo es el mismo que el ID del estudiante
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el bloqueo del estudiante", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void actualizarBloqueo(Bloqueo bloqueo) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.merge(bloqueo); // Actualiza el bloqueo existente
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al actualizar el bloqueo", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void desbloquearEstudiante(Long idEstudiante) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            Bloqueo bloqueo = em.find(Bloqueo.class, idEstudiante);
            if (bloqueo != null) {
                bloqueo.setEstBloquedo(true);
                em.merge(bloqueo);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al desbloquear estudiante", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Bloqueo> buscarBloqueosPorNombre(String nombre, Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT b FROM Bloqueo b JOIN b.estudiante e WHERE e.nombre LIKE :nombre AND b.estBloquedo = true";
            TypedQuery<Bloqueo> query = em.createQuery(jpql, Bloqueo.class);
            query.setParameter("nombre", "%" + nombre + "%"); // Usa LIKE para la búsqueda
            query.setMaxResults(filtro.getLimite());
            query.setFirstResult(filtro.getPagina() * filtro.getLimite());

            List<Bloqueo> resultados = query.getResultList();
            return resultados;
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener bloqueos por nombre de estudiante", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Bloqueo> obtenerBloqueos() {
        EntityManager em = emf.createEntityManager();
        try {
            String query = "SELECT b FROM Bloqueo b JOIN FETCH b.estudiante"; // Incluye la relación
            return em.createQuery(query, Bloqueo.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void guardarBloqueo(Bloqueo bloqueo) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            // Validaciones adicionales si son necesarias
            if (bloqueo == null || bloqueo.getEstudiante() == null) {
                throw new IllegalArgumentException("El bloqueo o el estudiante no pueden ser nulos.");
            }

            em.persist(bloqueo);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al guardar el bloqueo", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public String obtenerNombreEstudiantePorId(Long idEstudiante) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT e.nombre FROM Estudiante e WHERE e.id = :idEstudiante";
            TypedQuery<String> query = em.createQuery(jpql, String.class);
            query.setParameter("idEstudiante", idEstudiante);

            // Manejo de NoResultException
            return query.getSingleResult();
        } catch (NoResultException e) {
            throw new PersistenciaException("No se encontró el estudiante con ID: " + idEstudiante, e);
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el nombre del estudiante con ID: " + idEstudiante, e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public Bloqueo consultar(Long id) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            return em.find(Bloqueo.class, id);
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar el bloqueo con ID: " + id, e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void eliminarBloqueo(Long id) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            Bloqueo bloqueo = em.find(Bloqueo.class, id);
            if (bloqueo != null) {
                em.getTransaction().begin();
                em.remove(bloqueo);
                em.getTransaction().commit();
            } else {
                throw new PersistenciaException("Bloqueo no encontrado");
            }
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new PersistenciaException("Error al eliminar el bloqueo con ID: " + id, e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
