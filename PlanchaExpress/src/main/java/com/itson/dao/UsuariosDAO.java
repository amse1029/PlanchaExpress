/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dao;

import com.itson.dominio.Usuario;
import com.itson.interfaces.IUsuariosDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
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
    public boolean insertarUsuario(/*Usuario usuario*/) {
        try {
            em.getTransaction().begin();

            Usuario persona1 = new Usuario("Raúl Soto", "admin");
            Usuario persona2 = new Usuario("Elvia Villegas", "recep");

            em.persist(persona1);
            em.persist(persona2);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se han insertado 2 personas con éxito");
            return true;
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
            return false;
        }

        
    }
    
    public Usuario getUsuario(){
       
            em.getTransaction().begin();

            Usuario persona1 = new Usuario("Raúl Sotooo", "admin");
        

            em.persist(persona1);
      

            em.getTransaction().commit();
  
            return persona1;
        }
    
    public Usuario consultaUsuario(Long id){
        try {
            //Busca el id en la clase Usuario
            return em.find(Usuario.class, id);
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar al usuario");
            return null;
        }
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean autenticarUsuario(String nombre, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    }
    
