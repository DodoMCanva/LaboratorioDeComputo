/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;


/**
 *
 * @author cesar
 */
public interface IAdministradorDAO {

    // Declaración del método que valida al administrador
    boolean validarAdministrador(String usuario, String contraseña);
}