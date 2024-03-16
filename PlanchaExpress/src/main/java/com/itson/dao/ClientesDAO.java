/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dao;

import com.itson.dominio.Cliente;
import com.itson.interfaces.IClientesDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author alexasoto
 */
public class ClientesDAO implements IClientesDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.itson.planchaexpress");
    EntityManager em = emf.createEntityManager();

    public ClientesDAO() {
    }

    @Override
    public boolean insertarCliente(/*Cliente cliente*/) {
        try {
            em.getTransaction().begin();

            Cliente cliente1 = new Cliente("Alexa María Soto Esquer", "6471220381", "Reforma 37");
            Cliente cliente2 = new Cliente("Abraham Quintana García", "12", "bla");
            Cliente cliente3 = new Cliente("Cristian Arreola", "12", "bla");
            Cliente cliente4 = new Cliente("Ivan Tapia Moreno", "12", "bla");

            em.persist(cliente1);
            em.persist(cliente2);
            em.persist(cliente3);
            em.persist(cliente4);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se han insertado 4 clientes con éxito");
            return true;
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
            return false;
        }
    }
     public Cliente getCliente(){
       
            em.getTransaction().begin();

            Cliente cliente = new Cliente("Raúl Sotoo", "123","mx");
        

            em.persist(cliente);
      

            em.getTransaction().commit();
  
            return cliente;
      
    }

    @Override
    public Cliente consultaCliente(Long id) {
        try {
            //Busca el id en la clase Cliente
            return em.find(Cliente.class, id);
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar al cliente");
            return null;
        }
    }
    
    @Override
    public List<Cliente> consultarLista() {
        try {
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
        return query.getResultList();
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados");
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public boolean eliminarCliente(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
