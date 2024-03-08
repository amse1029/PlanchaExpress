/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itson.dao;

import com.itson.interfaces.IUsuariosDAO;

/**
 *
 * @author alexasoto
 */
public class DAO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        IUsuariosDAO usuario = new UsuariosDAO();
        usuario.insertar();
    }
}
