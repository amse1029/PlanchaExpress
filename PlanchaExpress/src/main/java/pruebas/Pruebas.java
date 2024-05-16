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
    
    public static void main(String[] args) {
        IUsuariosDAO usuarios = new UsuariosDAO();
        IClientesDAO clientes = new ClientesDAO();
        
        LogicaNegocio logica = new LogicaNegocio();

        usuarios.insertarUsuario();
        clientes.insertarCliente();


        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
    }
    
}
