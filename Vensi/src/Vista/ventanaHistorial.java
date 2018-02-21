package Vista;

import DAO.EntradaStockDAO;
import DAO.TurnoDAO;
import Modelo.Entradastock;
import Modelo.Turno;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaHistorial extends javax.swing.JFrame 
{
    DefaultTableModel modelo;
    TableColumnModel tcm ;
    TurnoDAO tDAO = new TurnoDAO();
    EntradaStockDAO eStockDAO = new EntradaStockDAO();    
    
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    
    ImageIcon icono;
    
    public ventanaHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        //this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir  
        this.setMinimumSize(new Dimension(890, 550));
        this.setPreferredSize(new Dimension(890, 550)); 
        
        cbBuscarPor.addItem("Seleccionar");
        cbBuscarPor.addItem("Número");
        cbBuscarPor.addItem("Fecha");
        btnVisualizarH.setEnabled(false);
        txfdNro.setEnabled(false);        
        dateDesde.setEnabled(false);
        dateHasta.setEnabled(false);
                       
        //Al hacer click en el JFrame se quita la seleccion en el JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {               
                tablaHistorial.clearSelection();
                btnVisualizarH.setEnabled(false);
            } 
        });        
        
        llenarTabla(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        panelTodo = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbBuscarPor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labNro = new javax.swing.JLabel();
        txfdNro = new javax.swing.JTextField();
        labFecha = new javax.swing.JLabel();
        LabFechaHasta = new javax.swing.JLabel();
        dateDesde = new org.jdesktop.swingx.JXDatePicker();
        dateHasta = new org.jdesktop.swingx.JXDatePicker();
        btnVaciarFechaHasta = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        panelRB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbTurno = new javax.swing.JRadioButton();
        rbCargaStock = new javax.swing.JRadioButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnMenuPpal = new javax.swing.JButton();
        btnVisualizarH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial de registros");
        setMinimumSize(new java.awt.Dimension(890, 550));
        setPreferredSize(new java.awt.Dimension(890, 550));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelTodo.setBackground(new java.awt.Color(0, 133, 155));
        panelTodo.setMinimumSize(new java.awt.Dimension(820, 510));

        panelBusqueda.setOpaque(false);

        jPanel2.setOpaque(false);

        cbBuscarPor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbBuscarPor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbBuscarPor.setNextFocusableComponent(txfdNro);
        cbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarPorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar por:");

        labNro.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labNro.setForeground(new java.awt.Color(255, 255, 255));
        labNro.setText("Ingrese el n° del registro:");

        txfdNro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdNro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdNro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdNro.setNextFocusableComponent(dateDesde);
        txfdNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdNroKeyTyped(evt);
            }
        });

        labFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labFecha.setForeground(new java.awt.Color(255, 255, 255));
        labFecha.setText("Ingrese la fecha:");

        LabFechaHasta.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        LabFechaHasta.setForeground(new java.awt.Color(255, 255, 255));
        LabFechaHasta.setText("antes del");

        dateDesde.setNextFocusableComponent(dateHasta);
        dateDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateDesdeActionPerformed(evt);
            }
        });

        dateHasta.setNextFocusableComponent(btnVaciarFechaHasta);
        dateHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateHastaActionPerformed(evt);
            }
        });

        btnVaciarFechaHasta.setBackground(new java.awt.Color(255, 153, 153));
        btnVaciarFechaHasta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnVaciarFechaHasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vHistorial/vaciar_50.png"))); // NOI18N
        btnVaciarFechaHasta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVaciarFechaHasta.setBorderPainted(false);
        btnVaciarFechaHasta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaciarFechaHasta.setFocusPainted(false);
        btnVaciarFechaHasta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVaciarFechaHasta.setNextFocusableComponent(btnBuscar);
        btnVaciarFechaHasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarFechaHastaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarFechaHastaMouseExited(evt);
            }
        });
        btnVaciarFechaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarFechaHastaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vHistorial/buscarRegistro_100.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setIconTextGap(5);
        btnBuscar.setNextFocusableComponent(btnVisualizarH);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labNro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdNro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labFecha)
                                .addGap(12, 12, 12)
                                .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnVaciarFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfdNro)
                            .addComponent(labNro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnVaciarFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar))
        );

        panelRB.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de registro:");

        bgTipo.add(rbTurno);
        rbTurno.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        rbTurno.setForeground(new java.awt.Color(255, 255, 255));
        rbTurno.setText("Turno");
        rbTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbTurno.setNextFocusableComponent(rbCargaStock);
        rbTurno.setOpaque(false);
        rbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTurnoActionPerformed(evt);
            }
        });

        bgTipo.add(rbCargaStock);
        rbCargaStock.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        rbCargaStock.setForeground(new java.awt.Color(255, 255, 255));
        rbCargaStock.setText("Carga stock");
        rbCargaStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbCargaStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbCargaStock.setNextFocusableComponent(cbBuscarPor);
        rbCargaStock.setOpaque(false);
        rbCargaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCargaStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRBLayout = new javax.swing.GroupLayout(panelRB);
        panelRB.setLayout(panelRBLayout);
        panelRBLayout.setHorizontalGroup(
            panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .addGroup(panelRBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbCargaStock, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(rbTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRBLayout.setVerticalGroup(
            panelRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRBLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(rbCargaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addComponent(panelRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelTabla.setOpaque(false);

        tablaHistorial = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaHistorial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaHistorial.setFocusable(false);
        tablaHistorial.setGridColor(new java.awt.Color(153, 153, 153));
        tablaHistorial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaHistorial.getTableHeader().setResizingAllowed(false);
        tablaHistorial.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaHistorial);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Resultados");

        btnMenuPpal.setBackground(new java.awt.Color(204, 204, 255));
        btnMenuPpal.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMenuPpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"))); // NOI18N
        btnMenuPpal.setText("Menú principal");
        btnMenuPpal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuPpal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPpal.setFocusPainted(false);
        btnMenuPpal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenuPpal.setIconTextGap(30);
        btnMenuPpal.setNextFocusableComponent(rbTurno);
        btnMenuPpal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPpalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPpalMouseExited(evt);
            }
        });
        btnMenuPpal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPpalActionPerformed(evt);
            }
        });

        btnVisualizarH.setBackground(new java.awt.Color(204, 204, 255));
        btnVisualizarH.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVisualizarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vHistorial/ver1_50.png"))); // NOI18N
        btnVisualizarH.setText("Visualizar");
        btnVisualizarH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisualizarH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarH.setFocusPainted(false);
        btnVisualizarH.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVisualizarH.setIconTextGap(40);
        btnVisualizarH.setNextFocusableComponent(btnMenuPpal);
        btnVisualizarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarHMouseExited(evt);
            }
        });
        btnVisualizarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jLabel6)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(btnMenuPpal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizarH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuPpal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarH, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!rbTurno.isSelected() && !rbCargaStock.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Debe marcar el tipo de registro que desea buscar.");
            llenarTabla(null);     
        }
        else
        {
            if (cbBuscarPor.getSelectedItem().equals("Seleccionar"))
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de búsqueda.");
                llenarTabla(null);            
            }
            else
            { 
                if (rbTurno.isSelected())
                {
                    llenarTabla("Turno");
                }   
                if (rbCargaStock.isSelected())
                {
                    llenarTabla("CargaStock");
                }
            }
        }  
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarPorActionPerformed
        if (cbBuscarPor.getSelectedItem().equals("Seleccionar"))
        {           
            txfdNro.setEnabled(false);  
            txfdNro.setText(null);
        
            dateDesde.setEnabled(false);
            dateHasta.setEnabled(false);
            dateDesde.setDate(null);
            dateHasta.setDate(null);
            
            llenarTabla(null);
        }       
        if (cbBuscarPor.getSelectedItem().equals("Número"))   
        {
            txfdNro.setEnabled(true);    
                        
            dateDesde.setEnabled(false);           
            dateHasta.setEnabled(false);
            dateDesde.setDate(null);
            dateHasta.setDate(null);
        }
        if (cbBuscarPor.getSelectedItem().equals("Fecha"))
        {
            dateDesde.setEnabled(true);
            dateHasta.setEnabled(true);            
                        
            txfdNro.setEnabled(false); 
            txfdNro.setText(null);
        }
    }//GEN-LAST:event_cbBuscarPorActionPerformed

    private void btnMenuPpalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPpalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPpalActionPerformed

    private void btnVisualizarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarHActionPerformed
        if (rbTurno.isSelected())
        {
            ventanaVisualizarHistorial.tablaSelec = "Turno"; 
        }
        if (rbCargaStock.isSelected())
        {
            ventanaVisualizarHistorial.tablaSelec = "CargaStock";
        }
        
        ventanaVisualizarHistorial.idSelec = Integer.parseInt(tablaHistorial.getValueAt(tablaHistorial.getSelectedRow(),0).toString());
        
        ventanaVisualizarHistorial vVisualizarHistorial = new ventanaVisualizarHistorial();        
        vVisualizarHistorial.setVisible(true);
    }//GEN-LAST:event_btnVisualizarHActionPerformed

    private void txfdNroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdNroKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE))         
            evt.consume();    
        
        if (c == KeyEvent.VK_ENTER)
        {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txfdNroKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        int filaSelec = tablaHistorial.getSelectedRow();
        
        if (filaSelec >= 0)
        {
            btnVisualizarH.setEnabled(true);
        }
        else
        {
            btnVisualizarH.setEnabled(false);
        }                
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnVaciarFechaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarFechaHastaActionPerformed
        dateHasta.setDate(null);
        
        if (rbTurno.isSelected())
        {
            llenarTabla("Turno");
        }   
        if (rbCargaStock.isSelected())
        {
            llenarTabla("CargaStock");
        }
    }//GEN-LAST:event_btnVaciarFechaHastaActionPerformed

    private void rbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTurnoActionPerformed
        txfdNro.setText("");
        dateDesde.setDate(null);
        dateHasta.setDate(null);        
        cbBuscarPor.setSelectedItem("Seleccionar");      
        btnVisualizarH.setEnabled(false);

        tablaVacia();
    }//GEN-LAST:event_rbTurnoActionPerformed

    private void rbCargaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCargaStockActionPerformed
        txfdNro.setText("");
        dateDesde.setDate(null);
        dateHasta.setDate(null);        
        cbBuscarPor.setSelectedItem("Seleccionar"); 
        btnVisualizarH.setEnabled(false);

        tablaVacia();
    }//GEN-LAST:event_rbCargaStockActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/buscarRegistro_lleno_100.png"));     
        btnBuscar.setIcon(icono); 
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/buscarRegistro_100.png"));     
        btnBuscar.setIcon(icono);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnVisualizarHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarHMouseEntered
        int filaSelec = tablaHistorial.getSelectedRow();
        
        if (filaSelec >= 0)
        {
            icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/ver1_lleno_50.png"));
            btnVisualizarH.setIcon(icono);
        }             
    }//GEN-LAST:event_btnVisualizarHMouseEntered

    private void btnVisualizarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarHMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/ver1_50.png"));     
        btnVisualizarH.setIcon(icono);
    }//GEN-LAST:event_btnVisualizarHMouseExited

    private void btnMenuPpalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_lleno_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseEntered

    private void btnMenuPpalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vGestion/home_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseExited

    private void btnVaciarFechaHastaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarFechaHastaMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/vaciar_lleno_50.png"));     
        btnVaciarFechaHasta.setIcon(icono);
    }//GEN-LAST:event_btnVaciarFechaHastaMouseEntered

    private void btnVaciarFechaHastaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarFechaHastaMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/vaciar_50.png"));     
        btnVaciarFechaHasta.setIcon(icono);
    }//GEN-LAST:event_btnVaciarFechaHastaMouseExited

    private void dateDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDesdeActionPerformed
        if (rbTurno.isSelected())
        {
            llenarTabla("Turno");
        }   
        if (rbCargaStock.isSelected())
        {
            llenarTabla("CargaStock");
        }
    }//GEN-LAST:event_dateDesdeActionPerformed

    private void dateHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateHastaActionPerformed
        if (rbTurno.isSelected())
        {
            llenarTabla("Turno");
        }   
        if (rbCargaStock.isSelected())
        {
            llenarTabla("CargaStock");
        }
    }//GEN-LAST:event_dateHastaActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaHistorial().setVisible(true);
            }
        });
    }
    
    public void llenarTabla(String clase)
    {
        String nro = txfdNro.getText();
        Date fechaDesde = dateDesde.getDate();
        Date fechaHasta = dateHasta.getDate();
        
        if (clase == null)
        {
            tablaVacia();
        }
        else 
        {            
            if (clase.equals("Turno"))
            {   
                modelo = new DefaultTableModel();
                modelo.addColumn("Número");
                modelo.addColumn("Fecha y hora inicio");
                modelo.addColumn("Fecha y hora fin");
                modelo.addColumn("Usuario");

                if (cbBuscarPor.getSelectedItem().equals("Fecha"))
                {   
                    if (nro.equals("") && fechaDesde != null)
                    {        
                        List<Turno> listaTurnos = tDAO.buscarPorFecha(fechaDesde, fechaHasta);
                        if (listaTurnos.isEmpty()) 
                        {
                            JOptionPane.showMessageDialog(null, "No hay turnos registrados.");
                            tablaVacia();
                        } 
                        else 
                        {
                            String[] datos = new String[4];

                            for (Turno t : listaTurnos) 
                            {
                                datos[0] = String.valueOf(t.getId());
                                datos[1] = String.valueOf(fechaHoraFormat.format(t.getFechaHoraInicio()) + "hs.");
                                if (t.getFechaHoraFin() != null)
                                {
                                    datos[2] = String.valueOf(fechaHoraFormat.format(t.getFechaHoraFin()) + "hs.");
                                }
                                else
                                {
                                    datos[2] = String.valueOf("Pendiente");
                                }
                                datos[3] = String.valueOf(t.getUsuario().getNombreUsuario());

                                modelo.addRow(datos);  
                                this.tablaHistorial.setModel(modelo);
                                tcm = tablaHistorial.getColumnModel();
                                tcm.getColumn(0).setPreferredWidth(100);
                                tcm.getColumn(1).setPreferredWidth(200);
                                tcm.getColumn(2).setPreferredWidth(200);
                                tcm.getColumn(3).setPreferredWidth(200);
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Debe asignar un intervalo de tiempo para la búsqueda.");
                        tablaVacia();
                    }
                }
                else    //numero
                {                    
                    if (cbBuscarPor.getSelectedItem().equals("Número"))
                    {
                        if (!nro.equals("") && fechaDesde == null)
                        {
                            Turno t = tDAO.buscarPorID(Integer.parseInt(txfdNro.getText()));
                            if (t == null) 
                            {
                                JOptionPane.showMessageDialog(null, "No hay turnos registrados.");
                                tablaVacia();
                            } 
                            else 
                            {
                                String[] datos = new String[4];

                                datos[0] = String.valueOf(t.getId());
                                datos[1] = String.valueOf(fechaHoraFormat.format(t.getFechaHoraInicio()) + "hs.");

                                if (t.getFechaHoraFin() != null)
                                {
                                    datos[2] = String.valueOf(fechaHoraFormat.format(t.getFechaHoraFin()) + "hs.");
                                }
                                else
                                {
                                    datos[2] = String.valueOf("Pendiente");
                                }
                                datos[3] = String.valueOf(t.getUsuario().getNombreUsuario());

                                modelo.addRow(datos);       
                                this.tablaHistorial.setModel(modelo);
                                tcm = tablaHistorial.getColumnModel();
                                tcm.getColumn(0).setPreferredWidth(100);
                                tcm.getColumn(1).setPreferredWidth(200);
                                tcm.getColumn(2).setPreferredWidth(200);
                                tcm.getColumn(3).setPreferredWidth(200);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe ingresar el número del registro que desea buscar.");
                            tablaVacia();
                        }
                    }                
                }  
            }
            else    //Entradastock
            {   
                if (clase.equals("CargaStock"))
                {
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Número");
                    modelo.addColumn("Fecha y hora");
                    modelo.addColumn("Proveedor");
                    modelo.addColumn("Importe");

                    if (cbBuscarPor.getSelectedItem().equals("Fecha"))
                    {
                        if (nro.equals("") && fechaDesde != null)
                        {
                            List<Entradastock> listaEntradastocks = eStockDAO.buscarPorFecha(fechaDesde, fechaHasta);

                            if (listaEntradastocks.isEmpty()) 
                            {
                                JOptionPane.showMessageDialog(null, "No hay cargas de stock registradas.");
                                tablaVacia();
                            } 
                            else 
                            {
                                String[] datos = new String[4];

                                for (Entradastock es : listaEntradastocks) 
                                {
                                    datos[0] = String.valueOf(es.getId());
                                    datos[1] = String.valueOf(fechaHoraFormat.format(es.getFechaHora()) + "hs.");
                                    datos[2] = String.valueOf(es.getProveedor().getRazonSocial());
                                    datos[3] = String.valueOf("$"+formatoPrecios.format(es.getImporteCostoTotal()));

                                    modelo.addRow(datos);
                                    this.tablaHistorial.setModel(modelo);
                                    tcm.getColumn(0).setPreferredWidth(100);
                                    tcm.getColumn(1).setPreferredWidth(200);
                                    tcm.getColumn(2).setPreferredWidth(200);
                                    tcm.getColumn(3).setPreferredWidth(100);
                                }
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe asignar un intervalo de tiempo para la búsqueda.");
                            tablaVacia();
                        }                        
                    }
                    else    //numero
                    {
                        if (cbBuscarPor.getSelectedItem().equals("Número"))
                        {
                            if (!nro.equals("") && fechaDesde == null)
                            {
                                Entradastock es = eStockDAO.buscarPorID(Integer.parseInt(txfdNro.getText()));

                                if (es == null) 
                                {
                                    JOptionPane.showMessageDialog(null, "No hay cargas de stock registradas.");
                                    tablaVacia();
                                } 
                                else 
                                {
                                    String[] datos = new String[4];

                                    datos[0] = String.valueOf(es.getId());
                                    datos[1] = String.valueOf(fechaHoraFormat.format(es.getFechaHora()) + "hs.");
                                    datos[2] = String.valueOf(es.getProveedor().getRazonSocial());
                                    datos[3] = String.valueOf("$"+formatoPrecios.format(es.getImporteCostoTotal()));

                                    modelo.addRow(datos);
                                    this.tablaHistorial.setModel(modelo);
                                    tcm.getColumn(0).setPreferredWidth(100);
                                    tcm.getColumn(1).setPreferredWidth(200);
                                    tcm.getColumn(2).setPreferredWidth(200);
                                    tcm.getColumn(3).setPreferredWidth(100);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Debe ingresar el número del registro que desea buscar.");
                                tablaVacia();
                            }
                        }
                    }                                
                }
            }
        }
        
        tablaHistorial.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) //recupera el foco
            {
                tablaHistorial.setRowSelectionAllowed(true);                
            }

            @Override
            public void focusLost(FocusEvent fe) //pierde el foco
            {                
                tablaHistorial.setRowSelectionAllowed(false);
            } 
        });
        
        tablaHistorial.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaHistorial.setRowSelectionAllowed(true);
                
                int filaSelec = tablaHistorial.getSelectedRow();
        
                if (filaSelec >= 0)
                {
                    btnVisualizarH.setEnabled(true);
                }
                else
                {
                    btnVisualizarH.setEnabled(false);
                }
            } 
        });
    }   
    
    public void tablaVacia()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");

        tablaHistorial.setModel(modelo);   

        tcm = tablaHistorial.getColumnModel();        
        tcm.getColumn(0).setPreferredWidth(100);
        tcm.getColumn(1).setPreferredWidth(200);
        tcm.getColumn(2).setPreferredWidth(200);    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabFechaHasta;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenuPpal;
    private javax.swing.JButton btnVaciarFechaHasta;
    private javax.swing.JButton btnVisualizarH;
    private javax.swing.JComboBox<String> cbBuscarPor;
    private org.jdesktop.swingx.JXDatePicker dateDesde;
    private org.jdesktop.swingx.JXDatePicker dateHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labNro;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelRB;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JRadioButton rbCargaStock;
    private javax.swing.JRadioButton rbTurno;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTextField txfdNro;
    // End of variables declaration//GEN-END:variables
}
