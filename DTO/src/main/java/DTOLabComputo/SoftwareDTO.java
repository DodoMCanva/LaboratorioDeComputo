package DTOLabComputo;

/**
 * Clase SoftwareDTO que representa un objeto de transferencia de datos para la
 * información de un software.
 *
 * Esta clase incluye atributos que registran el identificador del software y su
 * nombre.
 */
public class SoftwareDTO {

    private int Software_ID;     // Identificador único del software
    private String Software;     // Nombre del software

    /**
     * Obtiene el identificador del software.
     *
     * @return El identificador del software.
     */
    public int getSoftware_ID() {
        return Software_ID;
    }

    /**
     * Establece el identificador del software.
     *
     * @param Software_ID El identificador a establecer.
     */
    public void setSoftware_ID(int Software_ID) {
        this.Software_ID = Software_ID;
    }

    /**
     * Obtiene el nombre del software.
     *
     * @return El nombre del software.
     */
    public String getSoftware() {
        return Software;
    }

    /**
     * Establece el nombre del software.
     *
     * @param Software El nombre a establecer.
     */
    public void setSoftware(String Software) {
        this.Software = Software;
    }
}
