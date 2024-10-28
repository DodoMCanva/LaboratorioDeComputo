package Persistencias;

/**
 * Clase personalizada de excepción para manejar errores de persistencia.
 *
 * @author Equipo 3
 */
public class PersistenciaException extends Exception {

    // Constructor que recibe un mensaje de error
    public PersistenciaException(String mensaje) {
        super(mensaje); // Llamar al constructor de la clase base (Exception) con el mensaje
    }

    // Constructor que recibe un mensaje de error y una causa (otra excepción)
    public PersistenciaException(String mensaje, Throwable causa) {
        super(mensaje, causa); // Llamar al constructor de la clase base (Exception) con el mensaje y la causa
    }
}
