package Persistencias;

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

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    @Override
    public List<Computadora> obtenerComputadorasTabla(Long CentroLab, Tabla filtro) throws PersistenciaException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            String jpql = "SELECT c FROM Computadora c WHERE c.centroLab.id = :centroLabId AND c.estEliminado = false";

            TypedQuery<Computadora> query = em.createQuery(jpql, Computadora.class);
            query.setParameter("centroLabId", CentroLab);
            query.setMaxResults(filtro.getLimite());
            query.setFirstResult(filtro.getPagina() * filtro.getLimite());

            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar computadoras por centro de laboratorio", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
public Computadora consultar(Long id) throws PersistenciaException {
    EntityManager em = null;
    try {
        em = emf.createEntityManager();
        return em.find(Computadora.class, id);
    } catch (Exception e) {
        throw new PersistenciaException("Error al consultar la computadora por ID", e);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}
    @Override
public List<Computadora> buscarporNumero(Long CentroLab, String numero, Tabla Filtro) throws PersistenciaException {
    EntityManager em = null;
    try {
        em = emf.createEntityManager();
        String jpql = "SELECT c FROM Computadora c WHERE c.centroLab.id = :centroLabId AND c.numero = :numero AND c.estEliminado = false";

        TypedQuery<Computadora> query = em.createQuery(jpql, Computadora.class);
        query.setParameter("centroLabId", CentroLab);
        query.setParameter("numero", numero);
        query.setMaxResults(Filtro.getLimite());
        query.setFirstResult(Filtro.getPagina() * Filtro.getLimite());

        return query.getResultList();
    } catch (Exception e) {
        throw new PersistenciaException("Error al buscar computadoras por número", e);
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

    @Override
    public void guardar(Computadora Computadora) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            Computadora.setEstatus("Disponible");
            em.getTransaction().begin();
            em.persist(Computadora);
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
    public void editar(Long id, Computadora eComputadora) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reglasNegocio(Computadora e) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarComputadora(Long id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
