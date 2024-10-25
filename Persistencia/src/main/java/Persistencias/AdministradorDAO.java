/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencias;

import Entidades.PersonalAutorizado;
import Interfaces.IAdministradorDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author cesar
 */
public class AdministradorDAO implements IAdministradorDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntidadLaboratorio");
    
    @Override
     public boolean validarAdministrador(String usuario, String contraseña) {
        EntityManager em = emf.createEntityManager(); 
        try {
            // Consulta para buscar el administrador
            TypedQuery<PersonalAutorizado> query = em.createQuery(
                "SELECT a FROM PersonalAutorizado a WHERE a.usuario = :usuario AND a.contraseña = :contraseña",
                PersonalAutorizado.class
            );
            query.setParameter("usuario", usuario);
            query.setParameter("contraseña", contraseña);

            List<PersonalAutorizado> resultados = query.getResultList();
            return !resultados.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }
}