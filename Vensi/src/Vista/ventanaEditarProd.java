package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Dimension;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaEditarProd extends javax.swing.JFrame 
{
    ProductoDAO pDAO = new ProductoDAO();
    public static int id_recibido;
    ProveedorDAO prDAO = new ProveedorDAO();
    DefaultTableModel modelo;
    TableColumnModel tcm;
    
    public ventanaEditarProd() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana  
        
        this.setMinimumSize(new Dimension(600, 350));  //al minimizar la ventana no permite que sea mas chico que esa medida
       
        this.setPreferredSize(new Dimension(600,350));    //al minimizar la ventana aparece con esa medida
        
        this.setResizable(false);   //No permite modificar el tamaño de la ventana
        
        labIdSelec.setVisible(false);   //label que contiene el id
        txfdEditarPesoEnvase.setEnabled(false); 
        
        mostrarProdSelec();        
        llenarTablaProv();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfdEditarCodigo = new javax.swing.JTextField();
        txfdEditarDescripcion = new javax.swing.JTextField();
        txfdEditarPrecioCosto = new javax.swing.JTextField();
        txfdEditarPrecioVenta = new javax.swing.JTextField();
        txfdEditarStockMinimo = new javax.swing.JTextField();
        txfdEditarPesoEnvase = new javax.swing.JTextField();
        cbEditarEstado = new javax.swing.JComboBox<>();
        labIdSelec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar producto");
        setPreferredSize(new java.awt.Dimension(600, 350));

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio costo:");

        jLabel4.setText("Precio venta:");

        jLabel7.setText("Stock mínimo:");

        jLabel9.setText("Peso del envase (gramos):");

        jLabel8.setText("Estado:");

        txfdEditarPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioCostoKeyTyped(evt);
            }
        });

        txfdEditarPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioVentaKeyTyped(evt);
            }
        });

        txfdEditarStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarStockMinimoKeyTyped(evt);
            }
        });

        txfdEditarPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPesoEnvaseKeyTyped(evt);
            }
        });

        cbEditarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));

        labIdSelec.setText("ID_Prod");

        jLabel5.setText("Se vende por:");

        bgTipoVenta.add(rbUnidad);
        rbUnidad.setText("Unidad");
        rbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnidadActionPerformed(evt);
            }
        });

        bgTipoVenta.add(rbPeso);
        rbPeso.setText("Peso");
        rbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesoActionPerformed(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProveedores.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tablaProveedores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarDescripcion))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarCodigo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioCosto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(labIdSelec))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(rbUnidad)
                            .addGap(18, 18, 18)
                            .addComponent(rbPeso))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfdEditarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfdEditarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbUnidad)
                    .addComponent(rbPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labIdSelec)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancelarEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        ventanaProducto vProducto = new ventanaProducto();
        vProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        Producto prod = new Producto();
        
        prod.setCodigo(txfdEditarCodigo.getText().toUpperCase());
        prod.setDescripcion(txfdEditarDescripcion.getText().toUpperCase());        
        prod.setPrecioCosto(Double.parseDouble(txfdEditarPrecioCosto.getText()));
        prod.setPrecioVenta(Double.parseDouble(txfdEditarPrecioVenta.getText()));
        prod.setStockMinimo(Double.parseDouble(txfdEditarStockMinimo.getText()));
                
        if (rbPeso.isSelected())
        {
            prod.setPorPeso(true);
            prod.setPesoEnvase(Integer.parseInt(txfdEditarPesoEnvase.getText()));
        }
        else
        {
            prod.setPorPeso(false);
            prod.setPesoEnvase(0);
        }
        
        if(cbEditarEstado.getSelectedItem().equals("Habilitado"))
        {
            prod.setEstado(true);
        }
        else
        {
            prod.setEstado(false);
        }
        int[] filasSelec = tablaProveedores.getSelectedRows();
        int idSelec;
        for(int i = 0; i<tablaProveedores.getSelectedRowCount(); i++ ){
            idSelec = Integer.parseInt(tablaProveedores.getValueAt(filasSelec[i], 1).toString());
            prod.addProveedor(prDAO.buscarPorId(idSelec));
        }
        
        pDAO.modificar(prod, id_recibido);
        
        ventanaProducto vProducto = new ventanaProducto();
        vProducto.setVisible(true);
        dispose();        
    }//GEN-LAST:event_btnAceptarEditarActionPerformed

    private void txfdEditarPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && 
                (c != '.' || txfdEditarPrecioCosto.getText().contains("."))) 
            evt.consume();       
        
    }//GEN-LAST:event_txfdEditarPrecioCostoKeyTyped

    private void txfdEditarPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && 
                (c != '.' || txfdEditarPrecioVenta.getText().contains("."))) 
            evt.consume();
    }//GEN-LAST:event_txfdEditarPrecioVentaKeyTyped

    private void txfdEditarStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txfdEditarStockMinimoKeyTyped

    private void txfdEditarPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txfdEditarPesoEnvaseKeyTyped

    private void rbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnidadActionPerformed
        if (rbUnidad.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(false);
        }
        else
        {
            txfdEditarPesoEnvase.setEnabled(true);
        }
    }//GEN-LAST:event_rbUnidadActionPerformed

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        if (rbPeso.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(true);
        }
        else
        {
            txfdEditarPesoEnvase.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesoActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaEditarProd().setVisible(true);
            }
        });
    }
    
    public void mostrarProdSelec()
    {
        Producto elProd = pDAO.buscarPorId(id_recibido);                
           
        //MOSTRAMOS LOS DATOS GUARDADOS DEL PRODUCTO SELECCIONADO. PARA LUEGO PODER MODIFICAR
        txfdEditarCodigo.setText(String.valueOf(elProd.getCodigo()));
        txfdEditarDescripcion.setText(String.valueOf(elProd.getDescripcion()));
        txfdEditarPrecioCosto.setText(String.valueOf(elProd.getPrecioCosto()));
        txfdEditarPrecioVenta.setText(String.valueOf(elProd.getPrecioVenta()));
        txfdEditarStockMinimo.setText(String.valueOf(elProd.getStockMinimo()));
        txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));
        
        if(elProd.isEstado())
        {
            cbEditarEstado.setSelectedItem("Habilitado");
        }
        else
        {
            cbEditarEstado.setSelectedItem("Deshabilitado");
        }         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoVenta;
    private javax.swing.JButton btnAceptarEditar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JComboBox<String> cbEditarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labIdSelec;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txfdEditarCodigo;
    private javax.swing.JTextField txfdEditarDescripcion;
    private javax.swing.JTextField txfdEditarPesoEnvase;
    private javax.swing.JTextField txfdEditarPrecioCosto;
    private javax.swing.JTextField txfdEditarPrecioVenta;
    private javax.swing.JTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaProv() {
        
        String[] datos = new String[2];
        List<Proveedor> lista = prDAO.listar("Habilitados");
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Proveedor");
        modelo.addColumn("ID");
        
        for(Proveedor p : lista){
            datos[0] = p.getRazonSocial();
            datos[1] = String.valueOf(p.getId());
            modelo.addRow(datos);
        }
        
        tablaProveedores.setModel(modelo);
        
        tcm = tablaProveedores.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(50);
        tcm.getColumn(1).setPreferredWidth(0);  
        tcm.getColumn(1).setMaxWidth(0);
        tcm.getColumn(1).setMinWidth(0);
        tablaProveedores.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tablaProveedores.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
    }
}