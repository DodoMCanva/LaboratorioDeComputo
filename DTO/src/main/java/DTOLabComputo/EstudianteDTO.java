package DTOLabComputo;

/**
 * Clase EstudianteDTO que representa un objeto de transferencia de datos para
 * la información de un estudiante.
 *
 * Esta clase contiene los atributos relevantes de un estudiante, incluyendo su
 * identificación, nombre, apellidos, contraseña, estado de egreso y la carrera
 * asociada al estudiante.
 */
public class EstudianteDTO {

    private Long Estudiante_ID;       // Identificador único del estudiante
    private String Nombre;            // Nombre del estudiante
    private String apellidoPaterno;   // Apellido paterno del estudiante
    private String apellidoMaterno;   // Apellido materno del estudiante
    private String Contraseña;        // Contraseña del estudiante
    private boolean estaEgresado;     // Indica si el estudiante está egresado
    private CarreraDTO Carrera;        // Carrera asociada al estudiante

    /**
     * Obtiene el identificador del estudiante.
     *
     * @return El identificador del estudiante.
     */
    public Long getEstudiante_ID() {
        return Estudiante_ID;
    }

    /**
     * Establece el identificador del estudiante.
     *
     * @param Estudiante_ID El identificador del estudiante a establecer.
     */
    public void setEstudiante_ID(Long Estudiante_ID) {
        this.Estudiante_ID = Estudiante_ID;
    }

    /**
     * Obtiene la contraseña del estudiante.
     *
     * @return La contraseña del estudiante.
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * Establece la contraseña del estudiante.
     *
     * @param Contrasena La contraseña a establecer.
     */
    public void setContraseña(String Contrasena) {
        this.Contraseña = Contrasena;
    }

    /**
     * Verifica si el estudiante está egresado.
     *
     * @return true si el estudiante está egresado, false en caso contrario.
     */
    public boolean isEstaEgresado() {
        return estaEgresado;
    }

    /**
     * Establece el estado de egreso del estudiante.
     *
     * @param estaEgresado El estado de egreso a establecer.
     */
    public void setEstaEgresado(boolean estaEgresado) {
        this.estaEgresado = estaEgresado;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param Nombre El nombre a establecer.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene el apellido paterno del estudiante.
     *
     * @return El apellido paterno del estudiante.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del estudiante.
     *
     * @param apellidoPaterno El apellido paterno a establecer.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del estudiante.
     *
     * @return El apellido materno del estudiante.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del estudiante.
     *
     * @param apellidoMaterno El apellido materno a establecer.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene la carrera asociada al estudiante.
     *
     * @return La carrera del estudiante.
     */
    public CarreraDTO getCarrera() {
        return Carrera;
    }

    /**
     * Establece la carrera asociada al estudiante.
     *
     * @param Carrera La carrera a establecer.
     */
    public void setCarrera(CarreraDTO Carrera) {
        this.Carrera = Carrera;
    }
}
