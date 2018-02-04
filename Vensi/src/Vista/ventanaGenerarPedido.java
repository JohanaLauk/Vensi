package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Impresion.Generar;
import Modelo.ItemImprimir;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaGenerarPedido extends javax.swing.JFrame 
{
    ProductoDAO prodDAO = new ProductoDAO();
    ProveedorDAO provDAO = new ProveedorDAO();
    DefaultTableModel modelo, modelo2, modelo3, m, m2;
    TableColumnModel tcm, tcm2, tcm3;
    DefaultListModel modeloList;
    
    String filtroSelec = "Todos";
    String situacionSelec = "Todos";
    String ordenSelec = "descripcion";
    String tipoSelec = "ASC";
    
    Producto elProd = null;
    Proveedor elProv = null;
    String provSelec = "Seleccionar";
    
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    public ventanaGenerarPedido() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);       //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        txfdBuscarProd.setEnabled(false);
        btnBuscarProd.setEnabled(false);

        cbFiltro.setEnabled(false);
        cbSituacion.setEnabled(false);
        cbOrdenCampo.setEnabled(false);
        cbTipoOrden.setEnabled(false);
        
        btnQuitar.setEnabled(false);
        btnAgregar.setEnabled(false);
        txfdCantidad.setEnabled(false);
        
        //Al hacer click en el JFrame se quita la seleccion en los JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProd.clearSelection();
                tablaPedido.clearSelection();
                listInfoProd.clearSelection();
                txfdCantidad.setText("");
                
                limpiarList();
                
                btnQuitar.setEnabled(false);
                btnAgregar.setEnabled(false);
                txfdCantidad.setEnabled(false);                
            } 
        });    
        
        listarAlarma();        
        llenarCBBProveedor();
        mostrarTablaVacia();
        llenarTablaPedido();         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbOrdenCampo = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        cbFiltro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        panelProv = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        txfdCantidad = new org.jdesktop.swingx.JXTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnImprimirPedido = new javax.swing.JButton();
        btnVolverMP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listProdAlarma = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar pedido");

        jLabel1.setText("Buscar:");

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.setNextFocusableComponent(cbFiltro);
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        jLabel2.setText("Ordenar por:");

        cbOrdenCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Stock", "Stock mínimo" }));
        cbOrdenCampo.setNextFocusableComponent(cbTipoOrden);
        cbOrdenCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenCampoActionPerformed(evt);
            }
        });

        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.setNextFocusableComponent(txfdCantidad);
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

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

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltro.setNextFocusableComponent(cbSituacion);
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        jLabel4.setText("Filtrar por:");

        txfdBuscarProd.setNextFocusableComponent(btnBuscarProd);
        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        jLabel7.setText("Indique el proveedor:");

        cbProveedores.setNextFocusableComponent(txfdBuscarProd);
        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProvLayout = new javax.swing.GroupLayout(panelProv);
        panelProv.setLayout(panelProvLayout);
        panelProvLayout.setHorizontalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProvLayout.setVerticalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvLayout.createSequentialGroup()
                .addGroup(panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo ofertas", "Sólo suspendidos" }));
        cbSituacion.setNextFocusableComponent(cbOrdenCampo);
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Cantidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(btnQuitar);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Código:", "Descripción:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listInfoProd);

        jLabel6.setText("Datos del producto:");

        btnQuitar.setText("Quitar");
        btnQuitar.setNextFocusableComponent(btnImprimirPedido);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        txfdCantidad.setNextFocusableComponent(btnAgregar);
        txfdCantidad.setPrompt("Unidades");
        txfdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jLabel3.setText("Lista pedido:");

        btnImprimirPedido.setText("Imprimir pedido");
        btnImprimirPedido.setNextFocusableComponent(btnVolverMP);
        btnImprimirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPedidoActionPerformed(evt);
            }
        });

        btnVolverMP.setText("Volver al menú principal");
        btnVolverMP.setNextFocusableComponent(cbProveedores);
        btnVolverMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMPActionPerformed(evt);
            }
        });

        tablaPedido = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPedido.setFocusable(false);
        tablaPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPedido.getTableHeader().setResizingAllowed(false);
        tablaPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaPedido);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverMP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverMP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel8.setText("Alarma en productos ");

        jScrollPane4.setViewportView(listProdAlarma);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMPActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMPActionPerformed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        if (cbFiltro.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
            cbSituacion.setEnabled(false);
        }
        else
        {
            if (cbFiltro.getSelectedItem().equals("Habilitados"))
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
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void cbOrdenCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenCampoActionPerformed
        if (cbOrdenCampo.getSelectedItem().equals("Descripción"))
        {
            ordenSelec = "descripcion";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Código"))
        {
            ordenSelec = "codigo";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Precio costo"))
        {
            ordenSelec = "precio_costo";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Precio venta"))
        {
            ordenSelec = "precio_venta";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Stock"))
        {
            ordenSelec = "stock";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Stock mínimo"))
        {
            ordenSelec = "stock_minimo";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Peso del envase"))
        {
            ordenSelec = "peso_envase";
        } 
        
        llenarTabla();        
    }//GEN-LAST:event_cbOrdenCampoActionPerformed

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

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        String cadena = txfdBuscarProd.getText();        
        List<Producto> listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
        llenarTablaBusqueda(listaBusqueda);
        
        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {
            if (cadena.equals("") || cadena == null)
            {
                cbFiltro.setEnabled(true);
                if (cbFiltro.getSelectedItem().equals("Habilitados"))
                {
                    cbSituacion.setEnabled(true);
                }
                else
                {
                    cbSituacion.setEnabled(false);
                }
                cbOrdenCampo.setEnabled(true);
                cbTipoOrden.setEnabled(true); 
                llenarTabla();
            }
            else
            {
                cbFiltro.setEnabled(false);
                cbSituacion.setEnabled(false);
                cbOrdenCampo.setEnabled(false);
                cbTipoOrden.setEnabled(false);
            }
        } 
        else
        {
            mostrarTablaVacia();
        }  
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();        
        List<Producto> listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
        llenarTablaBusqueda(listaBusqueda);
        
        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {
            if (cadena.equals("") || cadena == null)
            {
                cbFiltro.setEnabled(true);
                if (cbFiltro.getSelectedItem().equals("Habilitados"))
                {
                    cbSituacion.setEnabled(true);
                }
                else
                {
                    cbSituacion.setEnabled(false);
                }
                cbOrdenCampo.setEnabled(true);
                cbTipoOrden.setEnabled(true); 
                llenarTabla();
            }
            else
            {
                cbFiltro.setEnabled(false);
                cbSituacion.setEnabled(false);
                cbOrdenCampo.setEnabled(false);
                cbTipoOrden.setEnabled(false);
            }
        } 
        else
        {
            mostrarTablaVacia();
            cbFiltro.setEnabled(false);
            cbSituacion.setEnabled(false);
            cbOrdenCampo.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProdKeyReleased

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        provSelec = String.valueOf(cbProveedores.getSelectedItem());
        List<Proveedor> listaTotalProv = provDAO.listar("Habilitados");
                
        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {  
            txfdBuscarProd.setEnabled(true);
            btnBuscarProd.setEnabled(true);
            
            cbFiltro.setEnabled(true);
            if (filtroSelec.equals("Habilitados"))
            {
                cbSituacion.setEnabled(true);
            }
            else
            {
                cbSituacion.setEnabled(false);
            }            
            cbOrdenCampo.setEnabled(true);
            cbTipoOrden.setEnabled(true);
            
            for (Proveedor p : listaTotalProv)
            {
                if (p.getRazonSocial().equals(provSelec))
                {
                    elProv = provDAO.buscarPorCuitNombre(provSelec, "Habilitados").get(0);
                    llenarTabla();
                }
            }      
            
            llenarTablaPedido();
        }
        else
        {
            mostrarTablaVacia();   
            
            if (provSelec.equals("Seleccionar"))
            {
                llenarTablaPedido();
            }
            
            txfdBuscarProd.setEnabled(false);
            btnBuscarProd.setEnabled(false);
            
            cbFiltro.setEnabled(false);
            cbSituacion.setEnabled(false);
            cbOrdenCampo.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSelec = tablaProd.getSelectedRow();
        boolean repetido = false;
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            String id_recibido = tablaProd.getValueAt(filaSelec, 6).toString();
            for(int i = 0; i < tablaPedido.getModel().getRowCount(); i++){
                if(Integer.parseInt(tablaPedido.getValueAt(i, 3).toString()) == Integer.parseInt(id_recibido))
                {
                    repetido = true;
                }
            }
            if(repetido){
                JOptionPane.showMessageDialog(null, "Producto repetido.");
            }
            else{
                            
            elProd = prodDAO.buscarPorId(Integer.parseInt(id_recibido));
            
            String codigo = elProd.getCodigo();
            String descrip = elProd.getDescripcion();
                
            String cantidad = txfdCantidad.getText();
            
            if(cantidad.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad");
            }
            else
            {   
                m = (DefaultTableModel) tablaPedido.getModel();
                String filaNueva[] = {codigo, descrip, cantidad, id_recibido};
                m.addRow(filaNueva);                   
            }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
        txfdCantidad.setText("");
        
        limpiarList();
        
        tablaProd.setRowSelectionAllowed(false);
        tablaPedido.setRowSelectionAllowed(false);
        
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
        txfdCantidad.setEnabled(false);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int filaSelec = tablaPedido.getSelectedRow();
        
        m2 = (DefaultTableModel) tablaPedido.getModel(); 
        m2.removeRow(filaSelec); 
        
        limpiarList();
        
        txfdCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);        
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnImprimirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPedidoActionPerformed
        //String provSelec = String.valueOf(cbProveedores.getSelectedItem());
        int filasTabla = tablaPedido.getRowCount();
        
        List<ItemImprimir> listaProdImprimir = new ArrayList();
        List<String> datosProv = new ArrayList();
        
        if(!provSelec.equals("Seleccionar") && !provSelec.equals("No hay proveedores") && filasTabla!=0 )
        {
            for (int i=0 ; i<filasTabla ; i++)   //recorre todas las filas del carrito
            { 
                String idProd = tablaPedido.getValueAt(i, 4).toString();                    
                Producto elProd = prodDAO.buscarPorId(Integer.parseInt(idProd));
                String cantidad = tablaPedido.getValueAt(i, 2).toString();
                
                ItemImprimir unItemImp = new ItemImprimir();
                unItemImp.setProducto(elProd);
                unItemImp.setCantidad(Integer.parseInt(cantidad));
                
                listaProdImprimir.add(unItemImp);                
            }
            
            List<Proveedor> listaTotalProv = provDAO.listar("Habilitados");
            
            for (Proveedor p : listaTotalProv)
            {
                if (p.getRazonSocial().equals(provSelec))
                {
                    datosProv.add(p.getRazonSocial());
                    datosProv.add(p.getCuit());
                    datosProv.add(p.getDireccion());
                    datosProv.add(p.getLocalidad() + ", " + p.getProvincia() + " (" + p.getPais() + ")");
                    datosProv.add(p.getContacto());
                }
            }            
            
            Generar generarNotaPedido = new Generar();
            generarNotaPedido.notaPedido();//listaProdImprimir, datosProv);     //aca debería pasarle por parametro lo que debe imprimir
        }
        else 
        {
            if(provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Debe agregar un producto");
            }
        }        
    }//GEN-LAST:event_btnImprimirPedidoActionPerformed

    private void cbSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacionActionPerformed
        if (cbSituacion.getSelectedItem().equals("Todos"))
        {
            situacionSelec = "Todos";
        }
        else
        {
            if (cbSituacion.getSelectedItem().equals("Sólo ofertas"))
            {
                situacionSelec = "Oferta";
            }
            else
            {
                situacionSelec = "Suspendido";
            }
        }
        llenarTabla();
    }//GEN-LAST:event_cbSituacionActionPerformed

    private void txfdCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantidadKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfdCantidadKeyTyped
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaGenerarPedido().setVisible(true);
            }
        });
    }

    public void llenarTabla()
    {   
        modelo = new DefaultTableModel();
        List<Producto> listaInicial = prodDAO.listar(OrdenarTabla(), elProv.getId());
        String[] datos = new String[7];
 
        modelo.addColumn("Código");         //0
        modelo.addColumn("Descripción");    //1
        modelo.addColumn("Precio costo");   //2
        modelo.addColumn("Stock");          //3
        modelo.addColumn("Stock mínimo");   //4
        modelo.addColumn("Peso envase");    //5
        modelo.addColumn("ID");             //6
        
        for (Producto p : listaInicial)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf("$" + formatoPrecios.format(p.getPrecioCosto()));
            
            if (p.isPorPeso())
            {
                int pesoEnvGR1 = p.getPesoEnvase();
                double pesoEnvGR2 = p.getPesoEnvase();
                datos[5] = String.valueOf(formatoKilos.format(pesoEnvGR2 / 1000) + "kg");
                
                int stockGR1 = p.getStock();
                //double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnvGR1;
                //double stockKG = stockGR2 / 1000;
                datos[3] = String.valueOf(stockU); //+ "  (" + stockKG + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                //double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnvGR1;
                //double stockMinKG = stockMinGR2 / 1000;
                datos[4] = String.valueOf(stockMinU); //+ "  (" + stockMinKG + "kg)");                
            }
            else
            {
                datos[3] = String.valueOf(p.getStock());
                datos[4] = String.valueOf(p.getStockMinimo()); 
                datos[5] = String.valueOf("---");
            }
                       
            datos[6] = String.valueOf(p.getId());
           
            modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(50);
        tcm.getColumn(3).setPreferredWidth(40);
        tcm.getColumn(4).setPreferredWidth(50);  
        tcm.getColumn(5).setPreferredWidth(50);       
        tcm.getColumn(6).setPreferredWidth(0);  
        tcm.getColumn(6).setMaxWidth(0);
        tcm.getColumn(6).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);       
        
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
                
                int filaSelec = tablaProd.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    String cod = tablaProd.getValueAt(filaSelec, 0).toString();
                    String desc = tablaProd.getValueAt(filaSelec, 1).toString();
                    
                    modeloList = new DefaultListModel(); 
                    modeloList.clear();
                    modeloList.addElement("Código: " + cod);
                    modeloList.addElement("Descripcion: " + desc);

                    listInfoProd.setModel(modeloList);
                                        
                    btnAgregar.setEnabled(true);
                    txfdCantidad.setEnabled(true);
                    btnQuitar.setEnabled(false);
                }
            } 
        });
    }
    
    public void llenarTablaPedido()
    {
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Código");
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("ID");       
                
        tablaPedido.setModel(modelo2);
        
        tcm2 = tablaPedido.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(100);
        tcm2.getColumn(1).setPreferredWidth(300);
        tcm2.getColumn(2).setPreferredWidth(50);  
        tcm2.getColumn(3).setPreferredWidth(0);  
        tcm2.getColumn(3).setMaxWidth(0);
        tcm2.getColumn(3).setMinWidth(0);
        tablaPedido.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tablaPedido.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        
        tablaPedido.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaPedido.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
            {                
                tablaPedido.setRowSelectionAllowed(false);
            } 
        });
        
        tablaPedido.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaPedido.setRowSelectionAllowed(true);
                
                int filaSelec = tablaPedido.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    String cod = tablaPedido.getValueAt(filaSelec, 0).toString();
                    String desc = tablaPedido.getValueAt(filaSelec, 1).toString();
                    
                    modeloList = new DefaultListModel(); 
                    modeloList.clear();
                    modeloList.addElement("Código: " + cod);
                    modeloList.addElement("Descripcion: " + desc);
                    listInfoProd.setModel(modeloList);
                    
                    txfdCantidad.setEnabled(false);
                    btnAgregar.setEnabled(false);
                    btnQuitar.setEnabled(true);
                }
            } 
        });
    }
    
    public void llenarTablaBusqueda (List<Producto> listaBusqueda)
    {
        modelo3 = new DefaultTableModel();
        String[] datos = new String[7];
 
        modelo3.addColumn("Código");
        modelo3.addColumn("Descripción");
        modelo3.addColumn("Precio costo");
        modelo3.addColumn("Stock");
        modelo3.addColumn("Stock mínimo");
        modelo3.addColumn("Peso envase");
        modelo3.addColumn("ID");
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(formatoPrecios.format(p.getPrecioCosto()));
            
            if (p.isPorPeso())
            {
                int pesoEnvGR1 = p.getPesoEnvase();
                double pesoEnvGR2 = p.getPesoEnvase();
                datos[5] = String.valueOf(formatoKilos.format(pesoEnvGR2 / 1000) + "kg");
                
                int stockGR1 = p.getStock();
                //double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnvGR1;
                //double stockKG = stockGR2 / 1000;
                datos[3] = String.valueOf(stockU); //+ "  (" + stockKG + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                //double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnvGR1;
                //double stockMinKG = stockMinGR2 / 1000;
                datos[4] = String.valueOf(stockMinU); //+ "  (" + stockMinKG + "kg)");
            }
            else
            {
                datos[3] = String.valueOf(p.getStock());
                datos[4] = String.valueOf(p.getStockMinimo()); 
                datos[5] = String.valueOf("---");
            }
                       
            datos[6] = String.valueOf(p.getId());
           
           modelo3.addRow(datos);
        }
        
        tablaProd.setModel(modelo3);
        
        tcm3 = tablaProd.getColumnModel();
        tcm3.getColumn(0).setPreferredWidth(100);
        tcm3.getColumn(1).setPreferredWidth(300);
        tcm3.getColumn(2).setPreferredWidth(50);
        tcm3.getColumn(3).setPreferredWidth(40);
        tcm3.getColumn(4).setPreferredWidth(50);  
        tcm3.getColumn(5).setPreferredWidth(50);       
        tcm3.getColumn(6).setPreferredWidth(0);  
        tcm3.getColumn(6).setMaxWidth(0);
        tcm3.getColumn(6).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
    }
    
    public void mostrarTablaVacia()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Peso envase");
        modelo.addColumn("ID");

        tablaProd.setModel(modelo);

        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(50);
        tcm.getColumn(3).setPreferredWidth(40);
        tcm.getColumn(4).setPreferredWidth(50);  
        tcm.getColumn(5).setPreferredWidth(50);       
        tcm.getColumn(6).setPreferredWidth(0);  
        tcm.getColumn(6).setMaxWidth(0);
        tcm.getColumn(6).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
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
    
    public void listarAlarma()
    {
        modeloList = new DefaultListModel(); 
        modeloList.clear();
        
        List<Producto> prodAlarma = prodDAO.alarma();
        
        for (Producto p : prodAlarma)
        {
            modeloList.addElement(p.getCodigo() + " | " + p.getDescripcion());
        }     
        
        listProdAlarma.setModel(modeloList);        
    }
    
    public void llenarCBBProveedor()
    {
        DefaultComboBoxModel modeloCBB = new DefaultComboBoxModel();
        
        List<Proveedor> listaP = provDAO.listar("Habilitados");
        
        if (listaP.size() < 0)
        {            
            modeloCBB.addElement("No hay proveedores");
        }
        else
        {
            modeloCBB.addElement("Seleccionar");
            for (Proveedor p : listaP)
            {
                modeloCBB.addElement(p.getRazonSocial());
            }
        }
        
        cbProveedores.setModel(modeloCBB);
    }
    
    public void limpiarList()
    {
        modeloList = new DefaultListModel(); 
        modeloList.clear();
        modeloList.addElement("Código: ");
        modeloList.addElement("Descripcion: ");
        listInfoProd.setModel(modeloList);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnImprimirPedido;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVolverMP;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrdenCampo;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JList<String> listProdAlarma;
    private javax.swing.JPanel panelProv;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private org.jdesktop.swingx.JXTextField txfdCantidad;
    // End of variables declaration//GEN-END:variables
}
