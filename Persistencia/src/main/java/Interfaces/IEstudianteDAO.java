package Interfaces;

import Entidades.Estudiante;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;
/**
 * Interfaz DAO para Estudiante.
 * @autor Equipo 3
 */
public interface IEstudianteDAO {

    // Consultas
    List<Estudiante> obtenerEstudiantes(Tabla filtro) throws PersistenciaException;
     public List<Estudiante> buscarporNombre(String nombre, Tabla Filtro) throws PersistenciaException;
    Estudiante consultar(Long id) throws PersistenciaException;

    // Modificaciones
    void guardar(Estudiante estudiante) throws PersistenciaException;
    void editar(Long id, Estudiante estudiante) throws PersistenciaException;
    void eliminar(Long id) throws PersistenciaException;

    // Verificadores
    void reglasNegocio(Estudiante estudiante) throws PersistenciaException;
    void autenticarEstudiante(Long id) throws PersistenciaException;
}
