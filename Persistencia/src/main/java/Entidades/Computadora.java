package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Equipo 3
 */
@Entity
public class Computadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Computadora_ID")
    private Long id;

    @Column(name = "IP", length = 13, unique = true)
    private String ip;

    @Column(name = "NumeroPC")
    private int numeroPC;

    @Column(name = "Estatus", length = 20)
    private String estatus;

    @Column(name = "estEliminado")
    private boolean estEliminado;

    @Column(name = "TipoUsuario", length = 20)
    private String tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "CentroLab_ID")
    private CentroLaboratorio centroLab;

    @OneToMany(mappedBy = "computadora")
    private List<Sesion> sesiones;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getNumeroPC() {
        return numeroPC;
    }

    public void setNumeroPC(int numeroPC) {
        this.numeroPC = numeroPC;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public boolean isEstEliminado() {
        return estEliminado;
    }

    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public CentroLaboratorio getCentroLab() {
        return centroLab;
    }

    public void setCentroLab(CentroLaboratorio centroLab) {
        this.centroLab = centroLab;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Computadora)) {
            return false;
        }
        Computadora other = (Computadora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Computadora[ id=" + id + " ]";
    }
    
}
