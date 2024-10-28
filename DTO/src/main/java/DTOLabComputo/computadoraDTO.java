package DTOLabComputo;

/**
 * Clase computadoraDTO que representa un objeto de transferencia de datos para
 * la información de una computadora en un laboratorio.
 *
 * Esta clase incluye atributos que registran la identificación de la
 * computadora, su dirección IP, número de PC, estado, si está eliminada, tipo
 * de usuario y el centro de laboratorio al que pertenece.
 */
public class computadoraDTO {

    private Long Computadora_ID; // Identificador único de la computadora
    private String IP;           // Dirección IP de la computadora
    private int NumeroPC;       // Número de la computadora
    private String Estatus;      // Estado de la computadora (ej. disponible, en uso)
    private boolean estEliminado; // Estado de eliminación de la computadora (true si está eliminada)
    private String TipoUsuario;   // Tipo de usuario que utiliza la computadora
    private centroLabDTO centro;  // Centro de laboratorio al que pertenece la computadora

    /**
     * Obtiene el identificador de la computadora.
     *
     * @return El identificador de la computadora.
     */
    public Long getComputadora_ID() {
        return Computadora_ID;
    }

    /**
     * Establece el identificador de la computadora.
     *
     * @param Computadora_ID El identificador a establecer.
     */
    public void setComputadora_ID(Long Computadora_ID) {
        this.Computadora_ID = Computadora_ID;
    }

    /**
     * Obtiene la dirección IP de la computadora.
     *
     * @return La dirección IP de la computadora.
     */
    public String getIP() {
        return IP;
    }

    /**
     * Establece la dirección IP de la computadora.
     *
     * @param IP La dirección IP a establecer.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Obtiene el número de la computadora.
     *
     * @return El número de la computadora.
     */
    public int getNumeroPC() {
        return NumeroPC;
    }

    /**
     * Establece el número de la computadora.
     *
     * @param NumeroPC El número a establecer.
     */
    public void setNumeroPC(int NumeroPC) {
        this.NumeroPC = NumeroPC;
    }

    /**
     * Obtiene el estado de la computadora.
     *
     * @return El estado de la computadora.
     */
    public String getEstatus() {
        return Estatus;
    }

    /**
     * Establece el estado de la computadora.
     *
     * @param Estatus El estado a establecer.
     */
    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    /**
     * Verifica si la computadora está eliminada.
     *
     * @return true si está eliminada, false en caso contrario.
     */
    public boolean isEstEliminado() {
        return estEliminado;
    }

    /**
     * Establece el estado de eliminación de la computadora.
     *
     * @param estEliminado true para marcarla como eliminada, false en caso
     * contrario.
     */
    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }

    /**
     * Obtiene el tipo de usuario de la computadora.
     *
     * @return El tipo de usuario.
     */
    public String getTipoUsuario() {
        return TipoUsuario;
    }

    /**
     * Establece el tipo de usuario de la computadora.
     *
     * @param TipoUsuario El tipo de usuario a establecer.
     */
    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    /**
     * Obtiene el centro de laboratorio al que pertenece la computadora.
     *
     * @return El centro de laboratorio.
     */
    public centroLabDTO getCentro() {
        return centro;
    }

    /**
     * Establece el centro de laboratorio al que pertenece la computadora.
     *
     * @param centro El centro a establecer.
     */
    public void setCentro(centroLabDTO centro) {
        this.centro = centro;
    }
}
