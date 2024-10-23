/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;

import java.sql.Time;

/**
 *
 * @author cesar
 */
public class SesionDTO {
    private int Sesion_ID;
    private Time FechaInicioSesion;
    private Time FechaFinSesion;

    
    
    
    public int getSesion_ID() {
        return Sesion_ID;
    }

    public void setSesion_ID(int Sesion_ID) {
        this.Sesion_ID = Sesion_ID;
    }

    public Time getFechaInicioSesion() {
        return FechaInicioSesion;
    }

    public void setFechaInicioSesion(Time FechaInicioSesion) {
        this.FechaInicioSesion = FechaInicioSesion;
    }

    public Time getFechaFinSesion() {
        return FechaFinSesion;
    }

    public void setFechaFinSesion(Time FechaFinSesion) {
        this.FechaFinSesion = FechaFinSesion;
    }
    
    
    
    
    
    
    
}
