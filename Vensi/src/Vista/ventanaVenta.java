package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemVentaDAO;
import DAO.ProductoDAO;
import DAO.TurnoDAO;
import Modelo.EntradaSalida;
import Modelo.ItemVenta;
import Modelo.Producto;
import Modelo.Turno;
import Utils.Redondear;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaVenta extends javax.swing.JFrame 
{    
    ProductoDAO pDAO = new ProductoDAO();
    TurnoDAO tDAO = new TurnoDAO();
    ItemVentaDAO itDAO = new ItemVentaDAO();
    Turno elTurno = new Turno();    
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();    
    
    DefaultTableModel modelo, modelo2, modelo3, m;
    TableColumnModel tcm, tcm2, tcm3;   
    DefaultListModel modeloList;
    
    List<Producto> listaBusqueda = null;
    Turno turnoActual = null; 
    
    String filtroSelec = "Habilitados";
    String situacionSelec = "HabOferta";
    String ordenSelec = "descripcion";
    String tipoSelec = "ASC";
    
    Redondear r = new Redondear();    
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    ImageIcon icono;
        
    public ventanaVenta() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        this.setMinimumSize(new Dimension(1210, 600));  //Indica que hasta esa medida se puede minimizar        
        this.setPreferredSize(new Dimension(1210, 600));    //al ejecutarse, la ventana aparece con esa medida
        
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/V.jpg"));
        this.setIconImage(ico);
        
        //Al hacer click en el JFrame...
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProd.clearSelection();
                tablaCarrito.clearSelection();
                listInfoProd.clearSelection();
                
                limpiarList();
                
                txfdCantidad.setText("");
                txfdCantidad.setEnabled(false);
                btnQuitar.setEnabled(false);
                btnAgregar.setEnabled(false);
            } 
        });      
               
        llenarTabla();
        llenarTablaCarrito();        
        verificarTurno();               
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelTodo = new javax.swing.JPanel();
        panelBotonesArriba = new javax.swing.JPanel();
        btnIniciarTurno = new javax.swing.JButton();
        btnDetalleCaja = new javax.swing.JButton();
        btnCerrarTurno = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbOrdenCampo = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        txfdBuscarProd = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        panelTablaProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        panelDatosProd = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        txfdCantidad = new org.jdesktop.swingx.JXTextField();
        panelTablaCarrito = new javax.swing.JPanel();
        labMontoTotalCompra = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de ventas");
        setMinimumSize(new java.awt.Dimension(1210, 600));
        setPreferredSize(new java.awt.Dimension(1210, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));

        panelBotonesArriba.setBackground(new java.awt.Color(0, 0, 0));
        panelBotonesArriba.setOpaque(false);

        btnIniciarTurno.setBackground(new java.awt.Color(204, 204, 255));
        btnIniciarTurno.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnIniciarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/turnoSinIniciar_50.png"))); // NOI18N
        btnIniciarTurno.setText("Iniciar turno");
        btnIniciarTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarTurno.setFocusPainted(false);
        btnIniciarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIniciarTurno.setIconTextGap(20);
        btnIniciarTurno.setNextFocusableComponent(txfdBuscarProd);
        btnIniciarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTurnoActionPerformed(evt);
            }
        });

        btnDetalleCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnDetalleCaja.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDetalleCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/caja_50.png"))); // NOI18N
        btnDetalleCaja.setText("Detalle de caja");
        btnDetalleCaja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetalleCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalleCaja.setFocusPainted(false);
        btnDetalleCaja.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDetalleCaja.setIconTextGap(20);
        btnDetalleCaja.setNextFocusableComponent(btnCerrarTurno);
        btnDetalleCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetalleCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetalleCajaMouseExited(evt);
            }
        });
        btnDetalleCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleCajaActionPerformed(evt);
            }
        });

        btnCerrarTurno.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrarTurno.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCerrarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/turnoSinCerrar_50.png"))); // NOI18N
        btnCerrarTurno.setText("Cerrar turno");
        btnCerrarTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarTurno.setFocusPainted(false);
        btnCerrarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrarTurno.setIconTextGap(20);
        btnCerrarTurno.setNextFocusableComponent(btnMenuPrincipal);
        btnCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTurnoActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        btnMenuPrincipal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"))); // NOI18N
        btnMenuPrincipal.setText("Menú principal");
        btnMenuPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.setFocusPainted(false);
        btnMenuPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenuPrincipal.setIconTextGap(20);
        btnMenuPrincipal.setNextFocusableComponent(btnIniciarTurno);
        btnMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseExited(evt);
            }
        });
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesArribaLayout = new javax.swing.GroupLayout(panelBotonesArriba);
        panelBotonesArriba.setLayout(panelBotonesArribaLayout);
        panelBotonesArribaLayout.setHorizontalGroup(
            panelBotonesArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDetalleCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBotonesArribaLayout.setVerticalGroup(
            panelBotonesArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDetalleCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIniciarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBusqueda.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ordenar por:");

        cbOrdenCampo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbOrdenCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio", "Stock" }));
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

        txfdBuscarProd.setToolTipText("");
        txfdBuscarProd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtrar por:");

        cbFiltro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo habilitados", "Sólo ofertas" }));
        cbFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFiltro.setNextFocusableComponent(cbOrdenCampo);
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBusquedaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbOrdenCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        if (tablaProd.getColumnModel().getColumnCount() > 0) {
            tablaProd.getColumnModel().getColumn(0).setPreferredWidth(95);
            tablaProd.getColumnModel().getColumn(1).setPreferredWidth(255);
            tablaProd.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProd.getColumnModel().getColumn(3).setPreferredWidth(80);
            tablaProd.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout panelTablaProdLayout = new javax.swing.GroupLayout(panelTablaProd);
        panelTablaProd.setLayout(panelTablaProdLayout);
        panelTablaProdLayout.setHorizontalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTablaProdLayout.setVerticalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelDatosProd.setBackground(new java.awt.Color(102, 184, 211));

        listInfoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listInfoProd.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CÓDIGO:", "DESCRIPCIÓN:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listInfoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(listInfoProd);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Datos del producto:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btnQuitar.setBackground(new java.awt.Color(255, 153, 153));
        btnQuitar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setFocusPainted(false);
        btnQuitar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnQuitar.setNextFocusableComponent(btnConfirmar);
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

        txfdCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCantidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCantidad.setNextFocusableComponent(btnAgregar);
        txfdCantidad.setPrompt("unidad / gramos");
        txfdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosProdLayout = new javax.swing.GroupLayout(panelDatosProd);
        panelDatosProd.setLayout(panelDatosProdLayout);
        panelDatosProdLayout.setHorizontalGroup(
            panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(284, 284, 284)))
                .addGap(31, 31, 31)
                .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosProdLayout.setVerticalGroup(
            panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProdLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
            .addGroup(panelDatosProdLayout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txfdCantidad.getAccessibleContext().setAccessibleDescription("   unidad / gramos");

        panelTablaCarrito.setBackground(new java.awt.Color(102, 184, 211));

        labMontoTotalCompra.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        labMontoTotalCompra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMontoTotalCompra.setText("Total compra: $0");

        btnConfirmar.setBackground(new java.awt.Color(90, 227, 101));
        btnConfirmar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"))); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConfirmar.setIconTextGap(50);
        btnConfirmar.setNextFocusableComponent(btnDetalleCaja);
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseExited(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        tablaCarrito = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaCarrito.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCarrito.setFocusable(false);
        tablaCarrito.setGridColor(new java.awt.Color(153, 153, 153));
        tablaCarrito.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCarrito.getTableHeader().setResizingAllowed(false);
        tablaCarrito.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaCarrito);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Carrito:");

        javax.swing.GroupLayout panelTablaCarritoLayout = new javax.swing.GroupLayout(panelTablaCarrito);
        panelTablaCarrito.setLayout(panelTablaCarritoLayout);
        panelTablaCarritoLayout.setHorizontalGroup(
            panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTablaCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaCarritoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaCarritoLayout.createSequentialGroup()
                        .addGroup(panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labMontoTotalCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        panelTablaCarritoLayout.setVerticalGroup(
            panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaCarritoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labMontoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBotonesArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelDatosProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTablaCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelBotonesArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(panelDatosProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTablaCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelTodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnIniciarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTurnoActionPerformed
        ventanaInicioTurno vInicioTurno = new ventanaInicioTurno();
        vInicioTurno.setVisible(true);
    }//GEN-LAST:event_btnIniciarTurnoActionPerformed

    private void btnCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTurnoActionPerformed
        List<EntradaSalida> listaAperturas = esDAO.validarES(turnoActual.getId(), "apertura de caja");
        List<EntradaSalida> listaSueldos = esDAO.validarES(turnoActual.getId(), "sueldo");
        
        if (listaAperturas.size() != 0 && listaSueldos.size() != 0)   //tiene aperturas y sueldos cargados
        {
            ventanaCierreTurno vCierreTurno = new ventanaCierreTurno();
            vCierreTurno.setVisible(true);
            this.dispose();
        }
        else
        {
            if (listaAperturas.size() != 0 && listaSueldos.size() == 0)   //SI aperturas | NO sueldos 
            {
                int cerrarTurno = JOptionPane.showConfirmDialog(null, "El turno no tiene registrado un \"Sueldo\".\n¿Desea continuar?", "AVISO", JOptionPane.YES_NO_OPTION);
                if (cerrarTurno == 0)
                {
                    ventanaCierreTurno vCierreTurno = new ventanaCierreTurno();
                    vCierreTurno.setVisible(true);
                    this.dispose();
                }
            }
            if (listaAperturas.size() == 0 && listaSueldos.size() != 0) //NO aperturas | SI sueldos 
            {
                int cerrarTurno = JOptionPane.showConfirmDialog(null, "El turno no tiene registrado una \"Apertura de caja\".\n¿Desea continuar?", "AVISO", JOptionPane.YES_NO_OPTION);
                if (cerrarTurno == 0)
                {
                    ventanaCierreTurno vCierreTurno = new ventanaCierreTurno();
                    vCierreTurno.setVisible(true);
                    this.dispose();
                }
            }
            if (listaAperturas.size() == 0 && listaSueldos.size() == 0) //NO aperturas | NO sueldos 
            {
                int cerrarTurno = JOptionPane.showConfirmDialog(null, "El turno no tiene registrado una \"Apertura de caja\" ni un \"Sueldo\".\n"
                                                                        + "¿Desea continuar?", "AVISO", JOptionPane.YES_NO_OPTION);
                if (cerrarTurno == 0)
                {
                    ventanaCierreTurno vCierreTurno = new ventanaCierreTurno();
                    vCierreTurno.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnCerrarTurnoActionPerformed

    private void btnDetalleCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleCajaActionPerformed
        ventanaDetalleCaja vDetalleCaja = new ventanaDetalleCaja();
        vDetalleCaja.setVisible(true);
    }//GEN-LAST:event_btnDetalleCajaActionPerformed

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

    private void cbOrdenCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenCampoActionPerformed
        if (cbOrdenCampo.getSelectedItem().equals("Descripción"))
        {
            ordenSelec = "descripcion";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Código"))
        {
            ordenSelec = "codigo";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Precio"))
        {
            ordenSelec = "precio_venta";
        }
        if (cbOrdenCampo.getSelectedItem().equals("Stock"))
        {
            ordenSelec = "stock";
        }
        
        llenarTabla();   
    }//GEN-LAST:event_cbOrdenCampoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int cantFilasCarrito = tablaCarrito.getRowCount();   
        
        if (cantFilasCarrito != 0)     //carrito NO vacio
        {            
            for (int i=0 ; i<cantFilasCarrito ; i++)   //recorre todas las filas del carrito
            {               
                String idProd = tablaCarrito.getValueAt(i, 4).toString();                    
                Producto elProd = pDAO.buscarPorId(Integer.parseInt(idProd));
                int cantidad = 0;
                double precioT = 0;
                
                if (elProd.isPorPeso())
                {
                    double cant = 0;
                    String cadena = tablaCarrito.getValueAt(i, 1).toString();
                    cant = Double.parseDouble(cadena.substring(0, cadena.length()-2));
                    cantidad = Integer.parseInt(cadena.substring(0, cadena.length()-2));
                    
                    double cantKilo = cant / 1000; 
                                    
                    precioT = cantKilo * elProd.getPrecioVentaXKilo();
                    precioT = r.RedondearAIntArriba(precioT);           
                }
                else    //por unidad
                {
                    cantidad = Integer.parseInt(tablaCarrito.getValueAt(i, 1).toString());                    
                    precioT = cantidad * elProd.getPrecioVenta();
                }              
                               
                List<ItemVenta> listaItemVenta = itDAO.listar(turnoActual.getId());
                
                if (listaItemVenta.isEmpty())   //tabla item_venta VACÍA
                {         
                    ItemVenta unItemVenta = new ItemVenta();
                    unItemVenta.setProducto(elProd);    
                    unItemVenta.setCantidad(cantidad);
                    unItemVenta.setMonto(precioT);
                    unItemVenta.setHora(new Date());
                    unItemVenta.setTurno(turnoActual);
                                        
                    itDAO.alta(unItemVenta);                     
                    
                    //JOptionPane.showMessageDialog(null, "Tabla vacía, 1° ItemVenta agregado.");
                }
                else //tabla item_venta NO VACÍA
                {
                    boolean repetido = false;
                    ItemVenta itemModificar = null;
                    
                    for (ItemVenta item : listaItemVenta) //recorre la tabla item_venta del turno actual
                    {
                        if (item.getProducto().getId() == elProd.getId()) 
                        {
                            repetido = true;
                            itemModificar = item;
                        }
                    }
                    if (repetido) 
                    {
                        ItemVenta elItemVenta = new ItemVenta();
                        elItemVenta.setCantidad(itemModificar.getCantidad() + cantidad);
                        elItemVenta.setMonto(itemModificar.getMonto() + precioT);
                        elItemVenta.setHora(new Date());

                        itDAO.modificar(elItemVenta, itemModificar.getId());

                        //JOptionPane.showMessageDialog(null, "Producto repetido. ItemVenta modificado.");
                    } 
                    else 
                    {
                        ItemVenta unItemVenta = new ItemVenta();
                        unItemVenta.setProducto(elProd);
                        unItemVenta.setCantidad(cantidad);
                        unItemVenta.setMonto(precioT);
                        unItemVenta.setHora(new Date());
                        unItemVenta.setTurno(turnoActual);

                        itDAO.alta(unItemVenta);

                        //JOptionPane.showMessageDialog(null, "Producto nuevo, ItemVenta agregado.");
                    }
                }                    
                pDAO.restarStock(Integer.parseInt(idProd), cantidad);   //Descuenta stock                
            }            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El carrito está vacío.");
        }
        
        turnoActual.setCantVentas(turnoActual.getCantVentas() + 1);  
        tDAO.modificar(turnoActual, turnoActual.getId());
        
        JOptionPane.showMessageDialog(null, "¡Compra efectuada!");
        labMontoTotalCompra.setText("Total compra: $0,00");
        llenarTabla();
        llenarTablaCarrito();
        limpiarList();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSelec = tablaProd.getSelectedRow();

        if (filaSelec >= 0)  //corroboramos si seleccionó una fila
        {                        
            boolean modificar = false;
            int filaModificar = -1;  
            
            String id_recibido = tablaProd.getValueAt(filaSelec, 5).toString();
            Producto elProd = pDAO.buscarPorId(Integer.parseInt(id_recibido));
                                  
            String descrip = elProd.getDescripcion();
            int stock = elProd.getStock();
            
            String cantInput = txfdCantidad.getText();            
                    
            if (cantInput.equals("")) 
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad");
            } 
            else 
            {
                if (Integer.parseInt(cantInput) > stock) 
                {
                    JOptionPane.showMessageDialog(null, "Stock insuficiente");
                    txfdCantidad.setText(null);
                } 
                else 
                {
                    m = (DefaultTableModel) tablaCarrito.getModel();
                    String precioUnitario = null;
                    String precioTotal = null;
                    double precioU = 0, x = 0;
                        
                    for (int i = 0; i < tablaCarrito.getModel().getRowCount(); i++) 
                    {
                        if (Integer.parseInt(tablaCarrito.getValueAt(i, 4).toString()) == Integer.parseInt(id_recibido)) 
                        {
                            modificar = true;
                            filaModificar = i;
                        }
                    }
                    
                    if (modificar)  //producto repetido
                    {   
                        if (elProd.isPorPeso())
                        {
                            String cadena = tablaCarrito.getValueAt(filaModificar, 1).toString();
                            String gramosHay = cadena.substring(0, cadena.length()-2);                             
                            String cantTotal = String.valueOf(Integer.parseInt(cantInput) + Integer.parseInt(gramosHay));
                                                    
                            double cantKilo = Double.parseDouble(cantTotal) / 1000; 
                                    
                            precioU = cantKilo * elProd.getPrecioVentaXKilo();
                            precioU = r.RedondearAIntArriba(precioU); 
                            
                            precioTotal = String.valueOf(formatoPrecios.format(precioU));   
                            
                            tablaCarrito.setValueAt(cantTotal+"gr", filaModificar, 1);  //1 = nroColumna | cantTotal=valor nuevo
                        }
                        else
                        {
                            String cantHay = tablaCarrito.getValueAt(filaModificar, 1).toString();
                            int cantTotal = Integer.parseInt(cantHay) + Integer.parseInt(cantInput);                            
                            
                            precioU = elProd.getPrecioVenta();  
                            x = precioU * cantTotal;
                            precioTotal = String.valueOf(formatoPrecios.format(x));
                            
                            tablaCarrito.setValueAt(cantTotal, filaModificar, 1);
                        }                   
                        
                        tablaCarrito.setValueAt("$"+precioTotal, filaModificar, 3);
                    }
                    else    //producto nuevo
                    {
                        if (elProd.isPorPeso())
                        {
                            double cantKilo = Double.parseDouble(cantInput) / 1000; 
                                    
                            precioU = cantKilo * elProd.getPrecioVentaXKilo();
                            precioU = r.RedondearAIntArriba(precioU); 
                                                        
                            precioUnitario = String.valueOf("---");
                            precioTotal = String.valueOf(formatoPrecios.format(precioU));
                            
                            String filaNueva[] = {descrip, cantInput + "gr", precioUnitario, "$"+precioTotal, id_recibido};
                            m.addRow(filaNueva);
                        }
                        else
                        {
                            precioU = elProd.getPrecioVenta();                        
                            precioUnitario = String.valueOf(formatoPrecios.format(precioU));
                            x = precioU * Integer.parseInt(cantInput);
                            precioTotal = String.valueOf(formatoPrecios.format(x));
                            
                            String filaNueva[] = {descrip, cantInput, "$"+precioUnitario, "$"+precioTotal, id_recibido};
                            m.addRow(filaNueva);
                        } 
                    }                    
                }
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
        
        labMontoTotalCompra.setText(String.valueOf("Total compra: $"+ formatoPrecios.format(calcularTotalCarrito())));
               
        limpiarList();
        
        tablaProd.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/prod+_50.png"));     
        btnAgregar.setIcon(icono);
        
        tablaProd.setRowSelectionAllowed(false);
        tablaCarrito.setRowSelectionAllowed(false);
        
        txfdCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
        
        txfdCantidad.setText(null);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int filaSelec = tablaCarrito.getSelectedRow();
        
        if (filaSelec >= 0)   //corroboramos si seleccionó una fila
        {    
            m = (DefaultTableModel) tablaCarrito.getModel();
            m.removeRow(filaSelec);
            
            double montoTotalCompra = calcularTotalCarrito();
            labMontoTotalCompra.setText(String.valueOf("Total compra: $"+ formatoPrecios.format(montoTotalCompra)));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
        
        limpiarList();
        
        tablaProd.clearSelection();
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"));     
        btnQuitar.setIcon(icono);
        
        txfdCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void txfdBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProdKeyReleased
        String cadena = txfdBuscarProd.getText();
        listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, "Habilitados", situacionSelec);
        llenarTablaBusqueda(listaBusqueda);
        
        if (txfdBuscarProd.getText().equals("") || txfdBuscarProd.getText() == null)
        {
            cbFiltro.setEnabled(true);
            cbOrdenCampo.setEnabled(true);
            cbTipoOrden.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltro.setEnabled(false);
            cbOrdenCampo.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProdKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenarTabla(); 
        verificarTurno();
    }//GEN-LAST:event_formWindowGainedFocus

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        if (cbFiltro.getSelectedItem().equals("Todos"))
        {
            situacionSelec = "HabOferta";
        }
        if (cbFiltro.getSelectedItem().equals("Sólo habilitados"))
        {
            situacionSelec = "Habilitado";
        }
        if (cbFiltro.getSelectedItem().equals("Sólo ofertas"))
        {
            situacionSelec = "Oferta";
        }        
        llenarTabla();
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void txfdCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantidadKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnAgregar.doClick();
        }
    }//GEN-LAST:event_txfdCantidadKeyTyped

    private void btnDetalleCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleCajaMouseEntered
        if (tDAO.obtenerUltimo().getFechaHoraInicio() != null && tDAO.obtenerUltimo().getFechaHoraFin() == null)   //turno abierto
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/caja_lleno_50.png"));     
            btnDetalleCaja.setIcon(icono); 
        }        
    }//GEN-LAST:event_btnDetalleCajaMouseEntered

    private void btnDetalleCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleCajaMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/caja_50.png"));     
        btnDetalleCaja.setIcon(icono); 
    }//GEN-LAST:event_btnDetalleCajaMouseExited

    private void btnMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));     
        btnMenuPrincipal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPrincipalMouseEntered

    private void btnMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));     
        btnMenuPrincipal.setIcon(icono); 
    }//GEN-LAST:event_btnMenuPrincipalMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        int filaSelec = tablaProd.getSelectedRow();
        
        if (filaSelec >= 0)// && cantFilas == 0)   //si hay seleccionado una fila en la tabla...            
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
        int filaSelec = tablaCarrito.getSelectedRow();
                
        if (filaSelec >= 0)   //si hay seleccionado una fila en la tabla...            
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_lleno_50.png"));
            btnQuitar.setIcon(icono);
        }              
    }//GEN-LAST:event_btnQuitarMouseEntered

    private void btnQuitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/borrar_50.png"));     
        btnQuitar.setIcon(icono); 
    }//GEN-LAST:event_btnQuitarMouseExited

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        if (tDAO.obtenerUltimo().getFechaHoraInicio() != null && tDAO.obtenerUltimo().getFechaHoraFin() == null)   //turno abierto
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_lleno_50.png"));
            btnConfirmar.setIcon(icono); 
        }
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"));     
        btnConfirmar.setIcon(icono); 
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        limpiarList();
        tablaProd.clearSelection();
        tablaCarrito.clearSelection();
    }//GEN-LAST:event_formWindowLostFocus
    
    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaVenta().setVisible(true);
            }
        });
    }
    
    public void llenarTabla() 
    {        
        modelo = new DefaultTableModel();
        List<Producto> lista = pDAO.listar(OrdenarTabla());
        String[] datos = new String[6];
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("$ por kilo");
        modelo.addColumn("Stock");
        modelo.addColumn("ID");
        
        for (Producto p : lista)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
                        
            
            if (p.isPorPeso())
            {
                datos[2] = String.valueOf("---");
                
                datos[3] = String.valueOf("$"+ formatoPrecios.format(p.getPrecioVentaXKilo()));
                
                int pesoEnv1 = p.getPesoEnvase();
                int stockGR1 = p.getStock();    
                double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnv1;  
                double stockKG = stockGR2 / 1000;
                datos[4] = String.valueOf(stockU + "  (" + formatoKilos.format(stockKG) + "kg)");
            }
            else
            {
                datos[2] = String.valueOf("$"+ formatoPrecios.format(p.getPrecioVenta()));
                datos[3] = String.valueOf("---");
                datos[4] = String.valueOf(p.getStock());
            }            
            datos[5] = String.valueOf(p.getId());
           
            modelo.addRow(datos);
        }
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(80);
        tcm.getColumn(1).setPreferredWidth(400);
        tcm.getColumn(2).setPreferredWidth(30);
        tcm.getColumn(3).setPreferredWidth(30);
        tcm.getColumn(4).setPreferredWidth(60);
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
                tablaCarrito.clearSelection();
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
                    
                    listInfoProd.setModel(modeloList);                    
                    listInfoProd.setForeground(Color.GREEN.darker());
                    
                    txfdCantidad.setEnabled(true);
                    btnQuitar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                }        
            } 
        });
    }
    
    public void llenarTablaCarrito()
    {              
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Precio Total");
        modelo2.addColumn("ID");
        
        tablaCarrito.setModel(modelo2);  
        
        tcm2 = tablaCarrito.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(300);
        tcm2.getColumn(1).setPreferredWidth(20);
        tcm2.getColumn(2).setPreferredWidth(20);
        tcm2.getColumn(3).setPreferredWidth(30);
        tcm2.getColumn(4).setPreferredWidth(20);
        tcm2.getColumn(4).setPreferredWidth(0);     
        tcm2.getColumn(4).setMaxWidth(0);
        tcm2.getColumn(4).setMinWidth(0);
        tablaCarrito.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tablaCarrito.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        
        tablaCarrito.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaCarrito.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
            {                
                tablaCarrito.setRowSelectionAllowed(false);
            } 
        });
        
        tablaCarrito.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {   
                tablaProd.clearSelection();
                tablaCarrito.setRowSelectionAllowed(true);
                
                int filaSelec = tablaCarrito.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    String cod = tablaCarrito.getValueAt(filaSelec, 4).toString();
                    String desc = tablaCarrito.getValueAt(filaSelec, 0).toString();
                    
                    modeloList = new DefaultListModel(); 
                    modeloList.clear();
                    modeloList.addElement("CÓDIGO:    " + cod);
                    modeloList.addElement("DESCRIPCIÓN:    " + desc);
                    
                    listInfoProd.setModel(modeloList);
                    listInfoProd.setForeground(Color.RED);
                    
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
        String[] datos = new String[6];
 
        modelo3.addColumn("Código");
        modelo3.addColumn("Descripción");
        modelo3.addColumn("Precio");
        modelo3.addColumn("$ por kilo");
        modelo3.addColumn("Stock");
        modelo3.addColumn("ID");
        
        for (Producto p : listaBusqueda)
        {
            datos[0] = p.getCodigo();
            datos[1] = p.getDescripcion();
                        
            
            if (p.isPorPeso())
            {
                datos[2] = String.valueOf("---");
                
                datos[3] = String.valueOf("$"+ formatoPrecios.format(p.getPrecioVentaXKilo()));
                
                int pesoEnv1 = p.getPesoEnvase();
                int stockGR1 = p.getStock();    
                double stockGR2 = p.getStock();
                int stockU = stockGR1 / pesoEnv1;  
                double stockKG = stockGR2 / 1000;
                datos[4] = String.valueOf(stockU + "  (" + formatoKilos.format(stockKG) + "kg)");
            }
            else
            {
                datos[2] = String.valueOf("$"+ formatoPrecios.format(p.getPrecioVenta()));
                datos[3] = String.valueOf("---");
                datos[4] = String.valueOf(p.getStock());
            }
            datos[5] = String.valueOf(p.getId());
                       
            modelo3.addRow(datos);
        }
        
        tablaProd.setModel(modelo3);
        
        tcm3 = tablaProd.getColumnModel();
        tcm3.getColumn(0).setPreferredWidth(80);
        tcm3.getColumn(1).setPreferredWidth(400);
        tcm3.getColumn(2).setPreferredWidth(30);
        tcm3.getColumn(3).setPreferredWidth(30);
        tcm3.getColumn(4).setPreferredWidth(60);
        tcm3.getColumn(5).setPreferredWidth(0);     
        tcm3.getColumn(5).setMaxWidth(0);
        tcm3.getColumn(5).setMinWidth(0);
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
    
    public void verificarTurno()
    {
        turnoActual = tDAO.obtenerUltimo();
        List<Turno> listaTurno = tDAO.listar();
        
        if (listaTurno.isEmpty())  //turno cerrado  //lista vacía (sin turnos)
        {   
            for (int i=0 ; i < panelBotonesArriba.getComponents().length ; i++)
            {
                panelBotonesArriba.getComponent(i).setEnabled(false);
            }
            for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
            {
                panelBusqueda.getComponent(i).setEnabled(false);
            }
            for (int i=0 ; i < panelTablaProd.getComponents().length ; i++)
            {
                panelTablaProd.getComponent(i).setEnabled(false);
            }
            for (int i=0 ; i < panelDatosProd.getComponents().length ; i++)
            {
                panelDatosProd.getComponent(i).setEnabled(false);
            }
            for (int i=0 ; i < panelTablaCarrito.getComponents().length ; i++)
            {
                panelTablaCarrito.getComponent(i).setEnabled(false);
            }
            tablaProd.setEnabled(false);
            btnIniciarTurno.setEnabled(true);  
            btnMenuPrincipal.setEnabled(true);
            
            icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoSinIniciar_50.png"));     
            btnIniciarTurno.setIcon(icono); 
            
            icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoCerrado_50.png"));     
            btnCerrarTurno.setIcon(icono); 
            
            tablaVacia();
            
            this.setTitle("Sistema de ventas   -   Turno sin iniciar");
            
        }
        else    //turno abierto   //lista con turnos
        {      
            if (tDAO.obtenerUltimo().getFechaHoraInicio() != null && tDAO.obtenerUltimo().getFechaHoraFin() == null)   //turno abierto
            {    
                for (int i=0 ; i < panelBotonesArriba.getComponents().length ; i++)
                {
                    panelBotonesArriba.getComponent(i).setEnabled(true);
                }
                for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
                {
                    panelBusqueda.getComponent(i).setEnabled(true);
                }
                for (int i=0 ; i < panelTablaProd.getComponents().length ; i++)
                {
                    panelTablaProd.getComponent(i).setEnabled(true);
                }
                for (int i=0 ; i < panelDatosProd.getComponents().length ; i++)
                {
                    panelDatosProd.getComponent(i).setEnabled(true);
                }
                for (int i=0 ; i < panelTablaCarrito.getComponents().length ; i++)
                {
                    panelTablaCarrito.getComponent(i).setEnabled(true);
                }
                tablaProd.setEnabled(true);
                btnIniciarTurno.setEnabled(false);
                btnAgregar.setEnabled(false);
                btnQuitar.setEnabled(false);     
                
                icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoIniciado_50.png"));     
                btnIniciarTurno.setIcon(icono); 

                icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoSinCerrar_50.png"));     
                btnCerrarTurno.setIcon(icono);
                
                this.setTitle("Sistema de ventas   -   Turno N°" + turnoActual.getId() 
                        + "  -  Apertura: " + fechaHoraFormat.format(turnoActual.getFechaHoraInicio()) + "hs.");
            }
            else    //turno cerrado
            {      
                if (tDAO.obtenerUltimo().getFechaHoraInicio() != null && tDAO.obtenerUltimo().getFechaHoraFin() != null)
                {
                    for (int i=0 ; i < panelBotonesArriba.getComponents().length ; i++)
                    {
                        panelBotonesArriba.getComponent(i).setEnabled(false);
                    }
                    for (int i=0 ; i < panelBusqueda.getComponents().length ; i++)
                    {
                        panelBusqueda.getComponent(i).setEnabled(false);                    
                    }
                    for (int i=0 ; i < panelTablaProd.getComponents().length ; i++)
                    {
                        panelTablaProd.getComponent(i).setEnabled(false);
                    }
                    for (int i=0 ; i < panelDatosProd.getComponents().length ; i++)
                    {
                        panelDatosProd.getComponent(i).setEnabled(false);
                    }
                    for (int i=0 ; i < panelTablaCarrito.getComponents().length ; i++)
                    {
                        panelTablaCarrito.getComponent(i).setEnabled(false);
                    }
                    tablaProd.setEnabled(false);
                    btnIniciarTurno.setEnabled(true);  
                    btnMenuPrincipal.setEnabled(true);
                    
                    icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoSinIniciar_50.png"));     
                    btnIniciarTurno.setIcon(icono); 

                    icono = new ImageIcon(getClass().getResource("/Recursos/vVenta/turnoCerrado_50.png"));     
                    btnCerrarTurno.setIcon(icono);
            
                    tablaVacia();
                    
                    this.setTitle("Sistema de ventas   -   Turno sin iniciar");
                }                
            }
        }
    }
    
    public double calcularTotalCarrito()
    {
        double totalCarrito = 0;
        double precioT = 0;
        
        for (int i = 0; i < tablaCarrito.getRowCount(); i++) 
        {
            int id = Integer.parseInt(tablaCarrito.getValueAt(i, 4).toString());
            Producto p = pDAO.buscarPorId(id);            

            if (p.isPorPeso())
            {
                String cadena = tablaCarrito.getValueAt(i, 1).toString();
                String cant = cadena.substring(0, cadena.length()-2);   //cantidad en gramos de la tabla
                
                double cantKilo = Double.parseDouble(cant) / 1000; 
                                    
                precioT = cantKilo * p.getPrecioVentaXKilo();
                precioT = r.RedondearAIntArriba(precioT); 
            }
            else
            {                            
                int cant = Integer.parseInt(tablaCarrito.getValueAt(i, 1).toString());
                precioT = p.getPrecioVenta() * cant;
            }      
            
            totalCarrito += precioT;
        }
        
        return totalCarrito;
    }
    
    public void limpiarList()
    {
        modeloList = new DefaultListModel(); 
        modeloList.clear();
        modeloList.addElement("CÓDIGO:    ");
        modeloList.addElement("DESCRIPCIÓN:    ");
        
        listInfoProd.setModel(modeloList);
        listInfoProd.setForeground(Color.BLACK);        
    }
    
    public void tablaVacia()
    {
        modelo = new DefaultTableModel();     
 
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("$ por kilo");
        modelo.addColumn("Stock");
        modelo.addColumn("ID");
        
        tablaProd.setModel(modelo);
        
        tcm = tablaProd.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(80);
        tcm.getColumn(1).setPreferredWidth(400);
        tcm.getColumn(2).setPreferredWidth(30);
        tcm.getColumn(3).setPreferredWidth(30);
        tcm.getColumn(4).setPreferredWidth(60);
        tcm.getColumn(5).setPreferredWidth(0);     
        tcm.getColumn(5).setMaxWidth(0);
        tcm.getColumn(5).setMinWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProd.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrarTurno;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDetalleCaja;
    private javax.swing.JButton btnIniciarTurno;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrdenCampo;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labMontoTotalCompra;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JPanel panelBotonesArriba;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelDatosProd;
    private javax.swing.JPanel panelTablaCarrito;
    private javax.swing.JPanel panelTablaProd;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private org.jdesktop.swingx.JXTextField txfdCantidad;
    // End of variables declaration//GEN-END:variables
}