/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import DTOLabComputo.CarreraDTO;

/**
 * Interfaz ICarreraBO que define los métodos relacionados con la lógica de negocio para la entidad Carrera.
 * Proporciona métodos para consultar información sobre carreras.
 * 
 * Equipo 3
 */
public interface ICarreraBO {
    
    /**
     * Método para consultar una carrera por su nombre.
     * 
     * @param Carrera El nombre de la carrera que se desea consultar.
     * @return Un objeto CarreraDTO que contiene la información de la carrera consultada.
     */
    CarreraDTO consultarPorNombre(String Carrera);
}

