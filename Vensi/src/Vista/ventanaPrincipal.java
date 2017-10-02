package Vista;

import java.awt.Dimension;

public class ventanaPrincipal extends javax.swing.JFrame 
{
    public ventanaPrincipal() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana  
        
        //this.setPreferredSize(new Dimension(836, 520));    //al ejecutarse, la ventana aparece con esa medida
        this.setPreferredSize(new Dimension(820, 480));
        
        //this.setUndecorated(true);  //sin bordes ni botones
        
        //this.setOpacity(0.95f);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labImagenIzquierda = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        btnHistorial = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
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
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labImagenIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo azul oscuro editado.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labImagenIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labImagenIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 400));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistorial.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-Repository-96 editado.png"))); // NOI18N
        btnHistorial.setToolTipText("Historial");
        btnHistorial.setBorder(null);
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 100, 120));

        btnPedidos.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pedidos editado.png"))); // NOI18N
        btnPedidos.setToolTipText("Pedidos");
        btnPedidos.setBorder(null);
        btnPedidos.setBorderPainted(false);
        btnPedidos.setContentAreaFilled(false);
        panelPrincipal.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, 130));

        btnAdministracion.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-Administrative Tools-96 editado.png"))); // NOI18N
        btnAdministracion.setToolTipText("Administración");
        btnAdministracion.setBorder(null);
        btnAdministracion.setBorderPainted(false);
        btnAdministracion.setContentAreaFilled(false);
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 110, 110));

        btnVentas.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-Payroll-96 editado 2.png"))); // NOI18N
        btnVentas.setToolTipText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, 130));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Icono salir blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 30));

        labImagenDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/espacio 1 editado - copia.jpg"))); // NOI18N
        labImagenDerecha.setText("jLabel1");
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
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labImagenDerecha;
    private javax.swing.JLabel labImagenIzquierda;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
