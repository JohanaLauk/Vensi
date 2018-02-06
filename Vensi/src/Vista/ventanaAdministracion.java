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
        
        this.setMinimumSize(new Dimension(900, 425));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(900, 425));    //al minimizar la ventana aparece con esa medida
         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenuPrincipal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnGestionProv = new javax.swing.JButton();
        btnGestionProd = new javax.swing.JButton();
        btnGestionClave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuPrincipal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir2_50.png"))); // NOI18N
        btnMenuPrincipal.setToolTipText("Volver");
        btnMenuPrincipal.setBorder(null);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 50, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionProv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_100.png"))); // NOI18N
        btnGestionProv.setBorder(null);
        btnGestionProv.setBorderPainted(false);
        btnGestionProv.setContentAreaFilled(false);
        btnGestionProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnGestionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 90));

        btnGestionProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_100.png"))); // NOI18N
        btnGestionProd.setBorder(null);
        btnGestionProd.setBorderPainted(false);
        btnGestionProd.setContentAreaFilled(false);
        btnGestionProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnGestionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 120));

        btnGestionClave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_100.png"))); // NOI18N
        btnGestionClave.setBorder(null);
        btnGestionClave.setBorderPainted(false);
        btnGestionClave.setContentAreaFilled(false);
        btnGestionClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnGestionClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 377, 130, 80));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión del producto");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 133, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestión del proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestión de clave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 463, 133, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 10, 510));

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo grande.png"))); // NOI18N
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labImagenFondo;
    // End of variables declaration//GEN-END:variables
}
