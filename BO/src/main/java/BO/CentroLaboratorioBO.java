package BO;

import DTOLabComputo.centroLabDTO;
import Entidades.CentroLaboratorio;
import Entidades.Computadora;
import Interfaces.ICentroLaboratorioBO;
import Interfaces.ICentroLaboratorioDAO;
import Persistencias.CentroLaboratorioDAO;
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
public class CentroLaboratorioBO implements ICentroLaboratorioBO {

    static ICentroLaboratorioDAO est = new CentroLaboratorioDAO();

    @Override
    public List<centroLabDTO> obtenerLaboratoriosTabla(Tabla Filtro) throws BOException {
        List<centroLabDTO> centrosDTO = new ArrayList<>();
        try {
            List<CentroLaboratorio> centrosENT = est.obtenerCentros(Filtro);
            for (CentroLaboratorio entidad : centrosENT) {
                centroLabDTO clDTO = convertirEntidadaDTO(entidad);
                centrosDTO.add(clDTO);
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return centrosDTO;
    }

    @Override
    public List<centroLabDTO> obtenerLaboratorio() throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<centroLabDTO> buscarporNombre(String Campus, Tabla Filtro) throws BOException {
        List<centroLabDTO> centrosDTO = new ArrayList<>();
        try {
            List<CentroLaboratorio> centrosENT = est.buscarporNombre(Campus, Filtro);
            for (CentroLaboratorio entidad : centrosENT) {
                centroLabDTO clDTO = convertirEntidadaDTO(entidad);
                centrosDTO.add(clDTO);
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return centrosDTO;
    }

    @Override
    public centroLabDTO consultar(Long id) throws BOException {
        CentroLaboratorio centro = null;
        try {
            centro = est.consultar(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(CentroLaboratorioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return centro != null ? convertirEntidadaDTO(centro) : null;
    }

    @Override
    public void guardar(centroLabDTO cl) throws BOException {
        try {
            est.guardar(convertirCentroLaboratorio(cl));
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Long id, centroLabDTO cl) throws BOException {
        try {
            est.editar(id, convertirCentroLaboratorio(cl));
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Long id) throws BOException {
        System.out.println(id);

        try {
            est.eliminar(id);
        } catch (PersistenciaException e) {
            System.out.println("ERROR:" + e.toString());
        }
    }

    @Override
    public void reglasNegocio(centroLabDTO cl) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private CentroLaboratorio convertirCentroLaboratorio(centroLabDTO dto) {
        CentroLaboratorio cl = new CentroLaboratorio();
        List<Computadora> computadoras = new ArrayList<>();
        cl.setCampus(dto.getCampus());
        cl.setComputadoras(computadoras);
        cl.setEstEliminado(false);
        cl.setNombre(dto.getNombre());
        cl.setHoraInicio(dto.getHoraInicio());
        cl.setHoraFin(dto.getHoraFin());
        return cl;
    }

    private centroLabDTO convertirEntidadaDTO(CentroLaboratorio entidad) {
        centroLabDTO dto = new centroLabDTO();
        dto.setCampus(entidad.getCampus());
        dto.setCentroLab_ID(entidad.getId());
        dto.setEstEliminado(false);
        dto.setHoraFin(entidad.getHoraFin());
        dto.setHoraInicio(entidad.getHoraInicio());
        dto.setNombre(entidad.getNombre());
        return dto;
    }

}
