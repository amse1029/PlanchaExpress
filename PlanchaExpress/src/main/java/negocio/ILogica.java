/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import com.itson.dominio.Cliente;
import com.itson.dominio.NotaRemision;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import java.util.List;

/**
 *
 * @author kingu
 */
public interface ILogica {
    public boolean registrarCliente(Cliente cliente);
    public boolean registrarUsuario(Usuario usuario);
    public boolean registrarServicio(Servicio servicio);
    public boolean crearNotaRemision(NotaRemision notaRemision);
    public boolean eliminarCliente(Long id);
    public boolean eliminarUsuario(Long id);
    public boolean eliminarServicio(Long id);
    public boolean cancelarNotaRemision(Long id);
    public List<NotaRemision> buscarNotasCliente(Cliente cliente);
    public NotaRemision buscarNota(Long folio);
    public List<Servicio> recuperarServicios();
    public List<Cliente> recuperarClientes();
    public boolean autenticarUsuario(String nombre, String pass);
}
