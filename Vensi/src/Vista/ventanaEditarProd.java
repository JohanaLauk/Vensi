package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.Producto;
import Modelo.Proveedor;
import Utils.Redondear;
import Utils.Validar;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ventanaEditarProd extends javax.swing.JFrame 
{
    ProveedorDAO prDAO = new ProveedorDAO();
    ProductoDAO pDAO = new ProductoDAO();
    Validar validar = new Validar();
    DefaultTableModel modelo;
    
    Redondear r = new Redondear();   
    
    public static int id_recibido;
    Producto elProd = null;
    String estado = null;
    String situacion = "Ninguno";
    
    int stockU;    //variable usada en mostrarProdSelec()
    List<JCheckBox> checkProv = new ArrayList<>();
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    
    ImageIcon icono;

    public ventanaEditarProd() 
    {
        initComponents();

        this.setLocationRelativeTo(null);     //centra la ventana  
        this.setMinimumSize(new Dimension(666, 428));  //al minimizar la ventana no permite que sea mas chico que esa medida
        this.setPreferredSize(new Dimension(666, 428));    //al minimizar la ventana aparece con esa medida        
        
        elProd = pDAO.buscarPorId(id_recibido);

        mostrarProdSelec();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
        bgroupProv = new javax.swing.ButtonGroup();
        panelTodo = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        txfdEditarStockMinimo = new org.jdesktop.swingx.JXTextField();
        jLabel7 = new javax.swing.JLabel();
        txfdEditarPrecioVenta = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        txfdEditarPrecioCosto = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        txfdEditarDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfdEditarCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();
        txfdEditarPesoEnvase = new org.jdesktop.swingx.JXTextField();
        panelBotones = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar producto");
        setPreferredSize(new java.awt.Dimension(590, 450));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelIzquierdo.setOpaque(false);

        txfdEditarStockMinimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarStockMinimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarStockMinimo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarStockMinimo.setNextFocusableComponent(rbUnidad);
        txfdEditarStockMinimo.setPrompt("Ingrese la cantidad en unidades");
        txfdEditarStockMinimo.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdEditarStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarStockMinimoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Stock mínimo:");

        txfdEditarPrecioVenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarPrecioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarPrecioVenta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarPrecioVenta.setNextFocusableComponent(txfdEditarStockMinimo);
        txfdEditarPrecioVenta.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdEditarPrecioVenta.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdEditarPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioVentaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Precio venta:");

        txfdEditarPrecioCosto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarPrecioCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarPrecioCosto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarPrecioCosto.setNextFocusableComponent(txfdEditarPrecioVenta);
        txfdEditarPrecioCosto.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdEditarPrecioCosto.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdEditarPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioCostoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Precio costo:");

        txfdEditarDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarDescripcion.setNextFocusableComponent(txfdEditarPrecioCosto);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");

        txfdEditarCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarCodigo.setNextFocusableComponent(txfdEditarDescripcion);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfdEditarCodigo)
            .addComponent(txfdEditarDescripcion)
            .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDerecho.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Se vende por:");

        bgTipoVenta.add(rbUnidad);
        rbUnidad.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        rbUnidad.setText("Unidad");
        rbUnidad.setNextFocusableComponent(rbPeso);
        rbUnidad.setOpaque(false);
        rbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnidadActionPerformed(evt);
            }
        });

        bgTipoVenta.add(rbPeso);
        rbPeso.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        rbPeso.setText("Peso");
        rbPeso.setNextFocusableComponent(txfdEditarPesoEnvase);
        rbPeso.setOpaque(false);
        rbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("gramos.");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Peso del envase:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");

        cbEstado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        cbEstado.setNextFocusableComponent(cbSituacion);
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Situación:");

        cbSituacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Oferta", "Suspendido" }));
        cbSituacion.setNextFocusableComponent(btnAceptarEditar);
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Proveedor/es:");

        tablaProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor", "Provee", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProv);
        if (tablaProv.getColumnModel().getColumnCount() > 0) {
            tablaProv.getColumnModel().getColumn(0).setResizable(false);
            tablaProv.getColumnModel().getColumn(1).setMinWidth(60);
            tablaProv.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaProv.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaProv.getColumnModel().getColumn(2).setMinWidth(0);
            tablaProv.getColumnModel().getColumn(2).setPreferredWidth(0);
            tablaProv.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        txfdEditarPesoEnvase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarPesoEnvase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarPesoEnvase.setToolTipText("Ej: 1000");
        txfdEditarPesoEnvase.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarPesoEnvase.setPrompt("Ej: 1000");
        txfdEditarPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPesoEnvaseKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                            .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEstado, 0, 120, Short.MAX_VALUE)
                                .addComponent(cbSituacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(107, 107, 107))
                        .addGroup(panelDerechoLayout.createSequentialGroup()
                            .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDerechoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbUnidad)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbPeso))
                                .addComponent(jLabel6))
                            .addGap(34, 34, 34)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbUnidad)
                    .addComponent(rbPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        panelBotones.setOpaque(false);

        btnAceptarEditar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAceptarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"))); // NOI18N
        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptarEditar.setIconTextGap(30);
        btnAceptarEditar.setNextFocusableComponent(btnCancelarEditar);
        btnAceptarEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarEditarMouseExited(evt);
            }
        });
        btnAceptarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"))); // NOI18N
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelarEditar.setIconTextGap(20);
        btnCancelarEditar.setNextFocusableComponent(txfdEditarCodigo);
        btnCancelarEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarEditarMouseExited(evt);
            }
        });
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        Producto prodEditar = new Producto();
        String codigoInput = txfdEditarCodigo.getText();

        boolean preciosOK = false;
        boolean rbOK = false;
        boolean alMenosUnCheck = false;

        if (!codigoInput.equals("") && !txfdEditarDescripcion.getText().equals("") && (rbPeso.isSelected() || rbUnidad.isSelected()))
        {   //Ingresó CODIGO, DESCRIPCION y marcó el TIPO DE VENTA
            Producto prodRepetido = pDAO.buscarPorCodigo(codigoInput);

            if (prodRepetido == null || elProd.getCodigo().equals(codigoInput))
            {
                prodEditar.setCodigo(txfdEditarCodigo.getText().toUpperCase());
                prodEditar.setDescripcion(txfdEditarDescripcion.getText().toUpperCase());

                if (txfdEditarPrecioCosto.getText().equals("") || txfdEditarPrecioVenta.getText().equals(""))
                {
                    prodEditar.setPrecioCosto(0.00);
                    prodEditar.setPrecioVenta(0.00);
                    preciosOK = true;
                }
                else
                {
                    if (validar.validarPrecio(txfdEditarPrecioCosto.getText()) && validar.validarPrecio(txfdEditarPrecioVenta.getText()))
                    {
                        double precioC = Double.parseDouble(txfdEditarPrecioCosto.getText());
                        prodEditar.setPrecioCosto(precioC); 

                        double precioV = Double.parseDouble(txfdEditarPrecioVenta.getText());
                        prodEditar.setPrecioVenta(precioV);

                        preciosOK = true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Utilice el siguiente formato para los precios \"00.00\"");
                        preciosOK = false;
                    }
                }

                if (preciosOK)
                {
                    if (!rbPeso.isSelected() && !rbUnidad.isSelected())    //TIPO DE VENTA por PESO
                    {
                        JOptionPane.showMessageDialog(null, "Debe marcar si el producto se vende por PESO o por UNIDAD.");
                        rbOK = false;
                    }
                    else
                    {
                        if (rbPeso.isSelected())    //TIPO DE VENTA por PESO
                        {
                            if (txfdEditarPesoEnvase.getText().equals(""))   //marcó PESO pero no ingresó el PESO DEL ENVASE
                            {
                                JOptionPane.showMessageDialog(null, "Debe ingresar el PESO DEL ENVASE (en gramos).");
                                rbOK = false;
                            }
                            else
                            {
                                prodEditar.setPorPeso(true);

                                int pesoEnv = Integer.parseInt(txfdEditarPesoEnvase.getText());
                                prodEditar.setPesoEnvase(pesoEnv);

                                String stockMin = txfdEditarStockMinimo.getText();
                                if (stockMin.equals(""))
                                {
                                    prodEditar.setStockMinimo(0);
                                }
                                else
                                {
                                    int stockMinGR = Integer.parseInt(stockMin) * pesoEnv;
                                    prodEditar.setStockMinimo(stockMinGR);
                                }

                                int stockGR = stockU * pesoEnv;  //convierto la unidad en gramos
                                prodEditar.setStock(stockGR);  //guardo el nuevo stock en gramos

                                String precioV = txfdEditarPrecioVenta.getText();
                                if (precioV.equals(""))
                                {
                                    prodEditar.setPrecioVentaXKilo(0);
                                }
                                else
                                {
                                    double precioKilo = (1000 * Double.parseDouble(precioV)) / pesoEnv;
                                    precioKilo = r.RedondearAIntArriba(precioKilo);
                                    prodEditar.setPrecioVentaXKilo(precioKilo);
                                }
                                rbOK = true;
                            }
                        }
                        if (rbUnidad.isSelected())    //TIPO DE VENTA por UNIDAD
                        {
                            prodEditar.setPorPeso(false);
                            prodEditar.setPesoEnvase(0);
                            String stockMin = txfdEditarStockMinimo.getText();
                            if (stockMin.equals(""))
                            {
                                prodEditar.setStockMinimo(0);
                            }
                            else
                            {
                                prodEditar.setStockMinimo(Integer.parseInt(stockMin));
                            }
                            prodEditar.setStock(stockU);
                            prodEditar.setPrecioVentaXKilo(0);

                            rbOK = true;
                        }
                    }

                    if (rbOK)
                    {
                        if (cbEstado.getSelectedItem().equals("Habilitado"))
                        {
                            prodEditar.setEstado(true);
                        }
                        else
                        {
                            prodEditar.setEstado(false);
                        }

                        if (situacion.equals("Ninguno"))
                        {
                            prodEditar.setOferta(false);
                            prodEditar.setSuspendido(false);
                        }
                        else
                        {
                            if (situacion.equals("Oferta"))
                            {
                                prodEditar.setOferta(true);
                                prodEditar.setSuspendido(false);
                            }
                            else //suspendido
                            {
                                prodEditar.setOferta(false);
                                prodEditar.setSuspendido(true);
                            }
                        }

                        for (int i = 0; i < tablaProv.getModel().getRowCount(); i++) 
                        {
                            boolean seleccionado = Boolean.parseBoolean(tablaProv.getValueAt(i, 1).toString());

                            if (seleccionado) 
                            {
                                int idSelec = Integer.parseInt(tablaProv.getValueAt(i, 2).toString());
                                prodEditar.addProveedors(prDAO.buscarPorId(idSelec));
                                alMenosUnCheck = true;
                            }
                        }

                        if (preciosOK && rbOK && alMenosUnCheck)
                        {
                            pDAO.modificar(prodEditar, id_recibido);
                            dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un proveedor.");
                        }
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El nuevo CÓDIGO del producto que ingresó ya existe.\n" +
                    "Corrobore en el inventario para mayor seguridad y control.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }        
    }//GEN-LAST:event_btnAceptarEditarActionPerformed

    private void txfdEditarStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')        
            evt.consume();        
    }//GEN-LAST:event_txfdEditarStockMinimoKeyTyped

    private void txfdEditarPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))        
            evt.consume();        
    }//GEN-LAST:event_txfdEditarPrecioVentaKeyTyped

    private void txfdEditarPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))
            evt.consume();
    }//GEN-LAST:event_txfdEditarPrecioCostoKeyTyped

    private void cbSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacionActionPerformed
        if (cbSituacion.getSelectedItem().equals("Ninguno"))
        {
            situacion = "Ninguno";
        }
        else
        {
            if (cbSituacion.getSelectedItem().equals("Oferta"))
            {
                situacion = "Oferta";
            }
            else
            {
                situacion = "Suspendido";
            }
        }
    }//GEN-LAST:event_cbSituacionActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        if (cbEstado.getSelectedItem().equals("Habilitado"))
        {
            estado = "Habilitado";
            cbSituacion.setEnabled(true);
        }
        else
        {
            estado = "Deshabilitado";
            cbSituacion.setEnabled(false);
            cbSituacion.setSelectedItem("Ninguno");
        }
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        if (rbPeso.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(true);
            txfdEditarPesoEnvase.setText(null);
        }
    }//GEN-LAST:event_rbPesoActionPerformed

    private void rbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnidadActionPerformed
        if (rbUnidad.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(false);
            txfdEditarPesoEnvase.setText(null);
        }
    }//GEN-LAST:event_rbUnidadActionPerformed

    private void btnCancelarEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarEditarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_lleno_50.png"));     
        btnCancelarEditar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarEditarMouseEntered

    private void btnCancelarEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarEditarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"));     
        btnCancelarEditar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarEditarMouseExited

    private void btnAceptarEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarEditarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_lleno_50.png"));     
        btnAceptarEditar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarEditarMouseEntered

    private void btnAceptarEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarEditarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"));     
        btnAceptarEditar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarEditarMouseExited

    private void txfdEditarPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9')         
            evt.consume(); 
    }//GEN-LAST:event_txfdEditarPesoEnvaseKeyTyped

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaEditarProd().setVisible(true);
            }
        });
    }

    public void mostrarProdSelec() 
    {
        //MOSTRAMOS LOS DATOS GUARDADOS DEL PRODUCTO SELECCIONADO. PARA LUEGO PODER MODIFICAR
        txfdEditarCodigo.setText(String.valueOf(elProd.getCodigo()));
        txfdEditarDescripcion.setText(String.valueOf(elProd.getDescripcion()));
        txfdEditarPrecioCosto.setText(String.valueOf(elProd.getPrecioCosto()));
        txfdEditarPrecioVenta.setText(String.valueOf(elProd.getPrecioVenta()));
        
        if (elProd.isPorPeso())
        {
            stockU = elProd.getStock() / elProd.getPesoEnvase();  //convertimos los gramos en unidades
        }        
        else
        {
            stockU = elProd.getStock();
        }
        
        if (elProd.isPorPeso())
        {   //convertimos los gramos en unidades
            txfdEditarStockMinimo.setText(String.valueOf(elProd.getStockMinimo() / elProd.getPesoEnvase()));
        }
        else
        {
            txfdEditarStockMinimo.setText(String.valueOf(elProd.getStockMinimo()));
        }
        
        if (elProd.getPesoEnvase() == 0)
        {
            txfdEditarPesoEnvase.setText(null);
        }
        else
        {
            txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));
        }        

        if (elProd.isEstado()) 
        {
            cbEstado.setSelectedItem("Habilitado");
            cbSituacion.setEnabled(true);
        } 
        else 
        {
            cbEstado.setSelectedItem("Deshabilitado");
            cbSituacion.setEnabled(false);
        }
        
        if (elProd.isOferta())
        {
            cbSituacion.setSelectedItem("Oferta");
        }
        else
        {
            if (elProd.isSuspendido())
            {
                cbSituacion.setSelectedItem("Suspendido");
            }
            else
            {
                cbSituacion.setSelectedItem("Ninguno");
            }
        }
        
        if (elProd.isPorPeso() == true) 
        {
            rbPeso.setSelected(true);
            txfdEditarPesoEnvase.setEnabled(true);
            rbUnidad.setSelected(false);
        } 
        else 
        {
            rbUnidad.setSelected(true);
            rbPeso.setSelected(false);
            txfdEditarPesoEnvase.setEnabled(false);
        }
    }  
    
    public void llenarTabla()
    {        
        List<Proveedor> lista = prDAO.listar("Habilitados", "razonSocial", "ASC");
        Set<Proveedor> listaProvDelProducto = pDAO.buscarPorId(id_recibido).getProveedors();
        modelo = (DefaultTableModel) tablaProv.getModel();
        Object datos[] = {"",false,""};
        
        for (Proveedor p : lista)
        {
            datos[0] = p.getRazonSocial();
            datos[2] = String.valueOf(p.getId());
            
            for (Proveedor pr : listaProvDelProducto)
            {
                if(p.getId() == pr.getId())
                {
                    datos[1] = true;
                }
            }
            modelo.addRow(datos);
            datos[0] = "";  datos[1] = false; datos[2] = "";
        }
        tablaProv.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoVenta;
    private javax.swing.ButtonGroup bgroupProv;
    private javax.swing.JButton btnAceptarEditar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTable tablaProv;
    private javax.swing.JTextField txfdEditarCodigo;
    private javax.swing.JTextField txfdEditarDescripcion;
    private org.jdesktop.swingx.JXTextField txfdEditarPesoEnvase;
    private org.jdesktop.swingx.JXTextField txfdEditarPrecioCosto;
    private org.jdesktop.swingx.JXTextField txfdEditarPrecioVenta;
    private org.jdesktop.swingx.JXTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables
}
