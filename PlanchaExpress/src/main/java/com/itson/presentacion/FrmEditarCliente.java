/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.Cliente;
import javax.swing.JOptionPane;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmEditarCliente extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    Cliente cliente;
    
    /**
     * Creates new form FrmEditarCliente
     */
    public FrmEditarCliente(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        
        this.txtNombre.setText(this.cliente.getNombre());
        this.txtDireccion1.setText(this.cliente.getDireccion());
        this.txtTelefono1.setText(this.cliente.getTelefono());


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //Listener para el evento de cierre
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                FrmServicios servicios = new FrmServicios();
                servicios.setVisible(true);
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
        lblCliente = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblCliente.setText("Editar cliente");
        pnlFondo.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        lblTelefono.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");
        pnlFondo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btnRegistrar1.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrar1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        btnRegistrar1.setText("Confirmar");
        btnRegistrar1.setFocusable(false);
        btnRegistrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, -1));

        lblNombre.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblDireccion.setText("Dirección:");
        pnlFondo.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtNombre.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, -1));

        txtDireccion1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, -1));

        txtTelefono1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmClientes frm = new FrmClientes();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
String nombre = this.txtNombre.getText();
        String direccion = this.txtDireccion1.getText();
        String telefono = this.txtTelefono1.getText();

        if (nombre.matches("[a-zA-Z]+(\\\\s[a-zA-Z]+)*")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (telefono.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(this, "Ingrese un teléfono válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        logica.actualizaCliente(cliente);

        this.dispose();
        FrmClientes frm = new FrmClientes();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}