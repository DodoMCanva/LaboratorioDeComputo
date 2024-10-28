package Persistencias;

import Entidades.*;
import Interfaces.ISoftwareDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Valeria
 */
public class SoftwareDAO implements ISoftwareDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    @Override
    public List<Software> obtenerPorComputadora(Computadora computadora) {
        EntityManager em = emf.createEntityManager();
        List<Software> listaSoftware = null;

        try {
            TypedQuery<Software> query = em.createQuery("SELECT s FROM Software s WHERE s.computadora = :computadora", Software.class);
            query.setParameter("computadora", computadora);
            listaSoftware = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error al obtener el software por computadora: " + e.getMessage());
        } finally {
            em.close();
        }

        return listaSoftware;
    }
}
