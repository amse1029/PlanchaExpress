/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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
import java.util.List;

/**
 *
 * @author kingu
 */
public class LogicaNegocio implements ILogica{

    IClientesDAO clientes=new ClientesDAO();
    IUsuariosDAO usuarios=new UsuariosDAO();
    IServiciosDAO servicios=new ServiciosDAO();
    INotasRemisionDAO notas=new NotasRemisionDAO();
    
    @Override
    public boolean registrarCliente(Cliente cliente) {
        return this.clientes.insertarCliente(cliente);
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        return this.usuarios.insertarUsuario(usuario);
    }

    @Override
    public boolean registrarServicio(Servicio servicio) {
        return this.servicios.insertarServicio(servicio);
    }

    @Override
    public boolean crearNotaRemision(NotaRemision notaRemision) {
        return this.notas.insertarNota(notaRemision.getUsuario(), notaRemision.getCliente(), notaRemision.getServicios(), 0, notaRemision.getFecha_recepcion(), notaRemision.getFecha_entrega());
    }

    @Override
    public boolean eliminarCliente(Long id) {
        return this.clientes.eliminarCliente(id);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        return this.usuarios.eliminarUsuario(id);
    }

    @Override
    public boolean eliminarServicio(Long id) {
        return this.servicios.eliminarServicio(id);
    }

    @Override
    public boolean cancelarNotaRemision(Long id) {
        return this.notas.eliminarNota(id);
    }

    @Override
    public List<NotaRemision> buscarNotasCliente(Cliente cliente) {
        return this.notas.buscarNotasCliente(cliente);
    }

    @Override
    public NotaRemision buscarNota(Long folio) {
        return this.notas.buscarNota(folio);
    }

    @Override
    public List<Servicio> recuperarServicios() {
        return this.servicios.buscarServicios();
    }

    @Override
    public List<Cliente> recuperarClientes() {
        return this.clientes.consultarLista();
    }

    @Override
    public boolean autenticarUsuario(String nombre, String pass) {
        return this.usuarios.autenticarUsuario(nombre, pass);
    }
    
}