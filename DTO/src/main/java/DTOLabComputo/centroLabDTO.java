package DTOLabComputo;

import java.time.LocalTime;

/**
 *
 * @author Equipo 3
 */
public class centroLabDTO {
    
    private int CentroLab_ID;
    private LocalTime HoraInicio;
    private LocalTime HoraFin;
    private String Campus;
    private boolean estEliminado;

    public int getCentroLab_ID() {
        return CentroLab_ID;
    }

    public void setCentroLab_ID(int CentroLab_ID) {
        this.CentroLab_ID = CentroLab_ID;
    }

    public LocalTime getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalTime HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public LocalTime getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(LocalTime HoraFin) {
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
