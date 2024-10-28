/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;

/**
 * Clase PersonalAutorizadoDTO que representa un objeto de transferencia de
 * datos para la información de un personal autorizado.
 *
 * Esta clase contiene los atributos relevantes de un usuario autorizado,
 * incluyendo su identificador, contraseña y nombre de usuario.
 */
public class PersonalAutorizadoDTO {

    private int Administrador_ID;    // Identificador único del administrador
    private String Constrasena;      // Contraseña del administrador
    private String Usuario;           // Nombre de usuario del administrador

    /**
     * Obtiene el identificador del administrador.
     *
     * @return El identificador del administrador.
     */
    public int getAdministrador_ID() {
        return Administrador_ID;
    }

    /**
     * Establece el identificador del administrador.
     *
     * @param Administrador_ID El identificador a establecer.
     */
    public void setAdministrador_ID(int Administrador_ID) {
        this.Administrador_ID = Administrador_ID;
    }

    /**
     * Obtiene la contraseña del administrador.
     *
     * @return La contraseña del administrador.
     */
    public String getConstrasena() {
        return Constrasena;
    }

    /**
     * Establece la contraseña del administrador.
     *
     * @param Constrasena La contraseña a establecer.
     */
    public void setConstrasena(String Constrasena) {
        this.Constrasena = Constrasena;
    }

    /**
     * Obtiene el nombre de usuario del administrador.
     *
     * @return El nombre de usuario del administrador.
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * Establece el nombre de usuario del administrador.
     *
     * @param Usuario El nombre de usuario a establecer.
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
}
