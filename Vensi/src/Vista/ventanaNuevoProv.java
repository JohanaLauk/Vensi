package Vista;

import DAO.ProveedorDAO;
import Modelo.Proveedor;
import Utils.Validar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaNuevoProv extends javax.swing.JFrame 
{
    ProveedorDAO pDAO = new ProveedorDAO();
    Validar validar = new Validar();
    
    ImageIcon icono;
    
    public ventanaNuevoProv() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfdRazonSocial = new javax.swing.JTextField();
        txfdDireccion = new javax.swing.JTextField();
        txfdContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfdLocalidad = new javax.swing.JTextField();
        txfdProvincia = new javax.swing.JTextField();
        txfdPais = new javax.swing.JTextField();
        txfdCuit = new org.jdesktop.swingx.JXTextField();
        panelBotones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo proveedor");
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelDatos.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Razón social:");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("CUIT:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Dirección:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Contacto:");

        txfdRazonSocial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdRazonSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdRazonSocial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdRazonSocial.setNextFocusableComponent(txfdCuit);

        txfdDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdDireccion.setNextFocusableComponent(txfdLocalidad);

        txfdContacto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdContacto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdContacto.setNextFocusableComponent(btnAceptar);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Localidad:");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Provincia:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("País:");

        txfdLocalidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdLocalidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdLocalidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdLocalidad.setNextFocusableComponent(txfdProvincia);

        txfdProvincia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdProvincia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdProvincia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdProvincia.setNextFocusableComponent(txfdPais);

        txfdPais.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPais.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPais.setNextFocusableComponent(txfdContacto);

        txfdCuit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdCuit.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txfdCuit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdCuit.setPrompt("XX-XXXXXXXX-X");
        txfdCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdCuitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txfdCuit, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txfdContacto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdPais, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfdProvincia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel7))
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txfdLocalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(txfdDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfdRazonSocial, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel6)))
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPais, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotones.setOpaque(false);

        btnAceptar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptar.setIconTextGap(10);
        btnAceptar.setNextFocusableComponent(btnCancelar);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(10);
        btnCancelar.setNextFocusableComponent(txfdRazonSocial);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Proveedor unProv = new Proveedor();
        String cuitInput = txfdCuit.getText();        
        
        if (!txfdRazonSocial.getText().equals("") && !cuitInput.equals("")) 
        {          
            if (validar.validarCUIT(cuitInput))
            {
                Proveedor provRepetido = pDAO.buscar1PorCuit(cuitInput);
                
                if (provRepetido == null)
                {
                    unProv.setRazonSocial(txfdRazonSocial.getText().toUpperCase());
                    unProv.setCuit(cuitInput);
                    unProv.setDireccion(txfdDireccion.getText().toUpperCase());
                    unProv.setLocalidad(txfdLocalidad.getText().toUpperCase());
                    unProv.setProvincia(txfdProvincia.getText().toUpperCase());
                    unProv.setPais(txfdPais.getText().toUpperCase());
                    unProv.setContacto(txfdContacto.getText());

                    pDAO.alta(unProv);
                    dispose();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "El CUIT del proveedor que desea crear ya existe.\n" +
                                                        "Corrobore en el inventario para mayor seguridad y control.");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El CUIT debe tener el siguiente formato \"xx-xxxxxxxx-x\"");                                                    
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txfdCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdCuitKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '-'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdCuitKeyTyped

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_lleno_50.png"));     
        btnCancelar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"));     
        btnCancelar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_lleno_50.png"));     
        btnAceptar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"));     
        btnAceptar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarMouseExited

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaNuevoProv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTextField txfdContacto;
    private org.jdesktop.swingx.JXTextField txfdCuit;
    private javax.swing.JTextField txfdDireccion;
    private javax.swing.JTextField txfdLocalidad;
    private javax.swing.JTextField txfdPais;
    private javax.swing.JTextField txfdProvincia;
    private javax.swing.JTextField txfdRazonSocial;
    // End of variables declaration//GEN-END:variables
}
