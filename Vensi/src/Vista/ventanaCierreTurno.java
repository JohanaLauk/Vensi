package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemVentaDAO;
import DAO.TurnoDAO;
import Modelo.EntradaSalida;
import Modelo.ItemVenta;
import Modelo.Turno;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventanaCierreTurno extends javax.swing.JFrame 
{
    TurnoDAO tDAO = new TurnoDAO();   
    ItemVentaDAO itDAO = new ItemVentaDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    
    Turno turnoActual = null;    
    public static int cantVentas;
    
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    
    ImageIcon icono;
    
    public ventanaCierreTurno() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana  
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        this.setMinimumSize(new Dimension(1150, 730));
        this.setPreferredSize(new Dimension(1150, 730));
        
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/V.jpg"));
        this.setIconImage(ico);
          
        turnoActual = tDAO.obtenerUltimo();
        
        this.setTitle("Cierre de turno   -   Turno N°" + turnoActual.getId() 
                        + "  -  Apertura: " + fechaHoraFormat.format(turnoActual.getFechaHoraInicio()) + "hs.");
        
        //el HAY se calcula automaticamente a medida que va ingresando los billetes
        txfdMontoEsperado.setText("$   " + String.valueOf(formatoPrecios.format(calcularMontoEsperado())));
        txfdDiferencia.setText("$   " + String.valueOf(formatoPrecios.format(calcularDiferencia())));       
        
        txfdMontoEntradas.setText("$   " + String.valueOf(formatoPrecios.format(calcularMontoVentas() + calcularMontoEntradas())));
        txfdMontoSalidas.setText("$   " + String.valueOf(formatoPrecios.format(calcularMontoSalidas())));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelCalculos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAceptarCerrarTurno = new javax.swing.JButton();
        btnCancelarCerrarTurno = new javax.swing.JButton();
        txfdDiferencia = new javax.swing.JTextField();
        txfdMontoEsperado = new javax.swing.JTextField();
        txfdHay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txfdMontoEntradas = new javax.swing.JTextField();
        txfdMontoSalidas = new javax.swing.JTextField();
        panelEntradas = new javax.swing.JPanel();
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
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cierre de turno");
        setMinimumSize(new java.awt.Dimension(1150, 730));
        setPreferredSize(new java.awt.Dimension(1150, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(102, 102, 102));

        panelCalculos.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Efectivo hay");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Monto esperado");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Diferencia");

        btnAceptarCerrarTurno.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptarCerrarTurno.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnAceptarCerrarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"))); // NOI18N
        btnAceptarCerrarTurno.setText("Aceptar");
        btnAceptarCerrarTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarCerrarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarCerrarTurno.setFocusPainted(false);
        btnAceptarCerrarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAceptarCerrarTurno.setIconTextGap(20);
        btnAceptarCerrarTurno.setNextFocusableComponent(btnCancelarCerrarTurno);
        btnAceptarCerrarTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarCerrarTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarCerrarTurnoMouseExited(evt);
            }
        });
        btnAceptarCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCerrarTurnoActionPerformed(evt);
            }
        });

        btnCancelarCerrarTurno.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelarCerrarTurno.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnCancelarCerrarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"))); // NOI18N
        btnCancelarCerrarTurno.setText("Cancelar");
        btnCancelarCerrarTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarCerrarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCerrarTurno.setFocusPainted(false);
        btnCancelarCerrarTurno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelarCerrarTurno.setIconTextGap(20);
        btnCancelarCerrarTurno.setNextFocusableComponent(txfdMontoEsperado);
        btnCancelarCerrarTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarCerrarTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarCerrarTurnoMouseExited(evt);
            }
        });
        btnCancelarCerrarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCerrarTurnoActionPerformed(evt);
            }
        });

        txfdDiferencia.setEditable(false);
        txfdDiferencia.setBackground(new java.awt.Color(242, 116, 39));
        txfdDiferencia.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txfdDiferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdDiferencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdDiferencia.setNextFocusableComponent(txfd500);

        txfdMontoEsperado.setEditable(false);
        txfdMontoEsperado.setBackground(new java.awt.Color(63, 157, 224));
        txfdMontoEsperado.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txfdMontoEsperado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdMontoEsperado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdMontoEsperado.setNextFocusableComponent(txfdHay);

        txfdHay.setEditable(false);
        txfdHay.setBackground(new java.awt.Color(15, 190, 85));
        txfdHay.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txfdHay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdHay.setText("$   0,00");
        txfdHay.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdHay.setNextFocusableComponent(txfdDiferencia);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("    CÁLCULOS");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Monto entradas");

        jLabel18.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Monto salidas");

        txfdMontoEntradas.setBackground(new java.awt.Color(0, 0, 0));
        txfdMontoEntradas.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        txfdMontoEntradas.setForeground(new java.awt.Color(255, 255, 255));
        txfdMontoEntradas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdMontoEntradas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txfdMontoSalidas.setBackground(new java.awt.Color(0, 0, 0));
        txfdMontoSalidas.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        txfdMontoSalidas.setForeground(new java.awt.Color(255, 255, 255));
        txfdMontoSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdMontoSalidas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelCalculosLayout = new javax.swing.GroupLayout(panelCalculos);
        panelCalculos.setLayout(panelCalculosLayout);
        panelCalculosLayout.setHorizontalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdMontoEsperado)
                    .addComponent(txfdHay)
                    .addComponent(txfdDiferencia))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCancelarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnAceptarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(txfdMontoEntradas)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculosLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txfdMontoSalidas)
                .addGap(88, 88, 88))
        );
        panelCalculosLayout.setVerticalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdMontoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdHay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(1, 1, 1)
                .addComponent(txfdMontoEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfdMontoSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCerrarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelEntradas.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        panelEntradas.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(192, 195, 197));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setText("500 x");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(192, 195, 197));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setText("200 x");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setBackground(new java.awt.Color(192, 195, 197));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setText("100 x");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton5.setBackground(new java.awt.Color(192, 195, 197));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton5.setText("20 x");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton6.setBackground(new java.awt.Color(192, 195, 197));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton6.setText("10 x");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton7.setBackground(new java.awt.Color(192, 195, 197));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton7.setText("5 x");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton8.setBackground(new java.awt.Color(192, 195, 197));
        jButton8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton8.setText("2 x ");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton9.setBackground(new java.awt.Color(192, 195, 197));
        jButton9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton9.setText("1 x");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton10.setBackground(new java.awt.Color(192, 195, 197));
        jButton10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton10.setText("00,50 x");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton11.setBackground(new java.awt.Color(192, 195, 197));
        jButton11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton11.setText("00,25 x");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.setFocusPainted(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txfd500.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd500.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd500.setNextFocusableComponent(txfd200);
        txfd500.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd500KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd500KeyTyped(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(192, 195, 197));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton4.setText("50 x");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txfd200.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd200.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd200.setNextFocusableComponent(txfd100);
        txfd200.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd200KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd200KeyTyped(evt);
            }
        });

        txfd100.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd100.setNextFocusableComponent(txfd50);
        txfd100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd100KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd100KeyTyped(evt);
            }
        });

        txfd50.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd50.setNextFocusableComponent(txfd20);
        txfd50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd50KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd50KeyTyped(evt);
            }
        });

        txfd20.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd20.setNextFocusableComponent(txfd10);
        txfd20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd20KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd20KeyTyped(evt);
            }
        });

        txfd10.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd10.setNextFocusableComponent(txfd5);
        txfd10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd10KeyTyped(evt);
            }
        });

        txfd5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd5.setNextFocusableComponent(txfd2);
        txfd5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd5KeyTyped(evt);
            }
        });

        txfd2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd2.setNextFocusableComponent(txfd1);
        txfd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd2KeyTyped(evt);
            }
        });

        txfd1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd1.setNextFocusableComponent(txfd0050);
        txfd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd1KeyTyped(evt);
            }
        });

        txfd0050.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd0050.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd0050.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd0050.setNextFocusableComponent(txfd0025);
        txfd0050.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd0050KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd0050KeyTyped(evt);
            }
        });

        txfd0025.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd0025.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd0025.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd0025.setNextFocusableComponent(txfd500);
        txfd0025.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfd0025KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfd0025KeyTyped(evt);
            }
        });

        txfd500total.setEditable(false);
        txfd500total.setBackground(new java.awt.Color(153, 255, 153));
        txfd500total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd500total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd500total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd500total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd500total.setNextFocusableComponent(txfd200);

        txfd200total.setEditable(false);
        txfd200total.setBackground(new java.awt.Color(153, 255, 153));
        txfd200total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd200total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd200total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd200total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd200total.setNextFocusableComponent(txfd100);

        txfd100total.setEditable(false);
        txfd100total.setBackground(new java.awt.Color(153, 255, 153));
        txfd100total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd100total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd100total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd100total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd100total.setNextFocusableComponent(txfd50);

        txfd50total.setEditable(false);
        txfd50total.setBackground(new java.awt.Color(153, 255, 153));
        txfd50total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd50total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd50total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd50total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd50total.setNextFocusableComponent(txfd20);

        txfd20total.setEditable(false);
        txfd20total.setBackground(new java.awt.Color(153, 255, 153));
        txfd20total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd20total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd20total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd20total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd20total.setNextFocusableComponent(txfd10);

        txfd10total.setEditable(false);
        txfd10total.setBackground(new java.awt.Color(153, 255, 153));
        txfd10total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd10total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd10total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd10total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd10total.setNextFocusableComponent(txfd5);

        txfd5total.setEditable(false);
        txfd5total.setBackground(new java.awt.Color(153, 255, 153));
        txfd5total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd5total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd5total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd5total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd5total.setNextFocusableComponent(txfd2);

        txfd2total.setEditable(false);
        txfd2total.setBackground(new java.awt.Color(153, 255, 153));
        txfd2total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd2total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd2total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd2total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd2total.setNextFocusableComponent(txfd1);

        txfd1total.setEditable(false);
        txfd1total.setBackground(new java.awt.Color(153, 255, 153));
        txfd1total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd1total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd1total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd1total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd1total.setNextFocusableComponent(txfd0050);

        txfd0050total.setEditable(false);
        txfd0050total.setBackground(new java.awt.Color(153, 255, 153));
        txfd0050total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd0050total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd0050total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd0050total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd0050total.setNextFocusableComponent(txfd0025);

        txfd0025total.setEditable(false);
        txfd0025total.setBackground(new java.awt.Color(153, 255, 153));
        txfd0025total.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfd0025total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfd0025total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfd0025total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txfd0025total.setNextFocusableComponent(btnAceptarCerrarTurno);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("=");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("=");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("=");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("=");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("=");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("=");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("=");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        javax.swing.GroupLayout panelEntradasLayout = new javax.swing.GroupLayout(panelEntradas);
        panelEntradas.setLayout(panelEntradasLayout);
        panelEntradasLayout.setHorizontalGroup(
            panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntradasLayout.createSequentialGroup()
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txfd200, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfd500, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfd100, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfd50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEntradasLayout.createSequentialGroup()
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfd0050, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txfd1)
                            .addComponent(txfd2)
                            .addComponent(txfd5)
                            .addComponent(txfd10)
                            .addComponent(txfd20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfd0025))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfd2total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd1total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd0050total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd0025total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd10total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd20total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd50total, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfd500total)
                    .addComponent(txfd200total)
                    .addComponent(txfd100total)
                    .addComponent(txfd5total))
                .addContainerGap())
        );
        panelEntradasLayout.setVerticalGroup(
            panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradasLayout.createSequentialGroup()
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd500)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd500total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txfd200total)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntradasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfd200, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEntradasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txfd100))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd100total))
                .addGap(6, 6, 6)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd50)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd50total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd20)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd20total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd10total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd5total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd2total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd1total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd0050)
                    .addGroup(panelEntradasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txfd0050total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txfd0025)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfd0025total)))
        );

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ingrese la cantidad de billetes existentes en la caja");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelTodoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    public double calcularMontoVentas()      //monto ventas
    {
        double montoVenta = 0;
    
        List<ItemVenta> listaIT = itDAO.listar(turnoActual.getId());
        
        for (ItemVenta iv : listaIT)
        {
            montoVenta += iv.getMonto();
        }
        return montoVenta;
    }
    
    public double calcularMontoEntradas()    //monto aperturas
    {   
        double montoEntradas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (es.isTipo())  //entrada de plata
            {
                montoEntradas += es.getMonto();
            } 
        }        
        return montoEntradas;
    }
    
    public int calcularCantEntradas()       //cant aperturas
    {
        int cantEntradas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (es.isTipo())  //entrada de plata
            {
                cantEntradas += 1;
            } 
        }        
        return cantEntradas;
    }
    
    public double calcularMontoSalidas()     //monto retiros y sueldos
    {
        double montoSalidas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (!es.isTipo())  //salida de plata
            {
                if (!es.getNombre().equals("ANULACIÓN DE VENTA"))   //Retiros y sueldos
                {
                    montoSalidas += es.getMonto();
                }
            } 
        }        
        return montoSalidas;
    }
    
    public int calcularCantSalidas()        //cant retiros y sueldos
    {
        int cantSalidas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (!es.isTipo())  //salida de plata
            {
                if (!es.getNombre().equals("ANULACIÓN DE VENTA"))   //Retiros y sueldos
                {
                    cantSalidas += 1;
                }
            } 
        }        
        return cantSalidas;
    }
    
    public double calcularMontoAnuladas()   //monto anulaciones
    {
        double montoAnuladas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (!es.isTipo())  //salida de plata
            {
                if (es.getNombre().equals("ANULACIÓN DE VENTA"))   //Retiros y sueldos
                {
                    montoAnuladas += es.getMonto();
                }
            } 
        }        
        return montoAnuladas;
    }
    
    public int calcularCantAnuladas()       //cant anulaciones
    {
        int cantAnuladas = 0;
        
        List<EntradaSalida> listaES = esDAO.listar(turnoActual.getId());
        
        for (EntradaSalida es : listaES)
        {
            if (!es.isTipo())  //salida de plata
            {
                if (es.getNombre().equals("ANULACIÓN DE VENTA"))   //Retiros y sueldos
                {
                    cantAnuladas += 1;
                }
            } 
        }
        
        return cantAnuladas;
    }
    
    public double calcularMontoEsperado()
    {       
        double montoEsperado = 0;
                         
        montoEsperado = (calcularMontoVentas() + calcularMontoEntradas()) - calcularMontoSalidas();
        
        return montoEsperado;
    }
    
    public double calcularDiferencia()
    {
        double diferencia = 0;
        
        double hay = calcularHay();
        double montoEsperado = calcularMontoEsperado();
        
        if (montoEsperado < 0)  //si el monto esperado es negativo...
        {
            diferencia = montoEsperado + hay;   //Ej: -4759 = -5399 + 640;
        }
        else
        {
            diferencia = hay - montoEsperado;   //Ej:  4759 =  5399 - 640:
        }        
        
        return diferencia;
    }
    
    private void btnCancelarCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCerrarTurnoActionPerformed
        ventanaVenta vVenta = new ventanaVenta();        
        vVenta.setVisible(true);    //hace visible una ventana  
        dispose();
    }//GEN-LAST:event_btnCancelarCerrarTurnoActionPerformed

    private void btnAceptarCerrarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCerrarTurnoActionPerformed
        int cerrar = JOptionPane.showConfirmDialog(null, "¿Está seguro de cerrar el turno?", "Cerrar turno", JOptionPane.YES_NO_OPTION);
        if (cerrar == 0)
        {
            turnoActual.setFechaHoraFin(new Date());
            
            turnoActual.setMontoVentas(calcularMontoVentas());            
            
            turnoActual.setMontoEntradas(calcularMontoEntradas());
            turnoActual.setCantEntradas(calcularCantEntradas());
            
            turnoActual.setMontoSalidas(calcularMontoSalidas());
            turnoActual.setCantSalidas(calcularCantSalidas());
            
            turnoActual.setMontoAnuladas(calcularMontoAnuladas());
            turnoActual.setCantAnuladas(calcularCantAnuladas());
            
            turnoActual.setEfectivoHay(calcularHay());            
                    
            tDAO.modificar(turnoActual, turnoActual.getId());
            
            JOptionPane.showMessageDialog(null, "¡Se ha cerrado el turno correctamente!");
                          
            ventanaVenta vVenta = new ventanaVenta();        
            vVenta.setVisible(true);    //hace visible una ventana
            dispose();
        }               
    }//GEN-LAST:event_btnAceptarCerrarTurnoActionPerformed

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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd200KeyReleased

    private void txfd200KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd200KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd100KeyReleased

    private void txfd100KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd100KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd50KeyReleased

    private void txfd50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd50KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd20KeyReleased

    private void txfd20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd20KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd10KeyReleased

    private void txfd10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd10KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd5KeyReleased

    private void txfd5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd5KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd2KeyReleased

    private void txfd2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd2KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd1KeyReleased

    private void txfd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd1KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd0050KeyReleased

    private void txfd0050KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0050KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
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
        txfdHay.setText("$   " + String.valueOf(calcularHay()));
        txfdDiferencia.setText("$   " + String.valueOf(calcularDiferencia()));
    }//GEN-LAST:event_txfd0025KeyReleased

    private void txfd0025KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfd0025KeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_txfd0025KeyTyped

    private void btnAceptarCerrarTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarCerrarTurnoMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_lleno_50.png"));     
        btnAceptarCerrarTurno.setIcon(icono);
    }//GEN-LAST:event_btnAceptarCerrarTurnoMouseEntered

    private void btnAceptarCerrarTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarCerrarTurnoMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/aceptar_50.png"));     
        btnAceptarCerrarTurno.setIcon(icono);
    }//GEN-LAST:event_btnAceptarCerrarTurnoMouseExited

    private void btnCancelarCerrarTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCerrarTurnoMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_lleno_50.png"));     
        btnCancelarCerrarTurno.setIcon(icono);
    }//GEN-LAST:event_btnCancelarCerrarTurnoMouseEntered

    private void btnCancelarCerrarTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCerrarTurnoMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/no_50.png"));     
        btnCancelarCerrarTurno.setIcon(icono);
    }//GEN-LAST:event_btnCancelarCerrarTurnoMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaVenta vVenta = new ventanaVenta();        
        vVenta.setVisible(true);    //hace visible una ventana
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelCalculos;
    private javax.swing.JPanel panelEntradas;
    private javax.swing.JPanel panelTodo;
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
    private javax.swing.JTextField txfdMontoEntradas;
    private javax.swing.JTextField txfdMontoEsperado;
    private javax.swing.JTextField txfdMontoSalidas;
    // End of variables declaration//GEN-END:variables
}
