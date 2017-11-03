package Vista;

import DAO.ProveedorDAO;
import Modelo.Proveedor;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaProveedor extends javax.swing.JFrame 
{    
    ProveedorDAO pDAO = new ProveedorDAO();
    DefaultTableModel modelo, modelo2;
    TableColumnModel tcm, tcm2;
    
    String filtroSelec = "Todos";
    
    public ventanaProveedor() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        this.setMinimumSize(new Dimension(1000, 500));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(1000, 500));    //al minimizar la ventana aparece con esa medida
               
        llenarTabla();          
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbFiltroCampoProv = new javax.swing.JComboBox<>();
        btnBuscarProv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txfdBuscarProv = new org.jdesktop.swingx.JXTextField();
        jPanel4 = new javax.swing.JPanel();
        btnNuevoProv = new javax.swing.JButton();
        btnEditarProv = new javax.swing.JButton();
        btnMenuPrincipalProv = new javax.swing.JButton();
        btnVolverProv = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración del Proveedor");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Buscar:");

        cbFiltroCampoProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltroCampoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCampoProvActionPerformed(evt);
            }
        });

        btnBuscarProv.setText("Buscar");
        btnBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProvActionPerformed(evt);
            }
        });

        jLabel4.setText("Filtrar por:");

        txfdBuscarProv.setPrompt("Busque por código o por descripción");
        txfdBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProvKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFiltroCampoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txfdBuscarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBuscarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdBuscarProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(cbFiltroCampoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnNuevoProv.setText("Nuevo");
        btnNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProvActionPerformed(evt);
            }
        });

        btnEditarProv.setText("Editar");
        btnEditarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProvActionPerformed(evt);
            }
        });

        btnMenuPrincipalProv.setText("Menú principal");
        btnMenuPrincipalProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalProvActionPerformed(evt);
            }
        });

        btnVolverProv.setText("Volver");
        btnVolverProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverProvActionPerformed(evt);
            }
        });

        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaProv);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipalProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuPrincipalProv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalProvActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalProvActionPerformed

    private void btnVolverProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverProvActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverProvActionPerformed

    private void btnNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvActionPerformed
        ventanaNuevoProv vNuevoProv = new ventanaNuevoProv();
        vNuevoProv.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnNuevoProvActionPerformed

    private void btnEditarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProvActionPerformed
        int filaSelec = tablaProv.getSelectedRow();
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            //GUARDAMOS EL ID EN LA VARIABLE DE LA VENTANA_EDITAR_PROV, DEL PROVEEDOR SELECCIONADO EN LA TABLA
            ventanaEditarProv.id_recibido = Integer.parseInt((String) tablaProv.getValueAt(filaSelec, 5));

            ventanaEditarProv vEditarProv = new ventanaEditarProv();
            vEditarProv.setVisible(true);
            dispose(); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
        }             
    }//GEN-LAST:event_btnEditarProvActionPerformed

    private void btnBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProvActionPerformed
        String cadena = txfdBuscarProv.getText();
        
        List<Proveedor> listaPB = pDAO.buscarPorCuitNombre(cadena, filtroSelec);
        
        llenarTablaBusqueda(listaPB);  
        
        if (txfdBuscarProv.getText().equals("") || txfdBuscarProv.getText() == null)
        {
            cbFiltroCampoProv.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampoProv.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarProvActionPerformed

    private void txfdBuscarProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProvKeyReleased
        String cadena = txfdBuscarProv.getText();
        
        List<Proveedor> listaPB = pDAO.buscarPorCuitNombre(cadena, filtroSelec);
        
        llenarTablaBusqueda(listaPB);
        
        if (txfdBuscarProv.getText().equals("") || txfdBuscarProv.getText() == null)
        {
            cbFiltroCampoProv.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampoProv.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProvKeyReleased

    private void cbFiltroCampoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCampoProvActionPerformed
        if (cbFiltroCampoProv.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
        }
        else
        {
            if (cbFiltroCampoProv.getSelectedItem().equals("Habilitados"))
            {
                filtroSelec = "Habilitados";
            }
            else
            {
                filtroSelec = "Deshabilitados";
            }
        }
    }//GEN-LAST:event_cbFiltroCampoProvActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaProveedor().setVisible(true);
            }
        });
    }
    
    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        List<Proveedor> lista = pDAO.listar(filtroSelec);  
        String[] datos = new String[6]; 
        
        modelo.addColumn("Razón social");
        modelo.addColumn("Cuit");
        modelo.addColumn("Direción");
        modelo.addColumn("Contacto");
        modelo.addColumn("Estado");
        modelo.addColumn("ID");
        
        for (Proveedor p : lista)
        {
            datos[0] = p.getRazonSocial();
            datos[1] = p.getCuit();
            datos[2] = String.valueOf(p.getDireccion());
            datos[3] = String.valueOf(p.getContacto());

            if (p.isEstado())
            {
                datos[4] = "Habilitado";
            }
            else
            {
                datos[4] = "Deshabilitado";
            }
            datos[5] = String.valueOf(p.getId());   
            
            modelo.addRow(datos);
        }    
        
        tablaProv.setModel(modelo);
        
        tcm = tablaProv.getColumnModel();        
        tcm.getColumn(0).setPreferredWidth(250);
        tcm.getColumn(1).setPreferredWidth(120);
        tcm.getColumn(2).setPreferredWidth(250);
        tcm.getColumn(3).setPreferredWidth(250);
        tcm.getColumn(4).setPreferredWidth(50);
        tcm.getColumn(5).setPreferredWidth(0);
        tcm.getColumn(5).setMaxWidth(0);
        tcm.getColumn(5).setMinWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
    }    
    
    public void llenarTablaBusqueda(List<Proveedor> listaBusqueda)
    {        
        modelo2 = new DefaultTableModel();
        String [] datos = new String[6]; 
        
        modelo2.addColumn("Razón social");
        modelo2.addColumn("Cuit");
        modelo2.addColumn("Direción");
        modelo2.addColumn("Contacto");
        modelo2.addColumn("Estado");
        modelo2.addColumn("ID");
        
        for (Proveedor p : listaBusqueda)
        {
            datos[0] = p.getRazonSocial();
            datos[1] = p.getCuit();
            datos[2] = String.valueOf(p.getDireccion());
            datos[3] = String.valueOf(p.getContacto());

            if (p.isEstado())
            {
                datos[4] = "Habilitado";
            }
            else
            {
                datos[4] = "Deshabilitado";
            }
            datos[5] = String.valueOf(p.getId());   
            
            modelo2.addRow(datos);
        }        
        tablaProv.setModel(modelo2);
        
        tcm2 = tablaProv.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(250);
        tcm2.getColumn(1).setPreferredWidth(120);
        tcm2.getColumn(2).setPreferredWidth(250);
        tcm2.getColumn(3).setPreferredWidth(250);
        tcm2.getColumn(4).setPreferredWidth(50);
        tcm2.getColumn(5).setPreferredWidth(0);
        tcm2.getColumn(5).setMaxWidth(0);
        tcm2.getColumn(5).setMinWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);

        //tablaProv.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProv;
    private javax.swing.JButton btnEditarProv;
    private javax.swing.JButton btnMenuPrincipalProv;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnVolverProv;
    private javax.swing.JComboBox<String> cbFiltroCampoProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaProv;
    private org.jdesktop.swingx.JXTextField txfdBuscarProv;
    // End of variables declaration//GEN-END:variables
}