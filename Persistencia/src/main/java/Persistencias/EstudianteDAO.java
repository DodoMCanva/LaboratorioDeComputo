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

    // Crear un EntityManagerFactory para la persistencia
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    // Consultas
    @Override
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        // Obtener lista de estudiantes que no están egresados
        List<Estudiante> estudiantes = em.createQuery("SELECT e FROM Estudiante e where e.estaEgresado=false ", Estudiante.class).getResultList();
        em.close(); // Cerrar el EntityManager
        return estudiantes; // Retornar lista de estudiantes
    }

    @Override
    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        List<Estudiante> estudiantes = null; // Inicializar lista de estudiantes
        try {
            // Consulta JPQL para buscar estudiantes por nombre
            estudiantes = em.createQuery(
                    "SELECT e FROM Estudiante e WHERE e.nombreCompleto.nombre LIKE :nombre",
                    Estudiante.class
            ).setParameter("nombre", "%" + nombre + "%").getResultList(); // Establecer parámetro de búsqueda
        } catch (Exception e) {
            throw new PersistenciaException("Error buscando estudiantes por nombre", e); // Lanzar excepción en caso de error
        } finally {
            em.close(); // Cerrar el EntityManager
        }
        return estudiantes; // Retornar lista de estudiantes encontrados
    }

    @Override
    public Estudiante consultar(Long id) {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        Estudiante estudiante = null; // Inicializar estudiante
        try {
            estudiante = em.find(Estudiante.class, id); // Buscar estudiante por ID
        } finally {
            em.close(); // Cerrar el EntityManager
        }
        return estudiante; // Retornar el estudiante encontrado
    }

    @Override
    public void guardar(Estudiante estudiante) {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            em.getTransaction().begin(); // Iniciar la transacción
            // Establecer la relación entre Estudiante y NombreCompleto
            NombreCompleto nombreCompleto = estudiante.getNombreCompleto();
            if (nombreCompleto != null) {
                nombreCompleto.setEstudiante(estudiante); // Asignar estudiante al NombreCompleto
                estudiante.setNombreCompleto(nombreCompleto); // Establecer el NombreCompleto en el estudiante
            }
            em.persist(estudiante); // Persistir el estudiante
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw e; // Lanzar excepción
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    @Override
    public void editar(Long id, Estudiante eEstudiante) {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            em.getTransaction().begin(); // Iniciar la transacción
            Estudiante estudiante = em.find(Estudiante.class, id); // Buscar estudiante por ID
            if (estudiante != null) {
                // Actualizar atributos del estudiante existente
                estudiante.setContraseña(eEstudiante.getContraseña());
                estudiante.setEstaEgresado(eEstudiante.isEstaEgresado());
                estudiante.setCarrera(eEstudiante.getCarrera());
                estudiante.setNombreCompleto(eEstudiante.getNombreCompleto());
                em.merge(estudiante); // Realizar merge del estudiante actualizado
            }
            em.getTransaction().commit(); // Confirmar la transacción
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw e; // Lanzar excepción
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            Estudiante estudiante = em.find(Estudiante.class, id); // Buscar estudiante por ID
            if (estudiante != null) {
                em.getTransaction().begin(); // Iniciar la transacción
                estudiante.setEstaEgresado(true); // Marcar estudiante como egresado
                em.merge(estudiante); // Realizar merge del estudiante
                em.getTransaction().commit(); // Confirmar la transacción
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hacer rollback si hay error
            }
            throw e; // Lanzar excepción
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }

    // Verificaciones
    @Override
    public void reglasNegocio(Estudiante e) {
        throw new UnsupportedOperationException("Not supported yet."); // Lanzar excepción si no está implementado
    }

    @Override
    public void autenticarEstudiante(Long id) throws PersistenciaException {
        EntityManager em = emf.createEntityManager(); // Crear un EntityManager
        try {
            Estudiante encontrado = em.find(Estudiante.class, id); // Buscar estudiante por ID
            if (encontrado == null) {
                throw new PersistenciaException("Autenticación fallida: ID no encontrado"); // Lanzar excepción si no se encuentra
            }
        } finally {
            em.close(); // Cerrar el EntityManager
        }
    }
}
