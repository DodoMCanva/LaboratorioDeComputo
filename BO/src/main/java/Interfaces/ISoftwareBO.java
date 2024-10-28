package Interfaces;

import DTOLabComputo.SoftwareDTO;
import Entidades.Software;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface ISoftwareBO {

    public SoftwareDTO consultarPorNombre(String Software);
}
