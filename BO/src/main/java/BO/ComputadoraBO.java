package BO;

import DTOLabComputo.centroLabDTO;
import DTOLabComputo.computadoraDTO;
import Entidades.CentroLaboratorio;
import Entidades.Computadora;
import Interfaces.IComputadoraBO;
import Interfaces.IComputadoraDAO;
import Persistencias.ComputadoraDAO;
import Persistencias.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public class ComputadoraBO implements IComputadoraBO {

    // Inicializa la instancia del DAO para manejar operaciones de base de datos relacionadas con computadoras
    private ComputadoraDAO cdao = new ComputadoraDAO();

    @Override
    public List<computadoraDTO> obtenerComputadorasTabla(Long id, Tabla Filtro) throws BOException {
        List<computadoraDTO> computadorasDTO = new ArrayList<>();
        try {
            // Obtiene la lista de entidades Computadora desde el DAO
            List<Computadora> compENT = cdao.obtenerComputadorasTabla(id, Filtro);
            for (Computadora entidad : compENT) {
                // Convierte cada entidad a su respectivo DTO
                computadoraDTO clDTO = convertirEntidadaDTO(entidad);
                computadorasDTO.add(clDTO); // Añade el DTO a la lista
            }
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return computadorasDTO; // Devuelve la lista de DTOs
    }

    @Override
    public List<computadoraDTO> obtenerComputadorasTablaSeleccion(Long id, Tabla Filtro) throws BOException {
        List<computadoraDTO> computadorasDTO = new ArrayList<>();
        try {
            System.out.println("Tabla BO"+id);
            // Obtiene la lista de entidades Computadora desde el DAO, considerando una selección
            List<Computadora> compENT = cdao.obtenerComputadorasTablaSeleccion(id, Filtro);
            
            for (Computadora entidad : compENT) {
                // Convierte cada entidad a su respectivo DTO
                computadoraDTO clDTO = convertirEntidadaDTO(entidad);
                computadorasDTO.add(clDTO); // Añade el DTO a la lista
            }
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return computadorasDTO; // Devuelve la lista de DTOs
    }

    @Override
    public List<computadoraDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException {
        // Este método no está implementado
        throw new UnsupportedOperationException("Not supported yet."); // Generado automáticamente
    }

    @Override
    public computadoraDTO consultar(Long id) throws BOException {
        try {
            // Consulta la computadora por su ID a través del DAO
            Computadora entidad = cdao.consultar(id);
            return convertirEntidadaDTO(entidad); // Convierte y devuelve el DTO
        } catch (PersistenciaException ex) {
            // Lanza una excepción personalizada si ocurre un error en la consulta
            throw new BOException("Error al consultar la computadora", ex);
        }
    }

    @Override
    public void guardar(Long idcl, computadoraDTO Computadora) throws BOException {
        // Convierte el DTO a la entidad correspondiente
        Computadora cent = convertirDTOaEntidad(Computadora);
        try {
            // Guarda la computadora en el DAO
            cdao.guardar(idcl, cent);
        } catch (PersistenciaException ex) {
            // Registra cualquier excepción que ocurra durante la persistencia
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Long id, computadoraDTO e) throws BOException {
        Computadora cent = convertirDTOaEntidad(e); // Convierte el DTO a la entidad
        try {
            // Crea una nueva instancia de Computadora y establece sus atributos
            Computadora computadora = new Computadora();
            computadora.setIp(e.getIP());
            computadora.setNumeroPC(e.getNumeroPC());
            computadora.setTipoUsuario(e.getTipoUsuario());

            // Llama al método editar del DAO
            cdao.editar(id, computadora);
        } catch (PersistenciaException ex) {
            // Lanza una excepción personalizada si ocurre un error en la edición
            throw new BOException("Error al editar la computadora con ID: " + id, ex);
        }
    }

    @Override
    public void eliminar(Long id) throws BOException {
        try {
            // Llama al método eliminar del DAO
            cdao.eliminar(id);
        } catch (PersistenciaException ex) {
            // Lanza una excepción personalizada si ocurre un error en la eliminación
            throw new BOException("Error al eliminar la computadora con ID: " + id, ex);
        }
    }


    private Computadora convertirDTOaEntidad(computadoraDTO dto) {
        Computadora c = new Computadora();
        c.setIp(dto.getIP()); // Establece el IP de la computadora
        c.setEstEliminado(false); // Marca la computadora como no eliminada
        c.setEstatus(dto.getEstatus()); // Establece el estatus de la computadora
        c.setNumeroPC(dto.getNumeroPC()); // Establece el número de la computadora
        c.setTipoUsuario(dto.getTipoUsuario()); // Establece el tipo de usuario de la computadora
        c.setCentroLab(convertircenDTOacenEntidad(dto.getCentro())); // Convierte y establece el centro de laboratorio
        return c; // Devuelve la entidad
    }

    private CentroLaboratorio convertircenDTOacenEntidad(centroLabDTO centro) {
        CentroLaboratorio cl = new CentroLaboratorio();
        cl.setId(centro.getCentroLab_ID()); // Establece el ID del centro de laboratorio
        cl.setCampus(centro.getCampus()); // Establece el campus
        cl.setEstEliminado(centro.isEstEliminado()); // Establece si el centro está eliminado
        cl.setNombre(centro.getNombre()); // Establece el nombre del centro de laboratorio
        cl.setHoraInicio(centro.getHoraInicio()); // Establece la hora de inicio
        cl.setHoraFin(centro.getHoraFin()); // Establece la hora de fin
        return cl; // Devuelve la entidad
    }

    private computadoraDTO convertirEntidadaDTO(Computadora entidad) {
        computadoraDTO dto = new computadoraDTO();
        dto.setComputadora_ID(dto.getComputadora_ID()); // awas
        dto.setEstatus(entidad.getEstatus()); // Establece el estatus en el DTO
        dto.setComputadora_ID(entidad.getId()); // Establece el ID en el DTO
        dto.setEstatus(entidad.getEstatus()); // Establece el estatus en el DTO (repetido)
        dto.setIP(entidad.getIp()); // Establece el IP en el DTO
        dto.setNumeroPC(entidad.getNumeroPC()); // Establece el número de la computadora en el DTO
        dto.setTipoUsuario(entidad.getTipoUsuario()); // Establece el tipo de usuario en el DTO
        return dto; // Devuelve el DTO
    }
}
