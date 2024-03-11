/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dao;

import com.itson.dominio.Cliente;
import com.itson.dominio.NotaRemision;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import com.itson.interfaces.INotasRemisionDAO;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexasoto
 */
public class NotasRemisionDAO implements INotasRemisionDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.itson.planchaexpress");
    EntityManager em = emf.createEntityManager();

    @Override
     public void insertarNota() {
         
         UsuariosDAO usuarios = new UsuariosDAO();
         ClientesDAO clientes = new ClientesDAO();
         ServiciosDAO servicios = new ServiciosDAO();
        try {
            em.getTransaction().begin();

            
            Date fechaActual = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaActual);

            int minutosAAgregar = 60;

            calendar.add(Calendar.MINUTE, minutosAAgregar);

            Date entrega = calendar.getTime();

            NotaRemision nota1 = new NotaRemision();
            nota1.setFecha_entrega(entrega);
            nota1.setFecha_recepcion(fechaActual);
            nota1.setUsuario(usuarios.getUsuario());
            nota1.setTotal(50);
            nota1.setCliente(clientes.getCliente());
            Servicio servicio = servicios.getServicio();
            nota1.getServicios().add(servicio);
            

            

            em.persist(nota1);
//            em.persist(servicio);
          

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se ha insertado 1 nota con éxito");
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
        }

        
    }
    
}
