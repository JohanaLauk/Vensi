package Vista;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class ventanaPrincipal extends javax.swing.JFrame 
{
    public ventanaPrincipal() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir
        
        //this.setSize(900,500);    //le da un tamaño a la ventana   
       
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setSize(screenSize);   //Hacer que la ventana tenga el mismo tamaño que la pantalla en la que va a aparecer
        
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //this.setVisible(Boolean.TRUE);    //hace visible la ventana
        
        //this.setResizable(Boolean.FALSE);     //no deja modificar el tamaño de la ventana
                       
        //this.pack();    //ajusta la ventana supuestamente
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        btnHistorial = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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

        btnHistorial.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnHistorial.setText("HISTORIAL");

        btnPedidos.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnPedidos.setText("PEDIDOS");

        btnAdministracion.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnAdministracion.setText("ADMINISTRACIÓN");
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Calibri", 0, 50)); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministracion, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministracion, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    public static void main(String args[]) 
    {               
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                //new ventanaPrincipal().setVisible(true);        
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}