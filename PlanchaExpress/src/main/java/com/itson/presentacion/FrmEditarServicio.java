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
 * @author Cristian
 */
public class FrmEditarServicio extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    /**
     * Creates new form FrmEditarServicio
     */
    public FrmEditarServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.llenarTablaServ();
    }
    
     public void llenarTablaServ() {
        List<Servicio> servicios = logica.recuperarServicios();
        DefaultTableModel modelo = (DefaultTableModel) this.tblServicios.getModel();
        modelo.setRowCount(0);
        for (Servicio servicio : servicios) {
            Object[] filaNueva = {servicio.getId(),servicio.getDescripcion() , servicio.getPrecio()};
            modelo.addRow(filaNueva);
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
        lblEditarServicio = new javax.swing.JLabel();
        scrlServicios = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEditarServicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblEditarServicio.setText("Editar Servicio");
        pnlFondo.add(lblEditarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tblServicios.setFont(new java.awt.Font("Kannada MN", 0, 14)); // NOI18N
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlServicios.setViewportView(tblServicios);

        pnlFondo.add(scrlServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 210));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
           // Obtenemos el índice de la fila seleccionada
           List<Servicio> listaServicios = logica.recuperarServicios();
        int filaSeleccionada = tblServicios.getSelectedRow();


        // Verificamos si hay alguna fila seleccionada
        if (filaSeleccionada != -1) {
//            DlgEditarServicio editarServicio = new DlgEditarServicio(this, true,servicio);
            
        } else {
            // Si no hay fila seleccionada, mostramos un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un servicio a editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmServicios frm = new FrmServicios();
        this.dispose();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblEditarServicio;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane scrlServicios;
    private javax.swing.JTable tblServicios;
    // End of variables declaration//GEN-END:variables
}
