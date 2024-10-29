package DTOLabComputo;

/**
 *
 * @author Equipo 3
 */
public class EstudianteDTO {
    private Long Estudiante_ID;
    private String Nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String Contraseña;
    private boolean estaEgresado;
    private CarreraDTO Carrera; 
    
    
    public Long getEstudiante_ID() {
        return Estudiante_ID;
    }

    public void setEstudiante_ID(Long Estudiante_ID) {
        this.Estudiante_ID = Estudiante_ID;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contrasena) {
        this.Contraseña = Contrasena;
    }

    public boolean isEstaEgresado() {
        return estaEgresado;
    }

    public void setEstaEgresado(boolean estaEgresado) {
        this.estaEgresado = estaEgresado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public CarreraDTO getCarrera() {
        return Carrera;
    }

    public void setCarrera(CarreraDTO Carrera) {
        this.Carrera = Carrera;
    }

  
    
    
    
    
}
