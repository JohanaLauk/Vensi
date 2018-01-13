package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.*;
import Utils.Redondear;
import Utils.Validar;
import java.awt.Dimension;
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
        llenarCheckBoxProv();             
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoVenta = new javax.swing.ButtonGroup();
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
        panelProveedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo producto");

        jLabel1.setText("Código");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio venta:");

        jLabel4.setText("Stock mínimo:");

        jLabel6.setText("Peso del envase (gramos):");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarNuevoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
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

        panelProveedor.setAutoscrolls(true);
        panelProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelProveedor.setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfdPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txfdPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txfdStockInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txfdCodigo)
                    .addComponent(jLabel1)
                    .addComponent(txfdDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txfdStockMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cbSituación, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(rbUnidad)
                            .addGap(18, 18, 18)
                            .addComponent(rbPeso)))
                    .addComponent(jLabel8)
                    .addComponent(panelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(txfdStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbUnidad)
                            .addComponent(rbPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txfdPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbSituación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(198, 198, 198)))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfdPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') &&
            (c != java.awt.event.KeyEvent.VK_BACK_SPACE) &&
            (c != '.'))
        evt.consume();
    }//GEN-LAST:event_txfdPrecioCostoKeyTyped

    private void txfdStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txfdStockMinimoKeyTyped

    private void txfdStockInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdStockInicialKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txfdStockInicialKeyTyped

    private void txfdPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') &&
            (c != java.awt.event.KeyEvent.VK_BACK_SPACE) &&
            (c != '.'))
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

        if (!(txfdStockInicial.getText().equals("") || txfdStockInicial.getText() == null)
            && !(txfdCodigo.getText().equals("") || txfdCodigo.getText() == null)
            && !(txfdDescripcion.getText().equals("") || txfdDescripcion.getText() == null)
            && (rbPeso.isSelected() || rbUnidad.isSelected()))
        {
            if (rbPeso.isSelected() && ((txfdPesoEnvase.getText().equals("") || txfdPesoEnvase.getText() == null)))
            {
                JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
            }
            else
            {
                unProd.setCodigo(txfdCodigo.getText().toUpperCase());
                unProd.setDescripcion(txfdDescripcion.getText().toUpperCase());

                if (txfdPrecioCosto.getText().equals("") || txfdPrecioCosto.getText() == null)
                {
                    unProd.setPrecioCosto(0.00);
                }
                else
                {
                    if (validar.validarPrecio(txfdPrecioCosto.getText()))
                    {
                        double precioC = Double.parseDouble(txfdPrecioCosto.getText());
                        unProd.setPrecioCosto(r.RedondearCentavos(precioC));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Utilice punto en el campo Precio costo");
                        unProd.setPrecioCosto(0.00);
                    }
                }

                if (txfdPrecioVenta.getText().equals("") || txfdPrecioVenta.getText() == null)
                {
                    unProd.setPrecioVenta(0.00);
                }
                else
                {
                    if (validar.validarPrecio(txfdPrecioVenta.getText()))
                    {
                        double precioV = Double.parseDouble(txfdPrecioVenta.getText());
                        unProd.setPrecioVenta(r.RedondearCentavos(precioV));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Utilice punto en el campo Precio venta");
                        unProd.setPrecioVenta(0.00);
                    }
                }

                if (rbPeso.isSelected())
                {
                    unProd.setPorPeso(true);    //por peso

                    int pesoEnv = Integer.parseInt(txfdPesoEnvase.getText());
                    unProd.setPesoEnvase(pesoEnv);  //gramos

                    int stockMin = Integer.parseInt(txfdStockMinimo.getText());  //unidades
                    int total = stockMin * pesoEnv;    //convierto las unidades en gramos
                    unProd.setStockMinimo(total);   //guardo en gramos

                    int stock = Integer.parseInt(txfdStockInicial.getText());   //unidades
                    int total2 = stock * pesoEnv;   //convierto las unidades en gramos
                    unProd.setStock(total2);   //guardo en gramos

                    double precioV = Double.parseDouble(txfdPrecioVenta.getText());
                    precioV = r.RedondearCentavos(precioV);
                    double precioKilo = (1000 * precioV) / pesoEnv;
                    unProd.setPrecioVentaXKilo(r.RedondearCentavos(precioKilo));
                }
                else
                {
                    unProd.setPorPeso(false);   //por unidad
                    unProd.setPesoEnvase(0);
                    unProd.setStockMinimo(Integer.parseInt(txfdStockMinimo.getText()));
                    unProd.setStock(Integer.parseInt(txfdStockInicial.getText()));
                }

                boolean alMenosUnCheck = false;

                for (JCheckBox c : checkProv)
                {
                    if (c.isSelected())
                    {
                        unProd.addProveedor(prDAO.buscarPorCuitNombre(c.getText(), "Habilitados").get(0));
                        alMenosUnCheck = true;
                    }
                }

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
                    else
                    {
                        unProd.setOferta(false);
                        unProd.setSuspendido(true);
                    }
                }

                if (alMenosUnCheck)
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
        if(c < '0' || c > '9') evt.consume();
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
    
    private void llenarCheckBoxProv() 
    {        
        List<Proveedor> lista = prDAO.listar("Habilitados");  
        int altura = 0;      
        
        for (Proveedor p : lista) 
        {
            JCheckBox c = new JCheckBox(p.getRazonSocial());
            c.setSize(500, 20);
            c.setLocation(0, altura);
            c.setVisible(true);
            checkProv.add(c);   //lista de checkBox con los Prov habilitados
            this.panelProveedor.add(c);  //panel que contiene los checkBox de Prov
            this.validate();    //que es this? que componente?
            altura += 20;
        }       
        
        this.panelProveedor.setPreferredSize(new Dimension(220,600));
        //this.panelProveedor.setAutoscrolls(true);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(300,180,240,200);
        scrollPane.setViewportView(this.panelProveedor);
        this.add(scrollPane);   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoVenta;
    private javax.swing.JButton btnAceptarNuevoProd;
    private javax.swing.JButton btnCancelarNuevoProd;
    private javax.swing.JComboBox<String> cbSituación;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txfdCodigo;
    private javax.swing.JTextField txfdDescripcion;
    private javax.swing.JTextField txfdPesoEnvase;
    private org.jdesktop.swingx.JXTextField txfdPrecioCosto;
    private org.jdesktop.swingx.JXTextField txfdPrecioVenta;
    private org.jdesktop.swingx.JXTextField txfdStockInicial;
    private org.jdesktop.swingx.JXTextField txfdStockMinimo;
    // End of variables declaration//GEN-END:variables
}
