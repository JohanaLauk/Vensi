package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.*;
import Utils.Redondear;
import Utils.Validar;
import java.awt.Dimension;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaNuevoProd extends javax.swing.JFrame 
{
    ProductoDAO pDAO = new ProductoDAO();
    ProveedorDAO prDAO = new ProveedorDAO();
    Validar validar = new Validar();
    DefaultTableModel modelo;
    TableColumnModel tcm;
    
    List<JCheckBox> checkProv = new ArrayList<>();
    JScrollPane scrollPane;
    
    Redondear r = new Redondear();    
    
    String situacion = "Ninguno";
    
    ImageIcon icono;    
            
    public ventanaNuevoProd() 
    {
        initComponents();
                
        this.setLocationRelativeTo(null);     //centra la ventana                
        
        txfdPesoEnvase.setEnabled(false);           
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelTodo = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btnAceptarNuevoProd = new javax.swing.JButton();
        btnCancelarNuevoProd = new javax.swing.JButton();
        panelIzquierdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfdCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfdDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfdPrecioCosto = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        txfdPrecioVenta = new org.jdesktop.swingx.JXTextField();
        jLabel9 = new javax.swing.JLabel();
        txfdStockInicial = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        txfdStockMinimo = new org.jdesktop.swingx.JXTextField();
        panelDerecho = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbSituación = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();
        txfdPesoEnvase = new org.jdesktop.swingx.JXTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo producto");
        setMaximumSize(new java.awt.Dimension(692, 429));
        setMinimumSize(new java.awt.Dimension(692, 429));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelBotones.setOpaque(false);

        btnAceptarNuevoProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAceptarNuevoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"))); // NOI18N
        btnAceptarNuevoProd.setText("Aceptar");
        btnAceptarNuevoProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarNuevoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarNuevoProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptarNuevoProd.setIconTextGap(30);
        btnAceptarNuevoProd.setNextFocusableComponent(btnCancelarNuevoProd);
        btnAceptarNuevoProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarNuevoProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarNuevoProdMouseExited(evt);
            }
        });
        btnAceptarNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNuevoProdActionPerformed(evt);
            }
        });

        btnCancelarNuevoProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelarNuevoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"))); // NOI18N
        btnCancelarNuevoProd.setText("Cancelar");
        btnCancelarNuevoProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarNuevoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarNuevoProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelarNuevoProd.setIconTextGap(20);
        btnCancelarNuevoProd.setNextFocusableComponent(txfdCodigo);
        btnCancelarNuevoProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarNuevoProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarNuevoProdMouseExited(evt);
            }
        });
        btnCancelarNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnCancelarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCancelarNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIzquierdo.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        txfdCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdCodigo.setNextFocusableComponent(txfdDescripcion);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");

        txfdDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdDescripcion.setNextFocusableComponent(txfdPrecioCosto);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Precio costo:");

        txfdPrecioCosto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPrecioCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPrecioCosto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPrecioCosto.setNextFocusableComponent(txfdPrecioVenta);
        txfdPrecioCosto.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdPrecioCosto.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioCostoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Precio venta:");

        txfdPrecioVenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPrecioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPrecioVenta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPrecioVenta.setNextFocusableComponent(txfdStockInicial);
        txfdPrecioVenta.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdPrecioVenta.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioVentaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Stock inicial:");

        txfdStockInicial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdStockInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdStockInicial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdStockInicial.setNextFocusableComponent(txfdStockMinimo);
        txfdStockInicial.setPrompt("Ingrese la cantidad en unidades");
        txfdStockInicial.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdStockInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdStockInicialKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Stock mínimo:");

        txfdStockMinimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdStockMinimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdStockMinimo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdStockMinimo.setNextFocusableComponent(rbUnidad);
        txfdStockMinimo.setPrompt("Ingrese la cantidad en unidades");
        txfdStockMinimo.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdStockMinimoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txfdCodigo)
            .addComponent(txfdDescripcion)
            .addComponent(txfdPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfdPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfdStockInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
            .addComponent(txfdStockMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(txfdStockInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        rbPeso.setNextFocusableComponent(txfdPesoEnvase);
        rbPeso.setOpaque(false);
        rbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("gramos.");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Peso del envase:");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Situación:");

        cbSituación.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbSituación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Oferta", "Suspendido" }));
        cbSituación.setNextFocusableComponent(btnAceptarNuevoProd);
        cbSituación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituaciónActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Seleccione el/los proveedor/es:");

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
        jScrollPane3.setViewportView(tablaProv);
        if (tablaProv.getColumnModel().getColumnCount() > 0) {
            tablaProv.getColumnModel().getColumn(0).setResizable(false);
            tablaProv.getColumnModel().getColumn(1).setMinWidth(60);
            tablaProv.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaProv.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaProv.getColumnModel().getColumn(2).setMinWidth(0);
            tablaProv.getColumnModel().getColumn(2).setPreferredWidth(0);
            tablaProv.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        txfdPesoEnvase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPesoEnvase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPesoEnvase.setToolTipText("Ej: 1000");
        txfdPesoEnvase.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPesoEnvase.setPrompt("Ej: 1000");
        txfdPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPesoEnvaseKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDerechoLayout.createSequentialGroup()
                        .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(panelDerechoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cbSituación, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDerechoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(rbUnidad)
                                .addGap(18, 18, 18)
                                .addComponent(rbPeso)))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbUnidad)
                    .addComponent(rbPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbSituación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txfdPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))        
            evt.consume();               
    }//GEN-LAST:event_txfdPrecioCostoKeyTyped

    private void txfdStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9')         
            evt.consume();        
    }//GEN-LAST:event_txfdStockMinimoKeyTyped

    private void txfdStockInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockInicialKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9')         
            evt.consume();        
    }//GEN-LAST:event_txfdStockInicialKeyTyped

    private void txfdPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))        
            evt.consume();        
    }//GEN-LAST:event_txfdPrecioVentaKeyTyped

    private void cbSituaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituaciónActionPerformed
        if (cbSituación.getSelectedItem().equals("Ninguno"))
        {
            situacion = "Ninguno";
        }
        else
        {
            if (cbSituación.getSelectedItem().equals("Oferta"))
            {
                situacion = "Oferta";
            }
            else
            {
                situacion = "Suspendido";
            }
        }
    }//GEN-LAST:event_cbSituaciónActionPerformed

    private void btnCancelarNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoProdActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNuevoProdActionPerformed

    private void btnAceptarNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarNuevoProdActionPerformed
        Producto unProd = new Producto();
        String codigoInput = txfdCodigo.getText();
        
        boolean preciosOK = false;
        boolean rbOK = false;
        boolean alMenosUnCheck = false;
                
        if (!codigoInput.equals("") && !txfdDescripcion.getText().equals(""))
        {   //Ingresó CODIGO, DESCRIPCION y marcó el TIPO DE VENTA
            Producto prodRepetido = pDAO.buscarPorCodigo(codigoInput);
            
            if (prodRepetido == null)
            {
                unProd.setCodigo(txfdCodigo.getText().toUpperCase());
                unProd.setDescripcion(txfdDescripcion.getText().toUpperCase());
                    
                if (txfdPrecioCosto.getText().equals("") || txfdPrecioVenta.getText().equals(""))
                {
                    unProd.setPrecioCosto(0.00);
                    unProd.setPrecioVenta(0.00); 
                    preciosOK = true;
                }
                else
                {                   
                    if (validar.validarPrecio(txfdPrecioCosto.getText()) || validar.validarPrecio(txfdPrecioVenta.getText()))
                    {
                        double precioC = Double.parseDouble(txfdPrecioCosto.getText());
                        unProd.setPrecioCosto(precioC);//r.RedondearCentavos(precioC));

                        double precioV = Double.parseDouble(txfdPrecioVenta.getText());
                        unProd.setPrecioVenta(precioV); //r.RedondearCentavos(precioV));
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
                            if (txfdPesoEnvase.getText().equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "Debe ingresar el PESO DEL ENVASE (en gramos).");
                                rbOK = false;
                            }
                            else
                            {
                                unProd.setPorPeso(true);    //por peso

                                int pesoEnv = Integer.parseInt(txfdPesoEnvase.getText());
                                unProd.setPesoEnvase(pesoEnv);  //gramos

                                String stockMin = txfdStockMinimo.getText();  //unidades
                                if (stockMin.equals(""))
                                {
                                    unProd.setStockMinimo(0);                            
                                }
                                else
                                {
                                    int total = Integer.parseInt(stockMin) * pesoEnv;    //convierto las unidades en gramos
                                    unProd.setStockMinimo(total);   //guardo en gramos
                                }                        

                                String stock = txfdStockInicial.getText();   //unidades
                                if (stock.equals(""))
                                {
                                    unProd.setStock(0);   //guardo en gramos
                                }
                                else
                                {
                                    int total2 = Integer.parseInt(stock) * pesoEnv;   //convierto las unidades en gramos
                                    unProd.setStock(total2);   //guardo en gramos
                                }                                                              

                                String precioV = txfdPrecioVenta.getText();
                                if (precioV.equals(""))
                                {
                                    unProd.setPrecioVentaXKilo(0);
                                }
                                else
                                {
                                    double precioKilo = (1000 * Double.parseDouble(precioV)) / pesoEnv;
                                    precioKilo = r.RedondearAIntArriba(precioKilo);
                                    unProd.setPrecioVentaXKilo(precioKilo);
                                }            
                                rbOK = true;
                            }
                        }
                        if (rbUnidad.isSelected())    //TIPO DE VENTA por UNIDAD
                        {
                            unProd.setPorPeso(false);   
                            unProd.setPesoEnvase(0);
                            String stockMin = txfdStockMinimo.getText();
                            if (stockMin.equals(""))
                            {
                                unProd.setStockMinimo(0);
                            }
                            else
                            {
                                unProd.setStockMinimo(Integer.parseInt(stockMin));
                            }
                            String stock = txfdStockInicial.getText();
                            if (stock.equals(""))
                            {
                                unProd.setStock(0);
                            }
                            else
                            {
                                unProd.setStock(Integer.parseInt(txfdStockInicial.getText()));
                            }
                            unProd.setPrecioVentaXKilo(0);

                            rbOK = true;
                        }
                    }
                    
                    if (rbOK)
                    {
                        if (situacion.equals("Ninguno"))
                        {
                            unProd.setOferta(false);
                            unProd.setSuspendido(false);
                        }
                        else
                        {
                            if (situacion.equals("Oferta"))
                            {
                                unProd.setOferta(true);
                                unProd.setSuspendido(false);
                            }
                            else    //suspendido
                            {
                                unProd.setOferta(false);
                                unProd.setSuspendido(true);
                            }
                        }

                        for (int i = 0; i < tablaProv.getModel().getRowCount(); i++)
                        {
                            boolean seleccionado = Boolean.parseBoolean(tablaProv.getValueAt(i, 1).toString());
                            if (seleccionado)
                            {
                                int idSelec = Integer.parseInt(tablaProv.getValueAt(i, 2).toString());
                                unProd.addProveedors(prDAO.buscarPorId(idSelec));
                                alMenosUnCheck = true;
                            }                            
                        }
                        
                        if (preciosOK && rbOK && alMenosUnCheck)
                        {
                            pDAO.alta(unProd);
                            dispose();                  
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un proveedor");
                        }
                    }
                }    
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El CÓDIGO del producto que desea crear ya existe.\n" +
                                                    "Corrobore en el inventario para mayor seguridad y control.");                
            }                   
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }
    }//GEN-LAST:event_btnAceptarNuevoProdActionPerformed

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        if (rbPeso.isSelected())
        {
            txfdPesoEnvase.setEnabled(true);
        }
        else
        {
            txfdPesoEnvase.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesoActionPerformed

    private void rbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnidadActionPerformed
        if (rbUnidad.isSelected())
        {
            txfdPesoEnvase.setEnabled(false);
        }
        else
        {
            txfdPesoEnvase.setEnabled(true);
        }
    }//GEN-LAST:event_rbUnidadActionPerformed

    private void btnCancelarNuevoProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarNuevoProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_lleno_50.png"));     
        btnCancelarNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnCancelarNuevoProdMouseEntered

    private void btnCancelarNuevoProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarNuevoProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"));     
        btnCancelarNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnCancelarNuevoProdMouseExited

    private void btnAceptarNuevoProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarNuevoProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_lleno_50.png"));     
        btnAceptarNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnAceptarNuevoProdMouseEntered

    private void btnAceptarNuevoProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarNuevoProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"));     
        btnAceptarNuevoProd.setIcon(icono);
    }//GEN-LAST:event_btnAceptarNuevoProdMouseExited

    private void txfdPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_txfdPesoEnvaseKeyTyped

    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaNuevoProd().setVisible(true);
            }
        });
    }
    
    public void llenarTabla() 
    {
        List<Proveedor> lista = prDAO.listar("Habilitados", "razonSocial", "ASC");
        modelo = (DefaultTableModel) tablaProv.getModel();
        
        for (Proveedor p : lista) 
        {
            Object datos[] = {p.getRazonSocial(), false, String.valueOf(p.getId())};
            modelo.addRow(datos);
        }
        tablaProv.setModel(modelo);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoVenta;
    private javax.swing.JButton btnAceptarNuevoProd;
    private javax.swing.JButton btnCancelarNuevoProd;
    private javax.swing.JComboBox<String> cbSituación;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTable tablaProv;
    private javax.swing.JTextField txfdCodigo;
    private javax.swing.JTextField txfdDescripcion;
    private org.jdesktop.swingx.JXTextField txfdPesoEnvase;
    private org.jdesktop.swingx.JXTextField txfdPrecioCosto;
    private org.jdesktop.swingx.JXTextField txfdPrecioVenta;
    private org.jdesktop.swingx.JXTextField txfdStockInicial;
    private org.jdesktop.swingx.JXTextField txfdStockMinimo;
    // End of variables declaration//GEN-END:variables
}
