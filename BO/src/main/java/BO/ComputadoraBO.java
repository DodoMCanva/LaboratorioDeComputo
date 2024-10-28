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

    private IComputadoraDAO cdao = new ComputadoraDAO();

    @Override
    public List<computadoraDTO> obtenerComputadorasTabla(Long id, Tabla Filtro) throws BOException {
        List<computadoraDTO> computadorasDTO = new ArrayList<>();
        try {
            List<Computadora> compENT = cdao.obtenerComputadorasTabla(id, Filtro);
            for (Computadora entidad : compENT) {
                computadoraDTO clDTO = convertirEntidadaDTO(entidad);
                computadorasDTO.add(clDTO);
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return computadorasDTO;
    }
    @Override
    public List<computadoraDTO> obtenerComputadorasTablaSeleccion(Long id, Tabla Filtro) throws BOException {
        List<computadoraDTO> computadorasDTO = new ArrayList<>();
        try {
            List<Computadora> compENT = cdao.obtenerComputadorasTablaSeleccion(id, Filtro);
            for (Computadora entidad : compENT) {
                computadoraDTO clDTO = convertirEntidadaDTO(entidad);
                computadorasDTO.add(clDTO);
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return computadorasDTO;
    }

    @Override
    public List<computadoraDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public computadoraDTO consultar(Long id) throws BOException {
        try {
            Computadora entidad = cdao.consultar(id);
            return convertirEntidadaDTO(entidad);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar la computadora", ex);
        }
    }

    @Override
    public void guardar(Long idcl, computadoraDTO Computadora) throws BOException {
        Computadora cent = convertirDTOaEntidad(Computadora);
        try {
            cdao.guardar(idcl,cent);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@Override
public void editar(Long id, computadoraDTO e) throws BOException {
    Computadora cent = convertirDTOaEntidad(e);
    try {
        // Convertimos el DTO a la entidad
        Computadora computadora = new Computadora();
        computadora.setIp(e.getIP());
        computadora.setNumeroPC(e.getNumeroPC());
        computadora.setTipoUsuario(e.getTipoUsuario());

        // Llamamos al método editar del DAO
        cdao.editar(id, computadora);
    } catch (PersistenciaException ex) {
        throw new BOException("Error al editar la computadora con ID: " + id, ex);
    }
}

@Override
public void eliminar(Long id) throws BOException {
    try {
        // Llamamos al método eliminar del DAO
        cdao.eliminar(id);
    } catch (PersistenciaException ex) {
        throw new BOException("Error al eliminar la computadora con ID: " + id, ex);
    }
}


    @Override
    public void reglasNegocio(computadoraDTO e) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private Computadora convertirDTOaEntidad(computadoraDTO dto) {
        Computadora c = new Computadora();
        c.setIp(dto.getIP());
        c.setEstEliminado(false);
        c.setEstatus(dto.getEstatus());
        c.setNumeroPC(dto.getNumeroPC());
        c.setTipoUsuario(dto.getTipoUsuario());
        c.setCentroLab(convertircenDTOacenEntidad(dto.getCentro()));
        return c;
    }

    private CentroLaboratorio convertircenDTOacenEntidad(centroLabDTO centro) {
        CentroLaboratorio cl = new CentroLaboratorio();
        cl.setId(centro.getCentroLab_ID());
        cl.setCampus(centro.getCampus());
        cl.setEstEliminado(centro.isEstEliminado());
        cl.setNombre(centro.getNombre());
        cl.setHoraInicio(centro.getHoraInicio());
        cl.setHoraFin(centro.getHoraFin());
        return cl;
    }

    private computadoraDTO convertirEntidadaDTO(Computadora entidad) {
        computadoraDTO dto = new computadoraDTO();
        dto.setEstatus(entidad.getEstatus());
        dto.setComputadora_ID(entidad.getId());
        dto.setEstatus(entidad.getEstatus());
        dto.setIP(entidad.getIp());
        dto.setNumeroPC(entidad.getNumeroPC());
        dto.setTipoUsuario(entidad.getTipoUsuario());
        return dto;
    }

}
