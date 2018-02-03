package Vista;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ventanaGestionClave extends javax.swing.JFrame 
{
    DefaultListModel modeloLista;
    UsuarioDAO uDAO = new UsuarioDAO();
    
    public ventanaGestionClave() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de claves");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(250, 215));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");

        cbTipoClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Propietario", "Empleado" }));
        cbTipoClave.setNextFocusableComponent(passActual);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setText("Pin nuevo: ");

        passNuevo.setNextFocusableComponent(passVerif);
        passNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passNuevoKeyTyped(evt);
            }
        });

        jLabel6.setText("Pin verif:");

        passVerif.setNextFocusableComponent(cbTipoClave);
        passVerif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passVerifKeyTyped(evt);
            }
        });

        btnConfirmarClave.setText("Confirmar");
        btnConfirmarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Pin actual:");

        passActual.setNextFocusableComponent(passNuevo);
        passActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passActualKeyTyped(evt);
            }
        });

        jLabel2.setText("Edición de clave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passActual))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTipoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passVerif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passActual;
    private javax.swing.JPasswordField passNuevo;
    private javax.swing.JPasswordField passVerif;
    // End of variables declaration//GEN-END:variables
}