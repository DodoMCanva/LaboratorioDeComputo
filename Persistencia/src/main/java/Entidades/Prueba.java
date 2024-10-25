/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entidades;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cesar
 */
public class Prueba {

    public void probarConeccion() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Estudiante());
        em.getTransaction().commit();
        em.close();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");
        CentroLaboratorio centro=new CentroLaboratorio();
        List<Computadora> computadoras= new ArrayList<>();
        
        centro.setCampus("Guaymas");
        centro.setEstEliminado(true);
        //centro.setHoraFin(LocalTime.of(8,30));
        //centro.setHoraInicio(LocalTime.of(6,00));
        centro.setComputadoras(computadoras);
        
        
	EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(centro);
        em.getTransaction().commit();
        em.close();
    }

}
