package Vista;

import DAO.ItemVentaDAO;
import DAO.ProductoDAO;
import DAO.TurnoDAO;
import Modelo.ItemVenta;
import Modelo.Producto;
import Modelo.Turno;
import Utils.Redondear;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaVenta extends javax.swing.JFrame 
{    
    ProductoDAO pDAO = new ProductoDAO();
    TurnoDAO tDAO = new TurnoDAO();
    ItemVentaDAO itDAO = new ItemVentaDAO();
    Turno elTurno = new Turno();    
    
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
    
    int contadorCantVentas = 0;
        
    public ventanaVenta() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        this.setMinimumSize(new Dimension(1200, 500));  //Indica que hasta esa medida se puede minimizar        
        this.setPreferredSize(new Dimension(1200, 500));    //al ejecutarse, la ventana aparece con esa medida
        
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
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        panelTablaProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        panelTablaCarrito = new javax.swing.JPanel();
        LabMsjPC = new javax.swing.JLabel();
        labMontoTotalCompra = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        panelDatosProd = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listInfoProd = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        txfdCantidad = new org.jdesktop.swingx.JXTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setPreferredSize(new java.awt.Dimension(1200, 500));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btnIniciarTurno.setText("Iniciar turno");
        btnIniciarTurno.setNextFocusableComponent(txfdBuscarProd);
        btnIniciarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTurnoActionPerformed(evt);
            }
        });

        btnDetalleCaja.setText("Detalle de caja");
        btnDetalleCaja.setNextFocusableComponent(btnCerrarTurno);
        btnDetalleCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleCajaActionPerformed(evt);
            }
        });

        btnCerrarTurno.setText("Cerrar turno");
        btnCerrarTurno.setNextFocusableComponent(btnMenuPrincipal);
        btnCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTurnoActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setText("Menú principal");
        btnMenuPrincipal.setNextFocusableComponent(btnIniciarTurno);
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
                .addComponent(btnIniciarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(btnDetalleCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(btnCerrarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesArribaLayout.setVerticalGroup(
            panelBotonesArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnIniciarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDetalleCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Buscar:");

        jLabel3.setText("Ordenar por:");

        cbOrdenCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Precio", "Stock" }));
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

        txfdBuscarProd.setToolTipText("");
        txfdBuscarProd.setNextFocusableComponent(btnBuscar);
        txfdBuscarProd.setPrompt("Busque por código o por descripción");
        txfdBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProdKeyReleased(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setNextFocusableComponent(cbFiltro);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Filtrar por:");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sólo habilitados", "Sólo ofertas" }));
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
                        .addComponent(txfdBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addContainerGap())))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfdBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
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
            .addComponent(jScrollPane1)
        );
        panelTablaProdLayout.setVerticalGroup(
            panelTablaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        LabMsjPC.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        LabMsjPC.setText("Total de la compra:");

        labMontoTotalCompra.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        labMontoTotalCompra.setText("$0");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.setNextFocusableComponent(btnDetalleCaja);
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
        tablaCarrito.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCarrito.getTableHeader().setResizingAllowed(false);
        tablaCarrito.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaCarrito);

        jLabel2.setText("Carrito:");

        javax.swing.GroupLayout panelTablaCarritoLayout = new javax.swing.GroupLayout(panelTablaCarrito);
        panelTablaCarrito.setLayout(panelTablaCarritoLayout);
        panelTablaCarritoLayout.setHorizontalGroup(
            panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addGroup(panelTablaCarritoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaCarritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabMsjPC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labMontoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        panelTablaCarritoLayout.setVerticalGroup(
            panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaCarritoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMontoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabMsjPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        listInfoProd.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Código:", "Descripción:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listInfoProd);

        jLabel6.setText("Datos del producto:");

        jLabel5.setText("Cantidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(btnQuitar);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setText("Quitar");
        btnQuitar.setNextFocusableComponent(btnConfirmar);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

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
                .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(panelDatosProdLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosProdLayout.setVerticalGroup(
            panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosProdLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosProdLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        txfdCantidad.getAccessibleContext().setAccessibleDescription("   unidad / gramos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablaCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panelDatosProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotonesArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatosProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTablaCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTablaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
        //GUARDAMOS EL CONTADOR_VENTAS_CONFIRMADAS EN LA VARIABLE DE LA VENTANA_CIERRE_TURNO
        ventanaCierreTurno.cantVentas = contadorCantVentas; 
            
        ventanaCierreTurno vCierreTurno = new ventanaCierreTurno();
        vCierreTurno.setVisible(true);
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
        turnoActual = tDAO.obtenerUltimo();
        
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
        
        contadorCantVentas += 1;
        labMontoTotalCompra.setText("$0,00");
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
                            
                            tablaCarrito.setValueAt(cantTotal+"gr", filaModificar, 1);
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
        
        labMontoTotalCompra.setText(String.valueOf("$"+ formatoPrecios.format(calcularTotalCarrito())));
        
        limpiarList();

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
            labMontoTotalCompra.setText(String.valueOf("$"+ formatoPrecios.format(montoTotalCompra)));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
        
        limpiarList();
        
        txfdCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cadena = txfdBuscarProd.getText();
        listaBusqueda = pDAO.buscarPorCodigoNombre(cadena, "Habilitados", situacionSelec);
        llenarTablaBusqueda(listaBusqueda);
        
        if (txfdBuscarProd.getText().equals("") || txfdBuscarProd.getText() == null)
        {
            cbOrdenCampo.setEnabled(true);
            cbTipoOrden.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbOrdenCampo.setEnabled(false);
            cbTipoOrden.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
    }//GEN-LAST:event_txfdCantidadKeyTyped
    
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
                tablaCarrito.setRowSelectionAllowed(true);
                
                int filaSelec = tablaCarrito.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    String cod = tablaCarrito.getValueAt(filaSelec, 4).toString();
                    String desc = tablaCarrito.getValueAt(filaSelec, 0).toString();
                    
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
        List<Turno> listaTurno = tDAO.listar();
        
        if (listaTurno.isEmpty())  //lista vacía
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
            tablaVacia();
        }
        else    //lista con turnos
        {      //turno abierto
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
                    tablaVacia();
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
        modeloList.addElement("Código: ");
        modeloList.addElement("Descripcion: ");
        listInfoProd.setModel(modeloList);
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
    private javax.swing.JLabel LabMsjPC;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
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
    private javax.swing.JLabel labMontoTotalCompra;
    private javax.swing.JList<String> listInfoProd;
    private javax.swing.JPanel panelBotonesArriba;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelDatosProd;
    private javax.swing.JPanel panelTablaCarrito;
    private javax.swing.JPanel panelTablaProd;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaProd;
    private org.jdesktop.swingx.JXTextField txfdBuscarProd;
    private org.jdesktop.swingx.JXTextField txfdCantidad;
    // End of variables declaration//GEN-END:variables
}