/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class BloqueoDTO {
    private int Folio;
    private Date FechaFinBloqueo;
    private Date FechaInicioBloqueo;
    private String Motivo;

    public BloqueoDTO() {
        
        
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }
       

    public Date getFechaFinBloqueo() {
        return FechaFinBloqueo;
    }

    public void setFechaFinBloqueo(Date FechaFinBloqueo) {
        this.FechaFinBloqueo = FechaFinBloqueo;
    }

    public Date getFechaInicioBloqueo() {
        return FechaInicioBloqueo;
    }

    public void setFechaInicioBloqueo(Date FechaInicioBloqueo) {
        this.FechaInicioBloqueo = FechaInicioBloqueo;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
    
}
