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
        /*List<Estudiante> estudiantes = null;
        try {
            estudiantes = est.obtenerEstudiantes(Filtro);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Estudiante estudiante : estudiantes) {
            estudiantesDTO.add(convertirAEstudianteDTO(estudiante));
        }*/
        return centrosDTO;
    }

    @Override
    public List<centroLabDTO> obtenerLaboratorio() throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<centroLabDTO> buscarporCampus(String Campus, Tabla Filtro) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public centroLabDTO consultar(Long id) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}
