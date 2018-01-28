package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.*;
import Utils.Redondear;
import Utils.Validar;
import java.util.*;
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
    
            
    public ventanaNuevoProd() 
    {
        initComponents();
                
        this.setLocationRelativeTo(null);     //centra la ventana        
        //this.setPreferredSize(new Dimension(600, 200));    //al minimizar la ventana aparece con esa medida         
        //this.setUndecorated(true);  //quita los bordes de la ventana, incluyendo los botones
        
        txfdPesoEnvase.setEnabled(false);           
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfdCodigo = new javax.swing.JTextField();
        txfdDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfdPesoEnvase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarNuevoProd = new javax.swing.JButton();
        btnCancelarNuevoProd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbSituación = new javax.swing.JComboBox<>();
        txfdPrecioVenta = new org.jdesktop.swingx.JXTextField();
        txfdStockInicial = new org.jdesktop.swingx.JXTextField();
        txfdStockMinimo = new org.jdesktop.swingx.JXTextField();
        txfdPrecioCosto = new org.jdesktop.swingx.JXTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo producto");

        jLabel1.setText("Código");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio venta:");

        jLabel4.setText("Stock mínimo:");

        jLabel6.setText("Peso del envase:");

        txfdPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPesoEnvaseKeyTyped(evt);
            }
        });

        jLabel7.setText("Precio costo:");

        jLabel5.setText("Se vende por:");

        bgTipoVenta.add(rbUnidad);
        rbUnidad.setText("Unidad");
        rbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnidadActionPerformed(evt);
            }
        });

        bgTipoVenta.add(rbPeso);
        rbPeso.setText("Peso");
        rbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesoActionPerformed(evt);
            }
        });

        jLabel8.setText("Seleccione el/los proveedor/es:");

        btnAceptarNuevoProd.setText("Aceptar");
        btnAceptarNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNuevoProdActionPerformed(evt);
            }
        });

        btnCancelarNuevoProd.setText("Cancelar");
        btnCancelarNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnCancelarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnAceptarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAceptarNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setText("Stock inicial:");

        jLabel10.setText("Situación:");

        cbSituación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Oferta", "Suspendido" }));
        cbSituación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituaciónActionPerformed(evt);
            }
        });

        txfdPrecioVenta.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioVentaKeyTyped(evt);
            }
        });

        txfdStockInicial.setPrompt("Ingrese la cantidad en unidades");
        txfdStockInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdStockInicialKeyTyped(evt);
            }
        });

        txfdStockMinimo.setPrompt("Ingrese la cantidad en unidades");
        txfdStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdStockMinimoKeyTyped(evt);
            }
        });

        txfdPrecioCosto.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPrecioCostoKeyTyped(evt);
            }
        });

        jLabel11.setText("gramos.");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfdPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdStockInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txfdCodigo)
                    .addComponent(jLabel1)
                    .addComponent(txfdDescripcion)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txfdStockMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rbUnidad)
                        .addGap(18, 18, 18)
                        .addComponent(rbPeso))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(cbSituación, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbUnidad)
                            .addComponent(rbPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbSituación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(txfdStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfdPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))
        {
            evt.consume();
        }        
    }//GEN-LAST:event_txfdPrecioCostoKeyTyped

    private void txfdStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdStockMinimoKeyTyped

    private void txfdStockInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockInicialKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdStockInicialKeyTyped

    private void txfdPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.'))
        {
            evt.consume();
        }
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
                                    r.RedondearCentavos(precioKilo);
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

                        for(int i = 0; i < tablaProv.getModel().getRowCount(); i++){
                            boolean seleccionado = Boolean.parseBoolean(tablaProv.getValueAt(i, 1).toString());
                            if(seleccionado){
                                int idSelec = Integer.parseInt(tablaProv.getValueAt(i, 2).toString());
                                unProd.addProveedor(prDAO.buscarPorId(idSelec));
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

    private void txfdPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
        {
            evt.consume();
        }
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
        List<Proveedor> lista = prDAO.listar("Habilitados");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTable tablaProv;
    private javax.swing.JTextField txfdCodigo;
    private javax.swing.JTextField txfdDescripcion;
    private javax.swing.JTextField txfdPesoEnvase;
    private org.jdesktop.swingx.JXTextField txfdPrecioCosto;
    private org.jdesktop.swingx.JXTextField txfdPrecioVenta;
    private org.jdesktop.swingx.JXTextField txfdStockInicial;
    private org.jdesktop.swingx.JXTextField txfdStockMinimo;
    // End of variables declaration//GEN-END:variables
}
