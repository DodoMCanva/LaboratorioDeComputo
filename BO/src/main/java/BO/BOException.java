package BO;

/**
 *
 * @author Equipo 3
 */
public class BOException extends Exception {
    // Esta clase es una excepción personalizada que extiende de Exception.
    // Se utiliza para manejar errores específicos en la capa de negocio (BO).
    
    public BOException(String mensaje, Throwable causa) {
        // Constructor que permite pasar un mensaje de error y la causa original.
        super(mensaje, causa);
    }

    public BOException(String mensaje) {
        // Constructor que solo recibe un mensaje de error.
        super(mensaje);
    }
}

