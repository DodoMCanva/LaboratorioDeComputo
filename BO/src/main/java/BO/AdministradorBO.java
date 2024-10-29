    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Interfaces.IAdministradorBO;
import Interfaces.IAdministradorDAO;
import Persistencias.AdministradorDAO;

/**
 * @author cesar
 */
public class AdministradorBO implements IAdministradorBO {

    private IAdministradorDAO administradorDAO=new AdministradorDAO();
    
    public AdministradorBO(){
    
    }

    public AdministradorBO(IAdministradorDAO administradorDAO) {
        this.administradorDAO = administradorDAO;
    }

    @Override
    public boolean validarCredenciales(String usuario, String contraseña) {
        return administradorDAO.validarAdministrador(usuario, contraseña);
    }
}   