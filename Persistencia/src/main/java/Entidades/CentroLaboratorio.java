package Entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Equipo 3
 */
@Entity
public class CentroLaboratorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CentroLab_ID", nullable = false)
    private Long id;

    @Column(name = "HoraInicio", nullable = false)
    private Time horaInicio;

    @Column(name = "HoraFin", nullable = false)
    private Time horaFin;

    @Column(name = "Campus", length = 10, nullable = false)
    private String campus;

    @Column(name = "estEliminado", nullable = false)
    private boolean estEliminado;

    @OneToMany(mappedBy = "centroLab")
    private List<Computadora> computadoras;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time  getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time  horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time  getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public boolean isEstEliminado() {
        return estEliminado;
    }

    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(List<Computadora> computadoras) {
        this.computadoras = computadoras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CentroLaboratorio)) {
            return false;
        }
        CentroLaboratorio other = (CentroLaboratorio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CentroLaboratorio[ id=" + id + " ]";
    }
    
}
