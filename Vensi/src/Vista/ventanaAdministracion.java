package Vista;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class ventanaAdministracion extends javax.swing.JFrame 
{
    ImageIcon icono;
    
    public ventanaAdministracion() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir  
        this.setMinimumSize(new Dimension(835, 501));  //al minimizar la ventana no permite que sea mas chico que esa medida 
        this.setPreferredSize(new Dimension(835, 501));        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        btnGestionProd = new javax.swing.JButton();
        labProd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelMedio = new javax.swing.JPanel();
        btnGestionProv = new javax.swing.JButton();
        labProv = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelDerecha = new javax.swing.JPanel();
        btnGestionClave = new javax.swing.JButton();
        labClave = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));

        panelIzquierda.setOpaque(false);

        btnGestionProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prod_200.png"))); // NOI18N
        btnGestionProd.setBorder(null);
        btnGestionProd.setBorderPainted(false);
        btnGestionProd.setContentAreaFilled(false);
        btnGestionProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionProd.setFocusPainted(false);
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

        labProd.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        labProd.setForeground(new java.awt.Color(255, 255, 255));
        labProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labProd.setText("Gestión del producto");
        labProd.setToolTipText("");
        labProd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labProd, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addComponent(btnGestionProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(5, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addComponent(labProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGestionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMedio.setOpaque(false);

        btnGestionProv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/prov_200.png"))); // NOI18N
        btnGestionProv.setBorder(null);
        btnGestionProv.setBorderPainted(false);
        btnGestionProv.setContentAreaFilled(false);
        btnGestionProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionProv.setFocusPainted(false);
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

        labProv.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        labProv.setForeground(new java.awt.Color(255, 255, 255));
        labProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labProv.setText("Gestión del proveedor");
        labProv.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelMedioLayout = new javax.swing.GroupLayout(panelMedio);
        panelMedio.setLayout(panelMedioLayout);
        panelMedioLayout.setHorizontalGroup(
            panelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3)
        );
        panelMedioLayout.setVerticalGroup(
            panelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedioLayout.createSequentialGroup()
                .addComponent(labProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnGestionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelDerecha.setOpaque(false);

        btnGestionClave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGestionClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vAdministracion/clave_210.png"))); // NOI18N
        btnGestionClave.setBorder(null);
        btnGestionClave.setBorderPainted(false);
        btnGestionClave.setContentAreaFilled(false);
        btnGestionClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionClave.setFocusPainted(false);
        btnGestionClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        labClave.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        labClave.setForeground(new java.awt.Color(255, 255, 255));
        labClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labClave.setText("Gestión de clave");
        labClave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labClave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(57, 57, 57))
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGestionClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addComponent(labClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnGestionClave, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panelIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(panelMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 253, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labClave;
    private javax.swing.JLabel labProd;
    private javax.swing.JLabel labProv;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelMedio;
    private javax.swing.JPanel panelTodo;
    // End of variables declaration//GEN-END:variables
}
