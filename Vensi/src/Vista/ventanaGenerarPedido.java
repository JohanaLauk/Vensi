package Vista;

import DAO.ItemVentaDAO;
import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Impresion.Generar;
import Modelo.ItemImprimir;
import Modelo.ItemVenta;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
    String provViejo = "Seleccionar";
    
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    ImageIcon icono;
    
    public ventanaGenerarPedido() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);       //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        this.setMinimumSize(new Dimension(1300, 650));  //Indica que hasta esa medida se puede minimizar        
        this.setPreferredSize(new Dimension(1300, 650));    //al ejecutarse, la ventana aparece con esa medida
                        
        for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
        {
            panelBusqueda.getComponent(i).setEnabled(false);
        }
        btnQuitar.setEnabled(false);
        btnAgregar.setEnabled(false);
        txfdCantidad.setEnabled(false);
        btnImprimirPedido.setEnabled(false);
        
        for (int i=0 ; i < panelIzquierdo.getComponents().length ; i++)
        {
            panelIzquierdo.getComponent(i).setEnabled(false);
        }
        labProveedor.setEnabled(true);
        cbProveedores.setEnabled(true);
        
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
        //listarProdOfertas();  método sólo para prueba.
        llenarCBBProveedor();
        mostrarTablaVacia();
        llenarTablaPedido();         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        panelProv = new javax.swing.JPanel();
        labProveedor = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        panelBusqueda = new javax.swing.JPanel();
        labBuscar = new javax.swing.JLabel();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        labFiltrarPor = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();
        labOrdenarPor = new javax.swing.JLabel();
        cbOrdenCampo = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        panelAlarma = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listProdAlarma = new javax.swing.JList<>();
        panelInfoProd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        txfdCantidad = new org.jdesktop.swingx.JXTextField();
        panelTablaPeodo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnImprimirPedido = new javax.swing.JButton();
        btnVolverMP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generar pedido");
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));

        panelIzquierdo.setOpaque(false);

        panelProv.setOpaque(false);

        labProveedor.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        labProveedor.setForeground(new java.awt.Color(255, 255, 255));
        labProveedor.setText("Indique el proveedor:");

        cbProveedores.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(labProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelProvLayout.setVerticalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvLayout.createSequentialGroup()
                .addGroup(panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tablaProd = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaProd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProd.setFocusable(false);
        tablaProd.setGridColor(new java.awt.Color(153, 153, 153));
        tablaProd.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProd.getTableHeader().setResizingAllowed(false);
        tablaProd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProd);

        panelBusqueda.setOpaque(false);

        labBuscar.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        labBuscar.setForeground(new java.awt.Color(255, 255, 255));
        labBuscar.setText("Buscar:");

        txfdBuscarProd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdBuscarProd.setPrompt("busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        labFiltrarPor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labFiltrarPor.setForeground(new java.awt.Color(255, 255, 255));
        labFiltrarPor.setText("Filtrar por:");

        cbFiltro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFiltro.setNextFocusableComponent(cbSituacion);
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        cbSituacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo habilitados", "Sólo ofertas", "Sólo suspendidos" }));
        cbSituacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSituacion.setNextFocusableComponent(cbOrdenCampo);
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        labOrdenarPor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labOrdenarPor.setForeground(new java.awt.Color(255, 255, 255));
        labOrdenarPor.setText("Ordenar por:");

        cbOrdenCampo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbOrdenCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Stock", "Stock mínimo" }));
        cbOrdenCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbOrdenCampo.setNextFocusableComponent(cbTipoOrden);
        cbOrdenCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenCampoActionPerformed(evt);
            }
        });

        cbTipoOrden.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoOrden.setNextFocusableComponent(txfdCantidad);
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(labFiltrarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labOrdenarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labOrdenarPor)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labFiltrarPor)
                    .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        panelAlarma.setBackground(new java.awt.Color(102, 184, 211));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ALARMA DE TODOS LOS PRODUCTOS FALTANTES:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listProdAlarma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listProdAlarma.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(listProdAlarma);

        javax.swing.GroupLayout panelAlarmaLayout = new javax.swing.GroupLayout(panelAlarma);
        panelAlarma.setLayout(panelAlarmaLayout);
        panelAlarmaLayout.setHorizontalGroup(
            panelAlarmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlarmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlarmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAlarmaLayout.setVerticalGroup(
            panelAlarmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlarmaLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelInfoProd.setBackground(new java.awt.Color(102, 184, 211));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.setNextFocusableComponent(btnQuitar);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        listInfoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listInfoProd.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CÓDIGO:", "DESCRIPCIÓN:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listInfoProd);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel6.setText("Datos del producto:");

        btnQuitar.setBackground(new java.awt.Color(255, 153, 153));
        btnQuitar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitar.setBorderPainted(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setFocusPainted(false);
        btnQuitar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnQuitar.setNextFocusableComponent(btnImprimirPedido);
        btnQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitarMouseExited(evt);
            }
        });
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        txfdCantidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCantidad.setNextFocusableComponent(btnAgregar);
        txfdCantidad.setPrompt("unidades");
        txfdCantidad.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelInfoProdLayout = new javax.swing.GroupLayout(panelInfoProd);
        panelInfoProd.setLayout(panelInfoProdLayout);
        panelInfoProdLayout.setHorizontalGroup(
            panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoProdLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInfoProdLayout.setVerticalGroup(
            panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProdLayout.createSequentialGroup()
                .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoProdLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelInfoProdLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTablaPeodo.setBackground(new java.awt.Color(102, 184, 211));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Lista pedido:");

        btnImprimirPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimirPedido.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnImprimirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_50.png"))); // NOI18N
        btnImprimirPedido.setText("Imprimir pedido");
        btnImprimirPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImprimirPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirPedido.setFocusPainted(false);
        btnImprimirPedido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImprimirPedido.setIconTextGap(30);
        btnImprimirPedido.setNextFocusableComponent(btnVolverMP);
        btnImprimirPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirPedidoMouseExited(evt);
            }
        });
        btnImprimirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPedidoActionPerformed(evt);
            }
        });

        btnVolverMP.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverMP.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnVolverMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"))); // NOI18N
        btnVolverMP.setText("Menú principal");
        btnVolverMP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverMP.setFocusPainted(false);
        btnVolverMP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolverMP.setIconTextGap(5);
        btnVolverMP.setNextFocusableComponent(cbProveedores);
        btnVolverMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMPMouseExited(evt);
            }
        });
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
        tablaPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaPedido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPedido.setFocusable(false);
        tablaPedido.setGridColor(new java.awt.Color(153, 153, 153));
        tablaPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPedido.getTableHeader().setResizingAllowed(false);
        tablaPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaPedido);

        javax.swing.GroupLayout panelTablaPeodoLayout = new javax.swing.GroupLayout(panelTablaPeodo);
        panelTablaPeodo.setLayout(panelTablaPeodoLayout);
        panelTablaPeodoLayout.setHorizontalGroup(
            panelTablaPeodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaPeodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaPeodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaPeodoLayout.createSequentialGroup()
                        .addComponent(btnVolverMP, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addGroup(panelTablaPeodoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaPeodoLayout.setVerticalGroup(
            panelTablaPeodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaPeodoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaPeodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverMP))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelInfoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaPeodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(panelAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelInfoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTablaPeodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        List<Proveedor> listaTotalProv = provDAO.listar("Habilitados", "razonSocial", "ASC");
        
        if (provViejo.equals("Seleccionar") && !provSelec.equals("Seleccionar"))   //abre la ventana y selecciona un prov
        {
            labBuscar.setEnabled(true);
            labFiltrarPor.setEnabled(true);
            labOrdenarPor.setEnabled(true);
            txfdBuscarProd.setEnabled(true);

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
            provViejo = provSelec;
        }
        else    //si selecciona por segunda vez un prov...
        {
            if (!provViejo.equals(provSelec))
            {       
                int cambiar = JOptionPane.showConfirmDialog(null, "Al seleccionar otro proveedor, perderá la lista actual de productos.\n¿Está seguro de continuar?", "¡ADVERTENCIA!", JOptionPane.YES_NO_OPTION);
                if (cambiar == 0)
                {
                    if (provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
                    {  
                        mostrarTablaVacia();   

                        if (provSelec.equals("Seleccionar"))
                        {
                            llenarTablaPedido();
                        }

                        limpiarList();
                        habilitarBTNImprimir();

                        btnAgregar.setEnabled(false);
                        btnQuitar.setEnabled(false);
                        txfdCantidad.setText(null);

                        for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
                        {
                            panelBusqueda.getComponent(i).setEnabled(false);
                        }
                    }
                    else    
                    {
                        labBuscar.setEnabled(true);
                        labFiltrarPor.setEnabled(true);
                        labOrdenarPor.setEnabled(true);
                        txfdBuscarProd.setEnabled(true);

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

                        limpiarList();
                        habilitarBTNImprimir();
                        btnAgregar.setEnabled(false);
                        btnQuitar.setEnabled(false);
                        txfdCantidad.setText(null);            
                    }
                    provViejo = provSelec;
                }
                else    //si dice que NO quiere continuar... es decir, no hay cambios..
                {
                    provViejo = provViejo; 
                    cbProveedores.setSelectedItem(provViejo);  
                }
            }
        }         
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSelec = tablaProd.getSelectedRow();
                
        if (filaSelec >= 0)   //corroboramos si seleccionó una fila
        {
            int filaModificar = -1;
            boolean repetido = false;
            String id_recibido = tablaProd.getValueAt(filaSelec, 6).toString();
            
            for (int i = 0; i < tablaPedido.getRowCount(); i++)
            {
                if(Integer.parseInt(tablaPedido.getValueAt(i, 3).toString()) == Integer.parseInt(id_recibido))
                {
                    repetido = true;
                    filaModificar = i;
                }
            }
            if (repetido)
            {
                int cantVieja = Integer.parseInt(tablaPedido.getValueAt(filaModificar, 2).toString());
                int cantNueva = Integer.parseInt(txfdCantidad.getText());
                int cantidad = cantVieja + cantNueva;
                
                tablaPedido.setValueAt(cantidad, filaModificar, 2);
            }
            else
            {                            
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
        habilitarBTNImprimir();
        
        tablaProd.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));     
        btnAgregar.setIcon(icono); 
        
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
        habilitarBTNImprimir();
        
        tablaPedido.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"));
        btnQuitar.setIcon(icono);
        
        txfdCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);        
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnImprimirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPedidoActionPerformed
        //String provSelec = String.valueOf(cbProveedores.getSelectedItem());
        int filasTabla = tablaPedido.getRowCount();
        
        List<ItemImprimir> listaProdImprimir = new ArrayList();
        List<String> datosProv = new ArrayList();
        
        if (!provSelec.equals("Seleccionar") && !provSelec.equals("No hay proveedores") && filasTabla!=0 )
        {
            int imprimir = JOptionPane.showConfirmDialog(null, "¿Está seguro de imprimir la nota de pedido?", "Imprimir nota de pedido", JOptionPane.YES_NO_OPTION);
            if (imprimir == 0)
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

                List<Proveedor> listaTotalProv = provDAO.listar("Habilitados", "razonSocial", "ASC");

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

    private void txfdCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantidadKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnAgregar.doClick();
        }
    }//GEN-LAST:event_txfdCantidadKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        int filaSelec = tablaProd.getSelectedRow();
        
        if (filaSelec >= 0)
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_lleno_50.png"));
            btnAgregar.setIcon(icono);
        }              
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));     
        btnAgregar.setIcon(icono); 
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnQuitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseEntered
        int filaSelec = tablaPedido.getSelectedRow();
        
        if (filaSelec >= 0)
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_lleno_50.png"));
            btnQuitar.setIcon(icono);
        }
    }//GEN-LAST:event_btnQuitarMouseEntered

    private void btnQuitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"));
        btnQuitar.setIcon(icono);
    }//GEN-LAST:event_btnQuitarMouseExited

    private void btnImprimirPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirPedidoMouseEntered
        int filasTabla = tablaPedido.getRowCount();
        
        if (!provSelec.equals("Seleccionar") && !provSelec.equals("No hay proveedores") && filasTabla!=0)
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_lleno_50.png"));
            btnImprimirPedido.setIcon(icono);
        }
    }//GEN-LAST:event_btnImprimirPedidoMouseEntered

    private void btnImprimirPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirPedidoMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_50.png"));
        btnImprimirPedido.setIcon(icono);
    }//GEN-LAST:event_btnImprimirPedidoMouseExited

    private void btnVolverMPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMPMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));
        btnVolverMP.setIcon(icono);
    }//GEN-LAST:event_btnVolverMPMouseEntered

    private void btnVolverMPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMPMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));
        btnVolverMP.setIcon(icono);
    }//GEN-LAST:event_btnVolverMPMouseExited
    
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
                    modeloList.addElement("CÓDIGO:    " + cod);
                    modeloList.addElement("DESCRIPCIÓN:    " + desc);
                    
                    listInfoProd.setForeground(Color.GREEN.darker());
                    listInfoProd.setModel(modeloList);
                    
                    tablaPedido.clearSelection();
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
                    modeloList.addElement("CÓDIGO:    " + cod);
                    modeloList.addElement("DESCRIPCIÓN:    " + desc);
                    
                    listInfoProd.setForeground(Color.RED);                    
                    listInfoProd.setModel(modeloList);
                    
                    tablaProd.clearSelection();
                    
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
    
    public void habilitarBTNImprimir()
    {
        int cantFilas = tablaPedido.getRowCount();
        
        if (cantFilas > 0)
        {
            btnImprimirPedido.setEnabled(true);
        }
        else
        {
            btnImprimirPedido.setEnabled(false);            
        }
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
        
        listProdAlarma.setForeground(Color.BLUE);
        listProdAlarma.setModel(modeloList);        
    }
    
    public void llenarCBBProveedor()
    {
        DefaultComboBoxModel modeloCBB = new DefaultComboBoxModel();
        
        List<Proveedor> listaP = provDAO.listar("Habilitados", "razonSocial", "ASC");
        
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
        modeloList.addElement("CÓDIGO:    ");
        modeloList.addElement("DESCRIPCIÓN:    ");
        listInfoProd.setForeground(Color.BLACK);
        listInfoProd.setModel(modeloList);
    }
    
    public void listarProdOfertas()     //método provisorio | lo hice acá sólo para prueba
    {
        ItemVentaDAO ivDAO = new ItemVentaDAO();
        modeloList = new DefaultListModel(); 
        modeloList.clear();
        
        List<ItemVenta> prodOfertas = ivDAO.listarVentasOferta(10);
        
        if (prodOfertas != null)
        {
            for (ItemVenta iv : prodOfertas)
            {
                modeloList.addElement("Código " + iv.getProducto().getCodigo() + " | " + iv.getProducto().getDescripcion() 
                                        + " | Turno N°" + iv.getTurno().getId());
            }     
            listProdAlarma.setForeground(Color.BLUE);
            listProdAlarma.setModel(modeloList);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "listarProdOfertas VACIA");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnImprimirPedido;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVolverMP;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrdenCampo;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labBuscar;
    private javax.swing.JLabel labFiltrarPor;
    private javax.swing.JLabel labOrdenarPor;
    private javax.swing.JLabel labProveedor;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JList<String> listProdAlarma;
    private javax.swing.JPanel panelAlarma;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelInfoProd;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelProv;
    private javax.swing.JPanel panelTablaPeodo;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private org.jdesktop.swingx.JXTextField txfdCantidad;
    // End of variables declaration//GEN-END:variables
}
