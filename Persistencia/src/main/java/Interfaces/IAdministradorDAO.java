/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 * Interfaz IAdministradorDAO
 *
 * Define las operaciones de acceso a datos para la entidad de administrador
 * autorizado en el sistema, permitiendo validar las credenciales de acceso.
 * Esta interfaz proporciona un contrato que debe ser implementado para realizar
 * la verificación de acceso de los administradores.
 *
 */
public interface IAdministradorDAO {

    /**
     * Valida al administrador verificando que el usuario y la contraseña
     * proporcionados coincidan con los datos almacenados en la base de datos.
     *
     * Este método realiza una búsqueda en la base de datos para verificar si
     * existe un registro que coincida con las credenciales proporcionadas.
     *
     * @param usuario El nombre de usuario del administrador que se desea
     * validar.
     * @param contraseña La contraseña asociada al nombre de usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    boolean validarAdministrador(String usuario, String contraseña);
}
