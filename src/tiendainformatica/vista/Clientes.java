
package tiendainformatica.vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tiendainformatica.dao.ClienteDAO;
import tiendainformatica.modelo.Cliente;

public class Clientes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Clientes.class.getName());

    public Clientes() {
        
        initComponents();
        
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        cargarClientes();
        
        tablaClientesRegistrados.getColumnModel().getColumn(0).setPreferredWidth(15);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelGestionClientes = new javax.swing.JPanel();
        lblDatosCliente = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDocumentoCliente = new javax.swing.JTextField();
        lblCorreoCliente = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        lblApellidoCliente = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        lblTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtituloClientes = new javax.swing.JLabel();
        panelClientesRegistrados = new javax.swing.JPanel();
        lblClientesRegistrados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientesRegistrados = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGestionClientes.setBackground(new java.awt.Color(255, 255, 255));

        lblDatosCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDatosCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosCliente.setText("Datos del cliente");

        lblNombreCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreCliente.setText("Nombre");

        txtNombreCliente.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Documento");

        txtDocumentoCliente.setBackground(new java.awt.Color(204, 204, 204));

        lblCorreoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblCorreoCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoCliente.setText("Correo electrónico");

        txtCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));

        lblApellidoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblApellidoCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblApellidoCliente.setText("Apellido");

        txtApellidoCliente.setBackground(new java.awt.Color(204, 204, 204));

        lblTelefonoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblTelefonoCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoCliente.setText("Teléfono");

        txtTelefonoCliente.setBackground(new java.awt.Color(204, 204, 204));

        lblDireccionCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblDireccionCliente.setText("Dirección");

        txtDireccionCliente.setBackground(new java.awt.Color(204, 204, 204));

        btnGuardarCliente.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.setFocusPainted(false);
        btnGuardarCliente.addActionListener(this::btnGuardarClienteActionPerformed);

        javax.swing.GroupLayout panelGestionClientesLayout = new javax.swing.GroupLayout(panelGestionClientes);
        panelGestionClientes.setLayout(panelGestionClientesLayout);
        panelGestionClientesLayout.setHorizontalGroup(
            panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGestionClientesLayout.createSequentialGroup()
                        .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtDocumentoCliente)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarCliente)
                .addGap(60, 60, 60))
        );
        panelGestionClientesLayout.setVerticalGroup(
            panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTelefonoCliente))
                .addGap(0, 0, 0)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoCliente)
                    .addComponent(lblDireccionCliente))
                .addGap(6, 6, 6)
                .addGroup(panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnGuardarCliente)
                .addContainerGap())
        );

        panelTitulo.setBackground(new java.awt.Color(16, 27, 48));

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gestión de clientes");

        lblSubtituloClientes.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblSubtituloClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtituloClientes.setText("Administración de clientes");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtituloClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtituloClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClientesRegistrados.setBackground(new java.awt.Color(255, 255, 255));

        lblClientesRegistrados.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblClientesRegistrados.setForeground(new java.awt.Color(0, 0, 0));
        lblClientesRegistrados.setText("Clientes registrados");

        tablaClientesRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Documento", "Telefono", "Correo"
            }
        ));
        jScrollPane2.setViewportView(tablaClientesRegistrados);

        javax.swing.GroupLayout panelClientesRegistradosLayout = new javax.swing.GroupLayout(panelClientesRegistrados);
        panelClientesRegistrados.setLayout(panelClientesRegistradosLayout);
        panelClientesRegistradosLayout.setHorizontalGroup(
            panelClientesRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesRegistradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClientesRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesRegistradosLayout.createSequentialGroup()
                        .addComponent(lblClientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        panelClientesRegistradosLayout.setVerticalGroup(
            panelClientesRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesRegistradosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblClientesRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGestionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelClientesRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelGestionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClientesRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        
        String nombre = txtNombreCliente.getText().trim();
        String apellido = txtApellidoCliente.getText().trim();
        String documento = txtDocumentoCliente.getText().trim();
        String telefono = txtTelefonoCliente.getText().trim();
        String correo = txtCorreoCliente.getText().trim();
        String direccion = txtDireccionCliente.getText().trim();  
        
        
        if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Nombre, apellido y documento son obligatorios.");
            
            return;
        }
        
        Cliente cliente = new Cliente (
                nombre, apellido, documento, telefono, correo, direccion
        );
        
        ClienteDAO dao = new ClienteDAO();
        
        if (dao.guardarCliente(cliente)) {
            
            JOptionPane.showMessageDialog(this, "Cliente registrado correctamente");
            cargarClientes();
            
            txtNombreCliente.setText("");
            txtApellidoCliente.setText("");
            txtDocumentoCliente.setText("");
            txtTelefonoCliente.setText("");
            txtCorreoCliente.setText("");
            txtDireccionCliente.setText("");
        } else {
            
            JOptionPane.showMessageDialog(this, "No se pudo registrar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    
    private void cargarClientes() {

        DefaultTableModel modelo = (DefaultTableModel) tablaClientesRegistrados.getModel();
        modelo.setRowCount(0);

        ClienteDAO dao = new ClienteDAO();

        List<Cliente> lista = dao.listarClientes();

        for (Cliente cliente : lista) {

            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getDocumento(),
                cliente.getTelefono(),
                cliente.getCorreo(),
                cliente.getDireccion()
            });
        }
    }

    
    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new Clientes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblClientesRegistrados;
    private javax.swing.JLabel lblCorreoCliente;
    private javax.swing.JLabel lblDatosCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSubtituloClientes;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelClientesRegistrados;
    private javax.swing.JPanel panelGestionClientes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaClientesRegistrados;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDocumentoCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
