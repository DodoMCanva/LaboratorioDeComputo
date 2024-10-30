package BO;

import DTOLabComputo.CarreraDTO;
import DTOLabComputo.EstudianteDTO;
import DTOLabComputo.centroLabDTO;
import DTOLabComputo.computadoraDTO;
import Entidades.Carrera;
import Entidades.CentroLaboratorio;
import Entidades.Computadora;
import Entidades.Estudiante;
import Entidades.NombreCompleto;
import Persistencias.SesionDAO;

/**
 *
 * @author Equipo 3
 */
public class SesionBO {
    private SesionDAO sd = new SesionDAO();
    public void guardar(computadoraDTO computadoraDTO, EstudianteDTO estuidanteDTO){
        SesionDAO.guardar(convertirDTOaEntidad(computadoraDTO),convertirAEstudiante(estuidanteDTO));
    
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
    
    private Estudiante convertirAEstudiante(EstudianteDTO dto) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(dto.getEstudiante_ID());
        NombreCompleto nombreCompleto = new NombreCompleto();
        nombreCompleto.setNombre(dto.getNombre());
        nombreCompleto.setApellidoPaterno(dto.getApellidoPaterno());
        nombreCompleto.setApellidoMaterno(dto.getApellidoMaterno());
        estudiante.setNombreCompleto(nombreCompleto);
        estudiante.setContraseña(dto.getContraseña());
        estudiante.setEstaEgresado(dto.isEstaEgresado());
        estudiante.setCarrera(convertirCarrera(dto.getCarrera()));
        return estudiante;
    }
    
    public Carrera convertirCarrera(CarreraDTO carreraDTO) {
        Carrera carrera = new Carrera();
        carrera.setId(carreraDTO.getCarrera_ID());
        carrera.setNombre(carreraDTO.getNombre());
        carrera.setTiempo(carreraDTO.getTiempo());

        return carrera;
    }

     
}
