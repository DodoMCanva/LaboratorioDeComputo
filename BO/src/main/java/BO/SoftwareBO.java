package BO;

import DTOLabComputo.SoftwareDTO;
import Interfaces.ISoftwareBO;
import Interfaces.ISoftwareDAO;
import Persistencias.SoftwareDAO;

/**
 *
 * @author Valeria
/**
 * Clase SoftwareBO que implementa la interfaz ISoftwareBO.
 * Esta clase es responsable de la lógica de negocio relacionada con el software.
 * Utiliza la interfaz ISoftwareDAO para acceder a los datos del software en la base de datos.
 * 
 * Equipo 3
 */
public class SoftwareBO implements ISoftwareBO {

    private ISoftwareDAO softwareDAO; // Interfaz para el acceso a datos

    /**
     * Constructor de la clase SoftwareBO.
     * Inicializa el objeto softwareDAO para interactuar con la base de datos.
     */
    public SoftwareBO() {
        this.softwareDAO = new SoftwareDAO(); // Inicializa el DAO
    }

    /**
     * Método para consultar un software por su nombre.
     * Este método actualmente lanza una excepción de operación no soportada.
     *
     * @param Software El nombre del software a consultar.
     * @return SoftwareDTO objeto que representa el software consultado.
     * @throws UnsupportedOperationException si el método no está implementado.
     */
    @Override
    public SoftwareDTO consultarPorNombre(String Software) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
