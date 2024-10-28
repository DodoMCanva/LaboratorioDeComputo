package DTOLabComputo;

/**
 *
 * Clase CarreraDTO que representa un objeto de transferencia de datos para la
 * información de una carrera.
 *
 * @author cesar
 */
public class CarreraDTO {

    private long Carrera_ID;  // Identificador único de la carrera
    private String Nombre;     // Nombre de la carrera
    private int tiempo;        // Tiempo de duración de uso por carrera

    /**
     * Obtiene el identificador de la carrera.
     *
     * @return El identificador de la carrera.
     */
    public long getCarrera_ID() {
        return Carrera_ID;
    }

    /**
     * Establece el identificador de la carrera.
     *
     * @param Carrera_ID El identificador de la carrera a establecer.
     */
    public void setCarrera_ID(long Carrera_ID) {
        this.Carrera_ID = Carrera_ID;
    }

    /**
     * Obtiene el nombre de la carrera.
     *
     * @return El nombre de la carrera.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre de la carrera.
     *
     * @param Nombre El nombre de la carrera a establecer.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene el tiempo de duración de uso.
     *
     * @return El tiempo de duración de uso.
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Establece el tiempo de duración de uso.
     *
     * @param tiempo El tiempo de duración a establecer.
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}
