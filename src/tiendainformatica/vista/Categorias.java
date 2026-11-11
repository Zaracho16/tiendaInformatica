
package tiendainformatica.vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tiendainformatica.dao.CategoriaDAO;
import tiendainformatica.modelo.Categoria;



public class Categorias extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Categorias.class.getName());
    private CategoriaDAO categoriaDAO = new CategoriaDAO();
    
   public Categorias() {
    initComponents();
    setLocationRelativeTo(null);
    setResizable(false);
    configurarTabla();
    cargarCategorias();
}
   private void configurarTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripción");
    tablaCategorias.setModel(modelo);
}
   private void cargarCategorias() {

    DefaultTableModel modelo =
            (DefaultTableModel) tablaCategorias.getModel();

    modelo.setRowCount(0);

    List<Categoria> lista = categoriaDAO.listarCategorias();

    for (Categoria categoria : lista) {

        Object[] fila = {
            categoria.getNombre(),
            categoria.getDescripcion()
        };

        modelo.addRow(fila);
    }
}
   
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGestionCategorias = new javax.swing.JLabel();
        lblAdminCategorias = new javax.swing.JLabel();
        lblDatosCategorias = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        lblCategoriasRegistradas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 27, 48));

        lblGestionCategorias.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblGestionCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionCategorias.setText("Gestión de categorías");

        lblAdminCategorias.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAdminCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminCategorias.setText("Administración de categorías");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGestionCategorias)
                    .addComponent(lblAdminCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblGestionCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblDatosCategorias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDatosCategorias.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosCategorias.setText("Datos de las categorias");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(this::txtNombreActionPerformed);

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción");

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnGuardar.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setForeground(new java.awt.Color(0, 0, 0));

        lblCategoriasRegistradas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCategoriasRegistradas.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoriasRegistradas.setText("Categorías registradas");

        tablaCategorias.setBorder(new javax.swing.border.MatteBorder(null));
        tablaCategorias.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(tablaCategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(lblDatosCategorias)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoriasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatosCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCategoriasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
         String nombre = txtNombre.getText().trim();
    String descripcion = txtDescripcion.getText().trim();

    // Validar nombre
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "El nombre de la categoría es obligatorio.");
        txtNombre.requestFocus();
        return;
    }

    if (nombre.length() > 100) {
        JOptionPane.showMessageDialog(this,
                "El nombre no puede superar los 100 caracteres.");
        return;
    }

    if (descripcion.length() > 250) {
        JOptionPane.showMessageDialog(this,
                "La descripción no puede superar los 250 caracteres.");
        return;
    }

    Categoria categoria = new Categoria(nombre, descripcion);

    if (categoriaDAO.guardarCategoria(categoria)) {

        JOptionPane.showMessageDialog(this,
                "Categoría guardada correctamente.");

        txtNombre.setText("");
        txtDescripcion.setText("");

        cargarCategorias();

        txtNombre.requestFocus();

    } else {

        JOptionPane.showMessageDialog(this,
                "No se pudo guardar la categoría. Verificá si ya existe.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdminCategorias;
    private javax.swing.JLabel lblCategoriasRegistradas;
    private javax.swing.JLabel lblDatosCategorias;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblGestionCategorias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tablaCategorias;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
