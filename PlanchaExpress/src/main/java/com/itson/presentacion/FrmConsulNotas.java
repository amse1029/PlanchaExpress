/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.NotaRemision;
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
public class FrmConsulNotas extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    NotaRemision nota;
    
    
    /**
     * Creates new form FrmConsulServicios
     */
    public FrmConsulNotas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.llenarTablaNotas();
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
        lblNota = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        scrlNotas = new javax.swing.JScrollPane();
        tblNotas = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnEditar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNota.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblNota.setText("Consultar notas de remisión");
        pnlFondo.add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, -1));

        tblNotas.setFont(new java.awt.Font("Kannada MN", 0, 14)); // NOI18N
        tblNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Folio", "Cliente", "Total", "Anticipo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlNotas.setViewportView(tblNotas);

        pnlFondo.add(scrlNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 430, 210));

        jToolBar1.setBackground(new java.awt.Color(153, 204, 255));
        jToolBar1.setRollover(true);

        btnEditar.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnDetalles.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        btnDetalles.setText("Detalles");
        btnDetalles.setFocusable(false);
        btnDetalles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetalles.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDetalles);

        btnEntregar.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        btnEntregar.setText("Entregar");
        btnEntregar.setFocusable(false);
        btnEntregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEntregar);

        pnlFondo.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 520, 60));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
        FrmNotasRemision frmRemision = new FrmNotasRemision();
        frmRemision.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // TODO add your handling code here: 
        int filaSeleccionada = tblNotas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            nota = logica.buscarNota(this.obtenerFolio());
            dispose();
            FrmConsulNota frm = new FrmConsulNota(nota);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblNotas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de entregar la nota.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            entregarNota();
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblNotas.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de editar la nota.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            nota = logica.buscarNota(this.obtenerFolio());
            dispose();
            FrmEditarNota1 frm = new FrmEditarNota1(nota);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void llenarTablaNotas() {
        List<NotaRemision> notas = logica.recuperarnotas();
        DefaultTableModel modelo = (DefaultTableModel) this.tblNotas.getModel();
        modelo.setRowCount(0);
        for (NotaRemision nota : notas) {
            Object[] filaNueva = {nota.getFolio(), nota.getCliente(), nota.getTotal(), 
                nota.getAnticipo(), nota.getEstado()};
            modelo.addRow(filaNueva);
        }
    }

    public Long obtenerFolio() {
        Long folio = 0L;
        int fila = tblNotas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna nota");
        } else {
            folio = (Long) tblNotas.getValueAt(fila, 0); // Primera columna
        }
        return folio;
    }
    
    public void entregarNota() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar la entrega de la nota?",
                "Confirmación", JOptionPane.YES_NO_OPTION);

        nota = logica.buscarNota(this.obtenerFolio());
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Si el usuario selecciona "Sí"
            System.out.println("El usuario ha seleccionado Sí.");
            if (logica.realizarEntrega(nota.getFolio())) {
                JOptionPane.showMessageDialog(this, "La nota con folio: " + nota.getFolio() + " ha sido entregada");
                this.setVisible(false);
                FrmNotasRemision notas = new FrmNotasRemision();
                notas.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrio un error al entregar la nota");
            }
        } else {
            // Si el usuario selecciona "No" o cierra el cuadro de diálogo
            System.out.println("El usuario ha seleccionado No o ha cerrado el cuadro de diálogo.");
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane scrlNotas;
    private javax.swing.JTable tblNotas;
    // End of variables declaration//GEN-END:variables
}