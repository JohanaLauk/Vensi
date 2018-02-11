package Vista;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaGestionClave extends javax.swing.JFrame 
{
    DefaultListModel modeloLista;
    UsuarioDAO uDAO = new UsuarioDAO();
    
    ImageIcon icono;
    
    public ventanaGestionClave() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbTipoClave = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passNuevo = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        passVerif = new javax.swing.JPasswordField();
        btnConfirmarClave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passActual = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de claves");
        setMinimumSize(new java.awt.Dimension(325, 295));
        setPreferredSize(new java.awt.Dimension(325, 295));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel1.setText("Usuario:");

        cbTipoClave.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbTipoClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Propietario", "Empleado" }));
        cbTipoClave.setNextFocusableComponent(passActual);

        btnVolver.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atras_50.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolver.setIconTextGap(0);
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

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setText("Pin nuevo: ");

        passNuevo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        passNuevo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passNuevo.setNextFocusableComponent(passVerif);
        passNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passNuevoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel6.setText("Pin verif:");

        passVerif.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        passVerif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passVerif.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passVerif.setNextFocusableComponent(cbTipoClave);
        passVerif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passVerifKeyTyped(evt);
            }
        });

        btnConfirmarClave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnConfirmarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"))); // NOI18N
        btnConfirmarClave.setText("Confirmar");
        btnConfirmarClave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarClave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConfirmarClave.setIconTextGap(10);
        btnConfirmarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmarClaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmarClaveMouseExited(evt);
            }
        });
        btnConfirmarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Pin actual:");

        passActual.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        passActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passActual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passActual.setNextFocusableComponent(passNuevo);
        passActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passActualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarClave, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passActual)
                            .addComponent(cbTipoClave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passVerif, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(passNuevo))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passActual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnConfirmarClave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnConfirmarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClaveActionPerformed
        String nombreUsuario = null;
        
        if (cbTipoClave.getSelectedItem().equals("Propietario"))
        {
            nombreUsuario = "Propietario";
        }
        else
        {
            if (cbTipoClave.getSelectedItem().equals("Empleado"))                
            {
                nombreUsuario = "Empleado";
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No ha seleccionado un usuario.");
            }
        }  
        
        if(passActual.getText().isEmpty() | passNuevo.getText().isEmpty() | passVerif.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos.");
        }
        else
        {
            int pinActual = Integer.parseInt(passActual.getText());
            int pinNuevo = Integer.parseInt(passNuevo.getText());
            int pinVerif = Integer.parseInt(passVerif.getText());
            
            List<Usuario> lista = uDAO.listar();
            for (Usuario u : lista)
            {
                if (u.getNombreUsuario().equals(nombreUsuario))
                {
                    if (u.getPin() == pinActual)
                    {
                        if (pinNuevo == pinVerif)
                        {
                            uDAO.modificarContraseña(nombreUsuario, pinNuevo);                       
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Los pines no coinciden.");
                        }            
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"El pin actual del usuario '"+nombreUsuario+"' no es correcto.");
                    }
                }
            } 
            JOptionPane.showMessageDialog(null,"Se ha modificado el pin correctamente.");
            
            passActual.setText(null);
            passNuevo.setText(null);
            passVerif.setText(null);
        }
    }//GEN-LAST:event_btnConfirmarClaveActionPerformed

    private void passActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passActualKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
            evt.consume();
    }//GEN-LAST:event_passActualKeyTyped

    private void passNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passNuevoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
            evt.consume();
    }//GEN-LAST:event_passNuevoKeyTyped

    private void passVerifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passVerifKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') 
            evt.consume();
    }//GEN-LAST:event_passVerifKeyTyped

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/atras_lleno_50.png"));     
        btnVolver.setIcon(icono); 
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/atras_50.png"));     
        btnVolver.setIcon(icono); 
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnConfirmarClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarClaveMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_lleno_50.png"));     
        btnConfirmarClave.setIcon(icono); 
    }//GEN-LAST:event_btnConfirmarClaveMouseEntered

    private void btnConfirmarClaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarClaveMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"));     
        btnConfirmarClave.setIcon(icono);
    }//GEN-LAST:event_btnConfirmarClaveMouseExited

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
    private javax.swing.JButton btnConfirmarClave;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbTipoClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JPasswordField passActual;
    private javax.swing.JPasswordField passNuevo;
    private javax.swing.JPasswordField passVerif;
    // End of variables declaration//GEN-END:variables
}