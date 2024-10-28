
package DTOLabComputo;



/**
 *
 * @author cesar
 */
public class CarreraDTO {

    private long Carrera_ID;
    private String Nombre;
    private int tiempo;

    public long getCarrera_ID() {
        return Carrera_ID;
    }

    public void setCarrera_ID(long Carrera_ID) {
        this.Carrera_ID = Carrera_ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}
