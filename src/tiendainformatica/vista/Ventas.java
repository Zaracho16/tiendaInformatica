
package tiendainformatica.vista;

import tiendainformatica.modelo.Usuario;
import tiendainformatica.dao.VentaDAO;
import tiendainformatica.modelo.Venta;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class Ventas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventas.class.getName());
    
    private void cargarVentas() {

        DefaultTableModel modelo =
                (DefaultTableModel) tablaVentasRegistradas.getModel();

        modelo.setRowCount(0);

        VentaDAO dao = new VentaDAO();

        List<Venta> ventas = dao.listarVentas();

        SimpleDateFormat formatoFecha =
                new SimpleDateFormat("dd/MM/yyyy HH:mm");

        for (Venta venta : ventas) {

            Object[] fila = {
                venta.getNumeroFactura(),
                formatoFecha.format(venta.getFecha()),
                venta.getNombreCliente(),
                venta.getNombreUsuario(),
                venta.getNombreMetodoPago(),
                venta.getTotal()
            };

            modelo.addRow(fila);
        }
    }

    private Usuario usuario;
    
    public Ventas(Usuario usuario) {
        
        initComponents();
        
        this.usuario = usuario;

        setLocationRelativeTo(null);
        setResizable(false);
        
        cargarVentas();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTituloVentas = new javax.swing.JPanel();
        lblTituloVentas = new javax.swing.JLabel();
        lblSubVentas = new javax.swing.JLabel();
        panelVentasRegistradas = new javax.swing.JPanel();
        lblVentasRegistradas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentasRegistradas = new javax.swing.JTable();
        btnNuevaVenta = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTituloVentas.setBackground(new java.awt.Color(16, 27, 48));

        lblTituloVentas.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTituloVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloVentas.setText("Gestión de Ventas");

        lblSubVentas.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSubVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblSubVentas.setText("Historial de ventas registradas");

        javax.swing.GroupLayout panelTituloVentasLayout = new javax.swing.GroupLayout(panelTituloVentas);
        panelTituloVentas.setLayout(panelTituloVentasLayout);
        panelTituloVentasLayout.setHorizontalGroup(
            panelTituloVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloVentasLayout.setVerticalGroup(
            panelTituloVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubVentas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVentasRegistradas.setBackground(new java.awt.Color(255, 255, 255));

        lblVentasRegistradas.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblVentasRegistradas.setForeground(new java.awt.Color(0, 0, 0));
        lblVentasRegistradas.setText("Ventas registradas");

        tablaVentasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Factura", "Fecha", "Cliente", "Usuario", "Metodo Pago", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaVentasRegistradas);

        btnNuevaVenta.setBackground(new java.awt.Color(0, 153, 0));
        btnNuevaVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.addActionListener(this::btnNuevaVentaActionPerformed);

        btnVolver.setBackground(new java.awt.Color(51, 102, 255));
        btnVolver.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnActualizar.setBackground(new java.awt.Color(0, 153, 255));
        btnActualizar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        javax.swing.GroupLayout panelVentasRegistradasLayout = new javax.swing.GroupLayout(panelVentasRegistradas);
        panelVentasRegistradas.setLayout(panelVentasRegistradasLayout);
        panelVentasRegistradasLayout.setHorizontalGroup(
            panelVentasRegistradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasRegistradasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVentasRegistradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasRegistradasLayout.createSequentialGroup()
                        .addComponent(lblVentasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasRegistradasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelVentasRegistradasLayout.setVerticalGroup(
            panelVentasRegistradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasRegistradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVentasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasRegistradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTituloVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVentasRegistradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTituloVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelVentasRegistradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        
       NuevaVenta nuevaventa = new NuevaVenta(usuario);
       
       nuevaventa.setVisible(true);
       
       this.dispose();
        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
        cargarVentas();

        JOptionPane.showMessageDialog(this, "Historial de ventas actualizado correctamente.");
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubVentas;
    private javax.swing.JLabel lblTituloVentas;
    private javax.swing.JLabel lblVentasRegistradas;
    private javax.swing.JPanel panelTituloVentas;
    private javax.swing.JPanel panelVentasRegistradas;
    private javax.swing.JTable tablaVentasRegistradas;
    // End of variables declaration//GEN-END:variables
}
