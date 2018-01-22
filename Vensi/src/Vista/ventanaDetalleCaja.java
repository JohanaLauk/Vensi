package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemVentaDAO;
import DAO.ProductoDAO;
import DAO.TurnoDAO;
import Modelo.EntradaSalida;
import Modelo.ItemVenta;
import Modelo.Producto;
import Modelo.Turno;
import java.text.DecimalFormat;
import java.util.List;
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
                
    public ventanaDetalleCaja() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana  
        
        turnoActual = tDAO.obtenerUltimo();
        
        llenarTabla();  
               
        txfdTotalVenta.setText("$" + String.valueOf(formatoPrecios.format(calcularVenta())));  //cambiar a LABEL
        txfdTotalCaja.setText("$" + String.valueOf(formatoPrecios.format(calcularTotalCaja())));   //cambiar a LABEL     
        
        labVenta.setText("$" + String.valueOf(formatoPrecios.format(calcularVenta())));
        labCajaT.setText("$" + String.valueOf(formatoPrecios.format(calcularTotalCaja())));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCaja = new javax.swing.JTable();
        txfdTotalVenta = new javax.swing.JTextField();
        txfdTotalCaja = new javax.swing.JTextField();
        btnCargarES = new javax.swing.JButton();
        btnVolverDC = new javax.swing.JButton();
        labVenta = new javax.swing.JLabel();
        labCajaT = new org.jdesktop.swingx.JXLabel();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono_salir_blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalle de caja");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 80, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total caja:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, -1));

        tablaDetalleCaja = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaDetalleCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDetalleCaja.setFocusable(false);
        tablaDetalleCaja.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalleCaja.getTableHeader().setResizingAllowed(false);
        tablaDetalleCaja.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalleCaja);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 360));

        txfdTotalVenta.setEditable(false);
        txfdTotalVenta.setBackground(new java.awt.Color(0, 153, 51));
        txfdTotalVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalVenta.setText("$");
        txfdTotalVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txfdTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 30));

        txfdTotalCaja.setBackground(new java.awt.Color(0, 0, 204));
        txfdTotalCaja.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalCaja.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalCaja.setText("$");
        txfdTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txfdTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 80, 30));

        btnCargarES.setText("Cargar entrada/salida");
        btnCargarES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarESActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarES, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 240, 100));

        btnVolverDC.setText("Volver");
        btnVolverDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDCActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 240, 100));

        labVenta.setBackground(new java.awt.Color(0, 153, 0));
        labVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        labVenta.setForeground(new java.awt.Color(255, 255, 255));
        labVenta.setText("$");
        labVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(labVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 80, 30));

        labCajaT.setBackground(new java.awt.Color(0, 0, 204));
        labCajaT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labCajaT.setForeground(new java.awt.Color(255, 255, 255));
        labCajaT.setText("$");
        labCajaT.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jPanel1.add(labCajaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 950, 490));

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo 2 grande.png"))); // NOI18N
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();  
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDCActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverDCActionPerformed

    private void btnCargarESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarESActionPerformed
        ventanaCargarES vCargarES = new ventanaCargarES();
        vCargarES.setVisible(true);
    }//GEN-LAST:event_btnCargarESActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenarTabla();
        
        txfdTotalVenta.setText("$" + String.valueOf(formatoPrecios.format(calcularVenta())));  //cambiar a LABEL
        txfdTotalCaja.setText("$" + String.valueOf(formatoPrecios.format(calcularTotalCaja())));   //cambiar a LABEL     
        
        labVenta.setText("$" + String.valueOf(formatoPrecios.format(calcularVenta())));
        labCajaT.setText("$" + String.valueOf(formatoPrecios.format(calcularTotalCaja()))); 
    }//GEN-LAST:event_formWindowGainedFocus
    
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
        
        if (listaIT.isEmpty())        
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
            montoVenta = montoVenta + (x.getMonto());
        }        
        return montoVenta;
    }
    
    public double calcularTotalCaja()
    {
        listaES = esDAO.listar(turnoActual.getId());
        
        double montoEntradaSalida=0;  
        double totalCaja=0;
        
        double montoVenta = calcularVenta();
        
        for (EntradaSalida x : listaES)
        {
            if (x.isTipo()) //entrada
            {
                montoEntradaSalida = montoEntradaSalida + x.getMonto();
            }            
        }                
        totalCaja = montoVenta + montoEntradaSalida;
        
        return totalCaja;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarES;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel labCajaT;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JLabel labVenta;
    private javax.swing.JTable tablaDetalleCaja;
    private javax.swing.JTextField txfdTotalCaja;
    private javax.swing.JTextField txfdTotalVenta;
    // End of variables declaration//GEN-END:variables
}