package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Equipo 3
 */
@Entity
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Estudiante_ID")
    private Long id;

    @Column(name = "Contraseña", length = 15)
    private String contraseña;

    @Column(name = "estaEgresado", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean estaEgresado;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Carrera_ID")
    private Carrera carrera;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private NombreCompleto nombreCompleto;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.PERSIST)
    private List<Sesion> sesiones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstaEgresado() {
        return estaEgresado;
    }

    public void setEstaEgresado(boolean estaEgresado) {
        this.estaEgresado = estaEgresado;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombreCompleto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estudiante[ id=" + id + " ]";
    }

}
