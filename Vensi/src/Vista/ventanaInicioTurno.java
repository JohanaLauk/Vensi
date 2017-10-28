package Vista;

import DAO.TurnoDAO;
import DAO.UsuarioDAO;
import Modelo.Turno;
import java.util.Date;
import javax.swing.JOptionPane;

public class ventanaInicioTurno extends javax.swing.JFrame 
{
    UsuarioDAO uDAO = new UsuarioDAO();
    TurnoDAO tDAO = new TurnoDAO();
    
    public ventanaInicioTurno() 
    {        
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        btnSIiniciarTurno.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNOiniciarTurno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSIiniciarTurno = new javax.swing.JButton();
        lbPin = new javax.swing.JLabel();
        txfdPin = new javax.swing.JPasswordField();
        labTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ventanaIniciarTurno"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        btnNOiniciarTurno.setText("NO");
        btnNOiniciarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOiniciarTurnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Está seguro que desea iniciar el turno ahora?");

        btnSIiniciarTurno.setText("SI");
        btnSIiniciarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIiniciarTurnoActionPerformed(evt);
            }
        });

        lbPin.setText("Ingrese el pin:");

        txfdPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfdPinKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNOiniciarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(btnSIiniciarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbPin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPin)
                    .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNOiniciarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSIiniciarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 180));

        labTitulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labTitulo.setText("Inicio de turno");
        labTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(labTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono_salir_blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        labImagenFondo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagen_fondo_agua.jpg"))); // NOI18N
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventanaVenta vVenta = new ventanaVenta();
        vVenta.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNOiniciarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOiniciarTurnoActionPerformed
        ventanaVenta vVenta = new ventanaVenta();
        vVenta.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnNOiniciarTurnoActionPerformed

    private void txfdPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPinKeyPressed
        
        if (!txfdPin.equals("")) {
            btnSIiniciarTurno.setEnabled(true);
        } else {
            btnSIiniciarTurno.setEnabled(false);
        }
    }//GEN-LAST:event_txfdPinKeyPressed

    private void btnSIiniciarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIiniciarTurnoActionPerformed
        
        if(uDAO.verificar("Dueño", Integer.parseInt(txfdPin.getText())) | uDAO.verificar("Empleado", Integer.parseInt(txfdPin.getText())))
        {
            Turno nuevoTurno = new Turno();
            nuevoTurno.setFechaHoraInicio(new Date());
            nuevoTurno.setFechaHoraFin(new Date());  // sólo para que no quede nula
            tDAO.alta(nuevoTurno);
            
            ventanaVenta vVenta = new ventanaVenta();
            vVenta.setVisible(true);    
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            txfdPin.setText("");
        }
    }//GEN-LAST:event_btnSIiniciarTurnoActionPerformed
    
    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaInicioTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNOiniciarTurno;
    private javax.swing.JButton btnSIiniciarTurno;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JLabel lbPin;
    private javax.swing.JPasswordField txfdPin;
    // End of variables declaration//GEN-END:variables
}