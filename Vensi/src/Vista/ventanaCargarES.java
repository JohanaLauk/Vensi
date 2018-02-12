package Vista;

import DAO.*;
import Modelo.*;
import Utils.Redondear;
import Utils.Validar;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaCargarES extends javax.swing.JFrame 
{
    Validar validar = new Validar();
    ItemVentaDAO itDAO = new ItemVentaDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    TurnoDAO tDAO = new TurnoDAO();
    ProductoDAO pDAO = new ProductoDAO();
    DefaultListModel modeloList;
    
    List<ItemVenta> listaIV = null;
    Turno turnoActual = null;
    String nombre = "Ninguno";
    
    Redondear r = new Redondear(); 
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    ImageIcon icono;
    
    public ventanaCargarES() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
                        
        habDeshabComponentes(nombre);          
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelES = new javax.swing.JPanel();
        cbTipoES = new javax.swing.JComboBox<>();
        labTipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txfdMonto = new javax.swing.JTextField();
        labTituloES = new javax.swing.JLabel();
        panelidentificarProd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInfoProdAnular = new javax.swing.JList<>();
        btnAnular = new javax.swing.JButton();
        labTituloPanelAnularProd = new javax.swing.JLabel();
        txfdCantProdAnular = new org.jdesktop.swingx.JXTextField();
        txfdCodNomProdAnular = new org.jdesktop.swingx.JXTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar un movimiento de caja");
        setPreferredSize(new java.awt.Dimension(780, 440));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(0, 0, 0));

        panelES.setBackground(new java.awt.Color(0, 133, 155));
        panelES.setForeground(new java.awt.Color(255, 255, 255));

        cbTipoES.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbTipoES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Apertura de caja", "Retiro", "Anulación de venta", "Sueldo" }));
        cbTipoES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoES.setNextFocusableComponent(txfdMonto);
        cbTipoES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoESActionPerformed(evt);
            }
        });

        labTipo.setBackground(new java.awt.Color(0, 0, 0));
        labTipo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labTipo.setForeground(new java.awt.Color(255, 255, 255));
        labTipo.setText("Tipo:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción:");

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(5);
        btnCancelar.setNextFocusableComponent(btnConfirmar);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(153, 255, 153));
        btnConfirmar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/si_50.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConfirmar.setIconTextGap(5);
        btnConfirmar.setNextFocusableComponent(txfdCodNomProdAnular);
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

        txAreaDescripcion.setEditable(false);
        txAreaDescripcion.setColumns(20);
        txAreaDescripcion.setRows(5);
        txAreaDescripcion.setNextFocusableComponent(btnCancelar);
        jScrollPane2.setViewportView(txAreaDescripcion);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monto:");

        txfdMonto.setNextFocusableComponent(txAreaDescripcion);
        txfdMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdMontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdMontoKeyTyped(evt);
            }
        });

        labTituloES.setBackground(new java.awt.Color(0, 0, 0));
        labTituloES.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        labTituloES.setForeground(new java.awt.Color(255, 255, 255));
        labTituloES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloES.setText("CARGA DE ENTRADA/SALIDA");

        javax.swing.GroupLayout panelESLayout = new javax.swing.GroupLayout(panelES);
        panelES.setLayout(panelESLayout);
        panelESLayout.setHorizontalGroup(
            panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelESLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labTituloES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGroup(panelESLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelESLayout.createSequentialGroup()
                        .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(labTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfdMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoES, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelESLayout.setVerticalGroup(
            panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelESLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labTituloES, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoES, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelidentificarProd.setBackground(new java.awt.Color(0, 133, 155));
        panelidentificarProd.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busque el producto:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingerese la cantidad:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacíon del producto:");

        listaInfoProdAnular.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        listaInfoProdAnular.setForeground(new java.awt.Color(255, 0, 0));
        listaInfoProdAnular.setNextFocusableComponent(btnAnular);
        jScrollPane1.setViewportView(listaInfoProdAnular);

        btnAnular.setBackground(new java.awt.Color(204, 204, 255));
        btnAnular.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/anular_50.png"))); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnular.setFocusPainted(false);
        btnAnular.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAnular.setIconTextGap(40);
        btnAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnularMouseExited(evt);
            }
        });
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        labTituloPanelAnularProd.setBackground(new java.awt.Color(0, 0, 0));
        labTituloPanelAnularProd.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        labTituloPanelAnularProd.setForeground(new java.awt.Color(255, 255, 255));
        labTituloPanelAnularProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloPanelAnularProd.setText("ANULACIÓN DE PRODUCTO");
        labTituloPanelAnularProd.setToolTipText("");

        txfdCantProdAnular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCantProdAnular.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCantProdAnular.setNextFocusableComponent(listaInfoProdAnular);
        txfdCantProdAnular.setPrompt("unidad / gramos");
        txfdCantProdAnular.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdCantProdAnular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdCantProdAnularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantProdAnularKeyTyped(evt);
            }
        });

        txfdCodNomProdAnular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCodNomProdAnular.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCodNomProdAnular.setNextFocusableComponent(txfdCantProdAnular);
        txfdCodNomProdAnular.setPrompt("por código o descripción");
        txfdCodNomProdAnular.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdCodNomProdAnular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdCodNomProdAnularKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelidentificarProdLayout = new javax.swing.GroupLayout(panelidentificarProd);
        panelidentificarProd.setLayout(panelidentificarProdLayout);
        panelidentificarProdLayout.setHorizontalGroup(
            panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelidentificarProdLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTituloPanelAnularProd, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelidentificarProdLayout.createSequentialGroup()
                                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfdCodNomProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfdCantProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelidentificarProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        panelidentificarProdLayout.setVerticalGroup(
            panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelidentificarProdLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labTituloPanelAnularProd)
                .addGap(27, 27, 27)
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdCodNomProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdCantProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelidentificarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelidentificarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cbTipoESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoESActionPerformed
        if (cbTipoES.getSelectedItem().equals("Ninguno"))
        {
            nombre = "Ninguno";
        }
        if (cbTipoES.getSelectedItem().equals("Apertura de caja"))
        {
            nombre = "Apertura de caja";
        }       
        if (cbTipoES.getSelectedItem().equals("Retiro"))
        {
            nombre = "Retiro";
        }
        if (cbTipoES.getSelectedItem().equals("Anulación de venta"))
        {
            nombre = "Anulación de venta";
        }
        if (cbTipoES.getSelectedItem().equals("Sueldo"))
        {
            nombre = "Sueldo";
        }        
        
        habDeshabComponentes(nombre);
    }//GEN-LAST:event_cbTipoESActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        EntradaSalida unaES = new EntradaSalida();
        Turno turnoActual = tDAO.obtenerUltimo();
        
        if (nombre.equals("Ninguno"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar el tipo de entrada o salida");
        }
        else
        {
            if (nombre.equals("Apertura de caja"))
            {
                unaES.setTipo(true);    //entrada
            }
            else
            {
                unaES.setTipo(false);   //salida                             
            }            
        }
        
        String descripcion = txAreaDescripcion.getText();        
        
        if (validar.validarPrecio(txfdMonto.getText()))
        {
            unaES.setMonto(Double.parseDouble(txfdMonto.getText()));        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Utilice punto en el campo Monto");
        }
        
        unaES.setNombre(nombre.toUpperCase());       
        
        if (descripcion.equals(""))
        {
            if (nombre.equals("Apertura de caja"))
            {
                unaES.setDescripcion(null);
            }
            else
            {
                unaES.setDescripcion("Sin descripción".toUpperCase());
            }            
        }
        else
        {
            unaES.setDescripcion(descripcion.toUpperCase());
        }        
        
        unaES.setCantProd(0);       
        unaES.setHora(new Date());       
        unaES.setTurno(turnoActual);
        
        esDAO.alta(unaES);
        
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        int cantInput = Integer.parseInt(txfdCantProdAnular.getText());
        double cantDouble = Double.parseDouble(txfdCantProdAnular.getText());
        
        boolean esta = false;
        Turno turnoActual = tDAO.obtenerUltimo();
        
        List<ItemVenta> listaVentas = itDAO.listar(turnoActual.getId());
        ItemVenta item = null;
        
        for (ItemVenta v : listaVentas) //lista de ventas del turno que esta abierto
        {
            for (ItemVenta i : listaIV) //contiene 1 sólo prod
            {
                if (v.getProducto().getId() == i.getProducto().getId()) //El prod buscado se encuentra en las ventas. 
                {
                    esta = true; 
                    item = v;
                }   
            }
        } 
        if (esta)
        {
            if (item.getCantidad() >= cantInput)    //si la cantidad ingresada es menor a la cantidad que hay vendido...
            {                
                pDAO.sumarStock(item.getProducto().getId(), cantInput);   //actualizo el stock del producto
                item.setCantidad(item.getCantidad() - cantInput);  //resto la cantidad del itemVenta
                
                if (item.getProducto().isPorPeso())
                {
                    double cantKilo = cantDouble / 1000; 

                    double precioRestar = cantKilo * item.getProducto().getPrecioVentaXKilo();
                    precioRestar = r.RedondearAIntArriba(precioRestar); 
                    
                    item.setMonto(item.getMonto() - precioRestar);
                }
                else
                {
                    item.setMonto(item.getMonto() - (item.getProducto().getPrecioVenta() * cantInput));
                }
                
                EntradaSalida unES = new EntradaSalida();

                unES.setNombre("Anulación de venta".toUpperCase());
                unES.setDescripcion(item.getProducto().getDescripcion().toUpperCase());
                unES.setCantProd(cantInput);                        

                if (item.getProducto().isPorPeso())
                {
                    double cantKilo = cantDouble / 1000; 

                    double precioRestar = cantKilo * item.getProducto().getPrecioVentaXKilo();
                    precioRestar = r.RedondearAIntArriba(precioRestar); 
                    
                    unES.setMonto(precioRestar);
                }
                else
                {
                    unES.setMonto(item.getProducto().getPrecioVenta() * cantInput);
                }

                unES.setTipo(false);
                unES.setHora(new Date());
                
                unES.setTurno(turnoActual);

                esDAO.alta(unES);
                itDAO.modificar(item, item.getId());

                JOptionPane.showMessageDialog(null, "Venta anulada.");
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada debe ser menor o igual a la cantidad que se ha vendido.");
            }  
            
            if (item.getCantidad() == 0)
            {                
                itDAO.borrar(item.getId());     //borrar Item_venta
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se han realizado compras de este producto.");
        }      
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txfdMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdMontoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfdMontoKeyTyped

    private void txfdMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdMontoKeyReleased
        if (txfdMonto.getText().equals(""))
        {
            btnConfirmar.setEnabled(false);
        }
        else
        {
            btnConfirmar.setEnabled(true);
        }
    }//GEN-LAST:event_txfdMontoKeyReleased

    private void txfdCantProdAnularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantProdAnularKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfdCantProdAnularKeyTyped

    private void txfdCantProdAnularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCantProdAnularKeyReleased
        String cadena = txfdCantProdAnular.getText();
        
        if (cadena.equals(""))
        {
            btnAnular.setEnabled(false);
        }
        else
        {    
            if (listaIV.size() == 1)
            {
                btnAnular.setEnabled(true);
            }
            else 
            {
                btnAnular.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txfdCantProdAnularKeyReleased

    private void txfdCodNomProdAnularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCodNomProdAnularKeyReleased
        String cadena = txfdCodNomProdAnular.getText();
        turnoActual = tDAO.obtenerUltimo();
        
        if (cadena.equals(""))
        {
            llenarListBusqueda(null);            
        }
        else
        {
            listaIV = itDAO.buscar(cadena, turnoActual.getId());   //lista de productos que se vendieron segun la BUSQUEDA         
            llenarListBusqueda(listaIV); 
            
            if (listaIV.size() == 1)
            {
                if (txfdCantProdAnular.getText().equals(""))
                {
                    btnAnular.setEnabled(false);
                }
                else
                {
                    btnAnular.setEnabled(true);
                }
            }
            else 
            {
                btnAnular.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txfdCodNomProdAnularKeyReleased

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_lleno_50.png"));     
        btnCancelar.setIcon(icono); 
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"));     
        btnCancelar.setIcon(icono); 
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        if (!txfdMonto.getText().equals(""))
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/si_lleno_50.png"));
            btnConfirmar.setIcon(icono); 
        }            
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/si_50.png"));     
        btnConfirmar.setIcon(icono); 
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void btnAnularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseEntered
        String codProd = txfdCodNomProdAnular.getText();
        String cantProd = txfdCantProdAnular.getText();
        
        if (!codProd.equals("") && !cantProd.equals(""))
        {
            listaIV = itDAO.buscar(codProd, turnoActual.getId());   //lista de productos que se vendieron segun la BUSQUEDA         
        
            if (nombre.equals("Anulación de venta") && listaIV.size() == 1)
            {
                icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/anular_lleno_50.png"));     
                btnAnular.setIcon(icono); 
            }
        }            
    }//GEN-LAST:event_btnAnularMouseEntered

    private void btnAnularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/anular_50.png"));     
        btnAnular.setIcon(icono); 
    }//GEN-LAST:event_btnAnularMouseExited

    public void habDeshabComponentes(String nombre)
    {
        if (nombre.equals("Anulación de venta"))
        {
            for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
            {
                panelidentificarProd.getComponent(i).setEnabled(true);
            }
            for(int i=0 ; i < panelES.getComponents().length ; i++)  //deshabilita los 2 paneles
            {
                panelES.getComponent(i).setEnabled(false);                
            }
            
            if (!txfdCodNomProdAnular.equals("") && !txfdCantProdAnular.equals(""))
            {
                btnAnular.setEnabled(true);
            }
            else
            {
                btnAnular.setEnabled(false);
            }
            cbTipoES.setEnabled(true);
            btnCancelar.setEnabled(true);            
            txfdMonto.setText(null);           
            txAreaDescripcion.setText(null);
            labTipo.setEnabled(true);
        }
        else
        {
            if (nombre.equals("Ninguno"))
            {
                for(int i=0 ; i < panelES.getComponents().length ; i++)  //deshabilita los 2 paneles
                {                    
                    panelES.getComponent(i).setEnabled(false);                    
                }
                for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
                {
                    panelidentificarProd.getComponent(i).setEnabled(false);
                }
                
                labTituloES.setEnabled(true);
                labTipo.setEnabled(true);                
                cbTipoES.setEnabled(true);    
                btnCancelar.setEnabled(true);                
                txfdMonto.setText(null);           
                txAreaDescripcion.setText(null);
                txfdCodNomProdAnular.setText(null);
                txfdCantProdAnular.setText(null);
                                
                limpiarList();
            }
            else
            {           
                for (int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
                {
                    panelidentificarProd.getComponent(i).setEnabled(false);
                }
                for (int i=0 ; i < panelES.getComponents().length ; i++)  //deshabilita los 2 paneles
                {
                    panelES.getComponent(i).setEnabled(true);
                }
                
                btnCancelar.setEnabled(true);
                btnConfirmar.setEnabled(false);
                txAreaDescripcion.setEditable(true);
                cbTipoES.setEnabled(true);
                txfdMonto.setText(null);           
                txAreaDescripcion.setText(null);
                txfdCodNomProdAnular.setText(null);
                txfdCantProdAnular.setText(null);
                
                limpiarList();
            }
        }
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaCargarES().setVisible(true);
            }
        });
    }
    
    private void llenarListBusqueda(List<ItemVenta> listaIV) 
    {     
        modeloList = new DefaultListModel();
        
        if (listaIV == null)
        {            
            modeloList.clear();
            btnAnular.setEnabled(false);
        }
        else
        {
            for (ItemVenta x : listaIV)
            {                
                modeloList.addElement("CÓDIGO:  " + x.getProducto().getCodigo());
                modeloList.addElement("DESCRIPCIÓN:  " + x.getProducto().getDescripcion());                

                if (x.getProducto().isPorPeso())
                {
                    modeloList.addElement("TIPO DE VENTA:  Por peso");
                    modeloList.addElement("PRECIO DE VENTA:  $" + String.valueOf(formatoPrecios.format(x.getProducto().getPrecioVenta())));
                    double cantGR2 = x.getCantidad();                    
                    double cantKG = cantGR2 / 1000;
                    modeloList.addElement("CANTIDAD VENDIDOS:  " + String.valueOf(formatoKilos.format(cantKG)) + "kg");
                }
                else
                {
                    modeloList.addElement("TIPO DE VENTA:  Por unidad");                    
                    modeloList.addElement("PRECIO DE VENTA:  $" + String.valueOf(formatoPrecios.format(x.getProducto().getPrecioVenta())));
                    modeloList.addElement("CANTIDAD VENDIDOS:  " + String.valueOf(x.getCantidad()));
                }
                modeloList.addElement("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }   
        listaInfoProdAnular.setModel(modeloList);
    }
    
    public void limpiarList()
    {
        modeloList = new DefaultListModel();        
        modeloList.clear();
        listaInfoProdAnular.setModel(modeloList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbTipoES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labTipo;
    private javax.swing.JLabel labTituloES;
    private javax.swing.JLabel labTituloPanelAnularProd;
    private javax.swing.JList<String> listaInfoProdAnular;
    private javax.swing.JPanel panelES;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JPanel panelidentificarProd;
    private javax.swing.JTextArea txAreaDescripcion;
    private org.jdesktop.swingx.JXTextField txfdCantProdAnular;
    private org.jdesktop.swingx.JXTextField txfdCodNomProdAnular;
    private javax.swing.JTextField txfdMonto;
    // End of variables declaration//GEN-END:variables
}
