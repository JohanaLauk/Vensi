package Vista;

import DAO.ProveedorDAO;
import Modelo.Producto;
import Modelo.Proveedor;
import Utils.Validar;
import java.awt.Dimension;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaEditarProv extends javax.swing.JFrame 
{
    ProveedorDAO pDAO = new ProveedorDAO();
    Validar validar = new Validar();
    public static int id_recibido;
    Proveedor elProv = null;      

    ImageIcon icono;
    
    public ventanaEditarProv() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana          
        this.setMinimumSize(new Dimension(333, 635));  //al minimizar la ventana no permite que sea mas chico que esa medida       
        this.setPreferredSize(new Dimension(333, 635));    //al minimizar la ventana aparece con esa medida    
               
        elProv = pDAO.buscarPorId(id_recibido);
        
        mostrarProvSelec();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbEditarEstado = new javax.swing.JComboBox<>();
        txfdEditarRazonSocial = new javax.swing.JTextField();
        txfdEditarDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfdLocalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfdProvincia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txfdPais = new javax.swing.JTextField();
        txfdEditarContacto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfdEditarCuit = new org.jdesktop.swingx.JXTextField();
        panelBotones = new javax.swing.JPanel();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar proveedor");
        setMinimumSize(new java.awt.Dimension(333, 635));
        setPreferredSize(new java.awt.Dimension(333, 635));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelDatos.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Razon social:");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("CUIT:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        cbEditarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        cbEditarEstado.setNextFocusableComponent(btnAceptarEditar);

        txfdEditarRazonSocial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarRazonSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarRazonSocial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarRazonSocial.setNextFocusableComponent(txfdEditarCuit);

        txfdEditarDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarDireccion.setNextFocusableComponent(txfdLocalidad);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Localidad:");

        txfdLocalidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdLocalidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdLocalidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdLocalidad.setNextFocusableComponent(txfdProvincia);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Provincia:");

        txfdProvincia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdProvincia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdProvincia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdProvincia.setNextFocusableComponent(txfdPais);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("País:");

        txfdPais.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdPais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdPais.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPais.setNextFocusableComponent(txfdEditarContacto);

        txfdEditarContacto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarContacto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdEditarContacto.setNextFocusableComponent(cbEditarEstado);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Contacto:");

        txfdEditarCuit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdEditarCuit.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txfdEditarCuit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdEditarCuit.setPrompt("XX-XXXXXXXX-X");
        txfdEditarCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdEditarCuitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfdEditarRazonSocial)
            .addComponent(txfdEditarDireccion)
            .addComponent(txfdLocalidad)
            .addComponent(txfdProvincia)
            .addComponent(txfdPais)
            .addComponent(txfdEditarContacto)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txfdEditarCuit, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdPais, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdEditarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEditarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBotones.setOpaque(false);

        btnAceptarEditar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptarEditar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAceptarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"))); // NOI18N
        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarEditar.setFocusPainted(false);
        btnAceptarEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptarEditar.setIconTextGap(10);
        btnAceptarEditar.setNextFocusableComponent(btnCancelarEditar);
        btnAceptarEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarEditarMouseExited(evt);
            }
        });
        btnAceptarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelarEditar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"))); // NOI18N
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarEditar.setFocusPainted(false);
        btnCancelarEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelarEditar.setIconTextGap(10);
        btnCancelarEditar.setNextFocusableComponent(txfdEditarRazonSocial);
        btnCancelarEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarEditarMouseExited(evt);
            }
        });
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancelarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        Proveedor prov = new Proveedor();
        String cuitInput = txfdEditarCuit.getText();        
        
        if (!txfdEditarRazonSocial.getText().equals("") && !cuitInput.equals("")) 
        {
            if (validar.validarCUIT(cuitInput)) 
            {
                Proveedor provRepetido = pDAO.buscar1PorCuit(cuitInput);
                
                if (provRepetido == null || elProv.getCuit().equals(cuitInput))   //si el cuit es unico (no se repite)...                 
                {                
                    prov.setRazonSocial(txfdEditarRazonSocial.getText().toUpperCase());
                    prov.setCuit(cuitInput);
                    prov.setDireccion(txfdEditarDireccion.getText().toUpperCase());
                    prov.setLocalidad(txfdLocalidad.getText().toUpperCase());
                    prov.setProvincia(txfdProvincia.getText().toUpperCase());
                    prov.setPais(txfdPais.getText().toUpperCase());
                    prov.setContacto(txfdEditarContacto.getText());

                    if (cbEditarEstado.getSelectedItem().equals("Habilitado")) 
                    {
                        prov.setEstado(true);
                    } 
                    else 
                    {
                        Set<Producto> misProdusctos = prov.getMisProductos();
                        
                        if (misProdusctos.size() != 0)       //si tiene producto...  
                        {
                            JOptionPane.showMessageDialog(null, "¡ALERTA! No puede deshabilitar el proveedor porque aún tiene productos a cargo."
                                    + "\nDiríjase a \"Gestión del producto\" y quite la referencia del proveedor de su producto, "
                                    + "\nsí es ese el caso (recuerde que un producto siempre debe tener, al menos, un proveedor a cargo)."
                                    + "\nDe lo contrario, aguarde a que el producto se agote, quite la referencia del proveedor, "
                                    + "\ndeshabilite el producto y luego deshabilite el proveedor.");
                        }
                        else    //Si no tiene productos referenciados...
                        {
                            prov.setEstado(false);
                        }
                    }

                    pDAO.modificar(prov, id_recibido);

                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El nuevo CUIT del proveedor que ingresó ya existe.\n" +
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
    }//GEN-LAST:event_btnAceptarEditarActionPerformed

    private void txfdEditarCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdEditarCuitKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE) && (c != '-'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txfdEditarCuitKeyTyped

    private void btnCancelarEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarEditarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_lleno_50.png"));     
        btnCancelarEditar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarEditarMouseEntered

    private void btnCancelarEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarEditarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/cancelar_50.png"));     
        btnCancelarEditar.setIcon(icono);
    }//GEN-LAST:event_btnCancelarEditarMouseExited

    private void btnAceptarEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarEditarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_lleno_50.png"));     
        btnAceptarEditar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarEditarMouseEntered

    private void btnAceptarEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarEditarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/confirmar_50.png"));     
        btnAceptarEditar.setIcon(icono);
    }//GEN-LAST:event_btnAceptarEditarMouseExited
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaEditarProv().setVisible(true);
            }
        });
    }
    
    public void mostrarProvSelec()
    {               
        //MOSTRAMOS LOS DATOS GUARDADOS DEL PROVEEDOR SELECCIONADO. PARA LUEGO PODER MODIFICAR
        txfdEditarRazonSocial.setText(String.valueOf(elProv.getRazonSocial()));
        txfdEditarCuit.setText(String.valueOf(elProv.getCuit()));
        txfdEditarDireccion.setText(String.valueOf(elProv.getDireccion()));
        txfdLocalidad.setText(String.valueOf(elProv.getLocalidad()));
        txfdProvincia.setText(String.valueOf(elProv.getProvincia()));
        txfdPais.setText(String.valueOf(elProv.getPais()));
        txfdEditarContacto.setText(String.valueOf(elProv.getContacto()));
        
        if(elProv.isEstado())
        {
            cbEditarEstado.setSelectedItem("Habilitado");
        }
        else
        {
            cbEditarEstado.setSelectedItem("Deshabilitado");
        }         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEditar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JComboBox<String> cbEditarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTextField txfdEditarContacto;
    private org.jdesktop.swingx.JXTextField txfdEditarCuit;
    private javax.swing.JTextField txfdEditarDireccion;
    private javax.swing.JTextField txfdEditarRazonSocial;
    private javax.swing.JTextField txfdLocalidad;
    private javax.swing.JTextField txfdPais;
    private javax.swing.JTextField txfdProvincia;
    // End of variables declaration//GEN-END:variables
}
