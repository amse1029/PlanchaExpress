/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.Cliente;
import com.itson.dominio.Servicio;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmCrearNota extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    List<Servicio> listaServicios = logica.recuperarServicios();
    
    
    /**
     * Creates new form FrmCrearNota
     */
    public FrmCrearNota() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        llenarListaClientes();
        agregarBotonesServicios(listaServicios); // Llama al método para agregar los botones correspondientes

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
        lblUsuarios = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        cbxClientes = new javax.swing.JComboBox<>();
        btnRegistrar1 = new javax.swing.JButton();
        lblCliente1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtAnticipo = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        lblServicios1 = new javax.swing.JLabel();
        lblAnticipo = new javax.swing.JLabel();
        lblEntrega1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCrear1 = new javax.swing.JButton();
        txtTelefono1 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        scrlServicios = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        pnlServicios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear nota de remisión");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuarios.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblUsuarios.setText("Crear nota de remisión");
        pnlFondo.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 100, -1));

        lblTelefono.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");
        pnlFondo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        cbxClientes.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        cbxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientesActionPerformed(evt);
            }
        });
        pnlFondo.add(cbxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, -1));

        btnRegistrar1.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrar1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        btnRegistrar1.setText("Registrar cliente");
        btnRegistrar1.setFocusable(false);
        btnRegistrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, -1));

        lblCliente1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblCliente1.setText("Cliente:");
        pnlFondo.add(lblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblDireccion.setText("Dirección:");
        pnlFondo.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtAnticipo.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        pnlFondo.add(txtAnticipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 190, -1));

        txtDireccion1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        txtDireccion1.setEnabled(false);
        pnlFondo.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, -1));

        lblServicios1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblServicios1.setText("Servicios:");
        pnlFondo.add(lblServicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblAnticipo.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblAnticipo.setText("Anticipo:");
        pnlFondo.add(lblAnticipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        lblEntrega1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblEntrega1.setText("Fecha de entrega:");
        pnlFondo.add(lblEntrega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        lblTotal.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        lblTotal.setText("Total:");
        pnlFondo.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        btnCrear1.setBackground(new java.awt.Color(153, 204, 255));
        btnCrear1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        btnCrear1.setText("Crear");
        btnCrear1.setFocusable(false);
        btnCrear1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrear1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 80, -1));

        txtTelefono1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        txtTelefono1.setEnabled(false);
        pnlFondo.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, -1));

        txtTotal1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N
        txtTotal1.setEnabled(false);
        pnlFondo.add(txtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 190, -1));

        scrlServicios.setEnabled(false);
        scrlServicios.setFont(new java.awt.Font("Kannada Sangam MN", 0, 13)); // NOI18N

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripción", "Cantidad", "Precio unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlServicios.setViewportView(tblServicios);

        pnlFondo.add(scrlServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 430, 210));
        pnlFondo.add(pnlServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 410, 410));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrmNotasRemision frm = new FrmNotasRemision();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
        FrmRegistrarCliente frm = new FrmRegistrarCliente();
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrear1ActionPerformed

    private void cbxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesActionPerformed
        // TODO add your handling code here:
        mostrarAtributosClienteSeleccionado();
    }//GEN-LAST:event_cbxClientesActionPerformed

    public void llenarListaClientes() {
        List<Cliente> listaClientes = logica.recuperarClientes();
        for (Cliente cliente : listaClientes) {
            cbxClientes.addItem(cliente);
        }
    }
    
    public void mostrarAtributosClienteSeleccionado() {
    // Obtener el cliente seleccionado del ComboBox
    Cliente clienteSeleccionado = (Cliente) cbxClientes.getSelectedItem();

    // Mostrar los atributos del cliente en el TextArea
    if (clienteSeleccionado != null) {
        txtDireccion1.setText(clienteSeleccionado.getDireccion());
        txtTelefono1.setText(clienteSeleccionado.getTelefono());
    }
    }
    
    private void agregarBotonesServicios(List<Servicio> servicios) {
        for (Servicio servicio : servicios) {
            JButton botonServicio = new JButton(servicio.getDescripcion()); // Utiliza el nombre del servicio como texto del botón
            botonServicio.setSize(100, 50); // Establece el tamaño del botón a 100x50 píxeles
            botonServicio.setBackground(new Color(153, 204, 255)); // Establece el color de fondo del botón a rojo
            botonServicio.setForeground(Color.BLACK); // Establece el color del texto del botón a blanco

            pnlServicios.add(botonServicio);
        }
        pnlServicios.revalidate(); // Actualiza el panel para reflejar los cambios
}
    
    private void obtenerListaServicios() {
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear1;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<Cliente> cbxClientes;
    private javax.swing.JLabel lblAnticipo;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEntrega1;
    private javax.swing.JLabel lblServicios1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlServicios;
    private javax.swing.JScrollPane scrlServicios;
    private javax.swing.JTable tblServicios;
    private javax.swing.JTextField txtAnticipo;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTotal1;
    // End of variables declaration//GEN-END:variables
}
