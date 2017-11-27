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
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaVisualizarHistorial extends javax.swing.JFrame 
{
    DefaultTableModel modelo;    
    DefaultListModel modeloList;
    public static String tablaSelec;
    public static int idSelec;
    TurnoDAO tDAO = new TurnoDAO();
    PedidoDAO pDAO = new PedidoDAO();
    ItemVentaDAO iVentaDAO = new ItemVentaDAO();
    ItemPedidoDAO iPedidoDAO = new ItemPedidoDAO();
    EntradaSalidaDAO esDAO = new EntradaSalidaDAO();
    
    
    public ventanaVisualizarHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
       
       llenarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTurno = new javax.swing.JTable();
        btnVolverVerHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualización del historial");

        jScrollPane1.setViewportView(listDatos);

        jLabel1.setText("Información");

        tablaTurno = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaTurno.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaTurno.setFocusable(false);
        tablaTurno.getTableHeader().setResizingAllowed(false);
        tablaTurno.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaTurno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );

        btnVolverVerHistorial.setText("Volver");
        btnVolverVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVerHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolverVerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverVerHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVerHistorialActionPerformed
        ventanaHistorial vHistorial = new ventanaHistorial();
        vHistorial.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
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
        
        this.tablaTurno.setModel(modelo);
        
        if (tablaSelec.equals("Turno")) {
            
            Turno t = tDAO.buscarPorID(idSelec);
            modeloList = new DefaultListModel();
            modeloList.addElement("Número: " + String.valueOf(t.getId()));
            modeloList.addElement("Fecha de inicio: " + String.valueOf(t.getFechaHoraInicio()));
            modeloList.addElement("Fecha de cierre: " + String.valueOf(t.getFechaHoraFin()));
            listDatos.setModel(modeloList);
            
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");
            List<ItemVenta> lista = iVentaDAO.listar(idSelec);
            for (ItemVenta i : lista) {
                datos[0] = i.getProducto().getDescripcion();
                datos[1] = String.valueOf(i.getCantidad());
                modelo.addRow(datos);
            }
            List<EntradaSalida> listaES = esDAO.listar(idSelec);
            if (listaES != null) {
                for (EntradaSalida e : listaES) {
                    if (e.isTipo()) {
                        datos[2] = "✔";
                    } else {
                        datos[3] = "✔";
                    }
                }
            }

            //falta las entradas y salidas
        }
        else
        {
            Pedido p = pDAO.buscarPorID(idSelec);
            modeloList = new DefaultListModel();
            modeloList.addElement("Número: " + String.valueOf(p.getId()));
            modeloList.addElement("Proveedor: " + p.getProveedor().getRazonSocial());
            modeloList.addElement("Fecha: " + String.valueOf(p.getFechaHora()));
            listDatos.setModel(modeloList);
            
            List<ItemPedido> lista = iPedidoDAO.listar(idSelec);
            for(ItemPedido i : lista){
                datos[0] = i.getProducto().getDescripcion();
                datos[1] = String.valueOf(i.getCantidad());
                modelo.addRow(datos);
            }
        }
        
        listDatos.setModel(modeloList);
        tablaTurno.setModel(modelo);
        
        TableColumnModel tcm = tablaTurno.getColumnModel();
        
        tcm.getColumn(0).setPreferredWidth(200);
        tcm.getColumn(1).setPreferredWidth(100);
        tcm.getColumn(2).setPreferredWidth(100);
        tcm.getColumn(3).setPreferredWidth(100);
        
        tablaTurno.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS); //no sé que opcion dejar, ¿que conviene?
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverVerHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listDatos;
    private javax.swing.JTable tablaTurno;
    // End of variables declaration//GEN-END:variables
}
