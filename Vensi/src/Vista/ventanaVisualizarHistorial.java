package Vista;

import DAO.EntradaSalidaDAO;
import DAO.ItemPedidoDAO;
import DAO.ItemVentaDAO;
import DAO.PedidoDAO;
import DAO.TurnoDAO;
import Modelo.ItemPedido;
import Modelo.ItemVenta;
import Modelo.Pedido;
import Modelo.Turno;
import Modelo.EntradaSalida;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaVisualizarHistorial extends javax.swing.JFrame 
{       
    TurnoDAO tDAO = new TurnoDAO();
    PedidoDAO pDAO = new PedidoDAO();
    ItemVentaDAO iVentaDAO = new ItemVentaDAO();
    ItemPedidoDAO iPedidoDAO = new ItemPedidoDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    
    DefaultTableModel modelo;    
    DefaultListModel modeloList; 
    
    public static String tablaSelec;    //viene de la ventana anterior
    public static int idSelec;   //viene de la ventana anterior
    
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    DecimalFormat formatoPrecios = new DecimalFormat("0.00");
    DecimalFormat formatoKilos = new DecimalFormat("0.000");
    
    public ventanaVisualizarHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
               
        llenarDatos();
        mostrarCalculos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatosTP = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txfdVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfdTotalCaja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfdDiferencia = new javax.swing.JTextField();
        btnVolverVerHistorial = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualización del historial");

        jScrollPane1.setViewportView(listDatosTP);

        jLabel1.setText("Información");

        tablaTP = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
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

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Venta: ");

        txfdVenta.setEditable(false);
        txfdVenta.setBackground(new java.awt.Color(0, 153, 51));
        txfdVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfdVenta.setText("$");
        txfdVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Total caja:");

        txfdTotalCaja.setBackground(new java.awt.Color(0, 0, 204));
        txfdTotalCaja.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalCaja.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalCaja.setText("$");
        txfdTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Diferencia:");

        txfdDiferencia.setBackground(new java.awt.Color(102, 0, 51));
        txfdDiferencia.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdDiferencia.setForeground(new java.awt.Color(255, 255, 255));
        txfdDiferencia.setText("$");
        txfdDiferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txfdTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txfdDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnVolverVerHistorial.setText("Volver");
        btnVolverVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVerHistorialActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolverVerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverVerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVerHistorialActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverVerHistorialActionPerformed

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
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");
            
            Turno t = tDAO.buscarPorID(idSelec);
            
            modeloList = new DefaultListModel();
            modeloList.addElement("NÚMERO:  " + String.valueOf(t.getId()));
            modeloList.addElement("FECHA DE INICIO:  " + String.valueOf(fechaHoraFormat.format(t.getFechaHoraInicio()) + "hs."));
            if (t.getFechaHoraFin() != null)
            {
                modeloList.addElement("FECHA DE CIERRE:  " + String.valueOf(fechaHoraFormat.format(t.getFechaHoraFin()) + "hs."));
            }
            else
            {
                modeloList.addElement("FECHA DE CIERRE:  " + String.valueOf("Pendiente"));
            }            
            modeloList.addElement("USUARIO:  " + String.valueOf(t.getUsuario().getNombreUsuario()));            
                                   
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
        }
        else    //Pedido
        {
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");
            
            Pedido p = pDAO.buscarPorID(idSelec);
            
            modeloList = new DefaultListModel();
            modeloList.addElement("Número:  " + String.valueOf(p.getId()));
            modeloList.addElement("Proveedor:  " + p.getProveedor().getRazonSocial());
            modeloList.addElement("Fecha y hora:  " + String.valueOf(fechaHoraFormat.format(p.getFechaHora())+ "hs."));
                        
            List<ItemPedido> listaCompras = iPedidoDAO.listar(idSelec);
            
            for(ItemPedido i : listaCompras)
            {
                datos[0] = i.getProducto().getDescripcion();
                datos[1] = String.valueOf(i.getCantidad());
                datos[2] = String.valueOf("---");
                datos[3] = String.valueOf("$" + formatoPrecios.format(i.getCantidad() * i.getProducto().getPrecioCosto()));
                
                modelo.addRow(datos);
            }
        }
        
        listDatosTP.setModel(modeloList);
        tablaTP.setModel(modelo);
        
        TableColumnModel tcm = tablaTP.getColumnModel();        
        tcm.getColumn(0).setPreferredWidth(200);
        tcm.getColumn(1).setPreferredWidth(100);
        tcm.getColumn(2).setPreferredWidth(100);
        tcm.getColumn(3).setPreferredWidth(100);
    }
    
    public void mostrarCalculos()
    {
        Turno t = tDAO.buscarPorID(idSelec);
        
        if (t.getFechaHoraFin() == null)
        {
            txfdVenta.setText(String.valueOf("$---"));
            txfdTotalCaja.setText(String.valueOf("$---"));
            txfdDiferencia.setText(String.valueOf("$---"));
        }
        else
        {
            txfdVenta.setText(String.valueOf("$"+t.getMontoVenta()));
            double montoEsperado = t.getMontoVenta() + t.getMontoES();
            txfdTotalCaja.setText(String.valueOf("$"+montoEsperado));
            double diferencia = t.getEfectivoHay() - montoEsperado;
            txfdDiferencia.setText(String.valueOf("$"+diferencia));
        }       
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVolverVerHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listDatosTP;
    private javax.swing.JTable tablaTP;
    private javax.swing.JTextField txfdDiferencia;
    private javax.swing.JTextField txfdTotalCaja;
    private javax.swing.JTextField txfdVenta;
    // End of variables declaration//GEN-END:variables
}
