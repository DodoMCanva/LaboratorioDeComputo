/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Persistencias.PersistenciaException;

/**
 *
 * @author cesar
 */
public interface IAdministradorDAO {
    
    public boolean validarCredenciales(String usuario, String contraseña) throws PersistenciaException;
           
}
