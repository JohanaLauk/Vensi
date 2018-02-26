package Vista;

import DAO.UsuarioDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaSeguridad extends javax.swing.JFrame 
{
    UsuarioDAO uDAO = new UsuarioDAO();
    
    static String nombreBtn;   
    int cont; 
    
    ImageIcon icono;
    
    public ventanaSeguridad() 
    {
        initComponents();           
        
        this.setLocationRelativeTo(null);     //centra la ventana     
        
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/V.jpg"));
        this.setIconImage(ico);
        
        cont = 0;   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbPin = new javax.swing.JLabel();
        txfdPin = new javax.swing.JPasswordField();
        panelBotones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Validación de usuario");
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese el pin de usuario para acceder");

        lbPin.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lbPin.setForeground(new java.awt.Color(255, 255, 255));
        lbPin.setText("Pin de autentificación:");
        lbPin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txfdPin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txfdPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdPinKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPinKeyTyped(evt);
            }
        });

        panelBotones.setOpaque(false);

        btnAceptar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptar.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptar.setIconTextGap(20);
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

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(20);
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
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbPin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
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

    private void txfdPinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPinKeyReleased
        if (txfdPin.getText().equals(""))
        {
            btnAceptar.setEnabled(false);
        }
        else
        {
            btnAceptar.setEnabled(true);
        }
    }//GEN-LAST:event_txfdPinKeyReleased

    private void txfdPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPinKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE))
            evt.consume();
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnAceptar.doClick();
        }
    }//GEN-LAST:event_txfdPinKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        ventanaPrincipal vPpal = new ventanaPrincipal();
        vPpal.setVisible(true);        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int pin = Integer.parseInt(txfdPin.getText());        
        
        if (nombreBtn.equals("Ventas"))            
        {
            if (uDAO.verificar("Propietario", pin) || uDAO.verificar("Empleado", pin))
            {
                ventanaVenta vVenta = new ventanaVenta();
                vVenta.setVisible(true);    //hace visible una ventana
                dispose();  //cierra la ventana que deja   
            }
            else
            {
                if (cont > 3)
                {
                    JOptionPane.showMessageDialog(null, "¡ACCESO DENEGADO!"
                                                    + "\n¡Pin incorrecto!"
                                                    + "\nSi el mensaje se repite, probablemente usted no tenga permiso para acceder aquí.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "¡ACCESO DENEGADO!"
                                                    + "\nPin incorrecto, intentalo nuevamente.");
                }
                
                txfdPin.setText("");
                btnAceptar.setEnabled(false);
                cont ++;
            }           
        }
        else
        {
            if (uDAO.verificar("Propietario", pin))
            {
                if (nombreBtn.equals("Administracion"))
                {
                    ventanaAdministracion vAdministracion = new ventanaAdministracion();
                    vAdministracion.setVisible(true);   
                    dispose();
                }
                if (nombreBtn.equals("Historial"))
                {
                    ventanaHistorial vHistorial = new ventanaHistorial();
                    vHistorial.setVisible(true);    
                    dispose();  
                }
                if (nombreBtn.equals("Pedidos"))
                {
                    ventanaGenerarPedido vPedido = new ventanaGenerarPedido();
                    vPedido.setVisible(true);
                    dispose();
                }
                if (nombreBtn.equals("CargaStock"))
                {
                    ventanaCargaStock vInventario = new ventanaCargaStock();
                    vInventario.setVisible(true);
                    dispose();
                }
            }
            else
            {
                if (cont > 3)
                {
                    JOptionPane.showMessageDialog(null, "¡ACCESO DENEGADO!"
                                                    + "\n¡Pin incorrecto!"
                                                    + "\nSi el mensaje se repite, probablemente usted no tenga permiso para acceder aquí.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "¡ACCESO DENEGADO!"
                                                    + "\nPin incorrecto, intentalo nuevamente.");
                }
                
                txfdPin.setText("");
                btnAceptar.setEnabled(false);
                cont ++;
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_lleno_50.png"));     
        btnCancelar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"));     
        btnCancelar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_lleno_50.png"));     
        btnAceptar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"));     
        btnAceptar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarMouseExited

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaSeguridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbPin;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JPasswordField txfdPin;
    // End of variables declaration//GEN-END:variables
}
