package Vista;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ventanaGestionClave extends javax.swing.JFrame 
{
    DefaultListModel modeloLista;
    UsuarioDAO uDAO = new UsuarioDAO();
    
    String nombreUsuario = null;
    
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
        
        mostrarDetalles();
        
        List<Usuario> lista = uDAO.listarDetalles();
        if (lista.size() == 2)
        {
            btnCrearClave.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbTipoClave = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDetalleUsuario = new javax.swing.JList<>();
        btnCrearClave = new javax.swing.JButton();
        btnEditarClave = new javax.swing.JButton();
        btnVolverClave = new javax.swing.JButton();
        panelClave = new javax.swing.JPanel();
        labTituloClave = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        btnCancelarClave = new javax.swing.JButton();
        btnConfirmarClave = new javax.swing.JButton();
        labUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de claves");
        setPreferredSize(new java.awt.Dimension(510, 220));

        jLabel1.setText("Tipo clave:");

        cbTipoClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sistema de ventas", "General" }));
        cbTipoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoClaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Detalles");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbTipoClave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCrearClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        labTituloClave.setText("Creación/edición de clave");

        jLabel4.setText("Usuario:");

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
                .addContainerGap()
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveLayout.createSequentialGroup()
                        .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(password2)
                            .addComponent(labUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelClaveLayout.createSequentialGroup()
                        .addComponent(btnCancelarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClaveLayout.createSequentialGroup()
                        .addComponent(labTituloClave)
                        .addGap(33, 33, 33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClaveLayout.setVerticalGroup(
            panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveLayout.createSequentialGroup()
                .addComponent(labTituloClave)
                .addGap(18, 18, 18)
                .addGroup(panelClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labUsuario))
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
                .addComponent(panelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
        labTituloClave.setText("Creación de clave");
        
        if (cbTipoClave.getSelectedItem().equals("General"))
        {
            labUsuario.setText("General");
        }
        else
        {
            labUsuario.setText("Sistema de ventas");            
        }
        
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
        
        String nombreUsuario = labUsuario.getText();
        int pin = Integer.parseInt(password1.getText());
        int pinVerif = Integer.parseInt(password2.getText());
        
        if (pin == pinVerif)
        {
            Usuario unUsuario = new Usuario();
            unUsuario.setNombreUsuario(nombreUsuario);
            unUsuario.setPin(pin);
            
            uDAO.alta(unUsuario);
            
            password1.getText();
            password2.getText();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_btnConfirmarClaveActionPerformed

    private void btnEditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClaveActionPerformed
        labTituloClave.setText("Edicción de clave");
        
        if (cbTipoClave.getSelectedItem().equals("General"))
        {
            labUsuario.setText("General");
        }
        else
        {
            labUsuario.setText("Sistema de ventas");            
        }
        
        for(int i=0 ; i < panelClave.getComponents().length ; i++)  //deshabilita el panel de edición/creación
        {
            panelClave.getComponent(i).setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarClaveActionPerformed

    private void cbTipoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoClaveActionPerformed
        mostrarDetalles();
    }//GEN-LAST:event_cbTipoClaveActionPerformed

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
    
    public void mostrarDetalles()
    {
        modeloLista = new DefaultListModel();
        List<Usuario> lista = uDAO.listarDetalles();
        String[] datos = new String[2];        
        
        if (cbTipoClave.getSelectedItem().equals("General")) //seleccionar
        {
            nombreUsuario = "General";
        }
        else
        {
            if (cbTipoClave.getSelectedItem().equals("Sistema de ventas"))
            {
                nombreUsuario = "Sistema de ventas";
            }
            else
            {
                nombreUsuario = "Seleccionar";
            }            
        }
        
        if (lista == null || nombreUsuario.equals("Seleccionar"))  //lista vacía
        {
            modeloLista.addElement("Usuario:");
            modeloLista.addElement("Pin:");
            
            listDetalleUsuario.setModel(modeloLista);
        }
        else
        {    
            for (Usuario u : lista)     //recorremos la lista de usuario
            {                
                datos[0] = u.getNombreUsuario();
                datos[1] = String.valueOf(u.getPin());
                
                if (datos[0].equals(nombreUsuario))
                {
                    modeloLista.addElement("Usuario: " + datos[0]);
                    modeloLista.addElement("Pin: " + datos[1]);

                    listDetalleUsuario.setModel(modeloLista);
                }        
            }
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarClave;
    private javax.swing.JButton btnConfirmarClave;
    private javax.swing.JButton btnCrearClave;
    private javax.swing.JButton btnEditarClave;
    private javax.swing.JButton btnVolverClave;
    private javax.swing.JComboBox<String> cbTipoClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labTituloClave;
    private javax.swing.JLabel labUsuario;
    private javax.swing.JList<String> listDetalleUsuario;
    private javax.swing.JPanel panelClave;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    // End of variables declaration//GEN-END:variables
}
