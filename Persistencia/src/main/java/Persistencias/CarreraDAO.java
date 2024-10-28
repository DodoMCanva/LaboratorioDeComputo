/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencias;

import DTOLabComputo.CarreraDTO;
import Entidades.Carrera;
import Interfaces.ICarreraDAO;
import java.util.List;
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
            List<Carrera> carreras = query.getResultList();
            if (carreras.size() == 1) {
                carrera = carreras.get(0); // Solo hay una carrera
            } else if (carreras.isEmpty()) {
                System.out.println("Carrera no encontrada.");
            } else {
                System.out.println("Más de una carrera encontrada con el nombre: " + nombreCarrera);
                carrera = carreras.get(0);
            }
        } catch (Exception e) {
            System.out.println("Error en la búsqueda de carrera: " + e.getMessage());
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
