package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemEntradaStockDAO;
import DAO.ItemVentaDAO;
import DAO.EntradaStockDAO;
import DAO.TurnoDAO;
import Modelo.ItemEntradastock;
import Modelo.ItemVenta;
import Modelo.Entradastock;
import Modelo.Turno;
import Modelo.EntradaSalida;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaVisualizarHistorial extends javax.swing.JFrame 
{       
    TurnoDAO tDAO = new TurnoDAO();
    EntradaStockDAO eStockDAO = new EntradaStockDAO();
    ItemVentaDAO iVentaDAO = new ItemVentaDAO();
    ItemEntradaStockDAO iEStockDAO = new ItemEntradaStockDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    
    DefaultTableModel modelo;    
    DefaultListModel modeloList; 
    
    public static String tablaSelec;    //viene de la ventana anterior
    public static int idSelec;   //viene de la ventana anterior
    
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    ImageIcon icono;
    
    public ventanaVisualizarHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
               
        if (tablaSelec.equals("Turno"))
        {
            this.setTitle("Visualización del Turno N°" + idSelec);            
        }
        if (tablaSelec.equals("CargaStock"))
        {
            this.setTitle("Visualización de la Actualización de Stock N°" + idSelec); 
        }
        
        llenarDatos();
        
        listDatosTP.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatosTP = new javax.swing.JList<>();
        panelCalculos = new javax.swing.JPanel();
        txfdVenta = new javax.swing.JTextField();
        labTotalCaja = new javax.swing.JLabel();
        labVenta = new javax.swing.JLabel();
        txfdTotalCaja = new javax.swing.JTextField();
        txfdEfectivo = new javax.swing.JTextField();
        labEfectivo = new javax.swing.JLabel();
        labDiferencia = new javax.swing.JLabel();
        txfdDiferencia = new javax.swing.JTextField();
        panelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTP = new javax.swing.JTable();
        labImporte = new javax.swing.JLabel();
        txfdImporte = new javax.swing.JTextField();
        txfdUnidades = new javax.swing.JTextField();
        labUnidades = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualización del historial");
        setMinimumSize(new java.awt.Dimension(736, 570));
        setResizable(false);

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelInfo.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Información");

        listDatosTP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listDatosTP);

        panelCalculos.setOpaque(false);

        txfdVenta.setEditable(false);
        txfdVenta.setBackground(new java.awt.Color(204, 204, 0));
        txfdVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfdVenta.setText("$");
        txfdVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labTotalCaja.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labTotalCaja.setText("Total caja:");

        labVenta.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labVenta.setText("Venta: ");

        txfdTotalCaja.setEditable(false);
        txfdTotalCaja.setBackground(new java.awt.Color(0, 0, 204));
        txfdTotalCaja.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalCaja.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalCaja.setText("$");
        txfdTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txfdEfectivo.setEditable(false);
        txfdEfectivo.setBackground(new java.awt.Color(0, 153, 0));
        txfdEfectivo.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        txfdEfectivo.setText("$");
        txfdEfectivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labEfectivo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labEfectivo.setText("Efectivo:");

        labDiferencia.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labDiferencia.setText("Diferencia:");

        txfdDiferencia.setEditable(false);
        txfdDiferencia.setBackground(new java.awt.Color(102, 0, 51));
        txfdDiferencia.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdDiferencia.setForeground(new java.awt.Color(255, 255, 255));
        txfdDiferencia.setText("$");
        txfdDiferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelCalculosLayout = new javax.swing.GroupLayout(panelCalculos);
        panelCalculos.setLayout(panelCalculosLayout);
        panelCalculosLayout.setHorizontalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTotalCaja)
                    .addComponent(labVenta)
                    .addComponent(labEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelCalculosLayout.setVerticalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addComponent(txfdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labTotalCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labEfectivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labDiferencia)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelTabla.setOpaque(false);

        tablaTP = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaTP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaTP.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaTP.setFocusable(false);
        tablaTP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaTP.getTableHeader().setResizingAllowed(false);
        tablaTP.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaTP);

        labImporte.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labImporte.setText("Importe:");

        txfdImporte.setBackground(new java.awt.Color(102, 0, 51));
        txfdImporte.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdImporte.setForeground(new java.awt.Color(255, 255, 255));
        txfdImporte.setText("$");
        txfdImporte.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txfdUnidades.setBackground(new java.awt.Color(0, 0, 204));
        txfdUnidades.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdUnidades.setForeground(new java.awt.Color(255, 255, 255));
        txfdUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfdUnidades.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labUnidades.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labUnidades.setText("Unidades:");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labUnidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfdUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labImporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfdImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labImporte)
                    .addComponent(txfdImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labUnidades)
                    .addComponent(txfdUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelBotones.setOpaque(false);

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atras_50.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolver.setIconTextGap(30);
        btnVolver.setNextFocusableComponent(btnImprimir);
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

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_50.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setFocusPainted(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImprimir.setIconTextGap(50);
        btnImprimir.setNextFocusableComponent(btnVolver);
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver)
            .addComponent(btnImprimir)
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodoLayout.createSequentialGroup()
                        .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/atras_lleno_50.png"));     
        btnVolver.setIcon(icono);        
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/atras_50.png"));     
        btnVolver.setIcon(icono);        
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_lleno_50.png"));     
        btnImprimir.setIcon(icono); 
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vHistorial/imprimir_50.png"));     
        btnImprimir.setIcon(icono);
    }//GEN-LAST:event_btnImprimirMouseExited

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaVisualizarHistorial().setVisible(true);
            }
        });
    }
    
    public void llenarDatos()
    {
        String[] datos = new String[4];
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        
        this.tablaTP.setModel(modelo);
        
        if (tablaSelec.equals("Turno")) 
        {
            labUnidades.setVisible(false);
            txfdUnidades.setVisible(false);
            labImporte.setVisible(false);
            txfdImporte.setVisible(false);
            
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");
            
            Turno t = tDAO.buscarPorID(idSelec);
            
            modeloList = new DefaultListModel();
            modeloList.addElement("NÚMERO:  " + String.valueOf(t.getId()));
            modeloList.addElement("");
            modeloList.addElement("FECHA DE INICIO:    " + String.valueOf(fechaHoraFormat.format(t.getFechaHoraInicio()) + "hs."));
            if (t.getFechaHoraFin() != null)
            {
                modeloList.addElement("FECHA DE CIERRE:   " + String.valueOf(fechaHoraFormat.format(t.getFechaHoraFin()) + "hs."));
            }
            else
            {
                modeloList.addElement("FECHA DE CIERRE:  " + String.valueOf("Pendiente"));
            }            
            modeloList.addElement("USUARIO:  " + String.valueOf(t.getUsuario().getNombreUsuario()));            
            modeloList.addElement(""); 
            modeloList.addElement("----------------------------------------------------------------------------------------------------------------");
            modeloList.addElement("Cantidad ventas confirmadas:  " + t.getCantVentas());
            modeloList.addElement("Cantidad aperturas:               " + t.getCantEntradas() + "   |     Monto:    $" + formatoPrecios.format(t.getMontoEntradas()));
            modeloList.addElement("Cantidad retiros/Sueldos:      " + t.getCantSalidas() + "   |     Monto:    $" + formatoPrecios.format(t.getMontoSalidas()));
            modeloList.addElement("Cantidad ventas anuladas:    " + t.getCantAnuladas() + "   |     Monto:    $" + formatoPrecios.format(t.getMontoAnuladas()));
            
            List<EntradaSalida> listaES = esDAO.listar(idSelec);
            List<ItemVenta> listaIV = iVentaDAO.listar(idSelec);
            
            for (EntradaSalida es : listaES)            
            {
                datos[0] = String.valueOf(es.getNombre());
                
                if (es.getCantProd() == 0)
                {
                    datos[1] = String.valueOf("---");
                }
                else
                {
                    for (ItemVenta v : listaIV)            
                    {
                        if (es.getDescripcion().equals(v.getProducto().getDescripcion()))
                        {
                            if (v.getProducto().isPorPeso())
                            {
                                double cantGR = es.getCantProd();
                                double cantKG = cantGR / 1000;
                                datos[1] = String.valueOf(formatoKilos.format(cantKG) + "kg");
                            }
                            else
                            {
                                datos[1] = String.valueOf(es.getCantProd());
                            }                            
                        }
                    }                    
                }
                
                if (es.isTipo())    // entrada
                {
                    datos[2] = String.valueOf("$" + formatoPrecios.format(es.getMonto()));
                    datos[3] = String.valueOf("---"); 
                }
                else    //salida
                {
                    datos[2] = String.valueOf("---"); 
                    datos[3] = String.valueOf("$" + formatoPrecios.format(es.getMonto()));
                }
                
                modelo.addRow(datos);
            }        
            
            for (ItemVenta i : listaIV) 
            {
                datos[0] = i.getProducto().getDescripcion();
                if (i.getProducto().isPorPeso())
                {
                    double cantGR = i.getCantidad();
                    double cantKG = cantGR / 1000;
                    datos[1] = String.valueOf(formatoKilos.format(cantKG) + "kg");
                }
                else
                {
                    datos[1] = String.valueOf(i.getCantidad());
                }
                datos[2] = String.valueOf("$" + formatoPrecios.format(i.getMonto()));
                datos[3] = String.valueOf("---");
                
                modelo.addRow(datos);
            }
            mostrarCalculos();
        }
        else    //Entradastock
        {
            labVenta.setVisible(false);
            txfdVenta.setVisible(false);
            labTotalCaja.setVisible(false);
            txfdTotalCaja.setVisible(false);
            labEfectivo.setVisible(false);
            txfdEfectivo.setVisible(false);
            labDiferencia.setVisible(false);
            txfdDiferencia.setVisible(false);
                        
            modelo.addColumn("Precio costo");
            modelo.addColumn("Precio venta");
            
            Entradastock es = eStockDAO.buscarPorID(idSelec);
            
            modeloList = new DefaultListModel();
            modeloList.addElement("NÚMERO:  " + String.valueOf(es.getId()));
            modeloList.addElement("");
            modeloList.addElement("PROVEEDOR:  " + es.getProveedor().getRazonSocial());
            modeloList.addElement("FECHA Y HORA:  " + String.valueOf(fechaHoraFormat.format(es.getFechaHora())+ "hs."));
                       
            List<ItemEntradastock> listaEntradaStock = iEStockDAO.listar(idSelec);
            
            for (ItemEntradastock i : listaEntradaStock)
            {
                datos[0] = i.getProducto().getDescripcion();
                datos[1] = String.valueOf(i.getCantidad());
                
                if (i.getPrecioCosto() == 0)
                {
                    datos[2] = String.valueOf("---");
                }
                else
                {
                    datos[2] = String.valueOf("$" + formatoPrecios.format(i.getPrecioCosto()));   
                }
                
                if (i.getPrecioVenta() == 0)
                {
                    datos[3] = String.valueOf("---");
                }
                else
                {
                    datos[3] = String.valueOf("$" + formatoPrecios.format(i.getPrecioVenta()));
                }
                
                modelo.addRow(datos);
                
                txfdUnidades.setText(String.valueOf(es.getCantidadTotal()));
                txfdImporte.setText(String.valueOf("$" + formatoPrecios.format(es.getImporteCostoTotal())));                
            }
        }
        
        listDatosTP.setModel(modeloList);
        tablaTP.setModel(modelo);
        
        TableColumnModel tcm = tablaTP.getColumnModel();        
        tcm.getColumn(0).setPreferredWidth(350);
        tcm.getColumn(1).setPreferredWidth(50);
        tcm.getColumn(2).setPreferredWidth(80);
        tcm.getColumn(3).setPreferredWidth(80);    
    }
    
    public void mostrarCalculos()
    {
        Turno t = tDAO.buscarPorID(idSelec);
        
        if (t.getFechaHoraFin() == null)
        {
            txfdVenta.setText(String.valueOf("$     ---"));
            txfdTotalCaja.setText(String.valueOf("$     ---"));
            txfdEfectivo.setText(String.valueOf("$     ---"));
            txfdDiferencia.setText(String.valueOf("$     ---"));
        }
        else
        {
            txfdVenta.setText(String.valueOf("$  " + formatoPrecios.format(t.getMontoVentas())));
            
            double montoEsperado = (t.getMontoVentas() + t.getMontoEntradas()) - t.getMontoSalidas();
            txfdTotalCaja.setText(String.valueOf("$  " + formatoPrecios.format(montoEsperado)));
            
            txfdEfectivo.setText(String.valueOf("$  " + formatoPrecios.format(t.getEfectivoHay())));  
            
            double diferencia = t.getEfectivoHay() - montoEsperado;
            txfdDiferencia.setText(String.valueOf("$  " + formatoPrecios.format(diferencia)));            
        }       
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labDiferencia;
    private javax.swing.JLabel labEfectivo;
    private javax.swing.JLabel labImporte;
    private javax.swing.JLabel labTotalCaja;
    private javax.swing.JLabel labUnidades;
    private javax.swing.JLabel labVenta;
    private javax.swing.JList<String> listDatosTP;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCalculos;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaTP;
    private javax.swing.JTextField txfdDiferencia;
    private javax.swing.JTextField txfdEfectivo;
    private javax.swing.JTextField txfdImporte;
    private javax.swing.JTextField txfdTotalCaja;
    private javax.swing.JTextField txfdUnidades;
    private javax.swing.JTextField txfdVenta;
    // End of variables declaration//GEN-END:variables
}
