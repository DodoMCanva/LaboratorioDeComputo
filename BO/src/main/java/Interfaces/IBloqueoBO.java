package Interfaces;

import BO.BOException;
import DTOLabComputo.BloqueoDTO;
import Entidades.Estudiante;
import Entidades.PersonalAutorizado;
import java.util.List;
import utilerias.Tabla;

/**
 *
 * @author Valeria
 */
public interface IBloqueoBO {

    public List<BloqueoDTO> obtenerBloqueosTabla(Tabla filtro) throws BOException;

    public void finalizarBloqueo(Long idEstudiante) throws BOException;

    public List<BloqueoDTO> buscarBloqueosPorNombre(String nombre, Tabla filtro);

    public void agregarBloqueo(BloqueoDTO bloqueoDTO) throws BOException;

    public void eliminarBloqueo(Long id) throws BOException;

    public BloqueoDTO consultar(Long id) throws BOException;

}
