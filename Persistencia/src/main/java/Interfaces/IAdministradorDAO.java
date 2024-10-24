
package Interfaces;

import Persistencias.PersistenciaException;

/**
 *
 * @author cesar
 */
public interface IAdministradorDAO {
    
    public boolean validarCredenciales(String usuario, String contraseña) throws PersistenciaException;
           
}
