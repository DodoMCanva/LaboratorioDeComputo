package Interfaces;

import Entidades.Computadora;
import Persistencias.PersistenciaException;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public interface IComputadoraDAO {
    //Consultas
    public List<Computadora> obtenerComputadorasTabla(Long CentroLab, Tabla Filtro) throws PersistenciaException;
    
    public List<Computadora> obtenerComputadorasTablaSeleccion(Long CentroLab, Tabla Filtro) throws PersistenciaException;

    public List<Computadora> buscarporNumero(Long CentroLab, String nombre, Tabla Filtro) throws PersistenciaException;

    public Computadora consultar(Long id) throws PersistenciaException;

    //Modificaciones
    public void guardar(Long idcl, Computadora computadora) throws PersistenciaException;

    public void editar(Long id, Computadora eComputadora) throws PersistenciaException;

    public void eliminar(Long id) throws PersistenciaException;

    //verificadores
    public void reglasNegocio(Computadora e) throws PersistenciaException;

    public void autenticarComputadora(Long id) throws PersistenciaException;
}
