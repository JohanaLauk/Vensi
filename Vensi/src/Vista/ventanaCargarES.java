package Vista;

import DAO.*;
import Modelo.*;
import Utils.Validar;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
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
    String nombre = "";
    
    public ventanaCargarES() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        this.setPreferredSize(new Dimension(780, 440));     //tamaño en la que aparecerá la ventana al ejecutar 
               
        habDeshabComponentes("Ninguno");          
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        panelES = new javax.swing.JPanel();
        cbTipoES = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txfdMonto = new javax.swing.JTextField();
        labTitulo = new javax.swing.JLabel();
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
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono_salir_blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        panelES.setBackground(new java.awt.Color(0, 0, 0));
        panelES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTipoES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Apertura de caja", "Retiro", "Anulación de venta", "Sueldo" }));
        cbTipoES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoESActionPerformed(evt);
            }
        });
        panelES.add(cbTipoES, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        panelES.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción:");
        panelES.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelES.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 30));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelES.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 130, 30));

        txAreaDescripcion.setEditable(false);
        txAreaDescripcion.setColumns(20);
        txAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txAreaDescripcion);

        panelES.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 130));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monto:");
        panelES.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        txfdMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdMontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdMontoKeyTyped(evt);
            }
        });
        panelES.add(txfdMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        getContentPane().add(panelES, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 370));

        labTitulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labTitulo.setText("Cargar entrada/salida");
        getContentPane().add(labTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -3, -1, 50));

        panelidentificarProd.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busque el producto:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingerese la cantidad:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacíon del producto:");

        jScrollPane1.setViewportView(listaInfoProdAnular);

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        labTituloPanelAnularProd.setForeground(new java.awt.Color(255, 255, 255));
        labTituloPanelAnularProd.setText("ANULACIÓN DE PRODUCTO");
        labTituloPanelAnularProd.setToolTipText("");

        txfdCantProdAnular.setPrompt("unidad / gramos");
        txfdCantProdAnular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdCantProdAnularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCantProdAnularKeyTyped(evt);
            }
        });

        txfdCodNomProdAnular.setPrompt("Por código o descripción");
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
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelidentificarProdLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfdCantProdAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfdCodNomProdAnular, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelidentificarProdLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(labTituloPanelAnularProd))
                        .addGroup(panelidentificarProdLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel2))
                        .addGroup(panelidentificarProdLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelidentificarProdLayout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        panelidentificarProdLayout.setVerticalGroup(
            panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelidentificarProdLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labTituloPanelAnularProd)
                .addGap(36, 36, 36)
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdCodNomProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelidentificarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdCantProdAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelidentificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 420, 370));

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo 2 grande.png"))); // NOI18N
        labImagenFondo.setText("jLabel1");
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
        int cantidad = Integer.parseInt(txfdCantProdAnular.getText());
        boolean repetido = false;
        Turno turnoActual = tDAO.obtenerUltimo();
        
        List<ItemVenta> listaVentas = itDAO.listar(turnoActual.getId());
        ItemVenta item = null;
        
        for (ItemVenta v : listaVentas) //lista de ventas del turno que esta abierto
        {
            for (ItemVenta i : listaIV) //contiene 1 sólo prod
            {
                if (v.getProducto().getId() == i.getProducto().getId()) //El prod buscado se encuentra en las ventas. 
                {
                    repetido = true; 
                    item = v;
                }   
            }
        } 
        if (repetido)
        {
            if (item.getCantidad() >= cantidad)
            {                
                pDAO.sumarStock(item.getProducto().getId(), cantidad);   //actualizo el stock del producto
                item.setCantidad(item.getCantidad() - cantidad);  //resto la cantidad del itemVenta
                if (item.getProducto().isPorPeso())
                {
                    item.setMonto(item.getMonto() - ((cantidad * item.getProducto().getPrecioVenta()) / item.getProducto().getPesoEnvase()));
                }
                else
                {
                    item.setMonto(item.getMonto() - (item.getProducto().getPrecioVenta() * cantidad));
                }
                
                EntradaSalida unES = new EntradaSalida();

                unES.setNombre("Anulación de venta".toUpperCase());
                unES.setDescripcion(item.getProducto().getDescripcion().toUpperCase());
                unES.setCantProd(cantidad);                        

                if (item.getProducto().isPorPeso())
                {
                    unES.setMonto((cantidad * item.getProducto().getPrecioVenta()) / item.getProducto().getPesoEnvase());
                }
                else
                {
                    unES.setMonto(item.getProducto().getPrecioVenta() * cantidad);
                }

                unES.setTipo(false);
                unES.setHora(new Date());
                
                unES.setTurno(turnoActual);

                esDAO.alta(unES);
                itDAO.modificar(item, item.getId());

                JOptionPane.showMessageDialog(null, "Venta anulada.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada debe ser menor o igual a la cantidad que se ha vendido.");
            }  
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se han realizado compras de este producto.");
        }
        
        dispose();
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txfdMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdMontoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        Turno turnoActual = tDAO.obtenerUltimo();
        
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
            
            cbTipoES.setEnabled(true);
            txfdMonto.setText(null);           
            txAreaDescripcion.setText(null);
            btnAnular.setEnabled(false);
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
                
                cbTipoES.setEnabled(true);                    
                txfdMonto.setText(null);           
                txAreaDescripcion.setText(null);
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
                
                btnConfirmar.setEnabled(false);
                txAreaDescripcion.setEditable(true);
                cbTipoES.setEnabled(true);
                txfdMonto.setText(null);           
                txAreaDescripcion.setText(null);
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
            modeloList = new DefaultListModel();
            modeloList.clear();
            btnAnular.setEnabled(false);
        }
        else
        {
            for (ItemVenta x : listaIV)
            {                
                modeloList.addElement("Código:  " + x.getProducto().getCodigo());
                modeloList.addElement("Descripción:  " + x.getProducto().getDescripcion());                

                if (x.getProducto().isPorPeso())
                {
                    modeloList.addElement("Stock:  " + String.valueOf(x.getProducto().getStock() / 1000 + "kg"));
                    modeloList.addElement("Tipo:  Por peso");
                    modeloList.addElement("Precio de venta:  $" + String.valueOf(x.getProducto().getPrecioVenta()));
                }
                else
                {
                    modeloList.addElement("Stock:  " + String.valueOf(x.getProducto().getStock()));
                    modeloList.addElement("Tipo:  Por unidad");
                    modeloList.addElement("Precio de venta:  $" + String.valueOf(x.getProducto().getPrecioVenta()));
                }
                modeloList.addElement("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }   
        listaInfoProdAnular.setModel(modeloList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbTipoES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JLabel labTituloPanelAnularProd;
    private javax.swing.JList<String> listaInfoProdAnular;
    private javax.swing.JPanel panelES;
    private javax.swing.JPanel panelidentificarProd;
    private javax.swing.JTextArea txAreaDescripcion;
    private org.jdesktop.swingx.JXTextField txfdCantProdAnular;
    private org.jdesktop.swingx.JXTextField txfdCodNomProdAnular;
    private javax.swing.JTextField txfdMonto;
    // End of variables declaration//GEN-END:variables
}
