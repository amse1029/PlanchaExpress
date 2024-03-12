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
import enumeradores.Estado;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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
            nota1.setEstado(Estado.CANCELADA);

            em.persist(nota1);
//            em.persist(servicio);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se ha insertado 1 nota con éxito");
        } catch (PersistenceException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            em.getTransaction().rollback();
        }

    }


    @Override
    public boolean eliminarNota(Long folio) {
        NotaRemision notaRemision = em.find(NotaRemision.class, folio);

        if (notaRemision != null) {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            try {

                em.remove(notaRemision);

                transaction.commit();

                System.out.println("Registro eliminado exitosamente.");
                return true;
            } catch (Exception e) {

                if (transaction != null && transaction.isActive()) {
                    transaction.rollback();
                }
                e.printStackTrace();
                return false;
            }
        } else {
            System.out.println("No se encontró ningún registro con el ID proporcionado.");
            
        }

        em.close();
        emf.close();
        return false;
    }

    @Override
    public NotaRemision buscarNota(Long folio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NotaRemision> buscarNotasCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertarNota(Usuario usuario, Cliente cliente,List<Servicio> servicios, float total, Date fecha_recepcion, Date fecha_entrega, Estado estado) throws PersistenceException {
       try {
            em.getTransaction().begin();
            NotaRemision nota = new NotaRemision(usuario,cliente,total,fecha_recepcion,fecha_entrega,estado);
            for (Servicio servicio : servicios) {
               nota.getServicios().add(servicio);
           }
            em.persist(nota);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se insertó la nota");
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar la nota");
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public void cancelarNota(Long folio) {
             NotaRemision notaRemision = em.find(NotaRemision.class, folio);

    
        if (notaRemision != null) {
     
            if (!Objects.equals(notaRemision.getEstado(), Estado.CANCELADA) &&
                !Objects.equals(notaRemision.getEstado(), Estado.COMPLETADA)) {

                EntityTransaction transaction = em.getTransaction();
                transaction.begin();

                try {
 
                    notaRemision.setEstado(Estado.CANCELADA);
                    transaction.commit();
                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback();
                    }
                    e.printStackTrace();
                }
            } else {
                System.out.println("La nota no puede ser cancelada en su estado actual.");
            }
        } else {
            System.out.println("No se encontró la nota con el folio proporcionado.");
        }
    

    }
}
