/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Interfaces.IAdministradorBO;
import Interfaces.IAdministradorDAO;
import Persistencias.AdministradorDAO;

/**
 * Clase AdministradorBO, responsable de la lógica de negocio relacionada con el administrador.
 * Implementa la interfaz IAdministradorBO y utiliza un DAO para interactuar con la base de datos.
 * 
 * Esta clase permite validar credenciales de administrador y facilita la interacción
 * con la capa de persistencia a través del DAO correspondiente.
 * 
 * @author Equipo 3
 */
public class AdministradorBO implements IAdministradorBO {

    // DAO para acceder a los datos del administrador en la base de datos
    private IAdministradorDAO administradorDAO = new AdministradorDAO();

    /**
     * Constructor vacío que inicializa el AdministradorBO con un DAO por defecto.
     */
    public AdministradorBO() {
    }

    /**
     * Constructor que permite inyectar un DAO específico para el administrador.
     * Esto es útil para cambiar el DAO en caso de necesitar una implementación diferente.
     *
     * @param administradorDAO Implementación de IAdministradorDAO para acceder a los datos del administrador
     */
    public AdministradorBO(IAdministradorDAO administradorDAO) {
        this.administradorDAO = administradorDAO;
    }

    /**
     * Valida las credenciales de un administrador llamando al método validarAdministrador en el DAO.
     *
     * @param usuario Nombre de usuario del administrador
     * @param contraseña Contraseña del administrador
     * @return true si las credenciales son válidas; false en caso contrario
     */
    @Override
    public boolean validarCredenciales(String usuario, String contraseña) {
        return administradorDAO.validarAdministrador(usuario, contraseña);
    }
}    
