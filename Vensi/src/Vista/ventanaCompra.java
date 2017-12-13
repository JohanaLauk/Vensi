package Vista;

import DAO.*;
import Modelo.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaCompra extends javax.swing.JFrame 
{
    ProductoDAO prodDAO = new ProductoDAO();
    ProveedorDAO provDAO = new ProveedorDAO();
    PedidoDAO pedidoDAO = new PedidoDAO();
    ItemPedidoDAO iDAO = new ItemPedidoDAO();
    
    DefaultTableModel modelo, modelo2, modelo3, m, m2;
    TableColumnModel tcm, tcm2, tcm3;
    DefaultListModel modeloList;
    
    String filtroSelec = "Todos";
    String situacionSelec = "Todos";
    String ordenSelec = "descripcion";
    String tipoSelec = "ASC";
    
    List<Producto> listaBusqueda = null;
    
    Proveedor elProv = null;
    String provSelec = "Seleccionar";
    
    public ventanaCompra() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        txfdCantidad.setEnabled(false);
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
        
        for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
        {
            panelBusqueda.getComponent(i).setEnabled(false);
        }
        for (int i=0 ; i < panelComboBox.getComponents().length ; i++)
        {
            panelComboBox.getComponent(i).setEnabled(false);
        }
        
        //Al hacer click en el JFrame se quita la seleccion en los JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProd.clearSelection();
                tablaListaInventario.clearSelection();
                listInfoProd.clearSelection();
                txfdCantidad.setText("");
                txfdPrecioCU.setText("");
                txfdPrecioVU.setText("");
                
                limpiarList();
                
                txfdCantidad.setEnabled(false);
                txfdPrecioCU.setEnabled(false);
                txfdPrecioVU.setEnabled(false);
                btnAgregar.setEnabled(false);
                btnQuitar.setEnabled(false);
            } 
        });
        
        llenarCBBProveedor();
        mostrarTablaVacia();
        llenarTablaInventario();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTablaProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListaInventario = new javax.swing.JTable();
        btnCargarInventario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        txfdCantidad = new javax.swing.JTextField();
        btnQuitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfdPrecioCU = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfdPrecioVU = new javax.swing.JTextField();
        panelBusqueda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        btnBuscarProd = new javax.swing.JButton();
        panelComboBox = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbOrdenCampo = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        panelProv = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");

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

        javax.swing.GroupLayout panelTablaProdLayout = new javax.swing.GroupLayout(panelTablaProd);
        panelTablaProd.setLayout(panelTablaProdLayout);
        panelTablaProdLayout.setHorizontalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaProdLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        panelTablaProdLayout.setVerticalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        tablaListaInventario = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaListaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListaInventario.setFocusable(false);
        tablaListaInventario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaListaInventario.getTableHeader().setResizingAllowed(false);
        tablaListaInventario.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaListaInventario);

        btnCargarInventario.setText("Cargar al inventario");
        btnCargarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarInventarioActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setText("Lista para el inventario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jLabel5.setText("Cantidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Datos del producto:");

        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Código:", "Descripción:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listInfoProd);

        txfdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantidadKeyTyped(evt);
            }
        });

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio costo:");

        jLabel9.setText("Precio venta:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfdPrecioCU, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfdPrecioVU, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txfdPrecioVU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txfdPrecioCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel4.setText("Buscar:");

        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setText("Filtrar por:");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo ofertas", "Sólo suspendidos" }));
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        jLabel8.setText("Ordenar por:");

        cbOrdenCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Stock", "Stock mínimo" }));
        cbOrdenCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenCampoActionPerformed(evt);
            }
        });

        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelComboBoxLayout = new javax.swing.GroupLayout(panelComboBox);
        panelComboBox.setLayout(panelComboBoxLayout);
        panelComboBoxLayout.setHorizontalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComboBoxLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(cbFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOrdenCampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelComboBoxLayout.setVerticalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboBoxLayout.createSequentialGroup()
                .addGroup(panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setText("Indique el proveedor:");

        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProvLayout = new javax.swing.GroupLayout(panelProv);
        panelProv.setLayout(panelProvLayout);
        panelProvLayout.setHorizontalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProvLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProvLayout.setVerticalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvLayout.createSequentialGroup()
                .addGroup(panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(panelComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfdCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantidadKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') &&
            (c != java.awt.event.KeyEvent.VK_BACK_SPACE))
        evt.consume();
    }//GEN-LAST:event_txfdCantidadKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSelec = tablaProd.getSelectedRow();

        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            String codigo = tablaProd.getValueAt(filaSelec, 0).toString();
            String descrip = tablaProd.getValueAt(filaSelec, 1).toString();
            String id_recibido = tablaProd.getValueAt(filaSelec, 5).toString();
            
            String cantidad = null, precioCostoU = null, precioVentaU = null;
            
            cantidad = txfdCantidad.getText();
            precioCostoU = txfdPrecioCU.getText();
            precioVentaU = txfdPrecioVU.getText();

            if(cantidad.equals("") || precioCostoU.equals("") || precioVentaU.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Falta ingresar la cantidad y/o el precio costo unitario");
            }
            else
            {
                m = (DefaultTableModel) tablaListaInventario.getModel();
                String filaNueva[] = {codigo, descrip, cantidad, "$"+precioCostoU, "$"+precioVentaU, id_recibido};
                m.addRow(filaNueva);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
        txfdCantidad.setText("");
        txfdPrecioCU.setText("");
        txfdPrecioVU.setText("");
        
        limpiarList();
        
        tablaProd.setRowSelectionAllowed(false);
        tablaListaInventario.setRowSelectionAllowed(false);
        
        txfdCantidad.setEnabled(false);    
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int filaSelec = tablaListaInventario.getSelectedRow();
        
        m2 = (DefaultTableModel) tablaListaInventario.getModel(); 
        m2.removeRow(filaSelec); 
        
        limpiarList();
        
        txfdCantidad.setEnabled(false);
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnCargarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarInventarioActionPerformed
        Producto producto = null;
        
        Pedido pedido = new Pedido();
        pedido.setFechaHora(new Date());        
        pedido.setProveedor(elProv);
        pedidoDAO.alta(pedido);

        int filasTablaInv = tablaListaInventario.getRowCount();
        for (int i = 0 ; i<filasTablaInv ; i++ )
        {            
            producto = prodDAO.buscarPorId(Integer.parseInt(tablaListaInventario.getValueAt(i,5).toString()));
            
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProducto(producto);
            itemPedido.setCantidad(Integer.parseInt(tablaListaInventario.getValueAt(i,2).toString()));
            itemPedido.setPedido(pedido);
            
            String cadena = tablaListaInventario.getValueAt(i,3).toString();
            cadena = cadena.substring(1);
            double precioCostoU = Double.parseDouble(cadena);
            
            String cadena2 = tablaListaInventario.getValueAt(i,4).toString();
            cadena2 = cadena2.substring(1);
            double precioVentaU = Double.parseDouble(cadena2);
            
            iDAO.alta(itemPedido);
            prodDAO.sumarStock(producto.getId(), Integer.parseInt(tablaListaInventario.getValueAt(i,2).toString()));
            
            if (producto.getPrecioCosto() != precioCostoU || producto.getPrecioVenta() != precioVentaU)
            {
                prodDAO.setearPrecioCostoU(producto.getId(), precioCostoU, precioVentaU);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Finalizado con éxito");
        
        txfdCantidad.setText(null);
        txfdPrecioCU.setText(null);        
        llenarTablaInventario();
        llenarTabla();
    }//GEN-LAST:event_btnCargarInventarioActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        provSelec = String.valueOf(cbProveedores.getSelectedItem());
        List<Proveedor> listaTotalProv = provDAO.listar("Habilitados");
                
        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {  
            for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
            {
                panelBusqueda.getComponent(i).setEnabled(true);
            }
            for (int i=0 ; i < panelComboBox.getComponents().length ; i++)
            {
                panelComboBox.getComponent(i).setEnabled(true);
            }            
            
            for (Proveedor p : listaTotalProv)
            {
                if (p.getRazonSocial().equals(provSelec))
                {
                    elProv = provDAO.buscarPorCuitNombre(provSelec, "Habilitados").get(0);
                    llenarTabla();
                }
            }
            
            String cadena = txfdBuscarProd.getText();        
            listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
            llenarTablaBusqueda(listaBusqueda);            
        }
        else
        {
            mostrarTablaVacia();   
            
            for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
            {
                panelBusqueda.getComponent(i).setEnabled(false);
            }
            for (int i=0 ; i < panelComboBox.getComponents().length ; i++)
            {
                panelComboBox.getComponent(i).setEnabled(false);
            }           
        }
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();
        listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
        llenarTablaBusqueda(listaBusqueda);

        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {
            if (cadena.equals(""))
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
    }//GEN-LAST:event_txfdBuscarProdKeyReleased

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
        listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
        llenarTablaBusqueda(listaBusqueda);

        if (!provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
        {
            if (cadena.equals(""))
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

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaCompra().setVisible(true);
            }
        });
    }
    
    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        List<Producto> listaReponer = prodDAO.listar(OrdenarTabla(), elProv.getId());
        String[] datos = new String[6];
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Tipo venta");
        modelo.addColumn("ID");
        
        for (Producto p : listaReponer)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getStock());
            datos[3] = String.valueOf(p.getStockMinimo());
            if (p.isPorPeso())  //por peso
            {
                datos[4] = String.valueOf("Venta por peso");
            }
            else    //por unidad
            {
                datos[4] = String.valueOf("Venta por unidad");
            }            
            datos[5] = String.valueOf(p.getId());
           
            modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(80);
        tcm.getColumn(3).setPreferredWidth(80);
        tcm.getColumn(4).setPreferredWidth(150);         
        tcm.getColumn(5).setPreferredWidth(0);  
        tcm.getColumn(5).setMaxWidth(0);
        tcm.getColumn(5).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);       
        
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
                    
                    txfdCantidad.setEnabled(true);
                    txfdPrecioCU.setEnabled(true);
                    txfdPrecioVU.setEnabled(true);
                    btnAgregar.setEnabled(true);
                    btnQuitar.setEnabled(false);
                }
            } 
        });
    }
    
    public void llenarTablaInventario()
    {
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Código");
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio costo");
        modelo2.addColumn("Precio venta");
        modelo2.addColumn("ID");       
                
        tablaListaInventario.setModel(modelo2);
        
        tcm2 = tablaListaInventario.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(100);
        tcm2.getColumn(1).setPreferredWidth(300);
        tcm2.getColumn(2).setPreferredWidth(50); 
        tcm2.getColumn(3).setPreferredWidth(100); 
        tcm2.getColumn(4).setPreferredWidth(100);
        tcm2.getColumn(5).setPreferredWidth(0);  
        tcm2.getColumn(5).setMaxWidth(0);
        tcm2.getColumn(5).setMinWidth(0);
        tablaListaInventario.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaListaInventario.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        
        tablaListaInventario.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaListaInventario.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
            {                
                tablaListaInventario.setRowSelectionAllowed(false);
            } 
        });
        
        tablaListaInventario.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaListaInventario.setRowSelectionAllowed(true);
                
                int filaSelec = tablaListaInventario.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    String cod = tablaListaInventario.getValueAt(filaSelec, 0).toString();
                    String desc = tablaListaInventario.getValueAt(filaSelec, 1).toString();
                    
                    modeloList = new DefaultListModel(); 
                    modeloList.clear();
                    modeloList.addElement("Código: " + cod);
                    modeloList.addElement("Descripcion: " + desc);
                    listInfoProd.setModel(modeloList);
                    
                    txfdCantidad.setEnabled(false);
                    txfdPrecioCU.setEnabled(false);
                    txfdPrecioVU.setEnabled(false);
                    btnAgregar.setEnabled(false);
                    btnQuitar.setEnabled(true);
                }
            } 
        });
    }
     
    public void llenarTablaBusqueda (List<Producto> listaBusqueda)
    {
        modelo3 = new DefaultTableModel();
        String[] datos = new String[6];
 
        modelo3.addColumn("Código");
        modelo3.addColumn("Descripción");
        modelo3.addColumn("Precio costo");
        modelo3.addColumn("Stock");
        modelo3.addColumn("Stock mínimo");
        modelo3.addColumn("ID");
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf(p.getPrecioCosto());
            datos[3] = String.valueOf(p.getStock());
            datos[4] = String.valueOf(p.getStockMinimo());
            datos[5] = String.valueOf(p.getId());
           
           modelo3.addRow(datos);
        }
        
        tablaProd.setModel(modelo3);
        
        tcm3 = tablaProd.getColumnModel();
        tcm3.getColumn(0).setPreferredWidth(80);
        tcm3.getColumn(1).setPreferredWidth(400);
        tcm3.getColumn(2).setPreferredWidth(50);
        tcm3.getColumn(3).setPreferredWidth(40);
        tcm3.getColumn(4).setPreferredWidth(50);        
        tcm3.getColumn(5).setPreferredWidth(0);  
        tcm3.getColumn(5).setMaxWidth(0);
        tcm3.getColumn(5).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
    }
    
    public void mostrarTablaVacia()
    {
        modelo = new DefaultTableModel();        
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock mínimo");
        modelo.addColumn("Tipo venta");
        modelo.addColumn("ID");
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(80);
        tcm.getColumn(3).setPreferredWidth(80);
        tcm.getColumn(4).setPreferredWidth(150);         
        tcm.getColumn(5).setPreferredWidth(0);  
        tcm.getColumn(5).setMaxWidth(0);
        tcm.getColumn(5).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);    
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
    private javax.swing.JButton btnCargarInventario;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVolver;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelComboBox;
    private javax.swing.JPanel panelProv;
    private javax.swing.JPanel panelTablaProd;
    private javax.swing.JTable tablaListaInventario;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private javax.swing.JTextField txfdCantidad;
    private javax.swing.JTextField txfdPrecioCU;
    private javax.swing.JTextField txfdPrecioVU;
    // End of variables declaration//GEN-END:variables
}