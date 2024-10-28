package Interfaces;

import BO.BOException;
import DTOLabComputo.computadoraDTO;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public interface IComputadoraBO {

    //Consultas
    public List<computadoraDTO> obtenerComputadorasTabla(Long id, Tabla Filtro) throws BOException;

    public List<computadoraDTO> obtenerComputadorasTablaSeleccion(Long id, Tabla Filtro) throws BOException;

    public List<computadoraDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException;

    public computadoraDTO consultar(Long id) throws BOException;

    //Modificaciones
    public void guardar(Long idcl, computadoraDTO Computadora) throws BOException;

    public void editar(Long id, computadoraDTO e) throws BOException;

    public void eliminar(Long id) throws BOException;

    //verificadores
    public void reglasNegocio(computadoraDTO e) throws BOException;

   
}
