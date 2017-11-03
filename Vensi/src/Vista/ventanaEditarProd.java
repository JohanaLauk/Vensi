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
        
        labIdSelec.setVisible(false);   //label que contiene el id
        
        mostrarProdSelec();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jLabel7.setText("Stock mínimo:");

        jLabel9.setText("Peso del envase:");

        jLabel8.setText("Estado:");

        cbEditarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));

        labIdSelec.setText("ID_Prod");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarDescripcion))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfdEditarCodigo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPrecioCosto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(labIdSelec))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txfdEditarStockMinimo))))
                .addGap(0, 71, Short.MAX_VALUE))
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
                    .addComponent(txfdEditarStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfdEditarPesoEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIdSelec)))
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
            .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancelarEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Producto prod = new Producto();
        
        prod.setCodigo(txfdEditarCodigo.getText());
        prod.setDescripcion(txfdEditarDescripcion.getText().toUpperCase());
        prod.setPesoEnvase(Integer.parseInt(txfdEditarPesoEnvase.getText()));
        prod.setPrecioCosto(Double.parseDouble(txfdEditarPrecioCosto.getText()));
        prod.setPrecioVenta(Double.parseDouble(txfdEditarPrecioVenta.getText()));
        prod.setStockMinimo(Double.parseDouble(txfdEditarStockMinimo.getText()));
        
        if(cbEditarEstado.getSelectedItem().equals("Habilitado"))
        {
            prod.setEstado(true);
        }
        else
        {
            prod.setEstado(false);
        }
        
        pDAO.modificar(prod, id_recibido);
        
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
    private javax.swing.JTextField txfdEditarStockMinimo;
    // End of variables declaration//GEN-END:variables
}