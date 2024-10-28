
package Interfaces;

import Entidades.Computadora;
import Entidades.Software;
import java.util.List;

/**
 * Interfaz para operaciones de acceso a datos de Software.
 * @author Equipo 3
 */
public interface ISoftwareDAO {

    // Consulta de software instalado en una computadora específica
    List<Software> obtenerPorComputadora(Computadora computadora);
}

