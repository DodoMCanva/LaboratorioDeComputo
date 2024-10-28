
package Interfaces;

import Entidades.Computadora;
import Entidades.Software;
import Persistencias.PersistenciaException;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface ISoftwareDAO {

    public List<Software> obtenerPorComputadora(Computadora computadora);
}
