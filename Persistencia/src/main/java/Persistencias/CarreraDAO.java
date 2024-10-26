/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencias;

import DTOLabComputo.CarreraDTO;
import Entidades.Carrera;
import Interfaces.ICarreraDAO;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author cesar
 */
public class CarreraDAO implements ICarreraDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

  @Override
public Carrera buscarCarreraPorNombre(String nombreCarrera) {
    EntityManager em = emf.createEntityManager();
    Carrera carrera = null;

    try {
        TypedQuery<Carrera> query = em.createQuery(
            "SELECT c FROM Carrera c WHERE c.nombre = :nombreCarrera",
            Carrera.class
        );
        query.setParameter("nombreCarrera", nombreCarrera);
        carrera = query.getSingleResult();
    } catch (NoResultException e) {
        System.out.println("Carrera no encontrada: " + e.getMessage());
    } finally {
        em.close();
    }

    return carrera;
}
    public Carrera convertirDTOAEntity(CarreraDTO carreraDTO) {
        Carrera carrera = new Carrera();
        carrera.setId(carrera.getId());
        carrera.setNombre(carreraDTO.getNombre());
        carrera.setTiempo(carreraDTO.getTiempo());
        return carrera;
    }
}
