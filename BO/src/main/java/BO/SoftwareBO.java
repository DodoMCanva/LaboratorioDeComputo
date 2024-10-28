package BO;

import DTOLabComputo.SoftwareDTO;
import Entidades.Software;
import Interfaces.ISoftwareBO;
import Interfaces.ISoftwareDAO;
import Persistencias.SoftwareDAO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class SoftwareBO implements ISoftwareBO {

    private ISoftwareDAO softwareDAO; // Interfaz para el acceso a datos

    public SoftwareBO() {
        this.softwareDAO = new SoftwareDAO(); // Inicializa el DAO
    }

    @Override
    public SoftwareDTO consultarPorNombre(String Software) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
