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
public class centroLabDTO {
    
    private int CentroLab_ID;
    private Time HoraInicio;
    private Time HoraFin;
    private String Campus;
    private boolean estEliminado;

    public int getCentroLab_ID() {
        return CentroLab_ID;
    }

    public void setCentroLab_ID(int CentroLab_ID) {
        this.CentroLab_ID = CentroLab_ID;
    }

    public Time getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Time HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Time getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(Time HoraFin) {
        this.HoraFin = HoraFin;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public boolean isEstEliminado() {
        return estEliminado;
    }

    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }
    
    
    
    
    
}
