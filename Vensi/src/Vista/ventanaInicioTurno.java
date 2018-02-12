package Vista;

import DAO.TurnoDAO;
import DAO.UsuarioDAO;
import Modelo.Turno;
import Modelo.Usuario;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaInicioTurno extends javax.swing.JFrame 
{
    UsuarioDAO uDAO = new UsuarioDAO();
    TurnoDAO tDAO = new TurnoDAO();
    
    ImageIcon icono;
    
    public ventanaInicioTurno() 
    {        
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        btnSI.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNO = new javax.swing.JButton();
        labPregunta = new javax.swing.JLabel();
        lbPin = new javax.swing.JLabel();
        btnSI = new javax.swing.JButton();
        txfdPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar turno");
        setName("ventanaIniciarTurno"); // NOI18N
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        btnNO.setBackground(new java.awt.Color(255, 153, 153));
        btnNO.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"))); // NOI18N
        btnNO.setText("NO");
        btnNO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNO.setFocusPainted(false);
        btnNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNO.setIconTextGap(30);
        btnNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNOMouseExited(evt);
            }
        });
        btnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOActionPerformed(evt);
            }
        });

        labPregunta.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labPregunta.setForeground(new java.awt.Color(255, 255, 255));
        labPregunta.setText("¿Está seguro que desea iniciar el turno ahora?");

        lbPin.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lbPin.setForeground(new java.awt.Color(255, 255, 255));
        lbPin.setText("Ingrese el pin:");
        lbPin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSI.setBackground(new java.awt.Color(153, 255, 153));
        btnSI.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnSI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/si_50.png"))); // NOI18N
        btnSI.setText("SI");
        btnSI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSI.setFocusPainted(false);
        btnSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSI.setIconTextGap(30);
        btnSI.setNextFocusableComponent(btnNO);
        btnSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSIMouseExited(evt);
            }
        });
        btnSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIActionPerformed(evt);
            }
        });

        txfdPin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txfdPin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdPin.setNextFocusableComponent(btnSI);
        txfdPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdPinKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdPinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbPin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnNO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnSI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labPregunta)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdPin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOActionPerformed
        dispose();
    }//GEN-LAST:event_btnNOActionPerformed

    private void btnSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIActionPerformed
        int pin = Integer.parseInt(txfdPin.getText());
        
        if(uDAO.verificar("Propietario", pin) || uDAO.verificar("Empleado", pin))
        {         
            Turno unTurno = new Turno(); 
            Date fechaHoraInicio = new Date();  
                        
            List<Usuario> listaUsuarios = uDAO.listar();
            
            for (Usuario u : listaUsuarios)
            {
                if (u.getPin() == pin)
                {
                    unTurno.setUsuario(u);
                }
            }
            unTurno.setCantVentas(0);
            unTurno.setFechaHoraInicio(fechaHoraInicio);      
                                    
            tDAO.alta(unTurno);
                            
            dispose();            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            txfdPin.setText("");
            btnSI.setEnabled(false);
        }
    }//GEN-LAST:event_btnSIActionPerformed

    private void txfdPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPinKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume(); 
    }//GEN-LAST:event_txfdPinKeyTyped

    private void btnNOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_lleno_50.png"));     
        btnNO.setIcon(icono); 
    }//GEN-LAST:event_btnNOMouseEntered

    private void btnNOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"));     
        btnNO.setIcon(icono);
    }//GEN-LAST:event_btnNOMouseExited

    private void btnSIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMouseEntered
        if (!txfdPin.getText().equals("")) 
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/si_lleno_50.png"));     
            btnSI.setIcon(icono);
        }        
    }//GEN-LAST:event_btnSIMouseEntered

    private void btnSIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/si_50.png"));     
        btnSI.setIcon(icono);
    }//GEN-LAST:event_btnSIMouseExited

    private void txfdPinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdPinKeyReleased
        if (txfdPin.getText().equals("")) 
        {
            btnSI.setEnabled(false);
        } 
        else 
        {
            btnSI.setEnabled(true);
        }
    }//GEN-LAST:event_txfdPinKeyReleased
    
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
    private javax.swing.JButton btnNO;
    private javax.swing.JButton btnSI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labPregunta;
    private javax.swing.JLabel lbPin;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JPasswordField txfdPin;
    // End of variables declaration//GEN-END:variables
}