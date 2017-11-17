package Vista;

import DAO.PedidoDAO;
import DAO.TurnoDAO;
import Modelo.Pedido;
import Modelo.Turno;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaHistorial extends javax.swing.JFrame 
{
    DefaultTableModel modelo;
    TableColumnModel tcm ;
    TurnoDAO tDAO = new TurnoDAO();
    PedidoDAO pDAO = new PedidoDAO();
    
    public ventanaHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        cbBuscarPor.addItem("");
        cbBuscarPor.addItem("Número");
        cbBuscarPor.addItem("Fecha");
        
        labNro.setEnabled(false);
        txfdNro.setEnabled(false);         
        
        labFecha.setEnabled(false);
        dateDesde.setEnabled(false);
        LabFechaHasta.setEnabled(false);
        dateHasta.setEnabled(false);
                
        //Al hacer click en el JFrame se quita la seleccion en el JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {                
                tablaHistorial.clearSelection();
            } 
        });
        
        llenarTabla(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbTurno = new javax.swing.JRadioButton();
        rbPedido = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbBuscarPor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labNro = new javax.swing.JLabel();
        txfdNro = new javax.swing.JTextField();
        labFecha = new javax.swing.JLabel();
        LabFechaHasta = new javax.swing.JLabel();
        dateDesde = new org.jdesktop.swingx.JXDatePicker();
        dateHasta = new org.jdesktop.swingx.JXDatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnMenuPrincipalHistorial = new javax.swing.JButton();
        btnVisualizarHistorial = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Historial");

        bgTipo.add(rbTurno);
        rbTurno.setText("Turno");

        bgTipo.add(rbPedido);
        rbPedido.setText("Pedido");

        jLabel1.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbTurno)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbPedido)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarPorActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        labNro.setText("Ingrese el n°:");

        labFecha.setText("Ingrese la fecha:");

        LabFechaHasta.setText("hasta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNro)
                    .addComponent(labFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfdNro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabFechaHasta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbBuscarPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNro)
                    .addComponent(txfdNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFecha)
                    .addComponent(LabFechaHasta)
                    .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablaHistorial = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
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
        tablaHistorial.getTableHeader().setResizingAllowed(false);
        tablaHistorial.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaHistorial);

        jLabel6.setText("Resultados");

        btnMenuPrincipalHistorial.setText("Menú principal");
        btnMenuPrincipalHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalHistorialActionPerformed(evt);
            }
        });

        btnVisualizarHistorial.setText("Visualizar");
        btnVisualizarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipalHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisualizarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnMenuPrincipalHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
        if (rbTurno.isSelected())
        {
            llenarTabla("Turno");
        }
        if (rbPedido.isSelected())
        {
            llenarTabla("Pedido");
        }       
        
        tablaHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS); //no sé que opcion dejar, ¿que conviene?
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarPorActionPerformed
        if (cbBuscarPor.getSelectedItem().equals(""))
        {
            labNro.setEnabled(false);
            txfdNro.setEnabled(false);         
        
            labFecha.setEnabled(false);
            dateDesde.setEnabled(false);
            LabFechaHasta.setEnabled(false);
            dateHasta.setEnabled(false);
        }       
        if (cbBuscarPor.getSelectedItem().equals("Número"))   
        {
            labNro.setEnabled(true);
            txfdNro.setEnabled(true);    
            
            labFecha.setEnabled(false);
            dateDesde.setEnabled(false);
            LabFechaHasta.setEnabled(false);
            dateHasta.setEnabled(false);
        }
        if (cbBuscarPor.getSelectedItem().equals("Fecha"))
        {
            labFecha.setEnabled(true);
            dateDesde.setEnabled(true);
            LabFechaHasta.setEnabled(true);
            dateHasta.setEnabled(true);
            
            labNro.setEnabled(false);
            txfdNro.setEnabled(false); 
        }
    }//GEN-LAST:event_cbBuscarPorActionPerformed

    private void btnMenuPrincipalHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalHistorialActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalHistorialActionPerformed

    private void btnVisualizarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarHistorialActionPerformed
        ventanaVisualizarHistorial vVisualizarHistorial = new ventanaVisualizarHistorial();
        vVisualizarHistorial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVisualizarHistorialActionPerformed

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
        if(clase == null)
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
        else if(clase.equals("Turno"))
        {   
            modelo = new DefaultTableModel();
            modelo.addColumn("Número");
            modelo.addColumn("Fecha y hora inicio");
            modelo.addColumn("Fecha y hora fin");

            if(cbBuscarPor.getSelectedItem().equals("Fecha"))
            {
                List<Turno> lista = tDAO.buscarPorFecha(dateDesde.getDate(), dateHasta.getDate());
                String [] datos = new String[3];
                for(Turno t : lista)
                {
                    datos[0] = String.valueOf(t.getId());
                    datos[1] = String.valueOf(t.getFechaHoraInicio());
                    datos[2] = String.valueOf(t.getFechaHoraFin());
                    
                    modelo.addRow(datos);
                }
                
            }
            else
            {
                List<Turno> lista = tDAO.buscarPorNumero(Integer.parseInt(txfdNro.getText()));
                String [] datos = new String[3];
                for(Turno t : lista)
                {
                    datos[0] = String.valueOf(t.getId());
                    datos[1] = String.valueOf(t.getFechaHoraInicio());
                    datos[2] = String.valueOf(t.getFechaHoraFin());
                    
                    modelo.addRow(datos);
                }
            }
                this.tablaHistorial.setModel(modelo);
            
                tcm = tablaHistorial.getColumnModel();
                tcm.getColumn(0).setPreferredWidth(100);
                tcm.getColumn(1).setPreferredWidth(200);
                tcm.getColumn(2).setPreferredWidth(200);
            
        }
        else{ //acá es el de pedido
            modelo = new DefaultTableModel();
            modelo.addColumn("Número");
            modelo.addColumn("Fecha y hora");
            modelo.addColumn("Proveedor");
            
            if(cbBuscarPor.getSelectedItem().equals("Fecha"))
            {
                List<Pedido> lista = pDAO.buscarPorFecha(dateDesde.getDate(), dateHasta.getDate());
                String [] datos = new String[3];
                for(Pedido p : lista)
                {
                    datos[0] = String.valueOf(p.getId());
                    datos[1] = String.valueOf(p.getFechaHora());
                    datos[2] = String.valueOf(p.getProveedor().getRazonSocial());
                    
                    modelo.addRow(datos);
                }
            }
            else
            {
                Pedido p = pDAO.buscarPorID(Integer.parseInt(txfdNro.getText()));
                String [] datos = new String[3];
                //for(Pedido p : lista)
                //{
                    datos[0] = String.valueOf(p.getId());
                    datos[1] = String.valueOf(p.getFechaHora());
                    datos[2] = String.valueOf(p.getProveedor().getRazonSocial());
                    
                    modelo.addRow(datos);
                //}
            }
            this.tablaHistorial.setModel(modelo);
        
            tcm.getColumn(0).setPreferredWidth(100);
            tcm.getColumn(1).setPreferredWidth(200);
            tcm.getColumn(2).setPreferredWidth(200);
        }
        
        tablaHistorial.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                tablaHistorial.setRowSelectionAllowed(true);
            }

            @Override
            public void focusLost(FocusEvent fe) 
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
            } 
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabFechaHasta;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenuPrincipalHistorial;
    private javax.swing.JButton btnVisualizarHistorial;
    private javax.swing.JComboBox<String> cbBuscarPor;
    private org.jdesktop.swingx.JXDatePicker dateDesde;
    private org.jdesktop.swingx.JXDatePicker dateHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labNro;
    private javax.swing.JRadioButton rbPedido;
    private javax.swing.JRadioButton rbTurno;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTextField txfdNro;
    // End of variables declaration//GEN-END:variables
}
