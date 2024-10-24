package Interfaces;

import Entidades.Estudiante;
import java.util.List;
import utilerias.Tabla;

public interface IEstudianteDAO {
    //Consultas
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro);

    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro);

    public Estudiante consultar(int id);

    //Modificaciones
    public void guardar(Estudiante estudiante);

    public void editar(int id);

    public void eliminar(int id);

    //verificadores
    public void reglasNegocio(Estudiante e);

    public void autenticarCliente(Estudiante estudiante);

}
