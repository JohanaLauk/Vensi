package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Modelo.Producto;
import Modelo.Proveedor;
import Utils.CentrarColumnas;
import Utils.ColorFilas;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
    
    ImageIcon icono;
    
    public ventanaProducto() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        this.setMinimumSize(new Dimension(1120,600));
        this.setPreferredSize(new Dimension(1120,600));      
        
        cbSituacion.setEnabled(false);
        
        //Al hacer click en el JFrame se quita la seleccion del JTable
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

        panelTodo = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        cbFiltroProv = new javax.swing.JComboBox<>();
        panelFiltros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbFiltroEstado = new javax.swing.JComboBox<>();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbCampoOrden = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnNuevoProd = new javax.swing.JButton();
        btnEditarProd = new javax.swing.JButton();
        btnVolverProd = new javax.swing.JButton();
        btnMenuPpal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión del producto");
        setMinimumSize(new java.awt.Dimension(1120, 600));
        setPreferredSize(new java.awt.Dimension(1120, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));
        panelTodo.setForeground(new java.awt.Color(0, 133, 155));

        panelBusqueda.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");

        txfdBuscarProd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdBuscarProd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfdBuscarProd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdBuscarProd.setNextFocusableComponent(btnEditarProd);
        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proveedor:");

        cbFiltroProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbFiltroProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFiltroProv.setNextFocusableComponent(cbFiltroEstado);
        cbFiltroProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFiltroProv, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbFiltroProv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFiltros.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Filtrar por:");

        cbFiltroEstado.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbFiltroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltroEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFiltroEstado.setNextFocusableComponent(cbSituacion);
        cbFiltroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroEstadoActionPerformed(evt);
            }
        });

        cbSituacion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo habilitados", "Sólo ofertas", "Sólo suspendidos" }));
        cbSituacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSituacion.setNextFocusableComponent(cbCampoOrden);
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ordenar por:");

        cbCampoOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbCampoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio costo", "Precio venta", "Stock", "Stock mínimo", "Peso del envase" }));
        cbCampoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCampoOrden.setNextFocusableComponent(cbTipoOrden);
        cbCampoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCampoOrdenActionPerformed(evt);
            }
        });

        cbTipoOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoOrden.setNextFocusableComponent(btnNuevoProd);
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFiltrosLayout = new javax.swing.GroupLayout(panelFiltros);
        panelFiltros.setLayout(panelFiltrosLayout);
        panelFiltrosLayout.setHorizontalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFiltrosLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(cbFiltroEstado, 0, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacion, 0, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCampoOrden, 0, 1, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(cbTipoOrden, 0, 1, Short.MAX_VALUE)
                .addGap(158, 158, 158))
        );
        panelFiltrosLayout.setVerticalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbFiltroEstado)
                        .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCampoOrden)
                        .addComponent(cbTipoOrden))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTabla.setOpaque(false);

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
        tablaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaProd.setFocusable(false);
        tablaProd.setGridColor(new java.awt.Color(153, 153, 153));
        tablaProd.setNextFocusableComponent(btnEditarProd);
        tablaProd.setRowHeight(20);
        tablaProd.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProd.getTableHeader().setResizingAllowed(false);
        tablaProd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProd);

        btnNuevoProd.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoProd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnNuevoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"))); // NOI18N
        btnNuevoProd.setText("Nuevo");
        btnNuevoProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoProd.setBorderPainted(false);
        btnNuevoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProd.setFocusPainted(false);
        btnNuevoProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevoProd.setIconTextGap(50);
        btnNuevoProd.setNextFocusableComponent(btnEditarProd);
        btnNuevoProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnNuevoProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnNuevoProdFocusLost(evt);
            }
        });
        btnNuevoProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoProdMouseExited(evt);
            }
        });
        btnNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProdActionPerformed(evt);
            }
        });

        btnEditarProd.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarProd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnEditarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/editar_50.png"))); // NOI18N
        btnEditarProd.setText("Editar");
        btnEditarProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarProd.setBorderPainted(false);
        btnEditarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProd.setFocusPainted(false);
        btnEditarProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditarProd.setIconTextGap(50);
        btnEditarProd.setNextFocusableComponent(btnVolverProd);
        btnEditarProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEditarProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnEditarProdFocusLost(evt);
            }
        });
        btnEditarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarProdMouseExited(evt);
            }
        });
        btnEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdActionPerformed(evt);
            }
        });

        btnVolverProd.setBackground(new java.awt.Color(204, 204, 255));
        btnVolverProd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVolverProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/volver_50.png"))); // NOI18N
        btnVolverProd.setText("Volver");
        btnVolverProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverProd.setBorderPainted(false);
        btnVolverProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverProd.setFocusPainted(false);
        btnVolverProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolverProd.setIconTextGap(30);
        btnVolverProd.setNextFocusableComponent(btnMenuPpal);
        btnVolverProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnVolverProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnVolverProdFocusLost(evt);
            }
        });
        btnVolverProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverProdMouseExited(evt);
            }
        });
        btnVolverProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverProdActionPerformed(evt);
            }
        });

        btnMenuPpal.setBackground(new java.awt.Color(204, 204, 255));
        btnMenuPpal.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMenuPpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"))); // NOI18N
        btnMenuPpal.setText("Menú principal");
        btnMenuPpal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuPpal.setBorderPainted(false);
        btnMenuPpal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPpal.setFocusPainted(false);
        btnMenuPpal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenuPpal.setIconTextGap(20);
        btnMenuPpal.setNextFocusableComponent(txfdBuscarProd);
        btnMenuPpal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnMenuPpalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnMenuPpalFocusLost(evt);
            }
        });
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

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(btnNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuPpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProd)
                    .addComponent(btnEditarProd)
                    .addComponent(btnVolverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPpal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFiltros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
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

    private void btnMenuPpalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPpalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPpalActionPerformed

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

    private void cbFiltroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroEstadoActionPerformed
        if (cbFiltroEstado.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
            cbSituacion.setEnabled(false);
        }
        else
        {
            if (cbFiltroEstado.getSelectedItem().equals("Habilitados"))
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
    }//GEN-LAST:event_cbFiltroEstadoActionPerformed

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
            cbFiltroEstado.setEnabled(true);
            if (cbFiltroEstado.getSelectedItem().equals("Habilitados"))
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
            cbFiltroEstado.setEnabled(false);
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnNuevoProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_lleno_50.png"));     
        btnNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProdMouseEntered

    private void btnNuevoProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));     
        btnNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProdMouseExited

    private void btnEditarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/editar_lleno_50.png"));     
        btnEditarProd.setIcon(icono);
    }//GEN-LAST:event_btnEditarProdMouseEntered

    private void btnEditarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/editar_50.png"));     
        btnEditarProd.setIcon(icono);
    }//GEN-LAST:event_btnEditarProdMouseExited

    private void btnVolverProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/volver_lleno_50.png"));     
        btnVolverProd.setIcon(icono);
    }//GEN-LAST:event_btnVolverProdMouseEntered

    private void btnVolverProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/volver_50.png"));     
        btnVolverProd.setIcon(icono);
    }//GEN-LAST:event_btnVolverProdMouseExited

    private void btnMenuPpalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseEntered

    private void btnMenuPpalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseExited

    private void btnEditarProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditarProdFocusGained
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/editar_lleno_50.png"));     
        btnEditarProd.setIcon(icono);
    }//GEN-LAST:event_btnEditarProdFocusGained

    private void btnEditarProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditarProdFocusLost
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/editar_50.png"));     
        btnEditarProd.setIcon(icono);
    }//GEN-LAST:event_btnEditarProdFocusLost

    private void btnNuevoProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNuevoProdFocusGained
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_lleno_50.png"));     
        btnNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProdFocusGained

    private void btnNuevoProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNuevoProdFocusLost
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));     
        btnNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProdFocusLost

    private void btnVolverProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnVolverProdFocusGained
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/volver_lleno_50.png"));     
        btnVolverProd.setIcon(icono);
    }//GEN-LAST:event_btnVolverProdFocusGained

    private void btnVolverProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnVolverProdFocusLost
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/volver_50.png"));     
        btnVolverProd.setIcon(icono);
    }//GEN-LAST:event_btnVolverProdFocusLost

    private void btnMenuPpalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnMenuPpalFocusGained
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalFocusGained

    private void btnMenuPpalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnMenuPpalFocusLost
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenarTabla();
    }//GEN-LAST:event_formWindowGainedFocus
    
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
            lista = pDAO.listar(OrdenarTabla(), prov.getId());
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
            
            if (proveedorSelec.equals("Todos")) 
            {
                Set<Proveedor> listaProv = p.getProveedors();   //proveedores que abastecen el producto            
                datos[10] = String.valueOf(listaProv.size());
            }
            else    //filtró por proveedor
            {
                datos[10] = String.valueOf("---");
            }
            
            datos[11] = String.valueOf(p.getId());            
           
            modelo.addRow(datos);
        }
        
        //ColorFilas cf = new ColorFilas(2);
        //tablaProd.setDefaultRenderer(Object.class, cf);  //Cambia de color las filas de la tablaProd (intercaladas)
        
        //tablaProd.setDefaultRenderer(Object.class, new CentrarColumnas());    //Centra el contenido de las columnas en la tablaProd
                
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
            public void focusGained(FocusEvent fe)  //recupera el foco
            {
                tablaProd.setRowSelectionAllowed(true);     //permitir seleccion
            }

            @Override
            public void focusLost(FocusEvent fe)    //pierde el foco
            {                
                tablaProd.setRowSelectionAllowed(false);    //no permitir seleccion
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
    
            Set<Proveedor> listaProv = p.getProveedors();                        
            
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
        List<Proveedor> lista = prDAO.listar("Habilitados", "razonSocial", "ASC");
        
        cbFiltroProv.addItem("Todos");
        
        for (Proveedor p : lista)
        {
            cbFiltroProv.addItem(p.getRazonSocial());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarProd;
    private javax.swing.JButton btnMenuPpal;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnVolverProd;
    private javax.swing.JComboBox<String> cbCampoOrden;
    private javax.swing.JComboBox<String> cbFiltroEstado;
    private javax.swing.JComboBox<String> cbFiltroProv;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    // End of variables declaration//GEN-END:variables
}
