package BO;

import DTOLabComputo.BloqueoDTO;
import Entidades.Bloqueo;
import Entidades.Estudiante;
import Interfaces.IBloqueoBO;
import Interfaces.IBloqueoDAO;
import Persistencias.BloqueoDAO;
import Persistencias.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilerias.Tabla;

/**
 *
 * @author Valeria
 */
public class BloqueoBO implements IBloqueoBO {

    static IBloqueoDAO bloqueoDAO = new BloqueoDAO();

    @Override
    public List<BloqueoDTO> obtenerBloqueosTabla(Tabla filtro) throws BOException {
        List<BloqueoDTO> bloqueoDTO = new ArrayList<>();
        List<Bloqueo> bloqueos = null;
        try {
            bloqueos = bloqueoDAO.obtenerBloqueos(filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al obtener los bloqueos", ex);
        }

        for (Bloqueo entidad : bloqueos) {
            BloqueoDTO blqDTO = convertirEntidadADTO(entidad);
            bloqueoDTO.add(blqDTO);
        }
        return bloqueoDTO;
    }

    @Override
    public void finalizarBloqueo(Long idEstudiante) throws BOException {
        try {
            bloqueoDAO.desbloquearEstudiante(idEstudiante);
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al finalizar el bloqueo del estudiante", ex);
        }
    }

    @Override
    public void agregarBloqueo(BloqueoDTO bloqueoDTO) throws BOException {
        Bloqueo nuevoBloqueo = convertirDTOAEntidad(bloqueoDTO);
        nuevoBloqueo.setFechaInicio(new Date()); // Establece la fecha actual
        nuevoBloqueo.setEstBloquedo(true); // Marca como bloqueado
        try {
            bloqueoDAO.guardarBloqueo(nuevoBloqueo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al agregar bloqueo", ex);
        }
    }

    public void desbloquearEstudiante(Long idEstudiante) throws BOException {
        try {
            Bloqueo bloqueo = bloqueoDAO.obtenerBloqueoPorEstudiante(idEstudiante);
            if (bloqueo != null) {
                bloqueo.setFechaFin(new Date()); // Establece la fecha de finalización
                bloqueo.setEstBloquedo(false); // Cambia el estado a no bloqueado
                bloqueoDAO.actualizarBloqueo(bloqueo); // Asegúrate de que este método esté implementado
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al desbloquear estudiante", ex);
        }
    }

    @Override
    public List<BloqueoDTO> buscarBloqueosPorNombre(String nombre, Tabla filtro) {
        List<BloqueoDTO> bloqueosDTO = new ArrayList<>();
        try {
            // Llamar al DAO para obtener la lista de bloqueos
            List<Bloqueo> bloqueos = bloqueoDAO.buscarBloqueosPorNombre(nombre, filtro);

            // Convertir cada entidad de bloqueo a su respectivo DTO
            for (Bloqueo entidad : bloqueos) {
                BloqueoDTO bDTO = convertirEntidadADTO(entidad);
                bloqueosDTO.add(bDTO);
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            try {
                throw new BOException("Error al obtener los bloqueos", ex); // Lanzar excepción personalizada
            } catch (BOException ex1) {
                Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return bloqueosDTO;

    }

    @Override
    public void eliminarBloqueo(Long id) throws BOException {
        try {
            bloqueoDAO.eliminarBloqueo(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al eliminar bloqueo", ex);
        }
    }

    @Override
    public BloqueoDTO consultar(Long id) throws BOException {
        Bloqueo bloqueo = null;
        try {
            bloqueo = bloqueoDAO.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(BloqueoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new BOException("Error al consultar el bloqueo", ex);
        }
        return bloqueo != null ? convertirEntidadADTO(bloqueo) : null;
    }

    private Bloqueo convertirDTOAEntidad(BloqueoDTO dto) {
        Bloqueo bloqueo = new Bloqueo();
        bloqueo.setFechaInicio(dto.getFechaInicioBloqueo());
        bloqueo.setFechaFin(dto.getFechaFinBloqueo());
        bloqueo.setMotivo(dto.getMotivo());
        bloqueo.setEstBloquedo(dto.isEstBloqueado());

        Estudiante estudiante = new Estudiante();
        estudiante.setId(dto.getEstudianteId());
        bloqueo.setEstudiante(estudiante);

        return bloqueo;
    }

    private BloqueoDTO convertirEntidadADTO(Bloqueo entidad) {
        BloqueoDTO dto = new BloqueoDTO();
        dto.setFolio(entidad.getId());
        dto.setFechaInicioBloqueo(entidad.getFechaInicio());
        dto.setFechaFinBloqueo(entidad.getFechaFin());
        dto.setMotivo(entidad.getMotivo());
        dto.setNombreEstudiante(entidad.getEstudiante().getNombreCompleto().getNombre());
        dto.setEstudianteId(entidad.getEstudiante().getId());
        dto.setEstBloqueado(entidad.getEstBloquedo());

        return dto;
    }

}
