/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTOLabComputo.CarreraDTO;
import Entidades.Carrera;
import Interfaces.ICarreraBO;
import Interfaces.ICarreraDAO;

/**
 *
 * @author Equipo 3
 */
public class CarreraBO implements ICarreraBO {
    // Esta clase es el Business Object (BO) para la entidad Carrera.
    // Implementa la interfaz ICarreraBO y se encarga de la lógica de negocio relacionada con las carreras.

    private final ICarreraDAO carreraDAO;

    // Constructor que recibe un ICarreraDAO. Esto permite que el BO sepa cómo interactuar con la base de datos.
    public CarreraBO(ICarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
    }

    @Override
    public CarreraDTO consultarPorNombre(String Carrera) {
        // Método que busca una carrera por su nombre utilizando el DAO.
        Carrera carrera = carreraDAO.buscarCarreraPorNombre(Carrera);
        // Si se encuentra la carrera, la convierte a DTO; si no, devuelve null.
        return carrera != null ? convertirEntityADTO(carrera) : null;
    }

    public CarreraDTO convertirEntityADTO(Carrera carrera) {
        // Método que convierte una entidad Carrera a su correspondiente DTO.
        CarreraDTO carreraDTO = new CarreraDTO();
        carreraDTO.setCarrera_ID(carrera.getId());
        carreraDTO.setNombre(carrera.getNombre());
        carreraDTO.setTiempo(carrera.getTiempo());
        return carreraDTO;
    }
}
