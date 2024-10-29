package DTOLabComputo;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class BloqueoDTO {

    private Long Folio;
    private Date FechaFinBloqueo;
    private Date FechaInicioBloqueo;
    private String Motivo;
    private String nombreEstudiante;
    private boolean estBloqueado;
    private Long administradorId;
    private Long estudianteId;

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public BloqueoDTO() {

    }

    public Long getFolio() {
        return Folio;
    }

    public void setFolio(Long Folio) {
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

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public boolean isEstBloqueado() {
        return estBloqueado;
    }

    public void setEstBloqueado(boolean estBloqueado) {
        this.estBloqueado = estBloqueado;
    }

    public Long getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(Long administradorId) {
        this.administradorId = administradorId;
    }

}
