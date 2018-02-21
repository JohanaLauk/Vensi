package Vista;

import DAO.*;
import Modelo.*;
import Utils.Redondear;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaCargaStock extends javax.swing.JFrame 
{
    ProductoDAO prodDAO = new ProductoDAO();
    ProveedorDAO provDAO = new ProveedorDAO();
    EntradaStockDAO eStockDAO = new EntradaStockDAO();
    ItemEntradaStockDAO iESDAO = new ItemEntradaStockDAO();
    
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
    
    Redondear r = new Redondear();
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    ImageIcon icono;
    
    public ventanaCargaStock() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        this.setMinimumSize(new Dimension(1300, 650));  //Indica que hasta esa medida se puede minimizar        
        this.setPreferredSize(new Dimension(1300, 650));    //al ejecutarse, la ventana aparece con esa medida
        
        txfdCantidad.setEnabled(false);
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
        btnCargarInventario.setEnabled(false);
        
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

        panelTodo = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        panelProv = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        panelBusqueda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        panelComboBox = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbOrdenCampo = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        panelTablaProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        panelInfoProd = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        btnQuitar = new javax.swing.JButton();
        panelInput = new javax.swing.JPanel();
        labCantidad = new javax.swing.JLabel();
        txfdCantidad = new org.jdesktop.swingx.JXTextField();
        jLabel1 = new javax.swing.JLabel();
        txfdPrecioCU = new org.jdesktop.swingx.JXTextField();
        jLabel9 = new javax.swing.JLabel();
        txfdPrecioVU = new org.jdesktop.swingx.JXTextField();
        panelTablaInventario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListaInventario = new javax.swing.JTable();
        btnCargarInventario = new javax.swing.JButton();
        btnMenuPpal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización de productos del inventario");
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));

        panelIzquierdo.setOpaque(false);

        panelProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panelProv.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Indique el proveedor:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProvLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelProvLayout.setVerticalGroup(
            panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvLayout.createSequentialGroup()
                .addGroup(panelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBusqueda.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar:");

        txfdBuscarProd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdBuscarProd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdBuscarProd.setPrompt("busque por código o por descripción");
        txfdBuscarProd.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelComboBox.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Filtrar por:");

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

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ordenar por:");

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

        javax.swing.GroupLayout panelComboBoxLayout = new javax.swing.GroupLayout(panelComboBox);
        panelComboBox.setLayout(panelComboBoxLayout);
        panelComboBoxLayout.setHorizontalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComboBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        panelTablaProd.setOpaque(false);

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

        javax.swing.GroupLayout panelTablaProdLayout = new javax.swing.GroupLayout(panelTablaProd);
        panelTablaProd.setLayout(panelTablaProdLayout);
        panelTablaProdLayout.setHorizontalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelTablaProdLayout.setVerticalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfoProd.setBackground(new java.awt.Color(102, 184, 211));

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Datos del producto:");

        listInfoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listInfoProd.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CÓDIGO:", "DESCRIPCIÓN:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listInfoProd);

        btnQuitar.setBackground(new java.awt.Color(255, 153, 153));
        btnQuitar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitar.setBorderPainted(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setFocusPainted(false);
        btnQuitar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnQuitar.setNextFocusableComponent(btnCargarInventario);
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

        panelInput.setOpaque(false);

        labCantidad.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labCantidad.setText("Cantidad:");

        txfdCantidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCantidad.setToolTipText("Ingrese la cantidad en unidades");
        txfdCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCantidad.setNextFocusableComponent(txfdPrecioCU);
        txfdCantidad.setPrompt("unidades");
        txfdCantidad.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantidadKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Precio costo:");

        txfdPrecioCU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPrecioCU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPrecioCU.setToolTipText("Ingrese el precio costo unitario");
        txfdPrecioCU.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPrecioCU.setNextFocusableComponent(txfdPrecioVU);
        txfdPrecioCU.setPrompt("Ej: 0.00");
        txfdPrecioCU.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdPrecioCU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioCUKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Precio venta:");

        txfdPrecioVU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPrecioVU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPrecioVU.setToolTipText("Ingrese el precio venta unitario");
        txfdPrecioVU.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPrecioVU.setNextFocusableComponent(btnAgregar);
        txfdPrecioVU.setPrompt("Ej: 0.00");
        txfdPrecioVU.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdPrecioVU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioVUKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPrecioCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPrecioVU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCantidad)
                    .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txfdPrecioCU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txfdPrecioVU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoProdLayout = new javax.swing.GroupLayout(panelInfoProd);
        panelInfoProd.setLayout(panelInfoProdLayout);
        panelInfoProdLayout.setHorizontalGroup(
            panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelInfoProdLayout.setVerticalGroup(
            panelInfoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProdLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelInfoProdLayout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTablaInventario.setBackground(new java.awt.Color(102, 184, 211));

        tablaListaInventario = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaListaInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaListaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListaInventario.setFocusable(false);
        tablaListaInventario.setGridColor(new java.awt.Color(153, 153, 153));
        tablaListaInventario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaListaInventario.getTableHeader().setResizingAllowed(false);
        tablaListaInventario.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaListaInventario);

        btnCargarInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarInventario.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        btnCargarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargarInventario_50.png"))); // NOI18N
        btnCargarInventario.setText("Cargar al inventario");
        btnCargarInventario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarInventario.setFocusPainted(false);
        btnCargarInventario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCargarInventario.setIconTextGap(10);
        btnCargarInventario.setNextFocusableComponent(btnMenuPpal);
        btnCargarInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarInventarioMouseExited(evt);
            }
        });
        btnCargarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarInventarioActionPerformed(evt);
            }
        });

        btnMenuPpal.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuPpal.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        btnMenuPpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"))); // NOI18N
        btnMenuPpal.setText("Menú prinicipal");
        btnMenuPpal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuPpal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPpal.setFocusPainted(false);
        btnMenuPpal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenuPpal.setIconTextGap(10);
        btnMenuPpal.setNextFocusableComponent(cbProveedores);
        btnMenuPpal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPpalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPpalMouseExited(evt);
            }
        });
        btnMenuPpal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPpalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Lista para el inventario:");

        javax.swing.GroupLayout panelTablaInventarioLayout = new javax.swing.GroupLayout(panelTablaInventario);
        panelTablaInventario.setLayout(panelTablaInventarioLayout);
        panelTablaInventarioLayout.setHorizontalGroup(
            panelTablaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panelTablaInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTablaInventarioLayout.createSequentialGroup()
                        .addComponent(btnMenuPpal)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaInventarioLayout.setVerticalGroup(
            panelTablaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaInventarioLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuPpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInfoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(panelInfoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTablaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSelec = tablaProd.getSelectedRow();         
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            int filaModificar = -1; 
            boolean repetido = false;            
            String id_recibido = tablaProd.getValueAt(filaSelec, 7).toString();                        
            int cantFilasInventario = tablaListaInventario.getRowCount();
                        
            for (int i = 0 ; i < cantFilasInventario ; i++)     //recorre las filas de la tablaListaInventario
            {
                if (Integer.parseInt(tablaListaInventario.getValueAt(i, 4).toString()) == Integer.parseInt(id_recibido))
                {
                    repetido = true;
                    filaModificar = i;
                }
            }
            
            if (repetido)
            {
                int cantVieja = Integer.parseInt(tablaListaInventario.getValueAt(filaModificar, 1).toString());
                String pcViejo = null;
                String pvViejo = null;
                
                String cadenaPC = tablaListaInventario.getValueAt(filaModificar, 2).toString();
                if (!cadenaPC.equals("---"))
                {
                    pcViejo = cadenaPC.substring(1);
                }
                else
                {
                    pcViejo = "---";
                }
                
                String cadenaPV = tablaListaInventario.getValueAt(filaModificar, 3).toString();
                if (!cadenaPV.equals("---"))
                {
                    pvViejo = cadenaPV.substring(1);
                } 
                else
                {
                    pvViejo = "---";
                }
                
                int cantNueva = Integer.parseInt(txfdCantidad.getText());
                String pcNuevo = txfdPrecioCU.getText();
                String pvNuevo = txfdPrecioVU.getText();
                
                int cantidad = cantVieja + cantNueva;                
                
                if ((pcViejo.equals("---") && pcNuevo.equals("")) && (pvViejo.equals("---") && pvNuevo.equals("")))     //null | null -- null | null
                {
                    pcNuevo = "---";
                    pvNuevo = "---";
                }
                if ((!pcViejo.equals("---") && !pcNuevo.equals("")) && (!pvViejo.equals("---") && !pvNuevo.equals(""))) //valor | valor -- valor | valor
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvNuevo;
                }
                if ((!pcViejo.equals("---") && pcNuevo.equals("")) && (!pvViejo.equals("---") && pvNuevo.equals("")))   //valor | null -- valor | null
                {
                    pcNuevo = pcViejo;
                    pvNuevo = pvViejo;                    
                }
                if ((!pcViejo.equals("---") && pcNuevo.equals("")) && (!pvViejo.equals("---") && !pvNuevo.equals("")))   //valor | null -- valor | valor
                {
                    pcNuevo = pcViejo;
                    pvNuevo = pvNuevo;                    
                }
                if ((pcViejo.equals("---") && !pcNuevo.equals("")) && (pvViejo.equals("---") && !pvNuevo.equals("")))   //null | valor  -- null | valor
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvNuevo;                    
                }
                if ((pcViejo.equals("---") && !pcNuevo.equals("")) && (!pvViejo.equals("---") && pvNuevo.equals("")))   //null | valor -- valor | null
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvViejo;                    
                } 
                if ((!pcViejo.equals("---") && pcNuevo.equals("")) && (pvViejo.equals("---") && !pvNuevo.equals("")))   //valor | null -- null | valor
                {
                    pcNuevo = pcViejo;
                    pvNuevo = pvNuevo;                    
                }
                if ((pcViejo.equals("---") && !pcNuevo.equals("")) && (pvViejo.equals("---") && pvNuevo.equals("")))   //null | valor -- null | null
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = "---";                    
                }
                if ((pcViejo.equals("---") && pcNuevo.equals("")) && (pvViejo.equals("---") && !pvNuevo.equals("")))   //null | null -- null | valor
                {
                    pcNuevo = "---";
                    pvNuevo = pvNuevo;                    
                }
                if ((!pcViejo.equals("---") && !pcNuevo.equals("")) && (pvViejo.equals("---") && pvNuevo.equals("")))   //valor | valor -- null | null
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = "---";                    
                }
                if ((pcViejo.equals("---") && pcNuevo.equals("")) && (!pvViejo.equals("---") && !pvNuevo.equals("")))   //null | null -- valor | valor
                {
                    pcNuevo = "---";
                    pvNuevo = pvNuevo;                    
                }
                
                if ((!pcViejo.equals("---") && !pcNuevo.equals("")) && (!pvViejo.equals("---") && pvNuevo.equals("")))   //valor | valor -- valor | null
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvViejo;                    
                }
                if ((!pcViejo.equals("---") && !pcNuevo.equals("")) && (pvViejo.equals("---") && !pvNuevo.equals("")))   //valor | valor -- null | valor
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvNuevo;                    
                }
                if ((pcViejo.equals("---") && pcNuevo.equals("")) && (!pvViejo.equals("---") && pvNuevo.equals("")))   //null | null -- valor | null
                {
                    pcNuevo = "---";
                    pvNuevo = pvViejo;                    
                }
                if ((pcViejo.equals("---") && !pcNuevo.equals("")) && (!pvViejo.equals("---") && !pvNuevo.equals("")))   //null | valor -- valor | valor
                {
                    pcNuevo = pcNuevo;
                    pvNuevo = pvNuevo;                    
                }
                if ((!pcViejo.equals("---") && pcNuevo.equals("")) && (pvViejo.equals("---") && pvNuevo.equals("")))   //valor | null -- null | null
                {
                    pcNuevo = pcViejo;
                    pvNuevo = "---";                    
                }
                                
                tablaListaInventario.setValueAt(cantidad, filaModificar, 1);
                if (!pcNuevo.equals("---"))
                {
                    tablaListaInventario.setValueAt("$" + pcNuevo, filaModificar, 2);
                }
                else
                {
                    tablaListaInventario.setValueAt(pcNuevo, filaModificar, 2);
                }
                if (!pvNuevo.equals("---"))
                {
                    tablaListaInventario.setValueAt("$" + pvNuevo, filaModificar, 3);
                }
                else
                {
                    tablaListaInventario.setValueAt(pvNuevo, filaModificar, 3);
                }
            }
            else
            {
                elProd = prodDAO.buscarPorId(Integer.parseInt(id_recibido));

                String descrip = elProd.getDescripcion();

                String cantidad = null, precioCostoU = null, precioVentaU = null;

                cantidad = txfdCantidad.getText();
                precioCostoU = txfdPrecioCU.getText();
                precioVentaU = txfdPrecioVU.getText();
                m = (DefaultTableModel) tablaListaInventario.getModel();

                if (cantidad.equals("") && precioCostoU.equals("") && precioVentaU.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Debe completar los campos");
                }
                else
                {
                    if (cantidad.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "¡Es obligatorio ingresar una cantidad!\n"
                                + "Si sólo desea modificiar los precios,\n"
                                + "hágalo desde \"Gestión del producto\".");
                    }
                    else
                    {
                        if (precioCostoU.equals("") && precioVentaU.equals("")) //Ninguno
                        {
                            String filaNueva[] = {descrip, cantidad, "---", "---", id_recibido};
                            m.addRow(filaNueva);
                        }

                        if (!precioCostoU.equals("") && !precioVentaU.equals(""))   //Todos 
                        {                        
                            String filaNueva[] = {descrip, cantidad, "$"+precioCostoU, "$"+precioVentaU, id_recibido};
                            m.addRow(filaNueva);
                        }

                        if (!precioCostoU.equals("") && precioVentaU.equals("")) //solo precio costo
                        {                        
                            String filaNueva[] = {descrip, cantidad, "$"+precioCostoU, "---", id_recibido};
                            m.addRow(filaNueva);
                        }

                        if (precioCostoU.equals("") && !precioVentaU.equals("")) //solo precio venta
                        {                        
                            String filaNueva[] = {descrip, cantidad, "---", "$"+precioVentaU, id_recibido};
                            m.addRow(filaNueva);
                        }
                    }
                }                
            }
            habilitarBTNCargaI();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.");
        }
        txfdCantidad.setText("");
        txfdPrecioCU.setText("");
        txfdPrecioVU.setText("");
        
        limpiarList();
        
        tablaProd.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));
        btnAgregar.setIcon(icono);
        
        tablaProd.setRowSelectionAllowed(false);
        tablaListaInventario.setRowSelectionAllowed(false);
        
        txfdCantidad.setEnabled(false);    
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMenuPpalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPpalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPpalActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int filaSelec = tablaListaInventario.getSelectedRow();
        
        m2 = (DefaultTableModel) tablaListaInventario.getModel(); 
        m2.removeRow(filaSelec); 
        
        limpiarList();
        habilitarBTNCargaI();
        
        tablaListaInventario.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"));     
        btnQuitar.setIcon(icono);  
        
        txfdCantidad.setEnabled(false);
        txfdPrecioCU.setEnabled(false);
        txfdPrecioVU.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnCargarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarInventarioActionPerformed
        int filasTablaInv = tablaListaInventario.getRowCount();
        int cantidadTotal = 0;
        double importeCostoT = 0;
        double precioCTItem = 0;
        
        if (filasTablaInv > 0)
        {
            int cargar = JOptionPane.showConfirmDialog(null, "¿Está seguro de cargar los productos al Inventario?", "Actualizar inventario", JOptionPane.YES_NO_OPTION);
            if (cargar == 0)
            {
                Producto producto = null; 

                //<-----Entradastock-------------------------------------------------------------------------------------
                Entradastock eStock = new Entradastock();        
                eStock.setFechaHora(new Date());        
                eStock.setProveedor(elProv);        
                eStockDAO.alta(eStock);
                //------Entradastock------------------------------------------------------------------------------------->

                for (int i = 0 ; i<filasTablaInv ; i++)
                {            
                    producto = prodDAO.buscarPorId(Integer.parseInt(tablaListaInventario.getValueAt(i,4).toString()));

                    //<-----ItemEntradastock-------------------------------------------------------------------------------------
                    ItemEntradastock itemES = new ItemEntradastock();
                    itemES.setProducto(producto);
                    itemES.setEntradastock(eStock);
                    int cant = Integer.parseInt(tablaListaInventario.getValueAt(i,1).toString());
                    itemES.setCantidad(cant);            

                    String cadenaPC = tablaListaInventario.getValueAt(i,2).toString();
                    if (!cadenaPC.equals("---"))
                    {
                        double pc = Double.parseDouble(cadenaPC.substring(1));
                        itemES.setPrecioCosto(pc);
                    }

                    String cadenaPV = tablaListaInventario.getValueAt(i,3).toString();
                    if (!cadenaPV.equals("---"))
                    {
                        double pv = Double.parseDouble(cadenaPV.substring(1));
                        itemES.setPrecioVenta(pv);
                    }

                    iESDAO.alta(itemES);
                    //------ItemEntradastock------------------------------------------------------------------------------------->


                    //<-----Entradastock-------------------------------------------------------------------------------------
                    cantidadTotal += itemES.getCantidad();
                    eStock.setCantidadTotal(cantidadTotal);

                    if (cadenaPC.equals("---"))   //si NO ingresó un precioCostoNUEVO, calcula el importeT con el pcVIEJO
                    {
                        double pcProd = producto.getPrecioCosto();
                        precioCTItem = itemES.getCantidad() * pcProd;
                    }
                    else    //si SÍ ingreso un precioCostoNUEVO, calcula el importeTotal.
                    {
                        precioCTItem = itemES.getCantidad() * itemES.getPrecioCosto();                    
                    }        
                    importeCostoT += precioCTItem;
                    eStock.setImporteCostoTotal(importeCostoT);
                    eStockDAO.modificar(eStock, eStock.getId());
                    //------Entradastock------------------------------------------------------------------------------------->


                    //<-----Producto--------------------------------------------------------------------------------------------
                    double precioCostoU = 0;            

                    if (cadenaPC.equals("---"))
                    {
                        precioCostoU = 0;
                    }
                    else
                    {
                        cadenaPC = cadenaPC.substring(1);
                        precioCostoU = Double.parseDouble(cadenaPC);
                    }

                    double precioVentaU = 0;
                    double precioVentaXkilo = 0;

                    if (cadenaPV.equals("---"))
                    {
                        precioVentaU = 0;
                        precioVentaXkilo = 0;
                    }
                    else
                    {
                        cadenaPV = cadenaPV.substring(1);
                        precioVentaU = Double.parseDouble(cadenaPV);

                        precioVentaXkilo = (1000 * precioVentaU) / producto.getPesoEnvase();
                        precioVentaXkilo = r.RedondearAIntArriba(precioVentaXkilo);
                    }               

                    if (producto.isPorPeso())
                    {    
                        int cantU = Integer.parseInt(tablaListaInventario.getValueAt(i,1).toString());
                        int cantGR = cantU * producto.getPesoEnvase();
                        prodDAO.sumarStock(producto.getId(), cantGR);
                    }
                    else
                    {
                        prodDAO.sumarStock(producto.getId(), Integer.parseInt(tablaListaInventario.getValueAt(i,1).toString()));
                    }            

                    prodDAO.setearPreciosUnidad(producto.getId(), precioCostoU, precioVentaU, precioVentaXkilo);
                    //------Producto-------------------------------------------------------------------------------------------->
                }          

                JOptionPane.showMessageDialog(null, "¡Inventario actualizado con éxito!");

                txfdCantidad.setText(null);
                txfdPrecioCU.setText(null);        
                llenarTablaInventario();
                llenarTabla();
            }            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "¡No hay producto para cargar al inventario!");
        }
    }//GEN-LAST:event_btnCargarInventarioActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        provSelec = String.valueOf(cbProveedores.getSelectedItem());
        List<Proveedor> listaProvHab = provDAO.listar("Habilitados", "razonSocial", "ASC");
        
        if (provViejo.equals("Seleccionar") && !provSelec.equals("Seleccionar"))   //abre la ventana y selecciona un prov
        {
            for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
            {
                panelBusqueda.getComponent(i).setEnabled(true);
            }
            for (int i=0 ; i < panelComboBox.getComponents().length ; i++)
            {
                panelComboBox.getComponent(i).setEnabled(true);
            } 
            cbSituacion.setEnabled(false);

            for (Proveedor p : listaProvHab)
            {
                if (p.getRazonSocial().equals(provSelec))
                {
                    elProv = provDAO.buscarPorCuitNombre(provSelec, "Habilitados").get(0);
                    llenarTabla();
                }
            }      

            llenarTablaInventario();
            provViejo = provSelec;
        }
        else    //si selecciona por segunda vez un prov...
        {
            if (!provViejo.equals(provSelec))  //si la opción que estaba es diferente a la que quiere ahora...
            {            
                int cambiar = JOptionPane.showConfirmDialog(null, "Al seleccionar otro proveedor, perderá la lista actual de productos.\n¿Está seguro de continuar?", "¡ADVERTENCIA!", JOptionPane.YES_NO_OPTION);
                if (cambiar == 0)
                {
                    if (provSelec.equals("Seleccionar") || provSelec.equals("No hay proveedores"))
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

                        if (provSelec.equals("Seleccionar"))
                        {
                            llenarTablaInventario();
                        }

                        limpiarList();
                        tablaProd.clearSelection();
                        tablaListaInventario.clearSelection();
                        btnAgregar.setEnabled(false);
                        btnQuitar.setEnabled(false);
                        txfdCantidad.setText(null);
                        txfdPrecioCU.setText(null);
                        txfdPrecioVU.setText(null);
                        btnCargarInventario.setEnabled(false);
                    }
                    else
                    {
                        for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
                        {
                            panelBusqueda.getComponent(i).setEnabled(true);
                        }
                        for (int i=0 ; i < panelComboBox.getComponents().length ; i++)
                        {
                            panelComboBox.getComponent(i).setEnabled(true);
                        } 
                        cbSituacion.setEnabled(false);

                        for (Proveedor p : listaProvHab)
                        {
                            if (p.getRazonSocial().equals(provSelec))
                            {
                                elProv = provDAO.buscarPorCuitNombre(provSelec, "Habilitados").get(0);
                                llenarTabla();
                            }
                        }      

                        llenarTablaInventario();         

                        limpiarList();
                        habilitarBTNCargaI();
                        btnAgregar.setEnabled(false);
                        btnQuitar.setEnabled(false);
                        txfdCantidad.setText(null);
                        txfdPrecioCU.setText(null);
                        txfdPrecioVU.setText(null);       
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

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();
        List<Producto> listaBusqueda = prodDAO.buscarPorCodigoNombre(cadena, filtroSelec, situacionSelec, elProv.getId());
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

    private void txfdPrecioCUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioCUKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))        
            evt.consume();   
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnAgregar.doClick();
        }
    }//GEN-LAST:event_txfdPrecioCUKeyTyped

    private void txfdPrecioVUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioVUKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))        
            evt.consume(); 
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnAgregar.doClick();
        }
    }//GEN-LAST:event_txfdPrecioVUKeyTyped

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
        int filaSelec = tablaListaInventario.getSelectedRow();
        
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

    private void btnCargarInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarInventarioMouseEntered
        int cantFilas = tablaListaInventario.getRowCount();
        
        if (cantFilas > 0)
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/cargarInventario_lleno_50.png"));
            btnCargarInventario.setIcon(icono); 
        }
    }//GEN-LAST:event_btnCargarInventarioMouseEntered

    private void btnCargarInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarInventarioMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/cargarInventario_50.png"));     
        btnCargarInventario.setIcon(icono); 
    }//GEN-LAST:event_btnCargarInventarioMouseExited

    private void btnMenuPpalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));     
        btnMenuPpal.setIcon(icono); 
    }//GEN-LAST:event_btnMenuPpalMouseEntered

    private void btnMenuPpalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseExited

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaCargaStock().setVisible(true);
            }
        });
    }
    
    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        List<Producto> listaProdProv = prodDAO.listar(OrdenarTabla(), elProv.getId());
        String[] datos = new String[8];
 
        modelo.addColumn("Código");         //0
        modelo.addColumn("Descripción");    //1
        modelo.addColumn("Precio costo");   //2
        modelo.addColumn("Precio venta");   //3
        modelo.addColumn("Stock");          //4
        modelo.addColumn("Stock mínimo");   //5
        modelo.addColumn("Peso envase");    //6
        modelo.addColumn("ID");             //7
        
        for (Producto p : listaProdProv)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf("$" + formatoPrecios.format(p.getPrecioCosto()));
            datos[3] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVenta()));
            
            if (p.isPorPeso())  //por peso
            {
                int pesoEnvGR1 = p.getPesoEnvase();
                double pesoEnvGR2 = p.getPesoEnvase();               
                datos[6] = String.valueOf(formatoKilos.format(pesoEnvGR2 / 1000) + "kg");
                
                int stockGR1 = p.getStock();
                //double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnvGR1;
                //double stockKG = stockGR2 / 1000;
                datos[4] = String.valueOf(stockU); //+ "  (" + formatoKilos.format(stockKG) + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                //double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnvGR1;
                //double stockMinKG = stockMinGR2 / 1000;
                datos[5] = String.valueOf(stockMinU); //+ "  (" + formatoKilos.format(stockMinKG) + "kg)");
            }
            else    //por unidad
            {
                datos[4] = String.valueOf(p.getStock());
                datos[5] = String.valueOf(p.getStockMinimo());
                datos[6] = String.valueOf("---");
            }            
            datos[7] = String.valueOf(p.getId());
           
            modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(80);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(60);
        tcm.getColumn(3).setPreferredWidth(60);
        tcm.getColumn(4).setPreferredWidth(30);  
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(60);
        tcm.getColumn(7).setPreferredWidth(0);  
        tcm.getColumn(7).setMaxWidth(0);
        tcm.getColumn(7).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);       
        
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
                    
                    tablaListaInventario.clearSelection();
                    
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
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio costo");
        modelo2.addColumn("Precio venta");
        modelo2.addColumn("ID");       
                
        tablaListaInventario.setModel(modelo2);
        
        tcm2 = tablaListaInventario.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(300);
        tcm2.getColumn(1).setPreferredWidth(60); 
        tcm2.getColumn(2).setPreferredWidth(80); 
        tcm2.getColumn(3).setPreferredWidth(80);
        tcm2.getColumn(4).setPreferredWidth(0);  
        tcm2.getColumn(4).setMaxWidth(0);
        tcm2.getColumn(4).setMinWidth(0);
        tablaListaInventario.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaListaInventario.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        
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
                    int id = Integer.parseInt(tablaListaInventario.getValueAt(filaSelec, 4).toString());
                    Producto elProd = prodDAO.buscarPorId(id);         
                    
                    modeloList = new DefaultListModel(); 
                    modeloList.clear();
                    modeloList.addElement("CÓDIGO:    " + elProd.getCodigo());
                    modeloList.addElement("DESCRIPCIÓN:    " + elProd.getDescripcion());
                    
                    listInfoProd.setForeground(Color.RED);                    
                    listInfoProd.setModel(modeloList);
                    
                    tablaProd.clearSelection();
                    
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
        String[] datos = new String[8];
 
        modelo3.addColumn("Código");         //0
        modelo3.addColumn("Descripción");    //1
        modelo3.addColumn("Precio costo");   //2
        modelo3.addColumn("Precio venta");   //3
        modelo3.addColumn("Stock");          //4
        modelo3.addColumn("Stock mínimo");   //5
        modelo3.addColumn("Peso envase");    //6
        modelo3.addColumn("ID");             //7
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
            datos[2] = String.valueOf("$" + formatoPrecios.format(p.getPrecioCosto()));
            datos[3] = String.valueOf("$" + formatoPrecios.format(p.getPrecioVenta()));
            
            if (p.isPorPeso())  //por peso
            {
                int pesoEnvGR1 = p.getPesoEnvase();
                double pesoEnvGR2 = p.getPesoEnvase();               
                datos[6] = String.valueOf(formatoKilos.format(pesoEnvGR2 / 1000) + "kg");
                
                int stockGR1 = p.getStock();
                //double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnvGR1;
                //double stockKG = stockGR2 / 1000;
                datos[4] = String.valueOf(stockU); //+ "  (" + stockKG + "kg)");
                
                int stockMinGR1 = p.getStockMinimo();
                //double stockMinGR2 = p.getStockMinimo();
                int stockMinU = stockMinGR1 / pesoEnvGR1;
                //double stockMinKG = stockMinGR2 / 1000;
                datos[5] = String.valueOf(stockMinU); //+ "  (" + stockMinKG + "kg)");                
            }
            else    //por unidad
            {
                datos[4] = String.valueOf(p.getStock());
                datos[5] = String.valueOf(p.getStockMinimo());                
                datos[6] = String.valueOf("---");
            }            
            datos[7] = String.valueOf(p.getId());
           
            modelo3.addRow(datos);
        }
        
        tablaProd.setModel(modelo3);
        
        tcm3 = tablaProd.getColumnModel();
        tcm3.getColumn(0).setPreferredWidth(80);
        tcm3.getColumn(1).setPreferredWidth(300);
        tcm3.getColumn(2).setPreferredWidth(60);
        tcm3.getColumn(3).setPreferredWidth(60);
        tcm3.getColumn(4).setPreferredWidth(30);  
        tcm3.getColumn(5).setPreferredWidth(50);
        tcm3.getColumn(6).setPreferredWidth(60);
        tcm3.getColumn(7).setPreferredWidth(0);  
        tcm3.getColumn(7).setMaxWidth(0);
        tcm3.getColumn(7).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
    }
    
    public void mostrarTablaVacia()
    {
        modelo = new DefaultTableModel();        
        modelo.addColumn("Código");         //0
        modelo.addColumn("Descripción");    //1
        modelo.addColumn("Precio costo");   //2
        modelo.addColumn("Precio venta");   //3
        modelo.addColumn("Stock");          //4
        modelo.addColumn("Stock mínimo");   //5
        modelo.addColumn("Peso envase");    //6
        modelo.addColumn("ID");             //7
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(80);
        tcm.getColumn(1).setPreferredWidth(300);
        tcm.getColumn(2).setPreferredWidth(60);
        tcm.getColumn(3).setPreferredWidth(60);
        tcm.getColumn(4).setPreferredWidth(30);  
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(60);
        tcm.getColumn(7).setPreferredWidth(0);  
        tcm.getColumn(7).setMaxWidth(0);
        tcm.getColumn(7).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);    
    }
    
    public void habilitarBTNCargaI()
    {
        int cantFilas = tablaListaInventario.getRowCount();
        
        if (cantFilas > 0)
        {
            btnCargarInventario.setEnabled(true);
        }
        else
        {
            btnCargarInventario.setEnabled(false);
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
        modeloList.addElement("CÓDIGO: ");
        modeloList.addElement("DESCRIPCIÓN: ");
        listInfoProd.setForeground(Color.BLACK);        
        listInfoProd.setModel(modeloList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarInventario;
    private javax.swing.JButton btnMenuPpal;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrdenCampo;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labCantidad;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelComboBox;
    private javax.swing.JPanel panelInfoProd;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelProv;
    private javax.swing.JPanel panelTablaInventario;
    private javax.swing.JPanel panelTablaProd;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaListaInventario;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private org.jdesktop.swingx.JXTextField txfdCantidad;
    private org.jdesktop.swingx.JXTextField txfdPrecioCU;
    private org.jdesktop.swingx.JXTextField txfdPrecioVU;
    // End of variables declaration//GEN-END:variables
}
