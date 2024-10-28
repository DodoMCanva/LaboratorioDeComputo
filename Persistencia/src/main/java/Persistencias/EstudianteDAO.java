package Persistencias;

import Entidades.Estudiante;
import Entidades.NombreCompleto;
import Interfaces.IEstudianteDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utilerias.Tabla;

public class EstudianteDAO implements IEstudianteDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    // Consultas
    @Override
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        List<Estudiante> estudiantes = em.createQuery("SELECT e FROM Estudiante e where e.estaEgresado=false ", Estudiante.class).getResultList();
        em.close();
        return estudiantes;
    }

    @Override
    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = em.createQuery(
                    "SELECT e FROM Estudiante e WHERE e.nombreCompleto.nombre LIKE :nombre",
                    Estudiante.class
            ).setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error buscando estudiantes por nombre", e);
        } finally {
            em.close();
        }
        return estudiantes;
    }

    @Override
    public Estudiante consultar(Long id) {
        EntityManager em = emf.createEntityManager();
        Estudiante estudiante = null;
        try {
            estudiante = em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
        return estudiante;
    }

    @Override
    public void guardar(Estudiante estudiante) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            // Establecer la relación entre Estudiante y NombreCompleto
            NombreCompleto nombreCompleto = estudiante.getNombreCompleto();
            if (nombreCompleto != null) {
                nombreCompleto.setEstudiante(estudiante);
                estudiante.setNombreCompleto(nombreCompleto);
            }
            em.persist(estudiante);
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
    public void editar(Long id, Estudiante eEstudiante) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Estudiante estudiante = em.find(Estudiante.class, id);
            if (estudiante != null) {
                estudiante.setContraseña(eEstudiante.getContraseña());
                estudiante.setEstaEgresado(eEstudiante.isEstaEgresado());
                estudiante.setCarrera(eEstudiante.getCarrera());
                estudiante.setNombreCompleto(eEstudiante.getNombreCompleto());
                em.merge(estudiante);
            }
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
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Estudiante estudiante = em.find(Estudiante.class, id);
            if (estudiante != null) {
                em.getTransaction().begin();
                estudiante.setEstaEgresado(true);
                em.merge(estudiante);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    // Verificaciones
    @Override
    public void reglasNegocio(Estudiante e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void autenticarEstudiante(Long id) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try {
            Estudiante encontrado = em.find(Estudiante.class, id);
            if (encontrado == null) {
                throw new PersistenciaException("Autenticación fallida: ID no encontrado");
            }
        } finally {
            em.close();
        }
    }
}
