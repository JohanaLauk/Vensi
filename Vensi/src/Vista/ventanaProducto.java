package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

public class ventanaProducto extends javax.swing.JFrame 
{    
    ProveedorDAO prDAO = new ProveedorDAO();
    ProductoDAO pDAO = new ProductoDAO();
    DefaultTableModel modelo, modelo2, modelo3;    
    TableColumnModel tcm, tcm2, tcm3;    
    JComboBox cbProv;
    DefaultComboBoxModel modeloCB;
    
    String filtroSelec = null;
    String ordenSelec = null;
    String tipoSelec = null;
    String proveedorSelec = null;                 
    
    public ventanaProducto() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        this.setMinimumSize(new Dimension(1000, 500));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(1000, 500));    //al minimizar la ventana aparece con esa medida
                       
        //Al hacer click en el JFrame se quita la seleccion en el JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {                
                tablaProd.clearSelection();
            } 
        });
        
        if (proveedorSelec == null)
        {
            proveedorSelec = "Proveedores";
        }
        
        llenarTabla(); 
        llenarComboBoxProv();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbFiltroCampoProd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbCampoOrden = new javax.swing.JComboBox<>();
        btnBuscarProd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbTipoOrden = new javax.swing.JComboBox<>();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        cbProveedores = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnNuevoProd = new javax.swing.JButton();
        btnEditarProd = new javax.swing.JButton();
        btnMenuPrincipalProd = new javax.swing.JButton();
        btnVolverProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración del producto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Buscar:");

        cbFiltroCampoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltroCampoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCampoProdActionPerformed(evt);
            }
        });

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

        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
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
                .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroCampoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFiltroCampoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        tablaProd = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProd.setFocusable(false);
        tablaProd.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProd.getTableHeader().setResizingAllowed(false);
        tablaProd.getTableHeader().setReorderingAllowed(false);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
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
    }//GEN-LAST:event_btnNuevoProdActionPerformed

    private void btnEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdActionPerformed
        int filaSelec = tablaProd.getSelectedRow();
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            //GUARDAMOS EL ID EN LA VARIABLE DE LA VENTANA_EDITAR_PROD, DEL PRODUCTO SELECCIONADO EN LA TABLA
            ventanaEditarProd.id_recibido = Integer.parseInt(tablaProd.getValueAt(filaSelec, 10).toString());   
        
            ventanaEditarProd vEditarProd = new ventanaEditarProd();
            vEditarProd.setVisible(true);            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }        
    }//GEN-LAST:event_btnEditarProdActionPerformed
       
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
        
        llenarTabla(); 
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
        
        llenarTabla();
    }//GEN-LAST:event_cbTipoOrdenActionPerformed

    private void cbFiltroCampoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCampoProdActionPerformed
        if (cbFiltroCampoProd.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
        }
        else
        {
            if (cbFiltroCampoProd.getSelectedItem().equals("Habilitados"))
            {
                filtroSelec = "Habilitados";                
            }
            else
            {
                filtroSelec = "Deshabilitados";
            }
        }
        
        llenarTabla();
    }//GEN-LAST:event_cbFiltroCampoProdActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaBusqueda = null;
        
        if (proveedorSelec.equals("Proveedores") || proveedorSelec == null)
        {
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec);
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, prov.getId());
        }
        
        llenarTablaBusqueda(listaBusqueda);
        
        if (txfdBuscarProd.getText().equals("") || txfdBuscarProd.getText() == null)
        {
            cbFiltroCampoProd.setEnabled(true);
            cbCampoOrden.setEnabled(true);
            cbTipoOrden.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampoProd.setEnabled(false);
            cbCampoOrden.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaBusqueda = null;
        
        if (proveedorSelec.equals("Proveedores") || proveedorSelec == null)
        {
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec);
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, prov.getId());
        }
        
        llenarTablaBusqueda(listaBusqueda);
        
        if (txfdBuscarProd.getText().equals("") || txfdBuscarProd.getText() == null)
        {
            cbFiltroCampoProd.setEnabled(true);
            cbCampoOrden.setEnabled(true);
            cbTipoOrden.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampoProd.setEnabled(false);
            cbCampoOrden.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProdKeyReleased

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        
        if (!cbProveedores.getSelectedItem().equals("Proveedores"))
        {
            proveedorSelec = cbProveedores.getSelectedItem().toString();
        }
        else
        {
            proveedorSelec = "Proveedores";
        }
        llenarTabla();
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated
    
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
    
    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        List<Producto> lista = null;
        
        if (proveedorSelec.equals("Proveedores") || proveedorSelec == null)
        {
            lista = pDAO.listar(OrdenarTabla());
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            lista = pDAO.listar(OrdenarTabla(), prov.getId());
        }
        
        String[] datos = new String[11];
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Tipo de venta");
        modelo.addColumn("Peso del envase");
        modelo.addColumn("Estado");
        modelo.addColumn("Proveedor");
        modelo.addColumn("ID");
        
        tablaProd.setModel(modelo);
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            
            if (p.isPorPeso())
            {
                datos[6] = "Por peso";
                datos[7] = String.valueOf(p.getPesoEnvase());
            }
            else
            {
                datos[6] = "Por unidad";
                datos[7] = "---";
            }                      
            
            if (p.isEstado())
            {
                datos[8] = "Habilitado";
            }
            else
            {
                datos[8] = "Deshabilitado";
            }    
    
            Set<Proveedor> listaProv = p.getProveedor(); 
            //String provs = "";          
           
            /*for (Proveedor pr : listaProv)
            {
                provs += pr.getRazonSocial() + ", ";
            }            
            datos[9] = provs;
            
            datos[9] = "ver";            
            datos[10] = String.valueOf(p.getId());*/
           
            modelo.addRow(datos);
               
            //pueba JOHA
            //cbProv = new JComboBox();
            int cantProv = listaProv.size();
            String[] provs = new String[cantProv+1];

            provs[0] = "Ver [" + cantProv + "]";
            //cbProv.addItem("Ver [" + cantProv + "]");
                             
            for (int i=1 ; i<cantProv ; i++)
            {
                for (Proveedor x : listaProv)
                {
                    provs[i] = String.valueOf(x.getRazonSocial());                    
                    //cbProv.addItem(String.valueOf(x.getRazonSocial()));
                }
            }
            
            cbProv = new JComboBox(provs);            
            TableColumn columna = tablaProd.getColumnModel().getColumn(9);            
            //TableCellEditor colEdit = new DefaultCellEditor(cbProv);
            //columna.setCellEditor(colEdit);
            columna.setCellEditor(new DefaultCellEditor(cbProv));   //esto es lo mismo que las 2 lineas anteriores        
            //columna.setCellRenderer(new ... (cbProv));
            
        }
        
        tablaProd.setModel(modelo);       
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(50);
        tcm.getColumn(3).setPreferredWidth(50);
        tcm.getColumn(4).setPreferredWidth(50);
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(80);
        tcm.getColumn(7).setPreferredWidth(50);
        tcm.getColumn(8).setPreferredWidth(50);   
        tcm.getColumn(9).setPreferredWidth(50);
        tcm.getColumn(10).setPreferredWidth(0);  
        tcm.getColumn(10).setMaxWidth(0);
        tcm.getColumn(10).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
        
        tablaProd.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaProd.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
            {                
                tablaProd.setRowSelectionAllowed(false);
            } 
        });
        
        tablaProd.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProd.setRowSelectionAllowed(true);
            } 
        });
    }  
    
    /*public void llenarTabla ()
    {
        modelo = new DefaultTableModel();
        List<Producto> lista = null;
        if (proveedorSelec.equals("Proveedores") || proveedorSelec == null)
        {
            lista = pDAO.listar(OrdenarTabla());
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            lista = pDAO.listar(OrdenarTabla(), prov.getId());
        }
        
        String[] datos = new String[10];
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Tipo de venta");
        modelo.addColumn("Peso del envase");
        modelo.addColumn("Estado");
        modelo.addColumn("ID");
        modelo.addColumn("Proveedores");
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            
            if (p.isPorPeso())
            {
                datos[6] = "Por peso";
            }
            else
            {
                datos[6] = "Por unidad";
            }
            
            datos[7] = String.valueOf(p.getPesoEnvase());
            
            if(p.isEstado())
            {
                datos[8] = "Habilitado";
            }
            else
            {
                datos[8] = "Deshabilitado";
            }
	    datos[9] = String.valueOf(p.getId());
	    modelo.addRow(datos);
            tablaProd.setModel(modelo);
            Set<Proveedor> listaProveedor = p.getProveedor();
            String [] nombresProv = new String[listaProveedor.size()];
            int i = 0;
    
            for(Proveedor pr : listaProveedor){
                nombresProv[i] = pr.getRazonSocial();
                i++;
            }
            JComboBox cb = new JComboBox(nombresProv);
	    TableColumn col = tablaProd.getColumnModel().getColumn(10);
	    TableCellEditor colEdit = new DefaultCellEditor(cb);
	    col.setCellEditor(colEdit);   
            
  
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(50);
        tcm.getColumn(3).setPreferredWidth(50);
        tcm.getColumn(4).setPreferredWidth(50);
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(80);
        tcm.getColumn(7).setPreferredWidth(50);
        tcm.getColumn(8).setPreferredWidth(50);   
        tcm.getColumn(9).setPreferredWidth(70);
        tcm.getColumn(9).setPreferredWidth(0);  
        tcm.getColumn(9).setMaxWidth(0);
        tcm.getColumn(9).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(9).setMinWidth(0);
	tcm.getColumn(10).setPreferredWidth(70);
        
        tablaProd.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaProd.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
            {                
                tablaProd.setRowSelectionAllowed(false);
            } 
        });
        
        tablaProd.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProd.setRowSelectionAllowed(true);
            } 
        });
    }*/
    
    public void llenarTablaBusqueda (List<Producto> listaBusqueda)
    {
        modelo2 = new DefaultTableModel();
        String[] datos = new String[11];
 
        modelo2.addColumn("Código");
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Precio costo");
        modelo2.addColumn("Precio venta");
        modelo2.addColumn("Stock");
        modelo2.addColumn("Stock mínimo");
        modelo2.addColumn("Tipo de venta");
        modelo2.addColumn("Peso del envase");
        modelo2.addColumn("Estado");
        modelo2.addColumn("Proveedores");
        modelo2.addColumn("ID");
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getPrecioVenta());
            datos[4] = String.valueOf(p.getStock());
            datos[5] = String.valueOf(p.getStockMinimo());
            
            if (p.isPorPeso())
            {
                datos[6] = "Por peso";
            }
            else
            {
                datos[6] = "Por unidad";
            }
            
            datos[7] = String.valueOf(p.getPesoEnvase());
            
            if(p.isEstado())
            {
                datos[8] = "Habilitado";
            }
            else
            {
                datos[8] = "Deshabilitado";
            }
            
            Set<Proveedor> listaProv = p.getProveedor();
            String provs = "";
            
            for (Proveedor pr : listaProv)
            {
                provs += pr.getRazonSocial() + ", ";
            }
            datos[9] = provs;
            datos[10] = String.valueOf(p.getId());
           
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
        tcm.getColumn(6).setPreferredWidth(80);
        tcm.getColumn(7).setPreferredWidth(50);
        tcm.getColumn(8).setPreferredWidth(50);   
        tcm.getColumn(9).setPreferredWidth(70);
        tcm.getColumn(10).setPreferredWidth(0);  
        tcm.getColumn(10).setMaxWidth(0);
        tcm.getColumn(10).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
    }
    
    public String[] OrdenarTabla()
    {
        String[] ordenamiento = new String[3];
                
        if (filtroSelec == null)
        {
            filtroSelec = "Todos";
        }
        if (ordenSelec == null)
        {
            ordenSelec = "descripcion";
        }
        if (tipoSelec == null)
        {
            tipoSelec = "ASC";
        }
        
        ordenamiento[0] = filtroSelec;
        ordenamiento[1] = ordenSelec;
        ordenamiento[2] = tipoSelec;
                
        return ordenamiento;
    }
    
    private void llenarComboBoxProv() 
    {
        List<Proveedor> lista = prDAO.listar("Habilitados");
        
        cbProveedores.addItem("Proveedores");
        
        for (Proveedor p : lista)
        {
            cbProveedores.addItem(p.getRazonSocial());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnEditarProd;
    private javax.swing.JButton btnMenuPrincipalProd;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnVolverProd;
    private javax.swing.JComboBox<String> cbCampoOrden;
    private javax.swing.JComboBox<String> cbFiltroCampoProd;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    // End of variables declaration//GEN-END:variables
}
