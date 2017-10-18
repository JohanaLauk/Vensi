package Vista;

import DAO.ProductoDAO;
import Modelo.Producto;
import java.awt.Dimension;

public class ventanaEditarProd extends javax.swing.JFrame 
{
    ProductoDAO pDAO = new ProductoDAO();
    public static int id_recibido;
    
    public ventanaEditarProd() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana  
        
        this.setMinimumSize(new Dimension(600, 400));  //al minimizar la ventana no permite que sea mas chico que esa medida
       
        this.setPreferredSize(new Dimension(600,400));    //al minimizar la ventana aparece con esa medida
        
        this.setResizable(false);   //No permite modificar el tamaño de la ventana
        
        //labIdSelec.setVisible(false);   //label que contiene el id
        encontrarProd();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfdEditarCodigo = new javax.swing.JTextField();
        txfdEditarDescripcion = new javax.swing.JTextField();
        txfdEditarPrecioCosto = new javax.swing.JTextField();
        txfdEditarPrecioVenta = new javax.swing.JTextField();
        txfdEditarPrecioVentaXPeso = new javax.swing.JTextField();
        txfdEditarStockMinimo = new javax.swing.JTextField();
        txfdEditarPesoEnvase = new javax.swing.JTextField();
        cbEditarEstado = new javax.swing.JComboBox<>();
        labIdSelec = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar producto");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio costo:");

        jLabel4.setText("Precio venta:");

        jLabel5.setText("Precio venta por kilo:");

        jLabel7.setText("Stock mínimo:");

        jLabel9.setText("Peso del envase:");

        jLabel8.setText("Estado:");

        cbEditarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));

        labIdSelec.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarDescripcion))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(labIdSelec))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPesoEnvase))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarStockMinimo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioVenta))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioCosto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioVentaXPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarCodigo))
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
                    .addComponent(jLabel5)
                    .addComponent(txfdEditarPrecioVentaXPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIdSelec))
                .addContainerGap())
        );

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        ventanaProducto vProducto = new ventanaProducto();
        vProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        
        Producto p = new Producto();
        p.setCodigo(txfdEditarCodigo.getText());
        p.setDescripcion(txfdEditarDescripcion.getText());
        p.setPesoEnvase(Integer.parseInt(txfdEditarPesoEnvase.getText()));
        p.setPrecioCosto(Double.parseDouble(txfdEditarPrecioCosto.getText()));
        p.setPrecioVenta(Double.parseDouble(txfdEditarPrecioVenta.getText()));
        p.setPrecioVentaXPeso(Double.parseDouble(txfdEditarPrecioVentaXPeso.getText()));
        p.setStockMinimo(Double.parseDouble(txfdEditarStockMinimo.getText()));
        if(cbEditarEstado.getSelectedItem().equals("Habilitado"))
        {
            p.setEstado(true);
        }
        else
        {
            p.setEstado(false);
        }
        
        pDAO.modificar(p, id_recibido);
        
        ventanaProducto vProducto = new ventanaProducto();
        vProducto.setVisible(true);
        dispose();
        
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
    
    public void encontrarProd()
    {
        Producto elProd = pDAO.buscarPorId(id_recibido);                
                
        txfdEditarCodigo.setText(String.valueOf(elProd.getCodigo()));
        txfdEditarDescripcion.setText(String.valueOf(elProd.getDescripcion()));
        txfdEditarPrecioCosto.setText(String.valueOf(elProd.getPrecioCosto()));
        txfdEditarPrecioVenta.setText(String.valueOf(elProd.getPrecioVenta()));
        txfdEditarPrecioVentaXPeso.setText(String.valueOf(elProd.getPrecioVentaXPeso()));
        txfdEditarStockMinimo.setText(String.valueOf(elProd.getStockMinimo()));
        txfdEditarPesoEnvase.setText(String.valueOf(elProd.getPesoEnvase()));
        if(elProd.isEstado())
        {
            cbEditarEstado.setSelectedItem("Habilitado");
        }
        else
        {
            cbEditarEstado.setSelectedItem("Deshabilitado");
        }
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEditar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JComboBox<String> cbEditarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel labIdSelec;
    private javax.swing.JTextField txfdEditarCodigo;
    private javax.swing.JTextField txfdEditarDescripcion;
    private javax.swing.JTextField txfdEditarPesoEnvase;
    private javax.swing.JTextField txfdEditarPrecioCosto;
    private javax.swing.JTextField txfdEditarPrecioVenta;
    private javax.swing.JTextField txfdEditarPrecioVentaXPeso;
    private javax.swing.JTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables
}