
package BO;

import Interfaces.IAdministradorBO;
import Interfaces.IAdministradorDAO;

/**
 *
 * @author cesar
 */
public class AdministradorBO implements IAdministradorBO{

    
    private IAdministradorDAO administradorDAO;

    public AdministradorBO(IAdministradorDAO administradorDAO) {
        this.administradorDAO =  administradorDAO;
    }

    @Override
    public boolean validarCredenciales(String usuario, String contraseña) {
        return administradorDAO.validarCredenciales(usuario, contraseña);
    }
}

