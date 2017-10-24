package Vista;

import DAO.ProductoDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Modelo.Producto;
import javax.swing.JOptionPane;

public class ventanaProducto extends javax.swing.JFrame 
{    
    ProductoDAO pDAO = new ProductoDAO();
    DefaultTableModel modelo, modelo2, modelo3;    
    TableColumnModel tcm, tcm2, tcm3;
    
    String ordenSelec = null;
    String tipoSelec = "ASC";
    
    public ventanaProducto() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        this.setMinimumSize(new Dimension(1000, 500));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(1000, 500));    //al minimizar la ventana aparece con esa medida
        
        if (txfdBuscarProd.getText().equals(""))
        {
            if (cbFiltroCampoProd.getSelectedItem().equals("Todos"))
            {
                llenarTablaInicio();   
            }
        }                    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfdBuscarProd = new javax.swing.JTextField();
        cbFiltroCampoProd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbCampoOrden = new javax.swing.JComboBox<>();
        btnBuscarProd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbTipoOrden = new javax.swing.JComboBox<>();
        btnActualizarTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnNuevoProd = new javax.swing.JButton();
        btnEditarProd = new javax.swing.JButton();
        btnMenuPrincipalProd = new javax.swing.JButton();
        btnVolverProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración del producto");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Buscar:");

        cbFiltroCampoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));

        jLabel3.setText("Ordenar por:");

        cbCampoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Precio venta", "Stock", "Stock mínimo", "Peso del envase" }));
        cbCampoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCampoOrdenActionPerformed(evt);
            }
        });

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        jLabel4.setText("Filtrar por:");

        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        btnActualizarTabla.setText("Actualizar");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFiltroCampoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfdBuscarProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizarTabla)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdBuscarProd)
                    .addComponent(btnBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFiltroCampoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizarTabla))))
        );

        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProd);

        btnNuevoProd.setText("Nuevo");
        btnNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProdActionPerformed(evt);
            }
        });

        btnEditarProd.setText("Editar");
        btnEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdActionPerformed(evt);
            }
        });

        btnMenuPrincipalProd.setText("Menú principal");
        btnMenuPrincipalProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalProdActionPerformed(evt);
            }
        });

        btnVolverProd.setText("Volver");
        btnVolverProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolverProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuPrincipalProd, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuPrincipalProd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalProdActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalProdActionPerformed

    private void btnVolverProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverProdActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverProdActionPerformed

    private void btnNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProdActionPerformed
        ventanaNuevoProd vNuevoProd = new ventanaNuevoProd();
        vNuevoProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNuevoProdActionPerformed

    private void btnEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdActionPerformed
        int filaSelec = tablaProd.getSelectedRow();
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            //GUARDAMOS EL ID EN LA VARIABLE DE LA VENTANA_EDITAR_PROD, DEL PRODUCTO SELECCIONADO EN LA TABLA
            ventanaEditarProd.id_recibido = Integer.parseInt( tablaProd.getValueAt(filaSelec, 8).toString());   
        
            ventanaEditarProd vEditarProd = new ventanaEditarProd();
            vEditarProd.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }        
    }//GEN-LAST:event_btnEditarProdActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaP = pDAO.buscarPorCodigoNombre(cadena);
        
        if (cbFiltroCampoProd.getSelectedItem().equals("Todos"))
        {
            if (cbCampoOrden.getSelectedItem().equals("Descripción"))
            {
                if (cbTipoOrden.getSelectedItem().equals("Ascendente"))
                {
                    llenarTablaBusqueda(listaP);
                }
            }
        }
        
    }//GEN-LAST:event_btnBuscarProdActionPerformed
       
    private void cbCampoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCampoOrdenActionPerformed
        if (cbCampoOrden.getSelectedItem().equals("Descripción"))
        {
                ordenSelec = "descripcion";
        }
        if (cbCampoOrden.getSelectedItem().equals("Código"))
        {
                ordenSelec = "codigo";
        }
        if (cbCampoOrden.getSelectedItem().equals("Precio costo"))
        {
                ordenSelec = "precio_costo";
        }
        if (cbCampoOrden.getSelectedItem().equals("Precio venta"))
        {
                ordenSelec = "precio_venta";
        }
        if (cbCampoOrden.getSelectedItem().equals("Stock"))
        {
                ordenSelec = "stock";
        }
        if (cbCampoOrden.getSelectedItem().equals("Stock mínimo"))
        {
                ordenSelec = "stock_minimo";
        }
        if (cbCampoOrden.getSelectedItem().equals("Peso del envase"))
        {
                ordenSelec = "peso_envase";
        }        
    }//GEN-LAST:event_cbCampoOrdenActionPerformed
       
    private void cbTipoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoOrdenActionPerformed
        if (cbTipoOrden.getSelectedItem().equals("Descendente"))
        {
                tipoSelec = "DESC";
        }
        else
        {
                tipoSelec = "ASC";
        }
    }//GEN-LAST:event_cbTipoOrdenActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        llenarTablaPersonalizada();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaProducto().setVisible(true);
            }
        });
    }
    
    public void llenarTablaInicio() //listo lo que hay en la bd
    {        
        modelo = new DefaultTableModel();
        List<Producto> lista = pDAO.listarPredeterminado();
        String[] datos = new String[9];
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Peso del envase");
        modelo.addColumn("Estado");
        modelo.addColumn("ID");
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            datos[6] = String.valueOf(p.getPesoEnvase());
            
            if(p.isEstado())
            {
                datos[7] = "Habilitado";
            }
            else
            {
                datos[7] = "Deshabilitado";
            }
            datos[8] = String.valueOf(p.getId());
           
           modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(50);
        tcm.getColumn(3).setPreferredWidth(50);
        tcm.getColumn(4).setPreferredWidth(50);
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(50);
        tcm.getColumn(7).setPreferredWidth(50);        
        tcm.getColumn(8).setPreferredWidth(0);  
        tcm.getColumn(8).setMaxWidth(0);
        tcm.getColumn(8).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
        
        tablaProd.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS); //no sé que opcion dejar, ¿que conviene?
    }
    
    public void llenarTablaPersonalizada()
    {        
        modelo2 = new DefaultTableModel();
        List<Producto> lista = pDAO.listarPersonalizado(OrdenarTabla());
        String[] datos = new String[9];
 
        modelo2.addColumn("Código");
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Precio costo");
        modelo2.addColumn("Precio venta");
        modelo2.addColumn("Stock");
        modelo2.addColumn("Stock mínimo");
        modelo2.addColumn("Peso del envase");
        modelo2.addColumn("Estado");
        modelo2.addColumn("ID");
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            datos[6] = String.valueOf(p.getPesoEnvase());
            
            if(p.isEstado())
            {
                datos[7] = "Habilitado";
            }
            else
            {
                datos[7] = "Deshabilitado";
            }
            datos[8] = String.valueOf(p.getId());
           
           modelo2.addRow(datos);
        }
        
        tablaProd.setModel(modelo2);
        
        tcm2 = tablaProd.getColumnModel();
        tcm2.getColumn(0).setPreferredWidth(100);
        tcm2.getColumn(1).setPreferredWidth(300);
        tcm2.getColumn(2).setPreferredWidth(50);
        tcm2.getColumn(3).setPreferredWidth(50);
        tcm2.getColumn(4).setPreferredWidth(50);
        tcm2.getColumn(5).setPreferredWidth(50);
        tcm2.getColumn(6).setPreferredWidth(50);
        tcm2.getColumn(7).setPreferredWidth(50);        
        tcm2.getColumn(8).setPreferredWidth(0);  
        tcm2.getColumn(8).setMaxWidth(0);
        tcm2.getColumn(8).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
        
        tablaProd.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS); //no sé que opcion dejar, ¿que conviene?
    }
    
    public void llenarTablaBusqueda (List<Producto> lista)
    {
        modelo3 = new DefaultTableModel();
        String[] datos = new String[9];
 
        modelo3.addColumn("Código");
        modelo3.addColumn("Descripción");
        modelo3.addColumn("Precio costo");
        modelo3.addColumn("Precio venta");
        modelo3.addColumn("Stock");
        modelo3.addColumn("Stock mínimo");
        modelo3.addColumn("Peso del envase");
        modelo3.addColumn("Estado");
        modelo3.addColumn("ID");
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            datos[6] = String.valueOf(p.getPesoEnvase());
            
            if(p.isEstado())
            {
                datos[7] = "Habilitado";
            }
            else
            {
                datos[7] = "Deshabilitado";
            }
            datos[8] = String.valueOf(p.getId());
           
           modelo3.addRow(datos);
        }
        
        tablaProd.setModel(modelo3);
        
        tcm3 = tablaProd.getColumnModel();
        tcm3.getColumn(0).setPreferredWidth(100);
        tcm3.getColumn(1).setPreferredWidth(300);
        tcm3.getColumn(2).setPreferredWidth(50);
        tcm3.getColumn(3).setPreferredWidth(50);
        tcm3.getColumn(4).setPreferredWidth(50);
        tcm3.getColumn(5).setPreferredWidth(50);
        tcm3.getColumn(6).setPreferredWidth(50);
        tcm3.getColumn(7).setPreferredWidth(50);        
        tcm3.getColumn(8).setPreferredWidth(0);  
        tcm3.getColumn(8).setMaxWidth(0);
        tcm3.getColumn(8).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
    }
    
    public String[] OrdenarTabla()
    {
        String[] ordenamiento = new String[2];
                
        ordenamiento[0] = ordenSelec;
        ordenamiento[1] = tipoSelec;
        
        return ordenamiento;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnEditarProd;
    private javax.swing.JButton btnMenuPrincipalProd;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnVolverProd;
    private javax.swing.JComboBox<String> cbCampoOrden;
    private javax.swing.JComboBox<String> cbFiltroCampoProd;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProd;
    private javax.swing.JTextField txfdBuscarProd;
    // End of variables declaration//GEN-END:variables
}