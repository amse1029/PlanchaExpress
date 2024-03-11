/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dao;

import com.itson.dominio.Usuario;
import com.itson.interfaces.IUsuariosDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author alexasoto
 */
public class UsuariosDAO implements IUsuariosDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.itson.planchaexpress");
    EntityManager em = emf.createEntityManager();

    public UsuariosDAO() {
    }

    @Override
    public void insertarUsuario() {
        try {
            em.getTransaction().begin();

            Usuario persona1 = new Usuario("Raúl Soto", "admin");
            Usuario persona2 = new Usuario("Elvia Villegas", "recep");

            em.persist(persona1);
            em.persist(persona2);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se han insertado 2 personas con éxito");
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
        }

        
    }
    
    public Usuario getUsuario(){
       
            em.getTransaction().begin();

            Usuario persona1 = new Usuario("Raúl Sotooo", "admin");
        

            em.persist(persona1);
      

            em.getTransaction().commit();
  
            return persona1;
        }
    

    
    }
    
