
package tiendainformatica.vista;

import tiendainformatica.dao.ProductoDAO;
import tiendainformatica.dao.CategoriaDAO;
import tiendainformatica.modelo.Producto;
import tiendainformatica.modelo.Categoria;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {
    
    private ProductoDAO productoDAO = new ProductoDAO();
    private CategoriaDAO categoriaDAO = new CategoriaDAO();

    private Map<String, Integer> categoriasMap = new HashMap<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Productos.class.getName());
    
    private void configurarTabla() {

    DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoría");

        tablaProductosRegistrados.setModel(modelo);
    }
    
    private void cargarCategorias() {

        cbCategoriasProductos.removeAllItems();
        categoriasMap.clear();

        List<Categoria> lista = categoriaDAO.listarCategorias();

        for (Categoria categoria : lista) {

            cbCategoriasProductos.addItem(categoria.getNombre());

            categoriasMap.put(
                    categoria.getNombre(),
                    categoria.getIdCategoria()
            );
        }

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay categorías registradas. Primero registre una categoría.");
        }
    }

    private void cargarProductos() {

        DefaultTableModel modelo =
                (DefaultTableModel) tablaProductosRegistrados.getModel();

        modelo.setRowCount(0);

        List<Producto> lista = productoDAO.listarProductos();

        for (Producto producto : lista) {

            Object[] fila = {
                producto.getIdProducto(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getNombreCategoria()
            };

            modelo.addRow(fila);
        }
    }

    public Productos() {
        

    initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        configurarTabla();
        cargarCategorias();
        cargarProductos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelTitulos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtituloProducto = new javax.swing.JLabel();
        panelDatosProducto = new javax.swing.JPanel();
        lblDatosProducto = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblDescripcionProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextArea();
        lblPrecioProducto = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        lblCategoriaProducto = new javax.swing.JLabel();
        cbCategoriasProductos = new javax.swing.JComboBox<>();
        lblStockInicial = new javax.swing.JLabel();
        txtStockInicialProducto = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        panelProductosRegistrados = new javax.swing.JPanel();
        lblProductosRegistrado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductosRegistrados = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTitulos.setBackground(new java.awt.Color(16, 27, 48));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Productos");

        lblSubtituloProducto.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtituloProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblSubtituloProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtituloProducto.setText("Registre y consulte los productos de la tienda");

        javax.swing.GroupLayout panelTitulosLayout = new javax.swing.GroupLayout(panelTitulos);
        panelTitulos.setLayout(panelTitulosLayout);
        panelTitulosLayout.setHorizontalGroup(
            panelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitulosLayout.setVerticalGroup(
            panelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtituloProducto)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelDatosProducto.setBackground(new java.awt.Color(255, 255, 255));

        lblDatosProducto.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDatosProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosProducto.setText("Datos del producto");

        lblNombreProducto.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setText("Nombre del producto:");

        txtNombreProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreProducto.addActionListener(this::txtNombreProductoActionPerformed);

        lblDescripcionProducto.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblDescripcionProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcionProducto.setText("Descripción");

        txtDescripcionProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcionProducto.setColumns(20);
        txtDescripcionProducto.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionProducto);

        lblPrecioProducto.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioProducto.setText("Precio");

        txtPrecioProducto.setBackground(new java.awt.Color(204, 204, 204));

        lblCategoriaProducto.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblCategoriaProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoriaProducto.setText("Categoria");

        cbCategoriasProductos.setBackground(new java.awt.Color(204, 204, 204));

        lblStockInicial.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblStockInicial.setForeground(new java.awt.Color(0, 0, 0));
        lblStockInicial.setText("Stock Inicial");

        txtStockInicialProducto.setBackground(new java.awt.Color(204, 204, 204));

        btnGuardarProducto.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardarProducto.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.setFocusPainted(false);
        btnGuardarProducto.addActionListener(this::btnGuardarProductoActionPerformed);

        javax.swing.GroupLayout panelDatosProductoLayout = new javax.swing.GroupLayout(panelDatosProducto);
        panelDatosProducto.setLayout(panelDatosProductoLayout);
        panelDatosProductoLayout.setHorizontalGroup(
            panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProductoLayout.createSequentialGroup()
                        .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(lblDatosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProducto))
                        .addGap(125, 125, 125)
                        .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCategoriasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStockInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosProductoLayout.createSequentialGroup()
                                .addComponent(txtStockInicialProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDatosProductoLayout.createSequentialGroup()
                        .addComponent(lblNombreProducto)
                        .addGap(243, 243, 243)
                        .addComponent(lblPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        panelDatosProductoLayout.setVerticalGroup(
            panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProductoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblDatosProducto)
                .addGap(18, 18, 18)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrecioProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionProducto)
                    .addComponent(lblCategoriaProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosProductoLayout.createSequentialGroup()
                        .addComponent(cbCategoriasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStockInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockInicialProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarProducto))))
                .addGap(11, 11, 11))
        );

        panelProductosRegistrados.setBackground(new java.awt.Color(255, 255, 255));

        lblProductosRegistrado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblProductosRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        lblProductosRegistrado.setText("Productos registrados");

        tablaProductosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Descripción", "Precio", "Stock", "Categoría"
            }
        ));
        jScrollPane2.setViewportView(tablaProductosRegistrados);

        javax.swing.GroupLayout panelProductosRegistradosLayout = new javax.swing.GroupLayout(panelProductosRegistrados);
        panelProductosRegistrados.setLayout(panelProductosRegistradosLayout);
        panelProductosRegistradosLayout.setHorizontalGroup(
            panelProductosRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosRegistradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductosRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelProductosRegistradosLayout.setVerticalGroup(
            panelProductosRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosRegistradosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblProductosRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(panelProductosRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatosProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDatosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelProductosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
       
        String nombre = txtNombreProducto.getText().trim();
        String descripcion = txtDescripcionProducto.getText().trim();
        String precioTexto = txtPrecioProducto.getText().trim();
        String stockTexto = txtStockInicialProducto.getText().trim();

        if (nombre.isEmpty() || precioTexto.isEmpty() || stockTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Complete todos los campos obligatorios.");

            return;
        }

        if (nombre.length() > 100) {
            JOptionPane.showMessageDialog(this, "El nombre no puede superar los 100 caracteres.");
            return;
        }

        if (descripcion.length() > 250) {
            JOptionPane.showMessageDialog(this,  "La descripción no puede superar los 250 caracteres.");
            return;
        }

        BigDecimal precio;
        int stock;

        try {
            precio = new BigDecimal(precioTexto.replace(",", "."));

            if (precio.compareTo(BigDecimal.ZERO) <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor que cero.");
                return;
            }

            if (precio.scale() > 2) {
                JOptionPane.showMessageDialog(this, "El precio admite como máximo dos decimales.");
                return;
            }

            stock = Integer.parseInt(stockTexto);

            if (stock < 0) {
                JOptionPane.showMessageDialog(this, "El stock no puede ser negativo.");
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Ingrese un precio y un stock válidos.");

            return;
        }

        String nombreCategoria = (String) cbCategoriasProductos.getSelectedItem();

        if (nombreCategoria == null || !categoriasMap.containsKey(nombreCategoria)) {

            JOptionPane.showMessageDialog(this, "Seleccione una categoría válida.");

            return;
        }

        int idCategoria = categoriasMap.get(nombreCategoria);

        Producto producto = new Producto(
                nombre,
                descripcion,
                precio,
                stock,
                idCategoria
        );

        if (productoDAO.guardarProducto(producto)) {

            JOptionPane.showMessageDialog(this, "Producto registrado correctamente.");

            txtNombreProducto.setText("");
            txtDescripcionProducto.setText("");
            txtPrecioProducto.setText("");
            txtStockInicialProducto.setText("");
            
            cargarProductos();

            txtNombreProducto.requestFocus();

        } else {

            JOptionPane.showMessageDialog(this, "No se pudo registrar el producto. Verifique los datos.");
        }   
        
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JComboBox<String> cbCategoriasProductos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoriaProducto;
    private javax.swing.JLabel lblDatosProducto;
    private javax.swing.JLabel lblDescripcionProducto;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProductosRegistrado;
    private javax.swing.JLabel lblStockInicial;
    private javax.swing.JLabel lblSubtituloProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelDatosProducto;
    private javax.swing.JPanel panelProductosRegistrados;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JTable tablaProductosRegistrados;
    private javax.swing.JTextArea txtDescripcionProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStockInicialProducto;
    // End of variables declaration//GEN-END:variables
}
