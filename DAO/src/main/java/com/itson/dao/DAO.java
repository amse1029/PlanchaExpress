/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itson.dao;

import com.itson.dominio.Usuario;
import com.itson.interfaces.IUsuariosDAO;

/**
 *
 * @author alexasoto
 */
public class DAO {

    public static void main(String[] args) {
        IUsuariosDAO usuarios = new UsuariosDAO();
        Usuario usuario=new Usuario();
        usuario.setNombre("Abraham");
        usuario.setPass("Gatito");
        boolean res=usuarios.insertarUsuario(usuario);
        if(res){
            System.out.println("insercion exitosa");
        }else{
            System.out.println("error en insercion");
        }
    }
}
