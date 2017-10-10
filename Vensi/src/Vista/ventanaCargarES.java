package Vista;

import java.awt.Dimension;

public class ventanaCargarES extends javax.swing.JFrame 
{
    public ventanaCargarES() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        this.setPreferredSize(new Dimension(780, 440));     //tamaño en la que aparecerá la ventana al ejecutar 
        
        if (cbTipoES.getSelectedItem().equals("Ninguno"))
        {
            for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
            {
                panelidentificarProd.getComponent(i).setEnabled(false);
            }
        }
        else
        {
           for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
            {
                panelidentificarProd.getComponent(i).setEnabled(true);
            } 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbTipoES = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaDescripcion = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        labTitulo = new javax.swing.JLabel();
        panelidentificarProd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfdCantidadProdAnular = new javax.swing.JTextField();
        txfdCodigoProdAnular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInfoProdAnular = new javax.swing.JList<>();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTipoES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Apertura de caja", "Retiro", "Anulación de venta", "Sueldo", "Mantenimiento", "Gasto vario", "Proveedor", "Alquiler", "Impuesto", " ", " ", " ", " ", " " }));
        cbTipoES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoESActionPerformed(evt);
            }
        });
        jPanel1.add(cbTipoES, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 220, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        btnConfirmar.setText("Confirmar");
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 100, 30));

        txAreaDescripcion.setColumns(20);
        txAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txAreaDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 370));

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Icono_salir_blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        labTitulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labTitulo.setText("Cargar entrada/salida");
        getContentPane().add(labTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -3, -1, 50));

        panelidentificarProd.setBackground(new java.awt.Color(0, 0, 0));
        panelidentificarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el código del producto:");
        panelidentificarProd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad:");
        panelidentificarProd.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));
        panelidentificarProd.add(txfdCantidadProdAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));
        panelidentificarProd.add(txfdCodigoProdAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacíon del producto:");
        panelidentificarProd.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jScrollPane1.setViewportView(listaInfoProdAnular);

        panelidentificarProd.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 310, 140));

        getContentPane().add(panelidentificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 420, 370));

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Imagen_fondo_agua.jpg"))); // NOI18N
        labImagenFondo.setText("jLabel1");
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventanaDetalleCaja vDetalleCaja = new ventanaDetalleCaja();
        vDetalleCaja.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbTipoESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoESActionPerformed
        if (cbTipoES.getSelectedItem().equals("Anulación de venta"))
        {
            for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
            {
                panelidentificarProd.getComponent(i).setEnabled(true);
            }
        }
        else
        {
           for(int i=0 ; i < panelidentificarProd.getComponents().length ; i++)  //deshabilita el panel de identificar producto
            {
                panelidentificarProd.getComponent(i).setEnabled(false);
            } 
        }
        
                
    }//GEN-LAST:event_cbTipoESActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ventanaDetalleCaja vDetalleCaja = new ventanaDetalleCaja();
        vDetalleCaja.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaCargarES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbTipoES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JList<String> listaInfoProdAnular;
    private javax.swing.JPanel panelidentificarProd;
    private javax.swing.JTextArea txAreaDescripcion;
    private javax.swing.JTextField txfdCantidadProdAnular;
    private javax.swing.JTextField txfdCodigoProdAnular;
    // End of variables declaration//GEN-END:variables
}
