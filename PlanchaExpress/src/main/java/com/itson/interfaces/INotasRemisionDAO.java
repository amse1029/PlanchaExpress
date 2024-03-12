/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import com.itson.dominio.Cliente;
import com.itson.dominio.NotaRemision;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import enumeradores.Estado;
import java.util.Date;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author alexasoto
 */
public interface INotasRemisionDAO {
    
//    public void insertarNota();
    public boolean insertarNota(Usuario usuario, Cliente cliente, List<Servicio> servicios, 
            float total, Date fecha_recepcion, Date fecha_entrega, Estado estado) throws PersistenceException;
    public boolean eliminarNota(Long folio);
    public void editarNota(Long folio,Usuario usuario, Cliente cliente,List<Servicio> servicios, float total, Date fecha_recepcion, Date fecha_entrega, Estado estado);
    public void cancelarNota(Long folio);
    public NotaRemision buscarNota(Long folio);
    public List<NotaRemision> buscarNotasCliente(Cliente cliente);
}
