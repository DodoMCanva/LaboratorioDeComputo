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
public class SesionDTO {
    private int Sesion_ID;
    private Date FechaInicioSesion;
    private Date FechaFinSesion;
    private computadoraDTO computadora;
    private EstudianteDTO estudiante;

    public int getSesion_ID() {
        return Sesion_ID;
    }

    public void setSesion_ID(int Sesion_ID) {
        this.Sesion_ID = Sesion_ID;
    }

    public Date getFechaInicioSesion() {
        return FechaInicioSesion;
    }

    public void setFechaInicioSesion(Date FechaInicioSesion) {
        this.FechaInicioSesion = FechaInicioSesion;
    }

    public Date getFechaFinSesion() {
        return FechaFinSesion;
    }

    public void setFechaFinSesion(Date FechaFinSesion) {
        this.FechaFinSesion = FechaFinSesion;
    }

    public computadoraDTO getComputadora() {
        return computadora;
    }

    public void setComputadora(computadoraDTO computadora) {
        this.computadora = computadora;
    }

    public EstudianteDTO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    
   
    
    
    
    
    
    
}
