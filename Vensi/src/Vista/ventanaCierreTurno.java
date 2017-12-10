package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemVentaDAO;
import DAO.TurnoDAO;
import Modelo.EntradaSalida;
import Modelo.ItemVenta;
import Modelo.Turno;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ventanaCierreTurno extends javax.swing.JFrame 
{
    TurnoDAO tDAO = new TurnoDAO();   
    ItemVentaDAO itDAO = new ItemVentaDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    
    Turno elTurno = new Turno();
    Turno turnoActual = null;
    static int id_turnoActualCT;
    
    public ventanaCierreTurno() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana  
        
        //turnoActual = tDAO.obtenerUltimo();
        
        //el HAY se calcula automaticamente a medida que va ingresando los billetes
        txfdMontoEsperado.setText("$" + String.valueOf(calcularMontoEsperado()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAceptarCerrarTurno = new javax.swing.JButton();
        btnCancelarCerrarTurno = new javax.swing.JButton();
        txfdDiferencia = new javax.swing.JTextField();
        txfdMontoEsperado = new javax.swing.JTextField();
        txfdHay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txfd500 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txfd200 = new javax.swing.JTextField();
        txfd100 = new javax.swing.JTextField();
        txfd50 = new javax.swing.JTextField();
        txfd20 = new javax.swing.JTextField();
        txfd10 = new javax.swing.JTextField();
        txfd5 = new javax.swing.JTextField();
        txfd2 = new javax.swing.JTextField();
        txfd1 = new javax.swing.JTextField();
        txfd0050 = new javax.swing.JTextField();
        txfd0025 = new javax.swing.JTextField();
        txfd500total = new javax.swing.JTextField();
        txfd200total = new javax.swing.JTextField();
        txfd100total = new javax.swing.JTextField();
        txfd50total = new javax.swing.JTextField();
        txfd20total = new javax.swing.JTextField();
        txfd10total = new javax.swing.JTextField();
        txfd5total = new javax.swing.JTextField();
        txfd2total = new javax.swing.JTextField();
        txfd1total = new javax.swing.JTextField();
        txfd0050total = new javax.swing.JTextField();
        txfd0025total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cierre de turno");

        jLabel12.setText("Hay");

        jLabel13.setText("Monto esperado:");

        jLabel14.setText("Diferencia");

        btnAceptarCerrarTurno.setText("Aceptar");
        btnAceptarCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCerrarTurnoActionPerformed(evt);
            }
        });

        btnCancelarCerrarTurno.setText("Cancelar");
        btnCancelarCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCerrarTurnoActionPerformed(evt);
            }
        });

        txfdDiferencia.setEditable(false);

        txfdMontoEsperado.setEditable(false);

        txfdHay.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarCerrarTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdMontoEsperado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txfdHay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel12)
                            .addGap(38, 38, 38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(32, 32, 32))
                        .addComponent(txfdDiferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdMontoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdHay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("500 x");

        jButton2.setText("200 x");

        jButton3.setText("100 x");

        jButton5.setText("20 x");

        jButton6.setText("10 x");

        jButton7.setText("5 x");

        jButton8.setText("2 x ");

        jButton9.setText("1 x");

        jButton10.setText("00,50 x");

        jButton11.setText("00,25 x");

        txfd500.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd500KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd500KeyTyped(evt);
            }
        });

        jButton4.setText("50 x");

        txfd200.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd200KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd200KeyTyped(evt);
            }
        });

        txfd100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd100KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd100KeyTyped(evt);
            }
        });

        txfd50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd50KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd50KeyTyped(evt);
            }
        });

        txfd20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd20KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd20KeyTyped(evt);
            }
        });

        txfd10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd10KeyTyped(evt);
            }
        });

        txfd5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd5KeyTyped(evt);
            }
        });

        txfd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd2KeyTyped(evt);
            }
        });

        txfd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd1KeyTyped(evt);
            }
        });

        txfd0050.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd0050KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd0050KeyTyped(evt);
            }
        });

        txfd0025.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd0025KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd0025KeyTyped(evt);
            }
        });

        txfd500total.setEditable(false);

        txfd200total.setEditable(false);

        txfd100total.setEditable(false);

        txfd50total.setEditable(false);

        txfd20total.setEditable(false);

        txfd10total.setEditable(false);

        txfd5total.setEditable(false);

        txfd2total.setEditable(false);

        txfd1total.setEditable(false);

        txfd0050total.setEditable(false);

        txfd0025total.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("  =");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("  =");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("  =");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("  =");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("  =");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("  =");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("  =");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("  =");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("  =");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("  =");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("  =");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd100))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd0025))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfd500, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(txfd200))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfd0050)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd100total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd50total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd20total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd500total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd200total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd10total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd5total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd2total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd1total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd0050total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfd0025total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd500total, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txfd500)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txfd200)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd200total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txfd100)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd100total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd50total)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txfd50)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd20total)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd10total)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txfd10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd5total)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd2total)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd1total)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfd0050total)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd0050))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfd0025))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(txfd0025total))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public double calcularHay()
    {
        double hay = 0;
        int m500=0, m200=0, m100=0, m50=0, m20=0, m10=0, m5=0, m2=0, m1=0;
        double m0050=0, m0025=0;
        
        if (!txfd500total.getText().equals(""))
        {
            m500 = Integer.parseInt(txfd500.getText()) * 500;
        }        
        if (!txfd200total.getText().equals(""))
        {
            m200 = Integer.parseInt(txfd200.getText()) * 200;
        }
        if (!txfd100total.getText().equals(""))
        {
            m100 = Integer.parseInt(txfd100.getText()) * 100;;
        }
        if (!txfd50total.getText().equals(""))
        {
            m50 = Integer.parseInt(txfd50.getText()) * 50;
        }
        if (!txfd20total.getText().equals(""))
        {
            m20 = Integer.parseInt(txfd20.getText()) * 20;
        }
        if (!txfd10total.getText().equals(""))
        {
            m10 = Integer.parseInt(txfd10.getText()) * 10;
        }
        if (!txfd5total.getText().equals(""))
        {
            m5 = Integer.parseInt(txfd5.getText()) * 5;
        }
        if (!txfd2total.getText().equals(""))
        {
            m2 = Integer.parseInt(txfd2.getText()) * 2;
        }
        if (!txfd1total.getText().equals(""))
        {
            m1 = Integer.parseInt(txfd1.getText()) * 1;
        }
        if (!txfd0050total.getText().equals(""))
        {
            m0050 = Double.parseDouble(txfd0050.getText()) * 00.50;
        }
        if (!txfd0025total.getText().equals(""))
        {
            m0025 = Double.parseDouble(txfd0025.getText()) * 00.25;
        }
               
        hay = m500+m200+m100+m50+m20+m10+m5+m2+m1+m0050+m0025;
        
        return hay;
    }
    
    public double calcularMontoEsperado()
    {        
        
        List<ItemVenta> listaIT = itDAO.listar(id_turnoActualCT);
        List<EntradaSalida> listaES = esDAO.listar(id_turnoActualCT);
        
        double montoVenta = 0;
        double montoES = 0;
        double montoEsperado=0;
        
        for (ItemVenta iv : listaIT)
        {
            montoVenta = montoVenta + (iv.getProducto().getPrecioVenta() * iv.getCantidad());
        }
        
        for (EntradaSalida es : listaES)
        {
            if (es.isTipo()) //entrada
            {
                montoES = montoES + es.getMonto();
            }
            else    //salida
            {
                montoES = montoES - es.getMonto();
            }            
        }         
        montoEsperado = montoVenta + montoES;
        
        return montoEsperado;
    }
    
    public double calcularDiferencia()
    {
        double diferencia = 0;
        
        double hay = calcularHay();
        double montoEsperado = calcularMontoEsperado();
        
        diferencia = hay - montoEsperado;
        
        return diferencia;
    }
    
    private void btnCancelarCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCerrarTurnoActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarCerrarTurnoActionPerformed

    private void btnAceptarCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCerrarTurnoActionPerformed
        elTurno.setFechaHoraFin(new Date());
        elTurno = tDAO.buscarPorID(id_turnoActualCT);
        tDAO.modificar(elTurno, id_turnoActualCT);
        
        JOptionPane.showMessageDialog(null, "Se ha cerrado el turno correctamente.");
              
        dispose();        
    }//GEN-LAST:event_btnAceptarCerrarTurnoActionPerformed

    private void txfd500KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd500KeyReleased
        if (txfd500.getText().equals(""))
        {
            txfd500total.setText("");            
        }
        else
        {
            int cant500 = Integer.parseInt(txfd500.getText());
            int monto500 = 500 * cant500;
            txfd500total.setText(String.valueOf(monto500));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd500KeyReleased

    private void txfd500KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd500KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd500KeyTyped

    private void txfd200KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd200KeyReleased
        if (txfd200.getText().equals(""))
        {
            txfd200total.setText("");            
        }
        else
        {
            int cant200 = Integer.parseInt(txfd200.getText());
            int monto200 = 200 * cant200;
            txfd200total.setText(String.valueOf(monto200));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd200KeyReleased

    private void txfd200KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd200KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd200KeyTyped

    private void txfd100KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd100KeyReleased
        if (txfd100.getText().equals(""))
        {
            txfd100total.setText("");            
        }
        else
        {
            int cant100 = Integer.parseInt(txfd100.getText());
            int monto100 = 100 * cant100;
            txfd100total.setText(String.valueOf(monto100));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd100KeyReleased

    private void txfd100KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd100KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd100KeyTyped

    private void txfd50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd50KeyReleased
        if (txfd50.getText().equals(""))
        {
            txfd50total.setText("");            
        }
        else
        {
            int cant50 = Integer.parseInt(txfd50.getText());
            int monto50 = 50 * cant50;
            txfd50total.setText(String.valueOf(monto50));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd50KeyReleased

    private void txfd50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd50KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd50KeyTyped

    private void txfd20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd20KeyReleased
        if (txfd20.getText().equals(""))
        {
            txfd20total.setText("");            
        }
        else
        {
            int cant20 = Integer.parseInt(txfd20.getText());
            int monto20 = 20 * cant20;
            txfd20total.setText(String.valueOf(monto20));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd20KeyReleased

    private void txfd20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd20KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd20KeyTyped

    private void txfd10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd10KeyReleased
        if (txfd10.getText().equals(""))
        {
            txfd10total.setText("");            
        }
        else
        {
            int cant10 = Integer.parseInt(txfd10.getText());
            int monto10 = 10 * cant10;
            txfd10total.setText(String.valueOf(monto10));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd10KeyReleased

    private void txfd10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd10KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd10KeyTyped

    private void txfd5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd5KeyReleased
        if (txfd5.getText().equals(""))
        {
            txfd5total.setText("");            
        }
        else
        {
            int cant5 = Integer.parseInt(txfd5.getText());
            int monto5 = 5 * cant5;
            txfd5total.setText(String.valueOf(monto5));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd5KeyReleased

    private void txfd5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd5KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd5KeyTyped

    private void txfd2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd2KeyReleased
        if (txfd2.getText().equals(""))
        {
            txfd2total.setText("");            
        }
        else
        {
            int cant2 = Integer.parseInt(txfd2.getText());
            int monto2 = 2 * cant2;
            txfd2total.setText(String.valueOf(monto2));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd2KeyReleased

    private void txfd2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd2KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd2KeyTyped

    private void txfd1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd1KeyReleased
        if (txfd1.getText().equals(""))
        {
            txfd1total.setText("");            
        }
        else
        {
            int cant1 = Integer.parseInt(txfd1.getText());
            int monto1 = 1 * cant1;
            txfd1total.setText(String.valueOf(monto1));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd1KeyReleased

    private void txfd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd1KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd1KeyTyped

    private void txfd0050KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0050KeyReleased
        if (txfd0050.getText().equals(""))
        {
            txfd0050total.setText("");            
        }
        else
        {
            int cant0050 = Integer.parseInt(txfd0050.getText());
            double monto0050 = 00.50 * cant0050;
            txfd0050total.setText(String.valueOf(monto0050));
        }
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd0050KeyReleased

    private void txfd0050KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0050KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd0050KeyTyped

    private void txfd0025KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0025KeyReleased
        if (txfd0025.getText().equals(""))
        {
            txfd0025total.setText("");            
        }
        else
        {
            int cant0025 = Integer.parseInt(txfd0025.getText());
            double monto0025 = 00.25 * cant0025;
            txfd0025total.setText(String.valueOf(monto0025));
        } 
        txfdHay.setText("$" + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$" + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd0025KeyReleased

    private void txfd0025KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0025KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && 
                (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd0025KeyTyped

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaCierreTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCerrarTurno;
    private javax.swing.JButton btnCancelarCerrarTurno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txfd0025;
    private javax.swing.JTextField txfd0025total;
    private javax.swing.JTextField txfd0050;
    private javax.swing.JTextField txfd0050total;
    private javax.swing.JTextField txfd1;
    private javax.swing.JTextField txfd10;
    private javax.swing.JTextField txfd100;
    private javax.swing.JTextField txfd100total;
    private javax.swing.JTextField txfd10total;
    private javax.swing.JTextField txfd1total;
    private javax.swing.JTextField txfd2;
    private javax.swing.JTextField txfd20;
    private javax.swing.JTextField txfd200;
    private javax.swing.JTextField txfd200total;
    private javax.swing.JTextField txfd20total;
    private javax.swing.JTextField txfd2total;
    private javax.swing.JTextField txfd5;
    private javax.swing.JTextField txfd50;
    private javax.swing.JTextField txfd500;
    private javax.swing.JTextField txfd500total;
    private javax.swing.JTextField txfd50total;
    private javax.swing.JTextField txfd5total;
    private javax.swing.JTextField txfdDiferencia;
    private javax.swing.JTextField txfdHay;
    private javax.swing.JTextField txfdMontoEsperado;
    // End of variables declaration//GEN-END:variables
}
