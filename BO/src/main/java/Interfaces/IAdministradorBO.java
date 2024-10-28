/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 * Interfaz IAdministradorBO que define los métodos relacionados con la lógica de negocio para la administración.
 * Proporciona métodos para la validación de credenciales de administrador.
 * 
 * Equipo 3
 */
public interface IAdministradorBO {
   
    /**
     * Método para validar las credenciales de un administrador.
     * 
     * @param usuario El nombre de usuario del administrador.
     * @param contraseña La contraseña del administrador.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    boolean validarCredenciales(String usuario, String contraseña);
}
