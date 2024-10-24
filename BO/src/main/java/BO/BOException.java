package BO;

/**
 *
 * @author Equipo 3
 */
public class BOException extends Exception{

    public BOException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public BOException(String mensaje) {
        super(mensaje);
    }
}
