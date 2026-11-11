
package tiendainformatica.vista;

public class NuevaVenta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NuevaVenta.class.getName());

    public NuevaVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTituloNuevaVenta = new javax.swing.JPanel();
        lblNuevaVenta = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JPanel();
        lblDatosVenta = new javax.swing.JLabel();
        lblNroFactura = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        lblFechaVenta = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        txtTotalVenta = new javax.swing.JPanel();
        lblDetalleVenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleVenta = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblTotalVenta = new javax.swing.JLabel();
        txtVentaTotal = new javax.swing.JTextField();
        panelMetodoPago = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbMetodoDePago = new javax.swing.JComboBox<>();
        lblSeleccionarMetodoPago = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelAgregarProductos = new javax.swing.JPanel();
        lblAgregarProductos = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecioUnitario = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTituloNuevaVenta.setBackground(new java.awt.Color(16, 27, 48));

        lblNuevaVenta.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaVenta.setText("Nueva Venta");

        javax.swing.GroupLayout panelTituloNuevaVentaLayout = new javax.swing.GroupLayout(panelTituloNuevaVenta);
        panelTituloNuevaVenta.setLayout(panelTituloNuevaVentaLayout);
        panelTituloNuevaVentaLayout.setHorizontalGroup(
            panelTituloNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloNuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloNuevaVentaLayout.setVerticalGroup(
            panelTituloNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloNuevaVentaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNuevaVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNumeroFactura.setBackground(new java.awt.Color(255, 255, 255));

        lblDatosVenta.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDatosVenta.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosVenta.setText("Datos de la venta");

        lblNroFactura.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblNroFactura.setForeground(new java.awt.Color(0, 0, 0));
        lblNroFactura.setText("Número de factura");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cliente");

        cbCliente.setBackground(new java.awt.Color(204, 204, 204));
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFechaVenta.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblFechaVenta.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaVenta.setText("Fecha");

        txtFechaVenta.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout txtNumeroFacturaLayout = new javax.swing.GroupLayout(txtNumeroFactura);
        txtNumeroFactura.setLayout(txtNumeroFacturaLayout);
        txtNumeroFacturaLayout.setHorizontalGroup(
            txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNumeroFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatosVenta)
                    .addGroup(txtNumeroFacturaLayout.createSequentialGroup()
                        .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        txtNumeroFacturaLayout.setVerticalGroup(
            txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNumeroFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroFactura)
                    .addComponent(lblFechaVenta)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNumeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTotalVenta.setBackground(new java.awt.Color(255, 255, 255));

        lblDetalleVenta.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDetalleVenta.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalleVenta.setText("Detalle de la venta");

        tablaDetalleVenta.setForeground(new java.awt.Color(0, 0, 0));
        tablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cant.", "Precio", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalleVenta);

        lblTotal.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL:");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));

        lblTotalVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTotalVenta.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalVenta.setText("TOTAL:");

        txtVentaTotal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout txtTotalVentaLayout = new javax.swing.GroupLayout(txtTotalVenta);
        txtTotalVenta.setLayout(txtTotalVentaLayout);
        txtTotalVentaLayout.setHorizontalGroup(
            txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTotalVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(txtTotalVentaLayout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtTotalVentaLayout.createSequentialGroup()
                        .addGroup(txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtTotalVentaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblTotalVenta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTotalVentaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        txtTotalVentaLayout.setVerticalGroup(
            txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTotalVentaLayout.createSequentialGroup()
                .addComponent(lblDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalVenta)
                    .addComponent(txtVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(txtTotalVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMetodoPago.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Método de pago");

        cbMetodoDePago.setBackground(new java.awt.Color(204, 204, 204));
        cbMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSeleccionarMetodoPago.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblSeleccionarMetodoPago.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccionarMetodoPago.setText("Seleccionar método");

        btnRegistrarVenta.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrarVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar venta");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");

        javax.swing.GroupLayout panelMetodoPagoLayout = new javax.swing.GroupLayout(panelMetodoPago);
        panelMetodoPago.setLayout(panelMetodoPagoLayout);
        panelMetodoPagoLayout.setHorizontalGroup(
            panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMetodoPagoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMetodoPagoLayout.createSequentialGroup()
                        .addGroup(panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSeleccionarMetodoPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(cbMetodoDePago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelMetodoPagoLayout.setVerticalGroup(
            panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMetodoPagoLayout.createSequentialGroup()
                        .addComponent(lblSeleccionarMetodoPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMetodoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        lblAgregarProductos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblAgregarProductos.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregarProductos.setText("Agregar productos");

        lblProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setText("Producto");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCantidad.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");

        txtCantidad.setBackground(new java.awt.Color(204, 204, 204));

        lblPrecioUnitario.setBackground(new java.awt.Color(204, 204, 204));
        lblPrecioUnitario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPrecioUnitario.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioUnitario.setText("Precio unitario");

        txtPrecioUnitario.setBackground(new java.awt.Color(204, 204, 204));

        btnAgregarProducto.setBackground(new java.awt.Color(0, 51, 255));
        btnAgregarProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("Agregar producto");

        javax.swing.GroupLayout panelAgregarProductosLayout = new javax.swing.GroupLayout(panelAgregarProductos);
        panelAgregarProductos.setLayout(panelAgregarProductosLayout);
        panelAgregarProductosLayout.setHorizontalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad))
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProducto)
                        .addGap(71, 71, 71))))
        );
        panelAgregarProductosLayout.setVerticalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(lblPrecioUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTituloNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNumeroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTotalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTituloNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(() -> new NuevaVenta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbMetodoDePago;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAgregarProductos;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDatosVenta;
    private javax.swing.JLabel lblDetalleVenta;
    private javax.swing.JLabel lblFechaVenta;
    private javax.swing.JLabel lblNroFactura;
    private javax.swing.JLabel lblNuevaVenta;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSeleccionarMetodoPago;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JPanel panelAgregarProductos;
    private javax.swing.JPanel panelMetodoPago;
    private javax.swing.JPanel panelTituloNuevaVenta;
    private javax.swing.JTable tablaDetalleVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JPanel txtNumeroFactura;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JPanel txtTotalVenta;
    private javax.swing.JTextField txtVentaTotal;
    // End of variables declaration//GEN-END:variables
}
