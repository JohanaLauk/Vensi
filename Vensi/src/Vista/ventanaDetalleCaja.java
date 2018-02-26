package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemVentaDAO;
import DAO.ProductoDAO;
import DAO.TurnoDAO;
import Modelo.EntradaSalida;
import Modelo.ItemVenta;
import Modelo.Producto;
import Modelo.Turno;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaDetalleCaja extends javax.swing.JFrame 
{
    ProductoDAO pDAO = new ProductoDAO();
    TurnoDAO tDAO = new TurnoDAO();
    ItemVentaDAO itDAO = new ItemVentaDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();   
    
    Turno turnoActual = null;
    
    List<ItemVenta> listaIT = null;
    List<EntradaSalida> listaES = null;
    List<Producto> listaProds = null;
    
    DefaultTableModel modelo;
    TableColumnModel tcm;
        
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    ImageIcon icono;
                
    public ventanaDetalleCaja() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana 
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir  
        
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/V.jpg"));
        this.setIconImage(ico);
        
        //Al hacer click en el JFrame...
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaDetalleCaja.clearSelection();
            } 
        });
        
        turnoActual = tDAO.obtenerUltimo();
        this.setTitle("Información de caja   -   Turno N°" + turnoActual.getId() 
                        + "  -  Apertura: " + fechaHoraFormat.format(turnoActual.getFechaHoraInicio()) + "hs.");
                
        llenarTabla();  
               
        txfdTotalVenta.setText("$   " + String.valueOf(formatoPrecios.format(calcularVenta())));
        txfdRetiros.setText("$   " + String.valueOf(formatoPrecios.format(calcularSalidas())));
        txfdTotalCaja.setText("$   " + String.valueOf(formatoPrecios.format(calcularTotalCaja())));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCaja = new javax.swing.JTable();
        labVenta = new javax.swing.JLabel();
        txfdTotalVenta = new javax.swing.JTextField();
        labRetiros = new javax.swing.JLabel();
        txfdRetiros = new javax.swing.JTextField();
        labTotalCaja = new javax.swing.JLabel();
        txfdTotalCaja = new javax.swing.JTextField();
        btnCargarES = new javax.swing.JButton();
        btnVolverDC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de caja");
        setMinimumSize(new java.awt.Dimension(850, 533));
        setPreferredSize(new java.awt.Dimension(850, 533));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panelTodo.setBackground(new java.awt.Color(102, 184, 211));

        panelDatos.setBackground(new java.awt.Color(0, 0, 0));
        panelDatos.setOpaque(false);

        tablaDetalleCaja = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaDetalleCaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaDetalleCaja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaDetalleCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDetalleCaja.setFocusable(false);
        tablaDetalleCaja.setGridColor(new java.awt.Color(153, 153, 153));
        tablaDetalleCaja.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalleCaja.getTableHeader().setResizingAllowed(false);
        tablaDetalleCaja.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalleCaja);

        labVenta.setBackground(new java.awt.Color(0, 153, 0));
        labVenta.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labVenta.setText("Venta: ");

        txfdTotalVenta.setEditable(false);
        txfdTotalVenta.setBackground(new java.awt.Color(0, 153, 51));
        txfdTotalVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalVenta.setText("$");
        txfdTotalVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labRetiros.setBackground(new java.awt.Color(204, 0, 0));
        labRetiros.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labRetiros.setText("Retiros:");

        txfdRetiros.setBackground(new java.awt.Color(255, 0, 0));
        txfdRetiros.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdRetiros.setForeground(new java.awt.Color(255, 255, 255));
        txfdRetiros.setText("$");
        txfdRetiros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labTotalCaja.setBackground(new java.awt.Color(0, 51, 204));
        labTotalCaja.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        labTotalCaja.setText("Total caja:");

        txfdTotalCaja.setBackground(new java.awt.Color(0, 0, 204));
        txfdTotalCaja.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalCaja.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalCaja.setText("$");
        txfdTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCargarES.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarES.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnCargarES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/calculadora_100.png"))); // NOI18N
        btnCargarES.setText("Cargar");
        btnCargarES.setToolTipText("Cargar entrada/salida");
        btnCargarES.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarES.setFocusPainted(false);
        btnCargarES.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCargarES.setIconTextGap(15);
        btnCargarES.setNextFocusableComponent(btnVolverDC);
        btnCargarES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarESMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarESMouseExited(evt);
            }
        });
        btnCargarES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarESActionPerformed(evt);
            }
        });

        btnVolverDC.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverDC.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVolverDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vTurno/atras_100.png"))); // NOI18N
        btnVolverDC.setText("Volver");
        btnVolverDC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverDC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverDC.setFocusPainted(false);
        btnVolverDC.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolverDC.setIconTextGap(10);
        btnVolverDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverDCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverDCMouseExited(evt);
            }
        });
        btnVolverDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVIMIENTOS DE CAJA");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labRetiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labTotalCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfdTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfdRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(btnCargarES, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addGap(72, 72, 72)
                        .addComponent(btnVolverDC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(labVenta)
                                .addGap(10, 10, 10)
                                .addComponent(labRetiros)
                                .addGap(10, 10, 10)
                                .addComponent(labTotalCaja))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(txfdTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txfdRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargarES, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolverDC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVolverDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDCActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverDCActionPerformed

    private void btnCargarESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarESActionPerformed
        ventanaCargarES vCargarES = new ventanaCargarES();
        vCargarES.setVisible(true);
    }//GEN-LAST:event_btnCargarESActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenarTabla();
        
        txfdTotalVenta.setText("$   " + String.valueOf(formatoPrecios.format(calcularVenta())));
        txfdRetiros.setText("$   " + String.valueOf(formatoPrecios.format(calcularSalidas())));
        txfdTotalCaja.setText("$   " + String.valueOf(formatoPrecios.format(calcularTotalCaja())));    
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnCargarESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarESMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/calculadora_lleno_100.png"));     
        btnCargarES.setIcon(icono); 
    }//GEN-LAST:event_btnCargarESMouseEntered

    private void btnCargarESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarESMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/calculadora_100.png"));     
        btnCargarES.setIcon(icono); 
    }//GEN-LAST:event_btnCargarESMouseExited

    private void btnVolverDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverDCMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/atras_lleno_100.png"));     
        btnVolverDC.setIcon(icono); 
    }//GEN-LAST:event_btnVolverDCMouseEntered

    private void btnVolverDCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverDCMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vTurno/atras_100.png"));     
        btnVolverDC.setIcon(icono); 
    }//GEN-LAST:event_btnVolverDCMouseExited
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaDetalleCaja().setVisible(true);
            }
        });
    }

    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        
        listaIT = itDAO.listar(turnoActual.getId());   //lista tabla item_venta
        listaES = esDAO.listar(turnoActual.getId());   //lista tabla entrada_salida
        
        String[] datos = new String[4];
        
        if (listaIT.isEmpty() && listaES.isEmpty())        
        {            
            modelo.addColumn("Detalle");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");

            tablaDetalleCaja.setModel(modelo);

            tcm = tablaDetalleCaja.getColumnModel();
            tcm.getColumn(0).setPreferredWidth(300);
            tcm.getColumn(1).setPreferredWidth(80);
            tcm.getColumn(2).setPreferredWidth(80);
            tcm.getColumn(3).setPreferredWidth(80);
        }
        else
        {
            modelo.addColumn("Detalle");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");

            //Entrada_salida
            for (EntradaSalida es : listaES)            
            {
                if (es.getDescripcion() != null)
                {
                    datos[0] = String.valueOf(es.getNombre() + "   (" + es.getDescripcion() + ")");
                }
                else
                {
                    datos[0] = String.valueOf(es.getNombre());
                }  
                
                if (es.getCantProd() == 0) //Si ES una APERTURA DE CAJA
                {
                    datos[1] = String.valueOf("---");
                }
                else
                {   
                    listaProds = pDAO.buscarPorCodigoNombre(es.getDescripcion(), "Habilitados", "HabOferta");
                    
                    for (Producto p : listaProds)
                    {
                        if (p.isPorPeso())
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
                
                if (es.isTipo())    // entrada
                {
                    datos[2] = String.valueOf("$" + formatoPrecios.format(es.getMonto()));
                    datos[3] = String.valueOf("---"); 
                }
                if (!es.isTipo())   //salida
                {
                    datos[2] = String.valueOf("---");
                    datos[3] = String.valueOf("$" + formatoPrecios.format(es.getMonto()));                                       
                }
                
                modelo.addRow(datos);
            }
            
            //Item_venta 
            for (ItemVenta v : listaIT)            
            {
                datos[0] = String.valueOf(v.getProducto().getDescripcion());
                if (v.getProducto().isPorPeso())
                {
                    double cantGR = v.getCantidad();
                    double cantKG = cantGR / 1000;
                    datos[1] = String.valueOf(formatoKilos.format(cantKG) + "kg");
                }
                else
                {
                    datos[1] = String.valueOf(v.getCantidad());
                }
                datos[2] = String.valueOf("$" + formatoPrecios.format(v.getMonto()));
                datos[3] = String.valueOf("---"); 

                modelo.addRow(datos);
            }

            tablaDetalleCaja.setModel(modelo);

            tcm = tablaDetalleCaja.getColumnModel();
            tcm.getColumn(0).setPreferredWidth(300);
            tcm.getColumn(1).setPreferredWidth(80);
            tcm.getColumn(2).setPreferredWidth(80);
            tcm.getColumn(3).setPreferredWidth(80);
        }
    }
    
    public double calcularVenta()
    {
        listaIT = itDAO.listar(turnoActual.getId());
        double montoVenta = 0;
        
        for (ItemVenta x : listaIT)
        {
            montoVenta = montoVenta + x.getMonto();
        }        
        return montoVenta;
    }
    
    public double calcularSalidas()
    {
        listaES = esDAO.listar(turnoActual.getId());
        double montoSalidas = 0;  
        
        for (EntradaSalida x : listaES)
        {
            if (!x.isTipo() && !x.getNombre().equals("ANULACIÓN DE VENTA")) //salidas
            {
                montoSalidas = montoSalidas + x.getMonto();
            }            
        }
        return montoSalidas;
    }
    
    public double calcularEntradas()
    {
        double montoEntradas = 0;
        
        for (EntradaSalida x : listaES)
        {
            if (x.isTipo()) //entradas
            {
                montoEntradas = montoEntradas + x.getMonto();
            }            
        } 
        return montoEntradas;
    }
    
    public double calcularTotalCaja()
    {        
        listaES = esDAO.listar(turnoActual.getId());
        double montoVenta = calcularVenta();
        double montoEntradas = calcularEntradas();
        double montoSalidas = calcularSalidas();
        double totalCaja = 0;
             
        totalCaja = montoVenta + montoEntradas - montoSalidas;
        
        return totalCaja;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarES;
    private javax.swing.JButton btnVolverDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labRetiros;
    private javax.swing.JLabel labTotalCaja;
    private javax.swing.JLabel labVenta;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaDetalleCaja;
    private javax.swing.JTextField txfdRetiros;
    private javax.swing.JTextField txfdTotalCaja;
    private javax.swing.JTextField txfdTotalVenta;
    // End of variables declaration//GEN-END:variables
}
