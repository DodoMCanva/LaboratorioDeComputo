/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;


import java.util.Date;

/**
 * Clase BloqueoDTO que representa un objeto de transferencia de datos
 * para la información de bloqueo.
 * 
 * @author cesar
 */
public class BloqueoDTO {
    private int Folio;                  // Número de folio que identifica el bloqueo
    private Date FechaFinBloqueo;       // Fecha en que finaliza el bloqueo
    private Date FechaInicioBloqueo;    // Fecha en que inicia el bloqueo
    private String Motivo;              // Motivo del bloqueo

    /**
     * Constructor por defecto de la clase BloqueoDTO.
     */
    public BloqueoDTO() {
        // Constructor vacío
    }

    /**
     * Obtiene el número de folio del bloqueo.
     * 
     * @return El número de folio.
     */
    public int getFolio() {
        return Folio;
    }

    /**
     * Establece el número de folio del bloqueo.
     * 
     * @param Folio El número de folio a establecer.
     */
    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    /**
     * Obtiene la fecha de fin del bloqueo.
     * 
     * @return La fecha de fin del bloqueo.
     */
    public Date getFechaFinBloqueo() {
        return FechaFinBloqueo;
    }

    /**
     * Establece la fecha de fin del bloqueo.
     * 
     * @param FechaFinBloqueo La fecha de fin a establecer.
     */
    public void setFechaFinBloqueo(Date FechaFinBloqueo) {
        this.FechaFinBloqueo = FechaFinBloqueo;
    }

    /**
     * Obtiene la fecha de inicio del bloqueo.
     * 
     * @return La fecha de inicio del bloqueo.
     */
    public Date getFechaInicioBloqueo() {
        return FechaInicioBloqueo;
    }

    /**
     * Establece la fecha de inicio del bloqueo.
     * 
     * @param FechaInicioBloqueo La fecha de inicio a establecer.
     */
    public void setFechaInicioBloqueo(Date FechaInicioBloqueo) {
        this.FechaInicioBloqueo = FechaInicioBloqueo;
    }

    /**
     * Obtiene el motivo del bloqueo.
     * 
     * @return El motivo del bloqueo.
     */
    public String getMotivo() {
        return Motivo;
    }

    /**
     * Establece el motivo del bloqueo.
     * 
     * @param Motivo El motivo a establecer.
     */
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
}
