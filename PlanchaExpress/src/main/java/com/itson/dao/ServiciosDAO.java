/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dao;

import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import com.itson.interfaces.IServiciosDAO;
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
public class ServiciosDAO implements IServiciosDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.itson.planchaexpress");
    EntityManager em = emf.createEntityManager();

    public ServiciosDAO() {
    }

    @Override
    public void insertarServicio() {
        try {
            em.getTransaction().begin();

            Servicio servicio1 = new Servicio("Lavado de cobijas", 100f);
            Servicio servicio2 = new Servicio("Camsisa planchada", 10f);
            Servicio servicio3 = new Servicio("Pantalón planchado", 10f);
            Servicio servicio4 = new Servicio("Vestido planchado", 12f);
            Servicio servicio5 = new Servicio("Lavado de camisas", 50f);

            em.persist(servicio1);
            em.persist(servicio2);
            em.persist(servicio3);
            em.persist(servicio4);
            em.persist(servicio5);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se han insertado los servicios con éxito");
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
        }
    }

    
}