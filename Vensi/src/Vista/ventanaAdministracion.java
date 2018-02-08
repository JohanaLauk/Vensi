package Vista;

import javax.swing.ImageIcon;

public class ventanaAdministracion extends javax.swing.JFrame 
{
    ImageIcon icono;
    //int x, y;
    
    public ventanaAdministracion() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnGestionProd = new javax.swing.JButton();
        labProd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnGestionProv = new javax.swing.JButton();
        labProv = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnGestionClave = new javax.swing.JButton();
        labClave = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labFondo = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setUndecorated(true);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jPanel1.setOpaque(false);

        btnGestionProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_200.png"))); // NOI18N
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

        labProd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labProd.setText("Gestión del producto");
        labProd.setToolTipText("");
        labProd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labProd, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGestionProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGestionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setOpaque(false);

        btnGestionProv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_200.png"))); // NOI18N
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

        labProv.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labProv.setText("Gestión del proveedor");
        labProv.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(11, 11, 11))
            .addComponent(btnGestionProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnGestionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        btnGestionClave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_210.png"))); // NOI18N
        btnGestionClave.setBorder(null);
        btnGestionClave.setBorderPainted(false);
        btnGestionClave.setContentAreaFilled(false);
        btnGestionClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionClave.setNextFocusableComponent(btnVolver);
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

        labClave.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labClave.setText("Gestión de clave");
        labClave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labClave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labClave, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator4)))
                        .addGap(47, 47, 47))
                    .addComponent(btnGestionClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGestionClave, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        labFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo grande.png"))); // NOI18N

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addComponent(labFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelTitulo.setOpaque(false);

        labTitulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labTitulo.setText("   Administración");
        labTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labTituloMouseDragged(evt);
            }
        });
        labTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labTituloMousePressed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/volver2_50.png"))); // NOI18N
        btnVolver.setToolTipText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setNextFocusableComponent(btnGestionProd);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/plata_circular grande.jpg"))); // NOI18N

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(btnVolver)
                .addContainerGap())
            .addComponent(labImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_lleno_210.png"));     
        btnGestionClave.setIcon(icono);
    }//GEN-LAST:event_btnGestionClaveMouseEntered

    private void btnGestionClaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionClaveMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_210.png"));     
        btnGestionClave.setIcon(icono);
    }//GEN-LAST:event_btnGestionClaveMouseExited

    private void btnGestionProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProvMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_lleno_200.png"));     
        btnGestionProv.setIcon(icono);
    }//GEN-LAST:event_btnGestionProvMouseEntered

    private void btnGestionProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProvMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_200.png"));     
        btnGestionProv.setIcon(icono);
    }//GEN-LAST:event_btnGestionProvMouseExited

    private void btnGestionProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProdMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_lleno_200.png"));     
        btnGestionProd.setIcon(icono);
    }//GEN-LAST:event_btnGestionProdMouseEntered

    private void btnGestionProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionProdMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_200.png"));     
        btnGestionProd.setIcon(icono);
    }//GEN-LAST:event_btnGestionProdMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/volver2_lleno_50.png"));     
        btnVolver.setIcon(icono);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/volver2_50.png"));     
        btnVolver.setIcon(icono);
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void labTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTituloMouseDragged
        //this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_labTituloMouseDragged

    private void labTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTituloMousePressed
        //x = evt.getX();
        //y = evt.getY();
    }//GEN-LAST:event_labTituloMousePressed

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
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labClave;
    private javax.swing.JLabel labFondo;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labProd;
    private javax.swing.JLabel labProv;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTodo;
    // End of variables declaration//GEN-END:variables
}
