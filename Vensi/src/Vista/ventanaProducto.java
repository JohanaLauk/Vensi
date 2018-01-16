package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ventanaProducto extends javax.swing.JFrame 
{    
    ProveedorDAO prDAO = new ProveedorDAO();
    ProductoDAO pDAO = new ProductoDAO();
    DefaultTableModel modelo, modelo2, modelo3;    
    TableColumnModel tcm, tcm2, tcm3;    
    JComboBox cbProv;
    DefaultComboBoxModel modeloCB;
    
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    String filtroSelec = "Todos";
    String situacionSelec = "Todos";
    String ordenSelec = "descripcion";
    String tipoSelec = "ASC";
    String proveedorSelec = "Todos";                 
    
    public ventanaProducto() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        this.setMinimumSize(new Dimension(1000, 500));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(1000, 500));    //al minimizar la ventana aparece con esa medida
        
        cbSituacion.setEnabled(false);
        
        //Al hacer click en el JFrame se quita la seleccion en el JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {                
                tablaProd.clearSelection();
            } 
        });
               
        llenarTabla(); 
        llenarComboBoxProv();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarProd = new javax.swing.JButton();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnNuevoProd = new javax.swing.JButton();
        btnEditarProd = new javax.swing.JButton();
        btnMenuPrincipalProd = new javax.swing.JButton();
        btnVolverProd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbFiltroCampo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbFiltroProv = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbCampoOrden = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración del producto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Buscar:");

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
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
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuPrincipalProd, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuPrincipalProd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jLabel4.setText("Filtrar por:");

        cbFiltroCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltroCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCampoActionPerformed(evt);
            }
        });

        jLabel2.setText("Proveedor:");

        cbFiltroProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroProvActionPerformed(evt);
            }
        });

        jLabel3.setText("Ordenar por:");

        cbCampoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Precio venta", "Stock", "Stock mínimo", "Peso del envase" }));
        cbCampoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCampoOrdenActionPerformed(evt);
            }
        });

        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo habilitados", "Sólo ofertas", "Sólo suspendidos" }));
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroProv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCampoOrden)
                        .addComponent(cbTipoOrden))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFiltroProv)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbSituacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltroCampo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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
            ventanaEditarProd.id_recibido = Integer.parseInt(tablaProd.getValueAt(filaSelec, 11).toString());   
        
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

    private void cbFiltroCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCampoActionPerformed
        if (cbFiltroCampo.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
            cbSituacion.setEnabled(false);
        }
        else
        {
            if (cbFiltroCampo.getSelectedItem().equals("Habilitados"))
            {
                filtroSelec = "Habilitados";   
                cbSituacion.setEnabled(true);
            }
            else
            {
                filtroSelec = "Deshabilitados";
                cbSituacion.setEnabled(false);
            }
        }
        
        llenarTabla();
    }//GEN-LAST:event_cbFiltroCampoActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaBusqueda = null;
        
        if (proveedorSelec.equals("Todos") || proveedorSelec == null)
        {
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec);
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, prov.getId());
        }
        
        llenarTablaBusqueda(listaBusqueda);
        
        if (txfdBuscarProd.getText().equals("") || txfdBuscarProd.getText() == null)
        {
            cbFiltroCampo.setEnabled(true);
            if (cbFiltroCampo.getSelectedItem().equals("Habilitados"))
            {
                cbSituacion.setEnabled(true);
            }
            else
            {
                cbSituacion.setEnabled(false);
            }
            cbFiltroProv.setEnabled(true);
            cbCampoOrden.setEnabled(true);
            cbTipoOrden.setEnabled(true);
            llenarTabla();
        }
        else
        {
            cbFiltroCampo.setEnabled(false);
            cbSituacion.setEnabled(false);
            cbFiltroProv.setEnabled(false);
            cbCampoOrden.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaBusqueda = null;
        
        if (proveedorSelec.equals("Todos") || proveedorSelec == null)
        {
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec);
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, prov.getId());
        }
        
        llenarTablaBusqueda(listaBusqueda);
        
        if (cadena.equals(""))
        {
            cbFiltroCampo.setEnabled(true);
            if (cbFiltroCampo.getSelectedItem().equals("Habilitados"))
            {
                cbSituacion.setEnabled(true);
            }
            else
            {
                cbSituacion.setEnabled(false);
            }
            cbFiltroProv.setEnabled(true);
            cbCampoOrden.setEnabled(true);
            cbTipoOrden.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampo.setEnabled(false);
            cbSituacion.setEnabled(false);
            cbFiltroProv.setEnabled(false);
            cbCampoOrden.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProdKeyReleased

    private void cbFiltroProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroProvActionPerformed
        if (!cbFiltroProv.getSelectedItem().equals("Todos"))
        {
            proveedorSelec = cbFiltroProv.getSelectedItem().toString();
        }
        else
        {
            proveedorSelec = "Todos";
        }
        llenarTabla();
    }//GEN-LAST:event_cbFiltroProvActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void cbSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacionActionPerformed
        if (cbSituacion.getSelectedItem().equals("Todos"))
        {
            situacionSelec = "Todos";
        }
        if (cbSituacion.getSelectedItem().equals("Sólo habilitados"))
        {
            situacionSelec = "Habilitado";
        }
        if (cbSituacion.getSelectedItem().equals("Sólo ofertas"))
        {
            situacionSelec = "Oferta";
        }    
        if (cbSituacion.getSelectedItem().equals("Sólo suspendidos"))
        {
            situacionSelec = "Suspendido";        
        }
    
        llenarTabla();
    }//GEN-LAST:event_cbSituacionActionPerformed
    
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
        
        if (proveedorSelec.equals("Todos") || proveedorSelec == null)
        {
            lista = pDAO.listar(OrdenarTabla());
        }
        else
        {
            Proveedor prov = prDAO.buscarPorCuitNombre(proveedorSelec, "Habilitados").get(0);
            lista = pDAO.listar(OrdenarTabla(), prov.getId());  //modificar
        }
        
        String[] datos = new String[12];
 
        modelo.addColumn("Código");         //0
        modelo.addColumn("Descripción");    //1 
        modelo.addColumn("Precio costo");   //2
        modelo.addColumn("Precio venta");   //3
        modelo.addColumn("$ por kg");       //4
        modelo.addColumn("Stock");          //5 
        modelo.addColumn("Stock mínimo");   //6
        modelo.addColumn("Tipo de venta");  //7
        modelo.addColumn("Peso del envase");//8
        modelo.addColumn("Estado");         //9
        modelo.addColumn("N° proveedor");   //10
        modelo.addColumn("ID");             //11
        
        tablaProd.setModel(modelo);
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf("$" + formatoPrecios.format(p.getPrecioCosto()));
            datos[3] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVenta()));            
            
            if (p.isPorPeso())
            {
                datos[4] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVentaXKilo()));
                
                int pesoEnv1 = p.getPesoEnvase();
                double pesoEnv2 = p.getPesoEnvase();
                datos[8] = String.valueOf(formatoKilos.format(pesoEnv2 / 1000) + "kg");
                
                int stockGR1 = p.getStock();    //gr
                double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnv1;  // u = gr / peso gr
                double stockKG = stockGR2 / 1000;   //kg =  gr / 1000            
                datos[5] = String.valueOf(stockU+"  ("+ formatoKilos.format(stockKG) + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnv1;
                double stockMinKG = stockMinGR2 / 1000;          
                
                datos[6] = String.valueOf(stockMinU+"  ("+ formatoKilos.format(stockMinKG) + "kg)");
                                
                datos[7] = "Por peso";   
            }
            else
            {
                datos[4] = String.valueOf("---");
                datos[5] = String.valueOf(p.getStock());
                datos[6] = String.valueOf(p.getStockMinimo());
                datos[7] = "Por unidad";
                datos[8] = "---";
            }
            
            if (p.isEstado())   //habilitado
            {
                if (p.isOferta() && !p.isSuspendido())
                {
                    datos[9] = "Habilitado - Oferta";
                }
                else
                {
                    if (p.isSuspendido() && !p.isOferta())
                    {
                        datos[9] = "Habilitado - Suspendido";
                    }
                    else
                    {
                        datos[9] = "Habilitado";
                    }                         
                }                
            }
            else
            {
                datos[9] = "Deshabilitado";
            }    
    
            Set<Proveedor> listaProv = p.getProveedor(); 
            
            /*String provs = "";          
           
            for (Proveedor pr : listaProv)
            {
                provs += pr.getRazonSocial() + ", ";
            }            
            datos[10] = provs;*/
            
            datos[10] = String.valueOf(listaProv.size());            
            datos[11] = String.valueOf(p.getId());            
           
            modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);       
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(20);
        tcm.getColumn(3).setPreferredWidth(20);
        tcm.getColumn(4).setPreferredWidth(20);
        tcm.getColumn(5).setPreferredWidth(30);
        tcm.getColumn(6).setPreferredWidth(20);
        tcm.getColumn(7).setPreferredWidth(30);
        tcm.getColumn(8).setPreferredWidth(50);
        tcm.getColumn(9).setPreferredWidth(80);   
        tcm.getColumn(10).setPreferredWidth(20);
        tcm.getColumn(11).setPreferredWidth(0);  
        tcm.getColumn(11).setMaxWidth(0);
        tcm.getColumn(11).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
        
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
        
    public void llenarTablaBusqueda (List<Producto> listaBusqueda)
    {
        modelo2 = new DefaultTableModel();
        String[] datos = new String[12];
 
        modelo2.addColumn("Código");            //0
        modelo2.addColumn("Descripción");       //1
        modelo2.addColumn("Precio costo");      //2
        modelo2.addColumn("Precio venta");      //3
        modelo2.addColumn("$ por kg");          //4
        modelo2.addColumn("Stock");             //5
        modelo2.addColumn("Stock mínimo");      //6
        modelo2.addColumn("Tipo de venta");     //7
        modelo2.addColumn("Peso del envase");   //8
        modelo2.addColumn("Estado");            //9
        modelo2.addColumn("N° proveedor");      //10
        modelo2.addColumn("ID");                //11
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf("$" + formatoPrecios.format(p.getPrecioCosto()));
            datos[3] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVenta()));
            
            if (p.isPorPeso())
            {
                datos[4] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVentaXKilo()));
                
                int pesoEnv1 = p.getPesoEnvase();
                double pesoEnv2 = p.getPesoEnvase();
                datos[8] = String.valueOf(pesoEnv2 / 1000 + "00kg");
                
                int stockGR1 = p.getStock();    //gr
                double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnv1;  // u = gr / peso gr
                double stockKG = stockGR2 / 1000;   //kg =  gr / 1000            
                datos[5] = String.valueOf(stockU + "  ("+ formatoKilos.format(stockKG) + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnv1;
                double stockMinKG = stockMinGR2 / 1000;               
                datos[6] = String.valueOf(stockMinU + "  ("+ formatoKilos.format(stockMinKG) + "kg)");
                                
                datos[7] = "Por peso";
            }
            else
            {
                datos[4] = String.valueOf("---");
                datos[5] = String.valueOf(p.getStock());
                datos[6] = String.valueOf(p.getStockMinimo());
                datos[7] = "Por unidad";
                datos[8] = "---";
            }
            
            if (p.isEstado())   //habilitado
            {
                if (p.isOferta() && !p.isSuspendido())
                {
                    datos[9] = "Habilitado - Oferta";
                }
                else
                {
                    if (p.isSuspendido() && !p.isOferta())
                    {
                        datos[9] = "Habilitado - Suspendido";
                    }
                    else
                    {
                        datos[9] = "Habilitado";
                    }                         
                }                
            }
            else
            {
                datos[9] = "Deshabilitado";
            }    
    
            Set<Proveedor> listaProv = p.getProveedor(); 
            
            /*String provs = "";          
           
            for (Proveedor pr : listaProv)
            {
                provs += pr.getRazonSocial() + ", ";
            }            
            datos[10] = provs;*/
            
            datos[10] = String.valueOf(listaProv.size());            
            datos[11] = String.valueOf(p.getId());            
           
            modelo2.addRow(datos);
        }
        
        tablaProd.setModel(modelo2);
        
        tcm2 = tablaProd.getColumnModel();
        tcm2.getColumn(0).setPreferredWidth(100);
        tcm2.getColumn(1).setPreferredWidth(300);
        tcm2.getColumn(2).setPreferredWidth(20);
        tcm2.getColumn(3).setPreferredWidth(20);
        tcm2.getColumn(4).setPreferredWidth(20);
        tcm2.getColumn(5).setPreferredWidth(30);
        tcm2.getColumn(6).setPreferredWidth(20);
        tcm2.getColumn(7).setPreferredWidth(30);
        tcm2.getColumn(8).setPreferredWidth(50);
        tcm2.getColumn(9).setPreferredWidth(80);   
        tcm2.getColumn(10).setPreferredWidth(20);
        tcm2.getColumn(11).setPreferredWidth(0);  
        tcm2.getColumn(11).setMaxWidth(0);
        tcm2.getColumn(11).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
    }
    
    public String[] OrdenarTabla()
    {
        String[] ordenamiento = new String[4];
         
        ordenamiento[0] = filtroSelec;
        ordenamiento[1] = situacionSelec;
        ordenamiento[2] = ordenSelec;
        ordenamiento[3] = tipoSelec;
                
        return ordenamiento;
    }
    
    private void llenarComboBoxProv() 
    {
        List<Proveedor> lista = prDAO.listar("Habilitados");
        
        cbFiltroProv.addItem("Todos");
        
        for (Proveedor p : lista)
        {
            cbFiltroProv.addItem(p.getRazonSocial());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnEditarProd;
    private javax.swing.JButton btnMenuPrincipalProd;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnVolverProd;
    private javax.swing.JComboBox<String> cbCampoOrden;
    private javax.swing.JComboBox<String> cbFiltroCampo;
    private javax.swing.JComboBox<String> cbFiltroProv;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    // End of variables declaration//GEN-END:variables
}
