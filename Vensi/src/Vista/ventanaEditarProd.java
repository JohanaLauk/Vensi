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
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JOptionPane;

public class ventanaEditarProd extends javax.swing.JFrame 
{
    ProveedorDAO prDAO = new ProveedorDAO();
    ProductoDAO pDAO = new ProductoDAO();
    Validar validar = new Validar();
    DefaultTableModel modelo;
    TableColumnModel tcm;
    
    Redondear r = new Redondear();   
    
    public static int id_recibido;
    Producto elProd = null;
    String estado = null;
    String situacion = "Ninguno";
    
    int stockU;    //variable usada en mostrarProdSelec()
    List<JCheckBox> checkProv = new ArrayList<>();
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");

    public ventanaEditarProd() 
    {
        initComponents();

        this.setLocationRelativeTo(null);     //centra la ventana  

        this.setMinimumSize(new Dimension(590, 450));  //al minimizar la ventana no permite que sea mas chico que esa medida

        this.setPreferredSize(new Dimension(590, 450));    //al minimizar la ventana aparece con esa medida

        this.setResizable(false);   //No permite modificar el tamaño de la ventana
        
        elProd = pDAO.buscarPorId(id_recibido);

        mostrarProdSelec();
        llenarCheckBoxProv();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
        bgroupProv = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfdEditarCodigo = new javax.swing.JTextField();
        txfdEditarDescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txfdEditarPesoEnvase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        panelProveedor = new javax.swing.JPanel();
        txfdEditarPrecioCosto = new org.jdesktop.swingx.JXTextField();
        txfdEditarPrecioVenta = new org.jdesktop.swingx.JXTextField();
        txfdEditarStockMinimo = new org.jdesktop.swingx.JXTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar producto");
        setPreferredSize(new java.awt.Dimension(590, 450));

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio costo:");

        jLabel4.setText("Precio venta:");

        jLabel7.setText("Stock mínimo:");

        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        jLabel9.setText("Peso del envase:");

        txfdEditarPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPesoEnvaseKeyTyped(evt);
            }
        });

        jLabel8.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Situación:");

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Oferta", "Suspendido" }));
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        jLabel6.setText("Proveedor/es:");

        javax.swing.GroupLayout panelProveedorLayout = new javax.swing.GroupLayout(panelProveedor);
        panelProveedor.setLayout(panelProveedorLayout);
        panelProveedorLayout.setHorizontalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        panelProveedorLayout.setVerticalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        txfdEditarPrecioCosto.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdEditarPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioCostoKeyTyped(evt);
            }
        });

        txfdEditarPrecioVenta.setPrompt("Ej: \"00\" o \"00.00\"");
        txfdEditarPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioVentaKeyTyped(evt);
            }
        });

        txfdEditarStockMinimo.setPrompt("Ingrese la cantidad en unidades");
        txfdEditarStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarStockMinimoKeyTyped(evt);
            }
        });

        jLabel11.setText("gramos.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txfdEditarDescripcion)
                    .addComponent(txfdEditarCodigo)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSituacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(panelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbUnidad)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbPeso))))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbUnidad)
                            .addComponent(rbPeso))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfdEditarStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarStockMinimoKeyTyped

    private void txfdEditarPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.')) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarPrecioVentaKeyTyped

    private void txfdEditarPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '.')) 
        {
            evt.consume();
        }
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

    private void txfdEditarPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarPesoEnvaseKeyTyped

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        if (rbPeso.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(true);
            txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));
        }
        else
        {
            txfdEditarPesoEnvase.setEnabled(false);
            txfdEditarPesoEnvase.setText("0");
        }
    }//GEN-LAST:event_rbPesoActionPerformed

    private void rbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnidadActionPerformed
        if (rbUnidad.isSelected())
        {
            txfdEditarPesoEnvase.setEnabled(false);
            txfdEditarPesoEnvase.setText("0");
        }
        else
        {
            txfdEditarPesoEnvase.setEnabled(true);
            txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));
        }
    }//GEN-LAST:event_rbUnidadActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        Producto prodEditar = new Producto();
        String codigoInput = txfdEditarCodigo.getText();
        boolean listo = false;        

        if (!codigoInput.equals("") && !txfdEditarDescripcion.getText().equals("") && (rbPeso.isSelected() || rbUnidad.isSelected()))
        {   //Ingresó CODIGO, DESCRIPCION y marcó el TIPO DE VENTA                        
            Producto prodRepetido = pDAO.buscarPorCodigo(codigoInput);
            
            if (prodRepetido == null || elProd.getCodigo().equals(codigoInput))
            {
                if (txfdEditarPrecioCosto.getText().equals("") || txfdEditarPrecioVenta.getText().equals(""))
                {
                    prodEditar.setPrecioCosto(0.00);
                    prodEditar.setPrecioVenta(0.00);
                    listo = true;
                }
                else
                {
                    if (validar.validarPrecio(txfdEditarPrecioCosto.getText()) && validar.validarPrecio(txfdEditarPrecioVenta.getText()))
                    {
                        double precioC = Double.parseDouble(txfdEditarPrecioCosto.getText());
                        prodEditar.setPrecioCosto(precioC); //r.RedondearCentavos(precioC));

                        double precioV = Double.parseDouble(txfdEditarPrecioVenta.getText());
                        prodEditar.setPrecioVenta(precioV); //r.RedondearCentavos(precioV));

                        prodEditar.setCodigo(txfdEditarCodigo.getText().toUpperCase());
                        prodEditar.setDescripcion(txfdEditarDescripcion.getText().toUpperCase());

                        if (rbPeso.isSelected())    //TIPO DE VENTA por PESO
                        {
                            if (txfdEditarPesoEnvase.getText().equals(""))   //marcó PESO pero no ingresó el PESO DEL ENVASE
                            {
                                JOptionPane.showMessageDialog(null, "Debe ingresar el PESO DEL ENVASE (en gramos).");
                                listo = false;
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
                                    int total = Integer.parseInt(stockMin) * pesoEnv;
                                    prodEditar.setStockMinimo(total);
                                }               

                                int total2 = stockU * pesoEnv;  //convierto la unidad en gramos
                                prodEditar.setStock(total2);  //guardo el nuevo stock en gramos
                                
                                double precioKilo = (1000 * precioV) / pesoEnv;
                                r.RedondearCentavos(precioKilo);
                                prodEditar.setPrecioVentaXKilo(precioKilo);

                                listo = true;
                            }
                        }
                        else    //TIPO DE VENTA por UNIDAD
                        {
                            prodEditar.setStock(stockU);
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

                            listo = true;
                        }


                        if (cbEstado.getSelectedItem().equals("Habilitado"))
                        {
                            prodEditar.setEstado(true);
                        }
                        else
                        {
                            prodEditar.setEstado(false);
                        }

                        if (cbSituacion.getSelectedItem().equals("Ninguno"))
                        {
                            prodEditar.setSuspendido(false);
                            prodEditar.setOferta(false);
                        }
                        else
                        {
                            if (cbSituacion.getSelectedItem().equals("Oferta"))
                            {
                                prodEditar.setOferta(true);
                                prodEditar.setSuspendido(false);
                            }
                            else //suspendido
                            {
                                prodEditar.setSuspendido(true);
                                prodEditar.setOferta(false);
                            }
                        }

                        boolean alMenosUnCheck = false;

                        for (JCheckBox c : checkProv)
                        {
                            if (c.isSelected())
                            {
                                prodEditar.addProveedor(prDAO.buscarPorCuitNombre(c.getText(), "Habilitados").get(0));
                                alMenosUnCheck = true;
                            }
                        }
                        if (alMenosUnCheck)
                        {
                            if (listo)
                            {
                                pDAO.modificar(prodEditar, id_recibido);
                                dispose();
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un proveedor.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Utilice el siguiente formato para los precios \"00.00\"");
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
        txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));

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
    
    private void llenarCheckBoxProv() 
    {
        List<Proveedor> lista = prDAO.listar("Habilitados");
        Set<Proveedor> listaProvDelProducto = pDAO.buscarPorId(id_recibido).getProveedor();       
        int altura = 0;
        for (Proveedor p : lista) 
        {
            JCheckBox c = new JCheckBox(p.getRazonSocial());
            c.setSize(500, 20);
            c.setLocation(0, altura);
            c.setVisible(true);
            
            for(Proveedor pr : listaProvDelProducto)
            {
                if(p.getId() == pr.getId())
                {
                    c.setSelected(true);
                }
            }
            checkProv.add(c);
            this.panelProveedor.add(c);
            this.validate();
            altura += 20;
        }
        this.panelProveedor.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelProveedor;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTextField txfdEditarCodigo;
    private javax.swing.JTextField txfdEditarDescripcion;
    private javax.swing.JTextField txfdEditarPesoEnvase;
    private org.jdesktop.swingx.JXTextField txfdEditarPrecioCosto;
    private org.jdesktop.swingx.JXTextField txfdEditarPrecioVenta;
    private org.jdesktop.swingx.JXTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables
}
