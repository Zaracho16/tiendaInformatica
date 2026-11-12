
package tiendainformatica.vista;

import tiendainformatica.dao.ProductoDAO;
import tiendainformatica.modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Stock.class.getName());
    
    private void cargarStock() {

        DefaultTableModel modelo =
                (DefaultTableModel) tablaProductosRegistradosStock.getModel();

        modelo.setRowCount(0);

        ProductoDAO dao = new ProductoDAO();

        List<Producto> productos = dao.listarProductos();

        for (Producto producto : productos) {

            Object[] fila = {
                producto.getIdProducto(),
                producto.getNombre(),
                producto.getNombreCategoria(),
                producto.getPrecio(),
                producto.getStock()
            };

            modelo.addRow(fila);
        }
    }

    public Stock() {
        
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        cargarStock();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulosStock = new javax.swing.JPanel();
        lblTituloControlDeStock = new javax.swing.JLabel();
        lblSubStock = new javax.swing.JLabel();
        panelControlDeStock = new javax.swing.JPanel();
        lblProductosRegistrados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductosRegistradosStock = new javax.swing.JTable();
        btnActualizarStock = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTitulosStock.setBackground(new java.awt.Color(16, 27, 48));
        panelTitulosStock.setForeground(new java.awt.Color(255, 255, 255));

        lblTituloControlDeStock.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTituloControlDeStock.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloControlDeStock.setText("Control de Stock");

        lblSubStock.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSubStock.setForeground(new java.awt.Color(255, 255, 255));
        lblSubStock.setText("Consulta de existencias de productos");

        javax.swing.GroupLayout panelTitulosStockLayout = new javax.swing.GroupLayout(panelTitulosStock);
        panelTitulosStock.setLayout(panelTitulosStockLayout);
        panelTitulosStockLayout.setHorizontalGroup(
            panelTitulosStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitulosStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloControlDeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubStock, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitulosStockLayout.setVerticalGroup(
            panelTitulosStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloControlDeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubStock)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelControlDeStock.setBackground(new java.awt.Color(255, 255, 255));

        lblProductosRegistrados.setFont(new java.awt.Font("Liberation Sans", 1, 21)); // NOI18N
        lblProductosRegistrados.setForeground(new java.awt.Color(0, 0, 0));
        lblProductosRegistrados.setText("Productos registrados");

        tablaProductosRegistradosStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Categoría", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tablaProductosRegistradosStock);

        btnActualizarStock.setBackground(new java.awt.Color(0, 153, 0));
        btnActualizarStock.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnActualizarStock.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarStock.setText("Actualizar");
        btnActualizarStock.setFocusPainted(false);
        btnActualizarStock.addActionListener(this::btnActualizarStockActionPerformed);

        btnVolver.setBackground(new java.awt.Color(51, 102, 255));
        btnVolver.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setFocusPainted(false);
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        javax.swing.GroupLayout panelControlDeStockLayout = new javax.swing.GroupLayout(panelControlDeStock);
        panelControlDeStock.setLayout(panelControlDeStockLayout);
        panelControlDeStockLayout.setHorizontalGroup(
            panelControlDeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlDeStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlDeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(panelControlDeStockLayout.createSequentialGroup()
                        .addComponent(lblProductosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlDeStockLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelControlDeStockLayout.setVerticalGroup(
            panelControlDeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlDeStockLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblProductosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelControlDeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarStock)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelControlDeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTitulosStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulosStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelControlDeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarStockActionPerformed
        
        cargarStock();
        
        JOptionPane.showMessageDialog(this, "Stock actualizado correctamente");
        
    }//GEN-LAST:event_btnActualizarStockActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     
        this.dispose();
        
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Stock().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarStock;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProductosRegistrados;
    private javax.swing.JLabel lblSubStock;
    private javax.swing.JLabel lblTituloControlDeStock;
    private javax.swing.JPanel panelControlDeStock;
    private javax.swing.JPanel panelTitulosStock;
    private javax.swing.JTable tablaProductosRegistradosStock;
    // End of variables declaration//GEN-END:variables
}
