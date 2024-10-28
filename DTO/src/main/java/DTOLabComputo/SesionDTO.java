/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;

import java.sql.Time;

/**
 * Clase SesionDTO que representa un objeto de transferencia de datos para la
 * información de una sesión.
 *
 * Esta clase incluye atributos que registran el identificador de la sesión, así
 * como las marcas de tiempo de inicio y fin de la misma.
 */
public class SesionDTO {

    private int Sesion_ID;              // Identificador único de la sesión
    private Time FechaInicioSesion;      // Marca de tiempo del inicio de la sesión
    private Time FechaFinSesion;         // Marca de tiempo del fin de la sesión

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
    public Time getFechaInicioSesion() {
        return FechaInicioSesion;
    }

    /**
     * Establece la fecha de inicio de la sesión.
     *
     * @param FechaInicioSesion La fecha de inicio a establecer.
     */
    public void setFechaInicioSesion(Time FechaInicioSesion) {
        this.FechaInicioSesion = FechaInicioSesion;
    }

    /**
     * Obtiene la fecha de fin de la sesión.
     *
     * @return La fecha de fin de la sesión.
     */
    public Time getFechaFinSesion() {
        return FechaFinSesion;
    }

    /**
     * Establece la fecha de fin de la sesión.
     *
     * @param FechaFinSesion La fecha de fin a establecer.
     */
    public void setFechaFinSesion(Time FechaFinSesion) {
        this.FechaFinSesion = FechaFinSesion;
    }
}
