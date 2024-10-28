package DTOLabComputo;

import java.sql.Time;

/**
 * Clase centroLabDTO que representa un objeto de transferencia de datos para la
 * información de un centro de laboratorio.
 *
 * Esta clase incluye atributos que registran el identificador del centro, su
 * nombre, horarios de operación y estado de eliminación.
 */
public class centroLabDTO {

    private long CentroLab_ID;  // Identificador único del centro de laboratorio
    private String Nombre;      // Nombre del centro de laboratorio
    private Time HoraInicio;    // Hora de inicio de operaciones
    private Time HoraFin;       // Hora de fin de operaciones
    private String Campus;      // Campus al que pertenece el centro
    private boolean estEliminado; // Estado de eliminación del centro (true si está eliminado)

    /**
     * Obtiene el identificador del centro de laboratorio.
     *
     * @return El identificador del centro de laboratorio.
     */
    public long getCentroLab_ID() {
        return CentroLab_ID;
    }

    /**
     * Establece el identificador del centro de laboratorio.
     *
     * @param CentroLab_ID El identificador a establecer.
     */
    public void setCentroLab_ID(long CentroLab_ID) {
        this.CentroLab_ID = CentroLab_ID;
    }

    /**
     * Obtiene el nombre del centro de laboratorio.
     *
     * @return El nombre del centro de laboratorio.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del centro de laboratorio.
     *
     * @param Nombre El nombre a establecer.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene la hora de inicio de operaciones del centro.
     *
     * @return La hora de inicio.
     */
    public Time getHoraInicio() {
        return HoraInicio;
    }

    /**
     * Establece la hora de inicio de operaciones del centro.
     *
     * @param HoraInicio La hora de inicio a establecer.
     */
    public void setHoraInicio(Time HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    /**
     * Obtiene la hora de fin de operaciones del centro.
     *
     * @return La hora de fin.
     */
    public Time getHoraFin() {
        return HoraFin;
    }

    /**
     * Establece la hora de fin de operaciones del centro.
     *
     * @param HoraFin La hora de fin a establecer.
     */
    public void setHoraFin(Time HoraFin) {
        this.HoraFin = HoraFin;
    }

    /**
     * Obtiene el campus al que pertenece el centro.
     *
     * @return El campus.
     */
    public String getCampus() {
        return Campus;
    }

    /**
     * Establece el campus al que pertenece el centro.
     *
     * @param Campus El campus a establecer.
     */
    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    /**
     * Verifica si el centro de laboratorio está eliminado.
     *
     * @return true si está eliminado, false en caso contrario.
     */
    public boolean isEstEliminado() {
        return estEliminado;
    }

    /**
     * Establece el estado de eliminación del centro de laboratorio.
     *
     * @param estEliminado true para marcarlo como eliminado, false en caso
     * contrario.
     */
    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }
}
