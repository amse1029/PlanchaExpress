/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmReportes extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    /**
     * Creates new form FrmClientes
     */
    public FrmReportes() {
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
        btnMensual = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        btnDiario = new javax.swing.JButton();
        btnSemanal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar clientes");
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
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        btnMensual.setBackground(new java.awt.Color(153, 204, 255));
        btnMensual.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnMensual.setText("Mensual");
        btnMensual.setFocusable(false);
        btnMensual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMensual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualActionPerformed(evt);
            }
        });
        pnlFondo.add(btnMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        lblUsuarios.setFont(new java.awt.Font("Kannada MN", 0, 36)); // NOI18N
        lblUsuarios.setText("Reportes");
        pnlFondo.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnDiario.setBackground(new java.awt.Color(153, 204, 255));
        btnDiario.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnDiario.setText("Diario");
        btnDiario.setFocusable(false);
        btnDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiarioActionPerformed(evt);
            }
        });
        pnlFondo.add(btnDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        btnSemanal.setBackground(new java.awt.Color(153, 204, 255));
        btnSemanal.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnSemanal.setText("Semanal");
        btnSemanal.setFocusable(false);
        btnSemanal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSemanal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemanalActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSemanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualActionPerformed
        // TODO add your handling code here: 
        this.dispose();
        FrmReporteMensual frm = new FrmReporteMensual();
        frm.setVisible(true);
    }//GEN-LAST:event_btnMensualActionPerformed

    private void btnDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmReporteDiario frm = new FrmReporteDiario();
        frm.setVisible(true);
    }//GEN-LAST:event_btnDiarioActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here: 
        this.dispose();
        FrmPrincipal frmPrin = new FrmPrincipal();
        frmPrin.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemanalActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmReporteSemanal frm = new FrmReporteSemanal();
        frm.setVisible(true);
    }//GEN-LAST:event_btnSemanalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiario;
    private javax.swing.JButton btnMensual;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSemanal;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
