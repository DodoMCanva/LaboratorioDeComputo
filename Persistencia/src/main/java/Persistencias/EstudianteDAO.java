package Persistencias;

import Entidades.Estudiante;
import Interfaces.IEstudianteDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utilerias.Tabla;

public class EstudianteDAO implements IEstudianteDAO {

    //com.mycompany_SegundaUnidad_jar_1.0PU se deberia cambiar eso
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_SegundaUnidad_jar_1.0PU");

    //Consultas
    @Override
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        List<Estudiante> estudiantes = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class).getResultList();
        em.close();
        return estudiantes;
    }

    @Override
    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public Estudiante consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Modificaciones
    @Override
    public void guardar(Estudiante estudiante) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(estudiante);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void editar(int id) {

    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Verificaciones
    @Override
    public void reglasNegocio(Estudiante e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void autenticarCliente(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
