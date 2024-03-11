/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.itson.dao.ClientesDAO;
import com.itson.dao.ServiciosDAO;
import com.itson.dao.UsuariosDAO;
import com.itson.interfaces.IClientesDAO;
import com.itson.interfaces.IServiciosDAO;
import com.itson.interfaces.IUsuariosDAO;

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
        
        usuarios.insertarUsuario();
        clientes.insertarCliente();
        servicios.insertarServicio();
    }
    
}
