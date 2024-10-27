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
public class ComputadoraBO implements IComputadoraBO{

    private IComputadoraDAO cdao = new ComputadoraDAO();
    
    @Override
    public List<computadoraDTO> obtenerComputadoras(Tabla Filtro) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<computadoraDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public computadoraDTO consultar(Long id) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardar(computadoraDTO Computadora) throws BOException {
        Computadora cent = convertirDTOaEntidad(Computadora);
        try {
            cdao.guardar(cent);
        } catch (PersistenciaException ex) {
            Logger.getLogger(EstudianteBO.class.getName()).log(Level.SEVERE, null, ex);
        }}

    @Override
    public void editar(Long id, computadoraDTO e) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reglasNegocio(computadoraDTO e) throws BOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean autenticarComputadora(Long id) throws BOException {
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
        cl.setCampus(centro.getCampus());
        cl.setEstEliminado(centro.isEstEliminado());
        cl.setNombre(centro.getNombre());
        cl.setHoraInicio(centro.getHoraInicio());
        cl.setHoraFin(centro.getHoraFin());
        return cl;
    }
    
    
    
}
