/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.itson.dominio.Cliente;
import com.itson.dominio.NotaRemision;
import com.itson.dominio.NotaServicio;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import java.util.List;

/**
 *
 * @author kingu
 */
public interface ILogica {
    public boolean registrarCliente();
    public boolean registrarUsuario();
    public boolean registrarServicio(Servicio servicio);
    public boolean crearNotaRemision(NotaRemision notaRemision);
    public boolean eliminarCliente(Long id);
    public boolean eliminarUsuario(Long id);
    public boolean eliminarServicio(Long id);
    public boolean cancelarNotaRemision(Long id);
    public boolean realizarEntrega(Long id);
    public String buscarNotasCliente(Cliente cliente);
    public NotaRemision buscarNota(Long folio);
    public List<Servicio> recuperarServicios();
    public List<Cliente> recuperarClientes();
    public boolean autenticarUsuario(String nombre, String pass);
    public Usuario buscarUsuario(Long id);
    public boolean insertarNotaServicio(NotaServicio notaServicio);
    public boolean actualizarNotaRemision(NotaRemision nota);
}
