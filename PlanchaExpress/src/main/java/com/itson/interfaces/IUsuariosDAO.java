/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import com.itson.dominio.Usuario;
import java.util.List;

/**
 *
 * @author alexasoto
 */
public interface IUsuariosDAO {
    
    public boolean insertarUsuario(Usuario usuario);
    public Usuario consultaUsuario(Long id);
    public boolean eliminarUsuario(Long id);
    public boolean autenticarUsuario(String nombre, String pass);
    public List<Usuario> buscarUsuarios();
    public boolean editaUsuario(Usuario usuario);
}
