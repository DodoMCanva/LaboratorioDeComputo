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
 * @author cesar
 */
public class CarreraBO implements ICarreraBO {

    private final ICarreraDAO carreraDAO;

    public CarreraBO(ICarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
    }

    @Override
    public CarreraDTO consultarPorNombre(String Carrera) {
        Carrera carrera = carreraDAO.buscarCarreraPorNombre(Carrera);
        return carrera != null ? convertirEntityADTO(carrera) : null;
    }

    public CarreraDTO convertirEntityADTO(Carrera carrera) {
        CarreraDTO carreraDTO = new CarreraDTO();
        carreraDTO.setCarrera_ID(carrera.getId());
        carreraDTO.setNombre(carrera.getNombre());
        carreraDTO.setTiempo(carrera.getTiempo());
        return carreraDTO;
    }
}
