/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.presentacion;

import com.itson.dominio.NotaRemision;
import com.itson.dominio.NotaServicio;
import com.itson.dominio.Servicio;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import negocio.ILogica;
import negocio.LogicaNegocio;

/**
 *
 * @author alexasoto
 */
public class FrmReporteDiario extends javax.swing.JFrame {

    ILogica logica = new LogicaNegocio();
    NotaRemision nota;

    /**
     * Creates new form FrmConsulServicios
     */
    public FrmReporteDiario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.llenarTablaNotas();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //Listener para el evento de cierre
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                FrmReportes frmReportes = new FrmReportes();
                frmReportes.setVisible(true);
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
        lblNota1 = new javax.swing.JLabel();
        scrlNotas1 = new javax.swing.JScrollPane();
        tblEntregadas = new javax.swing.JTable();
        lblNota2 = new javax.swing.JLabel();
        scrlNotas2 = new javax.swing.JScrollPane();
        tblCreadas = new javax.swing.JTable();
        lblNota3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 100, -1));

        lblNota1.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblNota1.setText("Reporte Diario");
        pnlFondo.add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        tblEntregadas.setFont(new java.awt.Font("Kannada MN", 0, 14)); // NOI18N
        tblEntregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Folio", "Cliente", "Servicios", "Total", "Resto Pagado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlNotas1.setViewportView(tblEntregadas);

        pnlFondo.add(scrlNotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 860, 90));

        lblNota2.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblNota2.setText("Entregadas");
        pnlFondo.add(lblNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        tblCreadas.setFont(new java.awt.Font("Kannada MN", 0, 14)); // NOI18N
        tblCreadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Folio", "Cliente", "Servicios", "Total", "Anticipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlNotas2.setViewportView(tblCreadas);

        pnlFondo.add(scrlNotas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 860, 90));

        lblNota3.setFont(new java.awt.Font("Kannada MN", 0, 20)); // NOI18N
        lblNota3.setText("Creadas");
        pnlFondo.add(lblNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
        FrmReportes frmReportes = new FrmReportes();
        frmReportes.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void llenarTablaNotas() {
        List<NotaRemision> notas = logica.recuperarnotas();
        DefaultTableModel creadas = (DefaultTableModel) this.tblCreadas.getModel();
        DefaultTableModel entregadas = (DefaultTableModel) this.tblEntregadas.getModel();
        creadas.setRowCount(0);
        entregadas.setRowCount(0);

        LocalDate fechaActual = LocalDate.now();

        for (NotaRemision nota : notas) {
            LocalDate fechaRecepcion = nota.getFecha_recepcion().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

            StringBuilder servicios = new StringBuilder();
            for (NotaServicio notaServicio : nota.getNotaServicios()) {
                servicios.append(notaServicio.getServicio().getDescripcion())
                        .append(", ").append(notaServicio.getCant())
                        .append(", ").append(notaServicio.getServicio().getPrecio())
                        .append(", ").append(notaServicio.getPrecio()).append("\n");
            }

            if (fechaRecepcion.equals(fechaActual)) {
                Object[] filaNueva = {nota.getFolio(), nota.getCliente(), servicios.toString(), nota.getTotal(), nota.getAnticipo()};
                creadas.addRow(filaNueva);
            }

            if (nota.getFecha_entregada() != null) {
                LocalDate fechaEntregada = nota.getFecha_entregada().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();

                if (fechaEntregada.equals(fechaActual)) {
                    Object[] filaNueva = {nota.getFolio(), nota.getCliente(), servicios.toString(), nota.getTotal(), nota.getTotal() - nota.getAnticipo()};
                    entregadas.addRow(filaNueva);
                }
            }
        }
        
        this.tblCreadas.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
        this.tblEntregadas.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
    }

    class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {

        public MultiLineCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value != null ? value.toString() : "");
            setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
            if (table.getRowHeight(row) < getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height);
            }
            return this;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane scrlNotas1;
    private javax.swing.JScrollPane scrlNotas2;
    private javax.swing.JTable tblCreadas;
    private javax.swing.JTable tblEntregadas;
    // End of variables declaration//GEN-END:variables
}
