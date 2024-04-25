/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.Servicio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmRegistrarServ extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    
    /**
     * Creates new form FrmRegistrarServ
     */
    public FrmRegistrarServ() {
        initComponents();
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
        lblServicio = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServicio.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblServicio.setText("Registrar servicios");
        pnlFondo.add(lblServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setFocusable(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        btnRegistrar1.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrar1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.setFocusable(false);
        btnRegistrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 100, -1));

        lblDescripcion.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblDescripcion.setText("Descripción:");
        pnlFondo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        txtPrecio.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, -1));

        lblPrecio.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblPrecio.setText("Precio:");
        pnlFondo.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmServicios frm = new FrmServicios();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
        String descripcion = this.txtDescripcion.getText();
        String precioStr = this.txtPrecio.getText();

        if (descripcion.length() > 200 || !descripcion.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Ingrese una descripción válida y no mayor a 200 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        float precio;
        try {
            precio = Float.parseFloat(precioStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        Servicio servicio = new Servicio(descripcion, precio);
        logica.registrarServicio(servicio);

        this.dispose();
        FrmServicios servicios = new FrmServicios();
        servicios.setVisible(true);

    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
