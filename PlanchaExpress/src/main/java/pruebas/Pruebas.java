/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.itson.dao.ClientesDAO;
import com.itson.dao.NotasRemisionDAO;
import com.itson.dao.ServiciosDAO;
import com.itson.dao.UsuariosDAO;
import com.itson.dominio.Cliente;
import com.itson.dominio.NotaRemision;
import com.itson.dominio.NotaServicio;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import com.itson.interfaces.IClientesDAO;
import com.itson.interfaces.INotasRemisionDAO;
import com.itson.interfaces.IServiciosDAO;
import com.itson.interfaces.IUsuariosDAO;
import com.itson.presentacion.FrmPrincipal;
import enumeradores.Estado;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IUsuariosDAO usuarios = new UsuariosDAO();
        IClientesDAO clientes = new ClientesDAO();
        IServiciosDAO servicios = new ServiciosDAO();
        INotasRemisionDAO notas = new NotasRemisionDAO();
        LogicaNegocio logica=new LogicaNegocio();
        
        usuarios.insertarUsuario();
        clientes.insertarCliente();
        servicios.insertarServicio();
        
        SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yy");
        Date fecha_recepcion = new Date();
        
        Cliente cliente = clientes.consultaCliente(3L);
        Usuario usuario = usuarios.consultaUsuario(2L);
        
        Servicio servicio = servicios.consultaServicio(7L);
        List<NotaServicio> notaServicios = new ArrayList<>();
        NotaServicio notaS=new NotaServicio();
        notaS.setCant(3);
        notaS.setDetalles(servicio.getDescripcion());
        notaS.setServicio(servicio);
        notaS.setPrecio(servicio.getPrecio()*notaS.getCant());
       
        NotaRemision nota=new NotaRemision(usuario, cliente, notaS.getPrecio(), fecha_recepcion, fecha_recepcion, Estado.PENDIENTE);
//        Long fol=notas.insertarNota(usuario, cliente, 0, fecha_recepcion, fecha_recepcion, Estado.PENDIENTE, 0);
        notaS.setNota(nota);
        notaServicios.add(notaS);
        nota.setNotaServicios(notaServicios);
        logica.crearNotaRemision(nota);
//        notas.cancelarNota(62L);

//notas.buscarNota(62L);
//notas.editarNota(412L, usuario, cliente, listaServicios, 80, fecha_recepcion, fecha_recepcion, Estado.CANCELADA);
        String informacionNotas = notas.buscarNotasCliente(cliente);
        System.out.println(informacionNotas);
        
        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
    }
    
}
