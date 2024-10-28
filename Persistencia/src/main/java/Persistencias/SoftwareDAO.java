package Persistencias;

import Entidades.*;
import Interfaces.ISoftwareDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Clase que implementa la interfaz ISoftwareDAO para manejar operaciones de persistencia de Software.
 * 
 * @author Equipo 3
 */
public class SoftwareDAO implements ISoftwareDAO {

    // Fabrica de entidades para manejar la conexión a la base de datos
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

    /**
     * Método para obtener una lista de software asociado a una computadora específica.
     *
     * @param computadora La computadora para la que se desea obtener el software.
     * @return Lista de software asociado a la computadora, o null si ocurre un error.
     */
    @Override
    public List<Software> obtenerPorComputadora(Computadora computadora) {
        EntityManager em = emf.createEntityManager(); // Crear un nuevo EntityManager
        List<Software> listaSoftware = null; // Inicializar la lista de software

        try {
            // Crear una consulta para seleccionar el software asociado a la computadora proporcionada
            TypedQuery<Software> query = em.createQuery("SELECT s FROM Software s WHERE s.computadora = :computadora", Software.class);
            query.setParameter("computadora", computadora); // Establecer el parámetro de la consulta
            listaSoftware = query.getResultList(); // Obtener la lista de resultados
        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            System.out.println("Error al obtener el software por computadora: " + e.getMessage());
        } finally {
            em.close(); // Cerrar el EntityManager al final
        }

        return listaSoftware; // Devolver la lista de software
    }
}
