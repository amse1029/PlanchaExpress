/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import com.itson.dominio.Cliente;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import java.util.Date;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author alexasoto
 */
public interface INotasRemisionDAO {
    
    public void insertarNota();
    public void insertarNota(Usuario usuario, Cliente cliente, List<Servicio> servicios, 
            float total, Date fecha_recepcion, Date fecha_entrega) throws PersistenceException;
    
}
