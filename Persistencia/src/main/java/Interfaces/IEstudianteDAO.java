package Interfaces;

import Entidades.Estudiante;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

public interface IEstudianteDAO {
    
    //Consultas
    public List<Estudiante> obtenerEstudiantes(Tabla Filtro) throws PersistenciaException;

    public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException;

    public Estudiante consultar(Long id) throws PersistenciaException;

    //Modificaciones
    public void guardar(Estudiante estudiante) throws PersistenciaException;

    public void editar(Long id, Estudiante eEstudiante) throws PersistenciaException;

    public void eliminar(Long id) throws PersistenciaException;

    //verificadores
    public void reglasNegocio(Estudiante e) throws PersistenciaException;

    public void autenticarEstudiante(Long id) throws PersistenciaException;

}
