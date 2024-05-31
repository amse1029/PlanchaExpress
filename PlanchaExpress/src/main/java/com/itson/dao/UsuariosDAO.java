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
import javax.persistence.TypedQuery;
import javax.swing.JFrame;
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
    public boolean insertarUsuario(Usuario usuario) {
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
    
    @Override
    public boolean eliminarUsuario(Long id) {
        try {
            em.getTransaction().begin();

            Usuario usuario = em.find(Usuario.class, id);

            if (usuario != null) {
                em.remove(usuario);
                em.getTransaction().commit();
                return true;
            } else {
                em.getTransaction().rollback();
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean autenticarUsuario(String nombre, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public Usuario consultaUsuario(Long id) {
        try {
            //Busca el id en la clase Cliente
            return em.find(Usuario.class, id);
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar al usuario");
            return null;
        }
    }

    @Override
    public boolean editaUsuario(Usuario usuario) {
        em.getTransaction().begin();
            em.merge(usuario); // Actualiza la entidad en la base de datos
            JOptionPane.showMessageDialog(null, "Usuario actualizado");
            em.getTransaction().commit();
            return true;
        }
    
    // Método para solicitar la contraseña al usuario
    public boolean solicitarContrasenaAdmin(JFrame frm) {
        String contrasenaIngresada = JOptionPane.showInputDialog(frm, "Ingrese la contraseña de administrador:", "Autenticación", JOptionPane.PLAIN_MESSAGE);

        // Aquí deberías verificar si la contraseña ingresada coincide con la del administrador en la base de datos
        String contrasenaAdminRegistrada = obtenerContrasenaAdmin(); // Método ficticio para obtener la contraseña del administrador registrado
        return contrasenaIngresada.equals(contrasenaAdminRegistrada);
    }

    private String obtenerContrasenaAdmin() {
        Usuario admin = this.obtenerUsuarioAdmin();
        return admin.getPass();
    }
    
    public Usuario obtenerUsuarioAdmin() {
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre = :nombre", Usuario.class);
            query.setParameter("nombre", "admin");
            return query.getSingleResult();
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el usuario administrador");
            // Realiza aquí alguna acción adecuada en caso de error, como loggear el error o mostrar un mensaje al usuario
            ex.printStackTrace(); // Esto es solo para propósitos de demostración, podrías manejar el error de otra manera
        }
        return null;
    }
    
    }

