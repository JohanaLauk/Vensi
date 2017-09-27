package Vista;

import java.awt.Dimension;

public class ventanaGestionClave extends javax.swing.JFrame 
{
    public ventanaGestionClave() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana
        
        this.setMinimumSize(new Dimension(510, 220));  //al minimizar la ventana no permite que sea mas chico que esa medida
        
        this.setPreferredSize(new Dimension(510, 220));    //al minimizar la ventana aparece con esa medida
        
        this.setResizable(false);   //No permite modificar el tamaño de la ventana
                
        for(int i=0 ; i < panelClave.getComponents().length ; i++)  //deshabilita el panel de edición/creación
        {
            panelClave.getComponent(i).setEnabled(false);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDetalleUsuario = new javax.swing.JList<>();
        btnCrearClave = new javax.swing.JButton();
        btnEditarClave = new javax.swing.JButton();
        btnVolverClave = new javax.swing.JButton();
        panelClave = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbTipoClave = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        btnCancelarClave = new javax.swing.JButton();
        btnConfirmarClave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de claves");
        setPreferredSize(new java.awt.Dimension(510, 220));

        jLabel1.setText("Tipo clave:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistema de ventas", "General" }));

        jLabel2.setText("Detalles");

        listDetalleUsuario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Usuario: ", "Pin:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listDetalleUsuario);

        btnCrearClave.setText("Crear");
        btnCrearClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClaveActionPerformed(evt);
            }
        });

        btnEditarClave.setText("Editar");
        btnEditarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClaveActionPerformed(evt);
            }
        });

        btnVolverClave.setText("Volver");
        btnVolverClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCrearClave, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverClave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearClave)
                    .addComponent(btnEditarClave)
                    .addComponent(btnVolverClave))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel3.setText("Creación/edición de clave");

        jLabel4.setText("Usuario:");

        cbTipoClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistema de ventas", "General" }));

        jLabel5.setText("Pin: ");

        jLabel6.setText("Pin:");

        btnCancelarClave.setText("Cancelar");
        btnCancelarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClaveActionPerformed(evt);
            }
        });

        btnConfirmarClave.setText("Confirmar");
        btnConfirmarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClaveLayout = new javax.swing.GroupLayout(panelClave);
        panelClave.setLayout(panelClaveLayout);
        panelClaveLayout.setHorizontalGroup(
            panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(panelClaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveLayout.createSequentialGroup()
                        .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password1)
                            .addComponent(password2)
                            .addComponent(cbTipoClave, 0, 140, Short.MAX_VALUE)))
                    .addGroup(panelClaveLayout.createSequentialGroup()
                        .addComponent(btnCancelarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClaveLayout.setVerticalGroup(
            panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarClave)
                    .addComponent(btnConfirmarClave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverClaveActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverClaveActionPerformed

    private void btnCrearClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClaveActionPerformed
        for(int i=0 ; i < panelClave.getComponents().length ; i++) 
        {
           panelClave.getComponent(i).setEnabled(true);
        }
    }//GEN-LAST:event_btnCrearClaveActionPerformed

    private void btnCancelarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClaveActionPerformed
        for(int i=0 ; i < panelClave.getComponents().length ; i++)  //deshabilita el panel de edición/creación
        {
            panelClave.getComponent(i).setEnabled(false);
        }
    }//GEN-LAST:event_btnCancelarClaveActionPerformed

    private void btnConfirmarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClaveActionPerformed
        
        for(int i=0 ; i < panelClave.getComponents().length ; i++)  //deshabilita el panel de edición/creación
        {
            panelClave.getComponent(i).setEnabled(false);
        }
    }//GEN-LAST:event_btnConfirmarClaveActionPerformed

    private void btnEditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClaveActionPerformed
        for(int i=0 ; i < panelClave.getComponents().length ; i++)  //deshabilita el panel de edición/creación
        {
            panelClave.getComponent(i).setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarClaveActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaGestionClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarClave;
    private javax.swing.JButton btnConfirmarClave;
    private javax.swing.JButton btnCrearClave;
    private javax.swing.JButton btnEditarClave;
    private javax.swing.JButton btnVolverClave;
    private javax.swing.JComboBox<String> cbTipoClave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDetalleUsuario;
    private javax.swing.JPanel panelClave;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    // End of variables declaration//GEN-END:variables
}
