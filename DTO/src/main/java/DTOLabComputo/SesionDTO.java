package DTOLabComputo;

import java.util.Date;

/**
 * Clase SesionDTO que representa un objeto de transferencia de datos para la
 * información de una sesión.
 *
 * Esta clase incluye atributos que registran el identificador de la sesión, así
 * como las marcas de tiempo de inicio y fin de la misma.
 */
public class SesionDTO {

    private int Sesion_ID;              // Identificador único de la sesión
    private Date fechaInicio;           // Marca de tiempo del inicio de la sesión
    private Date fechaFin;              // Marca de tiempo del fin de la sesión
    private EstudianteDTO estudiante;
    private computadoraDTO computadora;

    /**
     * Obtiene el identificador de la sesión.
     *
     * @return El identificador de la sesión.
     */
    public int getSesion_ID() {
        return Sesion_ID;
    }

    /**
     * Establece el identificador de la sesión.
     *
     * @param Sesion_ID El identificador a establecer.
     */
    public void setSesion_ID(int Sesion_ID) {
        this.Sesion_ID = Sesion_ID;
    }

    /**
     * Obtiene la fecha de inicio de la sesión.
     *
     * @return La fecha de inicio de la sesión.
     */
    public Date getFechaInicioSesion() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la sesión.
     *
     * @param FechaInicioSesion La fecha de inicio a establecer.
     */
    public void setFechaInicioSesion(Date FechaInicioSesion) {
        this.fechaInicio = FechaInicioSesion;
    }

    /**
     * Obtiene la fecha de fin de la sesión.
     *
     * @return La fecha de fin de la sesión.
     */
    public Date getFechaFinSesion() {
        return fechaFin;
    }

    /**
     * Establece la fecha de fin de la sesión.
     *
     * @param FechaFinSesion La fecha de fin a establecer.
     */
    public void setFechaFinSesion(Date FechaFinSesion) {
        this.fechaFin = FechaFinSesion;
    }

    public EstudianteDTO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    public computadoraDTO getComputadora() {
        return computadora;
    }

    public void setComputadora(computadoraDTO computadora) {
        this.computadora = computadora;
    }

}
