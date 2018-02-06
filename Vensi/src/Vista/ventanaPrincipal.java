package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class ventanaPrincipal extends javax.swing.JFrame 
{
    ImageIcon icono;
    int x, y;
    
    public ventanaPrincipal() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana          
        //this.setPreferredSize(new Dimension(836, 520));    //al ejecutarse, la ventana aparece con esa medida
        this.setPreferredSize(new Dimension(820, 480));        
        AWTUtilities.setWindowOpaque(this, false);  //quita el fondo del frame
        
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/Vensi.png"));
        this.setIconImage(ico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labNombreNegocio = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labImagenIzquierda = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        btnHistorial = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCargaStock = new javax.swing.JButton();
        LabTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labBarraTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labImagenDerecha = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vensi");
        setName("ventanaPrincipal"); // NOI18N
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labNombreNegocio.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        labNombreNegocio.setForeground(new java.awt.Color(255, 255, 255));
        labNombreNegocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNombreNegocio.setText("\"LA ESQUINA\"");
        labNombreNegocio.setToolTipText("");
        jPanel2.add(labNombreNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 70, 260, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        labImagenIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/imagen_fondo_izquierdo_(grande).jpg"))); // NOI18N
        jPanel2.add(labImagenIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 400));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistorial.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/historial_100.png"))); // NOI18N
        btnHistorial.setToolTipText("Historial");
        btnHistorial.setBorder(null);
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setNextFocusableComponent(btnPedidos);
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistorialMouseExited(evt);
            }
        });
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 100, 100));

        btnPedidos.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/pedido_100.png"))); // NOI18N
        btnPedidos.setToolTipText("Generar pedido");
        btnPedidos.setBorder(null);
        btnPedidos.setBorderPainted(false);
        btnPedidos.setContentAreaFilled(false);
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.setNextFocusableComponent(btnCargaStock);
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPedidosMouseExited(evt);
            }
        });
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, -1));

        btnAdministracion.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/adminBD_100.png"))); // NOI18N
        btnAdministracion.setToolTipText("Administrar inventario");
        btnAdministracion.setBorder(null);
        btnAdministracion.setBorderPainted(false);
        btnAdministracion.setContentAreaFilled(false);
        btnAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministracion.setNextFocusableComponent(btnHistorial);
        btnAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseExited(evt);
            }
        });
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 110));

        btnVentas.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/ventas_100.png"))); // NOI18N
        btnVentas.setToolTipText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setNextFocusableComponent(btnAdministracion);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 100));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/apagar_50.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setNextFocusableComponent(btnVentas);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 50));

        btnCargaStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/cargaStock_100.png"))); // NOI18N
        btnCargaStock.setToolTipText("Actualizar inventario");
        btnCargaStock.setBorder(null);
        btnCargaStock.setBorderPainted(false);
        btnCargaStock.setContentAreaFilled(false);
        btnCargaStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargaStock.setNextFocusableComponent(btnSalir);
        btnCargaStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargaStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargaStockMouseExited(evt);
            }
        });
        btnCargaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaStockActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCargaStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 110));

        LabTitulo.setBackground(new java.awt.Color(255, 255, 0));
        LabTitulo.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        LabTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabTitulo.setText("VENSI");
        LabTitulo.setToolTipText("");
        LabTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelPrincipal.add(LabTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 70));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 10));

        labBarraTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/plata_circular.jpg"))); // NOI18N
        labBarraTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labBarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labBarraTituloMouseDragged(evt);
            }
        });
        labBarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labBarraTituloMousePressed(evt);
            }
        });
        panelPrincipal.add(labBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 520, 70));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Generar pedido");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Actualizar inventario");
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Administrar inventario");
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Historial");
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 100, 20));

        labImagenDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vPrincipal/petroleo.png"))); // NOI18N
        panelPrincipal.add(labImagenDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 500, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        ventanaVenta vVenta = new ventanaVenta();
        vVenta.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);   //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        ventanaHistorial vHistorial = new ventanaHistorial();
        vHistorial.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        ventanaGenerarPedido vPedido = new ventanaGenerarPedido();
        vPedido.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnCargaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaStockActionPerformed
        ventanaCargaStock vInventario = new ventanaCargaStock();
        vInventario.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnCargaStockActionPerformed

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/ventas_lleno_100.png"));     
        btnVentas.setIcon(icono);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/ventas_100.png"));
        btnVentas.setIcon(icono);
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/apagar_lleno_50.png"));     
        btnSalir.setIcon(icono);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/apagar_50.png"));     
        btnSalir.setIcon(icono);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/pedido_lleno_100.png"));     
        btnPedidos.setIcon(icono);
    }//GEN-LAST:event_btnPedidosMouseEntered

    private void btnPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/pedido_100.png"));     
        btnPedidos.setIcon(icono);
    }//GEN-LAST:event_btnPedidosMouseExited

    private void btnAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/adminBD_lleno_100.png"));     
        btnAdministracion.setIcon(icono);
    }//GEN-LAST:event_btnAdministracionMouseEntered

    private void btnAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/adminBD_100.png"));     
        btnAdministracion.setIcon(icono);
    }//GEN-LAST:event_btnAdministracionMouseExited

    private void btnHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/historial_lleno_100.png"));     
        btnHistorial.setIcon(icono);
    }//GEN-LAST:event_btnHistorialMouseEntered

    private void btnHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/historial_100.png"));     
        btnHistorial.setIcon(icono);
    }//GEN-LAST:event_btnHistorialMouseExited

    private void btnCargaStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargaStockMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/cargaStock_lleno_100.png"));     
        btnCargaStock.setIcon(icono);        
    }//GEN-LAST:event_btnCargaStockMouseEntered

    private void btnCargaStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargaStockMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vPrincipal/cargaStock_100.png"));     
        btnCargaStock.setIcon(icono); 
    }//GEN-LAST:event_btnCargaStockMouseExited

    private void labBarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBarraTituloMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labBarraTituloMouseDragged

    private void labBarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBarraTituloMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_labBarraTituloMousePressed

    public static void main(String args[]) 
    {               
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabTitulo;
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnCargaStock;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labBarraTitulo;
    private javax.swing.JLabel labImagenDerecha;
    private javax.swing.JLabel labImagenIzquierda;
    private javax.swing.JLabel labNombreNegocio;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
