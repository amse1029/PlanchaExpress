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
import javax.swing.JOptionPane;

/**
 *
 * @author alexasoto
 */
public class UsuariosDAO implements IUsuariosDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.itson.agenciafiscal");
    EntityManager em = emf.createEntityManager();
    
    /**
     * Método que realiza una inserción de 2 usuarios
     */
    @Override
    public void insertar() {
        try {
            em.getTransaction().begin();

            Usuario admin = new Usuario("Raúl Soto", "1234");
            Usuario recepcionista = new Usuario("Elvia Villegas", "1234");

            em.persist(admin);
            em.persist(recepcionista);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se ha insertado el admin con éxito");
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
        }
    }
    }
    
