/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Carrera;

/**
 * Interfaz ICarreraDAO
 *
 * Define las operaciones de acceso a datos para la entidad Carrera,
 * proporcionando un contrato para implementar métodos que permitan buscar,
 * guardar y actualizar datos de Carrera en la base de datos.
 */
public interface ICarreraDAO {

    /**
     * Busca una carrera en la base de datos a partir de su nombre.
     *
     * Este método permite encontrar una entidad Carrera que coincida
     * exactamente con el nombre especificado. Es útil para realizar búsquedas
     * rápidas cuando solo se tiene el nombre de la carrera.
     *
     * @param Carrera
     * @return La entidad Carrera correspondiente si se encuentra una
     * coincidencia, o null si no existe ninguna carrera con ese nombre.
     */
    Carrera buscarCarreraPorNombre(String Carrera);

}
