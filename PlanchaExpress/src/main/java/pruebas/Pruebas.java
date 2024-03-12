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
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import com.itson.interfaces.IClientesDAO;
import com.itson.interfaces.INotasRemisionDAO;
import com.itson.interfaces.IServiciosDAO;
import com.itson.interfaces.IUsuariosDAO;
import enumeradores.Estado;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        
//        usuarios.insertarUsuario();
//        clientes.insertarCliente();
//        servicios.insertarServicio();
//        
        SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yy");
        Date fecha_recepcion = new Date();

        Cliente cliente = clientes.consultaCliente(5L);
        Usuario usuario = usuarios.consultaUsuario(201L);

        Servicio servicio = servicios.consultaServicio(8L);
        List<Servicio> listaServicios = new ArrayList<>();
        listaServicios.add(servicio);
//        notas.insertarNota(usuario, cliente,listaServicios,0, fecha_recepcion, fecha_recepcion,Estado.PENDIENTE);
//        notas.cancelarNota(412L);

//notas.buscarNota(412L);
notas.editarNota(412L, usuario, cliente, listaServicios, 80, fecha_recepcion, fecha_recepcion, Estado.CANCELADA);
    }
    
}
