/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import com.itson.dominio.Usuario;

/**
 *
 * @author alexasoto
 */
public interface IUsuariosDAO {
    
    public void insertarUsuario();
    public Usuario consultaUsuario(Long id);
    
}
