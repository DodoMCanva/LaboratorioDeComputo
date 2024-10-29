package Interfaces;

import Entidades.Bloqueo;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Valeria
 */
public interface IBloqueoDAO {

    public List<Bloqueo> obtenerBloqueos(Tabla filtro) throws PersistenciaException;

    public List<Bloqueo> obtenerBloqueos();

    public String obtenerNombreEstudiantePorId(Long idEstudiante) throws PersistenciaException;

    public Bloqueo obtenerBloqueoPorEstudiante(Long idEstudiante) throws PersistenciaException;

    public void actualizarBloqueo(Bloqueo bloqueo) throws PersistenciaException;

    List<Bloqueo> buscarBloqueosPorNombre(String nombre, Tabla filtro) throws PersistenciaException;

    public void desbloquearEstudiante(Long idEstudiante) throws PersistenciaException;

    public void guardarBloqueo(Bloqueo bloqueo) throws PersistenciaException;

    public Bloqueo consultar(Long id) throws PersistenciaException;

    public void eliminarBloqueo(Long id) throws PersistenciaException;

}
