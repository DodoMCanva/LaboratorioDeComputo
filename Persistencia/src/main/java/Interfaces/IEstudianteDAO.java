package Interfaces;

import Entidades.Estudiante;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

public interface IEstudianteDAO {
    //Consultas
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro) throws PersistenciaException;

    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException;

    public Estudiante consultar(int id) throws PersistenciaException;

    //Modificaciones
    public void guardar(Estudiante estudiante) throws PersistenciaException;

    public void editar(int id) throws PersistenciaException;

    public void eliminar(int id) throws PersistenciaException;

    //verificadores
    public void reglasNegocio(Estudiante e) throws PersistenciaException;

    public void autenticarCliente(Estudiante estudiante) throws PersistenciaException;

}
