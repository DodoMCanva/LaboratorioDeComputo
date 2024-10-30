package Persistencias;

import Entidades.CentroLaboratorio;
import Entidades.Computadora;
import Interfaces.IComputadoraDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public class ComputadoraDAO implements IComputadoraDAO {

    // Crear un EntityManagerFactory para la persistencia
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    @Override
    public List<Computadora> obtenerComputadorasTabla(Long CentroLab, Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager(); // Crear un EntityManager
            // Consulta JPQL para obtener computadoras por centro de laboratorio no eliminadas
            String jpql = "SELECT c FROM Computadora c WHERE c.centroLab.id = :centroLabId AND c.estEliminado = false";
            
            // Crear una consulta tipada
            TypedQuery<Computadora> query = em.createQuery(jpql, Computadora.class);
            query.setParameter("centroLabId", CentroLab); // Establecer el parámetro del centro de laboratorio
            query.setMaxResults(filtro.getLimite()); // Limitar resultados
            query.setFirstResult(filtro.getPagina() * filtro.getLimite()); // Paginación

            return query.getResultList(); // Retornar la lista de computadoras
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar computadoras por centro de laboratorio", e);
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }

    @Override
    public List<Computadora> obtenerComputadorasTablaSeleccion(Long CentroLab, Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager(); // Crear un EntityManager
            // Consulta JPQL para obtener computadoras estudiantiles no eliminadas
            String jpql = "SELECT c FROM Computadora c WHERE c.centroLab.id = :centroLabId AND c.estEliminado = false AND c.tipoUsuario = 'Estudiantil'";
            System.out.println("Llego a dao esto "+CentroLab);
            TypedQuery<Computadora> query = em.createQuery(jpql, Computadora.class);
            query.setParameter("centroLabId", CentroLab); // Establecer el parámetro del centro de laboratorio
            query.setMaxResults(filtro.getLimite()); // Limitar resultados
            query.setFirstResult(filtro.getPagina() * filtro.getLimite()); // Paginación

            return query.getResultList(); // Retornar la lista de computadoras
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar computadoras por centro de laboratorio", e);
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }

    @Override
    public Computadora consultar(Long id) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager(); // Crear un EntityManager
            return em.find(Computadora.class, id); // Buscar computadora por ID
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar la computadora por ID", e);
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }

    @Override
    public List<Computadora> buscarporNumero(Long CentroLab, String numero, Tabla Filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager(); // Crear un EntityManager
            // Consulta JPQL para buscar computadora por número y centro de laboratorio no eliminadas
            String jpql = "SELECT c FROM Computadora c WHERE c.centroLab.id = :centroLabId AND c.numero = :numero AND c.estEliminado = false";

            TypedQuery<Computadora> query = em.createQuery(jpql, Computadora.class);
            query.setParameter("centroLabId", CentroLab); // Establecer el parámetro del centro de laboratorio
            query.setParameter("numero", numero); // Establecer el parámetro del número
            query.setMaxResults(Filtro.getLimite()); // Limitar resultados
            query.setFirstResult(Filtro.getPagina() * Filtro.getLimite()); // Paginación

            return query.getResultList(); // Retornar la lista de computadoras
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar computadoras por número", e);
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }

    @Override
    public void guardar(Long idcl, Computadora computadora) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            computadora.setEstatus("Disponible"); // Establecer el estatus de la computadora
            // Si el centro de laboratorio no está en el contexto de persistencia, buscarlo
            if (computadora.getCentroLab() != null && !em.contains(computadora.getCentroLab())) {
                computadora.setCentroLab(em.find(CentroLaboratorio.class, idcl));
            }
            em.getTransaction().begin(); // Iniciar la transacción
            em.persist(computadora); // Persistir la computadora
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw e; // Lanzar la excepción
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    @Override
    public void editar(Long id, Computadora eComputadora) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            em.getTransaction().begin(); // Iniciar la transacción
            Computadora existente = em.find(Computadora.class, id); // Buscar la computadora existente
            if (existente != null) {
                // Actualiza los atributos de la computadora existente
                existente.setIp(eComputadora.getIp());
                existente.setNumeroPC(eComputadora.getNumeroPC());
                existente.setTipoUsuario(eComputadora.getTipoUsuario());
                em.merge(existente); // Realizar merge de la computadora existente
            } else {
                throw new PersistenciaException("No se encontró la computadora con el ID: " + id); // Lanzar excepción si no se encuentra
            }
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (PersistenciaException e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw new PersistenciaException("Error al editar computadora", e);
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }

    @Override
    public void eliminar(Long id) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            em.getTransaction().begin(); // Iniciar la transacción
            Computadora computadora = em.find(Computadora.class, id); // Buscar la computadora por ID
            if (computadora != null) {
                // Marca la computadora como eliminada (borrado lógico)
                computadora.setEstEliminado(true);
                em.merge(computadora); // Realizar merge de la computadora
            }
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw new PersistenciaException("Error al eliminar computadora con ID: " + id, e);
        } finally {
            if (em != null && em.isOpen()) {
                em.close(); // Cerrar el EntityManager
            }
        }
    }
}
