
package tiendainformatica.vista;

import tiendainformatica.modelo.Cliente;
import tiendainformatica.modelo.Producto;
import tiendainformatica.dao.ClienteDAO;
import tiendainformatica.dao.ProductoDAO;
import tiendainformatica.dao.MetodoPagoDAO;
import tiendainformatica.modelo.MetodoPago;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;
import javax.swing.JOptionPane;
import tiendainformatica.dao.VentaDAO;
import tiendainformatica.modelo.Usuario;

import tiendainformatica.modelo.DetalleVenta;
import java.util.ArrayList;
import java.sql.SQLException;

public class NuevaVenta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NuevaVenta.class.getName());
    
    private Usuario usuario;

    public NuevaVenta(Usuario usuario) {
        
        initComponents();
        
        this.usuario = usuario;
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        cargarClientes();
        cargarProductos();
        cargarMetodosPago();
        cargarNumeroFactura();
        
        txtFechaVenta.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        txtFechaVenta.setEditable(false);
        
        System.out.println("Usuario de la venta: " + usuario.getId());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTituloNuevaVenta = new javax.swing.JPanel();
        lblNuevaVenta = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JPanel();
        lblDatosVenta = new javax.swing.JLabel();
        lblNroFactura = new javax.swing.JLabel();
        txtNroDeFactura = new javax.swing.JTextField();
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
        btnCancelarVenta = new javax.swing.JButton();
        panelAgregarProductos = new javax.swing.JPanel();
        lblAgregarProductos = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        cbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecioUnitario = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        txtNroDeFactura.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cliente");

        cbCliente.setBackground(new java.awt.Color(204, 204, 204));

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
                            .addComponent(txtNroDeFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtNroDeFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lblSeleccionarMetodoPago.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblSeleccionarMetodoPago.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccionarMetodoPago.setText("Seleccionar método");

        btnRegistrarVenta.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrarVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar venta");
        btnRegistrarVenta.addActionListener(this::btnRegistrarVentaActionPerformed);

        btnCancelarVenta.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(this::btnCancelarVentaActionPerformed);

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
                        .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAgregarProductos.setBackground(new java.awt.Color(255, 255, 255));

        lblAgregarProductos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblAgregarProductos.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregarProductos.setText("Agregar productos");

        lblProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setText("Producto");

        cbProducto.setBackground(new java.awt.Color(204, 204, 204));
        cbProducto.addItemListener(this::cbProductoItemStateChanged);

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
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.addActionListener(this::btnAgregarProductoActionPerformed);

        javax.swing.GroupLayout panelAgregarProductosLayout = new javax.swing.GroupLayout(panelAgregarProductos);
        panelAgregarProductos.setLayout(panelAgregarProductosLayout);
        panelAgregarProductosLayout.setHorizontalGroup(
            panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panelMetodoPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductoItemStateChanged
        
    if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

        Producto producto = (Producto) cbProducto.getSelectedItem();

        if (producto != null) {
            txtPrecioUnitario.setText(producto.getPrecio().toString());
        }
    }
        
    }//GEN-LAST:event_cbProductoItemStateChanged

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
  
        Producto producto = (Producto) cbProducto.getSelectedItem();

        if (producto == null) {
            JOptionPane.showMessageDialog(this,
                    "Seleccioná un producto.");
            return;
        }

        try {

            int cantidad = Integer.parseInt(txtCantidad.getText().trim());

            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this,
                        "La cantidad debe ser mayor a cero.");
                return;
            }

            if (cantidad > producto.getStock()) {
                JOptionPane.showMessageDialog(this,
                        "Stock insuficiente. Disponible: " + producto.getStock());
                return;
            }

            BigDecimal precio = producto.getPrecio();
            BigDecimal subtotal = precio.multiply(BigDecimal.valueOf(cantidad));

            DefaultTableModel modelo =
                    (DefaultTableModel) tablaDetalleVenta.getModel();

            int filaExistente = -1;

            // Comprobar si el producto ya esta en la tabla
            for (int i = 0; i < modelo.getRowCount(); i++) {

                Producto productoTabla = (Producto) modelo.getValueAt(i, 0);

                if (productoTabla.getIdProducto() == producto.getIdProducto()) {
                    filaExistente = i;
                    break;
                }
            }

            if (filaExistente != -1) {

                int cantidadAnterior =
                        Integer.parseInt(modelo.getValueAt(filaExistente, 1).toString());

                int nuevaCantidad = cantidadAnterior + cantidad;

                if (nuevaCantidad > producto.getStock()) {
                    JOptionPane.showMessageDialog(this,
                            "No hay suficiente stock para esa cantidad.");
                    return;
                }

                BigDecimal nuevoSubtotal =
                        precio.multiply(BigDecimal.valueOf(nuevaCantidad));

                modelo.setValueAt(nuevaCantidad, filaExistente, 1);
                modelo.setValueAt(nuevoSubtotal, filaExistente, 3);

            } else {

                modelo.addRow(new Object[]{
                    producto,
                    cantidad,
                    precio,
                    subtotal
                });
            }

            calcularTotalVenta();

            txtCantidad.setText("");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Ingresá una cantidad válida.");
        }
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        
        Cliente cliente = (Cliente) cbCliente.getSelectedItem();

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Selecciona un cliente.");
            return;
        }

        MetodoPago metodoPago = (MetodoPago) cbMetodoDePago.getSelectedItem();

        if (metodoPago == null) {
            JOptionPane.showMessageDialog(this, "Selecciona un método de pago.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tablaDetalleVenta.getModel();

        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Agrega al menos un producto.");
            return;
        }

        List<DetalleVenta> detalles = new ArrayList<>();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            Producto producto = (Producto) modelo.getValueAt(i, 0);

            int cantidad = Integer.parseInt(
                    modelo.getValueAt(i, 1).toString()
            );

            BigDecimal precioUnitario = new BigDecimal(
                    modelo.getValueAt(i, 2).toString()
            );

            detalles.add(new DetalleVenta(
                    producto.getIdProducto(),
                    cantidad,
                    precioUnitario
            ));
        }

        try {

            VentaDAO dao = new VentaDAO();

            dao.registrarVentaCompleta(
                    txtNroDeFactura.getText(),
                    cliente.getIdCliente(),
                    usuario.getId(),
                    metodoPago.getIdMetodoPago(),
                    detalles
            );

            JOptionPane.showMessageDialog(
                    this,
                    "¡Venta registrada correctamente!"
            );

            modelo.setRowCount(0);


            txtVentaTotal.setText("0.00");

            cargarNumeroFactura();

            cargarProductos();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al registrar la venta: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        
      
       DefaultTableModel modelo = (DefaultTableModel) tablaDetalleVenta.getModel();

       modelo.setRowCount(0);

       txtCantidad.setText("");
       txtPrecioUnitario.setText("");
       txtVentaTotal.setText("0.00");
       cargarNumeroFactura();


       if (cbCliente.getItemCount() > 0) {
           cbCliente.setSelectedIndex(0);
       }

       if (cbMetodoDePago.getItemCount() > 0) {
           cbMetodoDePago.setSelectedIndex(0);
       }

       if (cbProducto.getItemCount() > 0) {
           cbProducto.setSelectedIndex(0);
       }

       JOptionPane.showMessageDialog(
               this,
               "Venta cancelada correctamente."
       );  
        
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    
    private void calcularTotalVenta() {

        DefaultTableModel modelo =
                (DefaultTableModel) tablaDetalleVenta.getModel();

        BigDecimal total = BigDecimal.ZERO;

        for (int i = 0; i < modelo.getRowCount(); i++) {

            BigDecimal subtotal =
                    new BigDecimal(modelo.getValueAt(i, 3).toString());

            total = total.add(subtotal);
        }

        txtVentaTotal.setText(total.toString());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<Cliente> cbCliente;
    private javax.swing.JComboBox<MetodoPago> cbMetodoDePago;
    private javax.swing.JComboBox<Producto> cbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtNroDeFactura;
    private javax.swing.JPanel txtNumeroFactura;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JPanel txtTotalVenta;
    private javax.swing.JTextField txtVentaTotal;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes() {

        cbCliente.removeAllItems();

        ClienteDAO dao = new ClienteDAO();

        List<Cliente> clientes = dao.listarClientes();

        for (Cliente cliente : clientes) {
            cbCliente.addItem(cliente);
        }

        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No hay clientes registrados.");
        }
    }
    
    private void cargarProductos() {

        cbProducto.removeAllItems();

        ProductoDAO dao = new ProductoDAO();

        List<Producto> productos = dao.listarProductos();

        for (Producto producto : productos) {

            if (producto.getStock() > 0) {
                cbProducto.addItem(producto);
            }
        }

        if (cbProducto.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No hay productos disponibles en stock.");
        }
    }
    
    
    private void cargarMetodosPago() {

        cbMetodoDePago.removeAllItems();

        MetodoPagoDAO dao = new MetodoPagoDAO();

        List<MetodoPago> metodos = dao.listarMetodosPago();

        for (MetodoPago metodo : metodos) {
            cbMetodoDePago.addItem(metodo);
        }

        if (metodos.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No hay métodos de pago registrados.");
        }
    }
    
    
    private void cargarNumeroFactura() {

         VentaDAO dao = new VentaDAO();

         String numero = dao.generarNumeroFactura();

         if (numero != null) {
             txtNroDeFactura.setText(numero);
         } else {
             JOptionPane.showMessageDialog(this,
                     "No se pudo generar el número de factura.");
         }
     }

}
