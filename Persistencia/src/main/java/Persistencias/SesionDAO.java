package Persistencias;

import Entidades.Computadora;
import Entidades.Estudiante;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Equipo 3
 */
public class SesionDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");
    public void guardar(Computadora computadora, Estudiante estudiante){
    EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            /*Sesion sesion = new Sesion
            em.persist();*/
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
}
