/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmUsuarios extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();

    /**
     * Creates new form FrmUsuarios
     */
    public FrmUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //Listener para el evento de cierre
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Abre la ventana principal
                FrmPrincipal principal = new FrmPrincipal();
                principal.setVisible(true);
            }
        });

        pack();
    }

    private boolean ingresarAdmin() {
        String pass;
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(
                null, passwordField, "Ingrese su contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            char[] password = passwordField.getPassword();
            pass = new String(password);
            long user = this.logica.autenticarUsuario("admin", pass);
            if (user != -1) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ninguna contraseña ingresada");
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar1 = new javax.swing.JButton();
        btnConsultar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Kannada MN", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setFocusable(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        lblUsuarios.setFont(new java.awt.Font("Kannada MN", 0, 36)); // NOI18N
        lblUsuarios.setText("Usuarios");
        pnlFondo.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrar.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFocusable(false);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        btnConsultar1.setBackground(new java.awt.Color(153, 204, 255));
        btnConsultar1.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnConsultar1.setText("Consultar");
        btnConsultar1.setFocusable(false);
        btnConsultar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        btnConsultar2.setBackground(new java.awt.Color(153, 204, 255));
        btnConsultar2.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnConsultar2.setText("Modificar Administrador");
        btnConsultar2.setFocusable(false);
        btnConsultar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar2ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnConsultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here: 
        this.dispose();
        FrmPrincipal frmPrin = new FrmPrincipal();
        frmPrin.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        FrmRegisUsuario frm = new FrmRegisUsuario();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmConsulUsuarios frm = new FrmConsulUsuarios();
        frm.setVisible(true);
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar2ActionPerformed
        // TODO add your handling code here:
        if (this.ingresarAdmin()) {
            String pass;
            JPasswordField passwordField = new JPasswordField();
            int option = JOptionPane.showConfirmDialog(
                    null, passwordField, "Ingrese su nueva contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                char[] password = passwordField.getPassword();
                pass = new String(password);
                String pass2;
                option = JOptionPane.showConfirmDialog(
                        null, passwordField, "Confirme su nueva contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (option == JOptionPane.OK_OPTION) {
                    password = passwordField.getPassword();
                    pass2 = new String(password);
                    if (pass.equals(pass2)) {
                        Usuario usuario = new Usuario("admin", pass);
                        logica.actualizaUsuario(usuario);
                    }else{
                        JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no coinciden");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Ninguna contraseña ingresada");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ninguna contraseña ingresada");
            }
        }
    }//GEN-LAST:event_btnConsultar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnConsultar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
