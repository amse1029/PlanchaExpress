/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.NotaRemision;
import javax.swing.JOptionPane;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmNotasRemision extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    NotaRemision nota;
    
    /**
     * Creates new form FrmNotasRemision
     */
    public FrmNotasRemision() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
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
        btnConsultar = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar notas de remisión");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultar.setBackground(new java.awt.Color(153, 204, 255));
        btnConsultar.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setFocusable(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        lblUsuarios.setFont(new java.awt.Font("Kannada MN", 0, 36)); // NOI18N
        lblUsuarios.setText("Notas de remisión");
        pnlFondo.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

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
        pnlFondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        btnEditar.setBackground(new java.awt.Color(153, 204, 255));
        btnEditar.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String folio = JOptionPane.showInputDialog(null, "Ingrese el folio:", "Solicitud de folio", JOptionPane.QUESTION_MESSAGE);
        nota = logica.buscarNota(Long.parseLong(folio));
        FrmConsulNota frm = new FrmConsulNota(nota);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmCrearNota frm = new FrmCrearNota();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String folio = "";
        do {
            folio = JOptionPane.showInputDialog(null, "Ingrese el folio:", "Solicitud de folio", JOptionPane.QUESTION_MESSAGE);
            if (folio == null) {
                this.setVisible(true);
                return;
            } else if (folio.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de folio");
            }
        } while (folio.equals(""));
        nota = logica.buscarNota(Long.parseLong(folio));
        FrmEditarNota1 frm = new FrmEditarNota1(nota);
        frm.setVisible(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        FrmPrincipal frmPrin = new FrmPrincipal();
        frmPrin.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
