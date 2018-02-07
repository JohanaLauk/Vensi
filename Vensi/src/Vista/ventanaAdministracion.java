package Vista;

import java.awt.Component;
import java.awt.*;
import javax.swing.ImageIcon;


public class ventanaAdministracion extends javax.swing.JFrame 
{
    ImageIcon icono;
    
    public ventanaAdministracion() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        //this.setMinimumSize(new Dimension(900, 425));  //al minimizar la ventana no permite que sea mas chico que esa medida        
        //this.setPreferredSize(new Dimension(900, 425));    //al minimizar la ventana aparece con esa medida         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labImagenFondo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnMenuPrincipal = new javax.swing.JButton();
        btnGestionProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGestionProv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGestionClave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labTitulo = new javax.swing.JLabel();
        labFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setUndecorated(true);

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo grande.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        btnMenuPrincipal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir2_50.png"))); // NOI18N
        btnMenuPrincipal.setToolTipText("Volver");
        btnMenuPrincipal.setBorder(null);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMenuPrincipal.setNextFocusableComponent(btnGestionProd);
        btnMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseExited(evt);
            }
        });
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnGestionProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_100.png"))); // NOI18N
        btnGestionProd.setBorder(null);
        btnGestionProd.setBorderPainted(false);
        btnGestionProd.setContentAreaFilled(false);
        btnGestionProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionProd.setNextFocusableComponent(btnGestionProv);
        btnGestionProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionProdMouseExited(evt);
            }
        });
        btnGestionProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión del producto");
        jLabel1.setToolTipText("");

        btnGestionProv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_100.png"))); // NOI18N
        btnGestionProv.setBorder(null);
        btnGestionProv.setBorderPainted(false);
        btnGestionProv.setContentAreaFilled(false);
        btnGestionProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionProv.setNextFocusableComponent(btnGestionClave);
        btnGestionProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionProvMouseExited(evt);
            }
        });
        btnGestionProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionProvActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestión del proveedor");

        btnGestionClave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_100.png"))); // NOI18N
        btnGestionClave.setBorder(null);
        btnGestionClave.setBorderPainted(false);
        btnGestionClave.setContentAreaFilled(false);
        btnGestionClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionClave.setNextFocusableComponent(btnMenuPrincipal);
        btnGestionClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionClaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionClaveMouseExited(evt);
            }
        });
        btnGestionClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestión de clave");

        labTitulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labTitulo.setText("Administración");

        labFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/plata_circular grande.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnGestionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnGestionClave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnGestionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnGestionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180)
                                .addComponent(btnGestionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnGestionClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionProdActionPerformed
        ventanaProducto vProducto = new ventanaProducto();
        vProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionProdActionPerformed

    private void btnGestionProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionProvActionPerformed
        ventanaProveedor vProveedor = new ventanaProveedor();
        vProveedor.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionProvActionPerformed

    private void btnGestionClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClaveActionPerformed
        ventanaGestionClave vGestionClave = new ventanaGestionClave();
        vGestionClave.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionClaveActionPerformed

    private void btnGestionClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionClaveMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_lleno_100.png"));     
        btnGestionClave.setIcon(icono);
    }//GEN-LAST:event_btnGestionClaveMouseEntered

    private void btnGestionClaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionClaveMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_100.png"));     
        btnGestionClave.setIcon(icono);
    }//GEN-LAST:event_btnGestionClaveMouseExited

    private void btnGestionProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProvMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_lleno_100.png"));     
        btnGestionProv.setIcon(icono);
    }//GEN-LAST:event_btnGestionProvMouseEntered

    private void btnGestionProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProvMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_100.png"));     
        btnGestionProv.setIcon(icono);
    }//GEN-LAST:event_btnGestionProvMouseExited

    private void btnGestionProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_lleno_100.png"));     
        btnGestionProd.setIcon(icono);
    }//GEN-LAST:event_btnGestionProdMouseEntered

    private void btnGestionProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_100.png"));     
        btnGestionProd.setIcon(icono);
    }//GEN-LAST:event_btnGestionProdMouseExited

    private void btnMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/salir2_lleno_50.png"));     
        btnMenuPrincipal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPrincipalMouseEntered

    private void btnMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/salir2_50.png"));     
        btnMenuPrincipal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPrincipalMouseExited

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                //new ventanaAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionClave;
    private javax.swing.JButton btnGestionProd;
    private javax.swing.JButton btnGestionProv;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labFondo;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labTitulo;
    // End of variables declaration//GEN-END:variables
}
