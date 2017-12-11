package Vista;

import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.Producto;
import Modelo.Proveedor;
import Validacion.Validar;
import java.awt.Dimension;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JOptionPane;

public class ventanaEditarProd extends javax.swing.JFrame {
    ProveedorDAO prDAO = new ProveedorDAO();
    ProductoDAO pDAO = new ProductoDAO();
    Validar validar = new Validar();
    DefaultTableModel modelo;
    TableColumnModel tcm;
    
    public static int id_recibido;
    
    List<JCheckBox> checkProv = new ArrayList<>();

    public ventanaEditarProd() 
    {
        initComponents();

        this.setLocationRelativeTo(null);     //centra la ventana  

        this.setMinimumSize(new Dimension(390, 590));  //al minimizar la ventana no permite que sea mas chico que esa medida

        this.setPreferredSize(new Dimension(390, 590));    //al minimizar la ventana aparece con esa medida

        this.setResizable(false);   //No permite modificar el tamaño de la ventana

        labIdSelec.setVisible(false);   //label que contiene el id
        txfdEditarPesoEnvase.setEnabled(false);

        Producto elProd = pDAO.buscarPorId(id_recibido);

        if (elProd.isPorPeso() == true) 
        {
            rbPeso.setSelected(true);
            rbUnidad.setSelected(false);
        } 
        else 
        {
            rbUnidad.setSelected(true);
            rbPeso.setSelected(false);
        }

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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfdEditarCodigo = new javax.swing.JTextField();
        txfdEditarDescripcion = new javax.swing.JTextField();
        txfdEditarPrecioCosto = new javax.swing.JTextField();
        txfdEditarPrecioVenta = new javax.swing.JTextField();
        txfdEditarStockMinimo = new javax.swing.JTextField();
        txfdEditarPesoEnvase = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        labIdSelec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbUnidad = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
        panelProveedor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbSituacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar producto");
        setPreferredSize(new java.awt.Dimension(390, 590));

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio costo:");

        jLabel4.setText("Precio venta:");

        jLabel7.setText("Stock mínimo:");

        jLabel9.setText("Peso del envase (gramos):");

        jLabel8.setText("Estado:");

        txfdEditarPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioCostoKeyTyped(evt);
            }
        });

        txfdEditarPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPrecioVentaKeyTyped(evt);
            }
        });

        txfdEditarStockMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarStockMinimoKeyTyped(evt);
            }
        });

        txfdEditarPesoEnvase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarPesoEnvaseKeyTyped(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));

        labIdSelec.setText("ID_Prod");

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

        jLabel6.setText("Proveedor/es:");

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
                .addContainerGap()
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelProveedorLayout = new javax.swing.GroupLayout(panelProveedor);
        panelProveedor.setLayout(panelProveedorLayout);
        panelProveedorLayout.setHorizontalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelProveedorLayout.setVerticalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
        );

        jLabel10.setText("Situación:");

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Suspendido", "Oferta" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarCodigo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarPrecioVenta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labIdSelec)
                        .addGap(62, 62, 62))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbUnidad)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbPeso))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfdEditarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfdEditarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfdEditarPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIdSelec))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbUnidad)
                    .addComponent(rbPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        Producto prod = new Producto();

        if (!(txfdEditarCodigo.getText().equals("") || txfdEditarCodigo.getText() == null)
                && !(txfdEditarDescripcion.getText().equals("") || txfdEditarDescripcion.getText() == null)
                && (rbPeso.isSelected() || rbUnidad.isSelected())) {
            if (rbPeso.isSelected() && ((txfdEditarPesoEnvase.getText().equals("") || txfdEditarPesoEnvase.getText() == null))) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar completar los campos obligatorios");
            } else {

                prod.setCodigo(txfdEditarCodigo.getText().toUpperCase());
                prod.setDescripcion(txfdEditarDescripcion.getText().toUpperCase());
                if (validar.validarPrecio(txfdEditarPrecioCosto.getText())) {
                    prod.setPrecioCosto(Double.parseDouble(txfdEditarPrecioCosto.getText()));
                } else {
                    JOptionPane.showMessageDialog(null, "Utilice punto en el campo Precio costo");
                }
                if (validar.validarPrecio(txfdEditarPrecioVenta.getText())) {
                    prod.setPrecioVenta(Double.parseDouble(txfdEditarPrecioVenta.getText()));
                } else {
                    JOptionPane.showMessageDialog(null, "Utilice punto en el campo Precio venta");
                }

                prod.setStockMinimo(Integer.parseInt(txfdEditarStockMinimo.getText()));

                if (rbPeso.isSelected()) {
                    prod.setPorPeso(true);
                    prod.setPesoEnvase(Integer.parseInt(txfdEditarPesoEnvase.getText()));
                } else {
                    prod.setPorPeso(false);
                    prod.setPesoEnvase(0);
                }

                if (cbEstado.getSelectedItem().equals("Habilitado")) {
                    prod.setEstado(true);
                } else {
                    prod.setEstado(false);
                }

                if (cbSituacion.getSelectedItem().equals("Ninguno")) {
                    prod.setSuspendido(false);
                    prod.setOferta(false);
                } else {
                    if (cbSituacion.getSelectedItem().equals("Oferta")) {
                        prod.setOferta(true);
                        prod.setSuspendido(false);
                    } else {
                        prod.setSuspendido(true);
                        prod.setOferta(false);
                    }
                }

                boolean alMenosUnCheck = false;

                for (JCheckBox c : checkProv) {
                    if (c.isSelected()) {
                        prod.addProveedor(prDAO.buscarPorCuitNombre(c.getText(), "Habilitados").get(0));
                        alMenosUnCheck = true;
                    }
                }
                if (alMenosUnCheck) {
                    pDAO.modificar(prod, id_recibido);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un proveedor");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }


    }//GEN-LAST:event_btnAceptarEditarActionPerformed

    private void txfdEditarPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioCostoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')
                && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)
                && (c != '.' || txfdEditarPrecioCosto.getText().contains("."))) {
            evt.consume();
        }

    }//GEN-LAST:event_txfdEditarPrecioCostoKeyTyped

    private void txfdEditarPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPrecioVentaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')
                && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)
                && (c != '.' || txfdEditarPrecioVenta.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarPrecioVentaKeyTyped

    private void txfdEditarStockMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarStockMinimoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarStockMinimoKeyTyped

    private void txfdEditarPesoEnvaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarPesoEnvaseKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarPesoEnvaseKeyTyped

    private void rbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnidadActionPerformed
        if (rbUnidad.isSelected()) {
            txfdEditarPesoEnvase.setEnabled(false);
        } else {
            txfdEditarPesoEnvase.setEnabled(true);
        }
    }//GEN-LAST:event_rbUnidadActionPerformed

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        if (rbPeso.isSelected()) {
            txfdEditarPesoEnvase.setEnabled(true);
        } else {
            txfdEditarPesoEnvase.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesoActionPerformed

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
        Producto elProd = pDAO.buscarPorId(id_recibido);

        //MOSTRAMOS LOS DATOS GUARDADOS DEL PRODUCTO SELECCIONADO. PARA LUEGO PODER MODIFICAR
        txfdEditarCodigo.setText(String.valueOf(elProd.getCodigo()));
        txfdEditarDescripcion.setText(String.valueOf(elProd.getDescripcion()));
        txfdEditarPrecioCosto.setText(String.valueOf(elProd.getPrecioCosto()));
        txfdEditarPrecioVenta.setText(String.valueOf(elProd.getPrecioVenta()));
        txfdEditarStockMinimo.setText(String.valueOf(elProd.getStockMinimo()));
        txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));

        if (elProd.isEstado()) 
        {
            cbEstado.setSelectedItem("Habilitado");
        } 
        else 
        {
            cbEstado.setSelectedItem("Deshabilitado");
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
    public static javax.swing.JLabel labIdSelec;
    private javax.swing.JPanel panelProveedor;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JRadioButton rbUnidad;
    private javax.swing.JTextField txfdEditarCodigo;
    private javax.swing.JTextField txfdEditarDescripcion;
    private javax.swing.JTextField txfdEditarPesoEnvase;
    private javax.swing.JTextField txfdEditarPrecioCosto;
    private javax.swing.JTextField txfdEditarPrecioVenta;
    private javax.swing.JTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables
}
