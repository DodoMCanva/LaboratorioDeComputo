package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Equipo 3
 */
@Entity
public class Bloqueo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Folio")
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaInicio")
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaFin")
    private Date fechaFin;

    @Column(name = "Motivo", length = 25)
    private String motivo;

    @Column(name = "estBloqueado")
    private Boolean estBloquedo;

    @ManyToOne
    @JoinColumn(name = "Estudiante_ID")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "Administrador_ID")
    private PersonalAutorizado administrador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public PersonalAutorizado getAdministrador() {
        return administrador;
    }

    public void setAdministrador(PersonalAutorizado administrador) {
        this.administrador = administrador;
    }

    public Boolean getEstBloquedo() {
        return estBloquedo;
    }

    public void setEstBloquedo(Boolean estBloquedo) {
        this.estBloquedo = estBloquedo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloqueo)) {
            return false;
        }
        Bloqueo other = (Bloqueo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Bloqueo[ id=" + id + " ]";
    }

}
