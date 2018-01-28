package Vista;

import DAO.PedidoDAO;
import DAO.TurnoDAO;
import Modelo.Pedido;
import Modelo.Turno;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaHistorial extends javax.swing.JFrame 
{
    DefaultTableModel modelo;
    TableColumnModel tcm ;
    TurnoDAO tDAO = new TurnoDAO();
    PedidoDAO pDAO = new PedidoDAO();    
    
    DateFormat fechaHoraFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    public ventanaHistorial() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana
        
        cbBuscarPor.addItem("Seleccionar");
        cbBuscarPor.addItem("Número");
        cbBuscarPor.addItem("Fecha");
        btnVisualizarHistorial.setEnabled(false);
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
                btnVisualizarHistorial.setEnabled(false);
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
        btnVaciarFechaHasta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnMenuPrincipalHistorial = new javax.swing.JButton();
        btnVisualizarHistorial = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Historial");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        bgTipo.add(rbTurno);
        rbTurno.setText("Turno");
        rbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTurnoActionPerformed(evt);
            }
        });

        bgTipo.add(rbPedido);
        rbPedido.setText("Pedido");
        rbPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPedidoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(2, 2, 2))
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

        txfdNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdNroKeyTyped(evt);
            }
        });

        labFecha.setText("Ingrese la fecha:");

        LabFechaHasta.setText("hasta");

        btnVaciarFechaHasta.setText("X");
        btnVaciarFechaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarFechaHastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbBuscarPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabFechaHasta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVaciarFechaHasta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labNro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfdNro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNro)
                    .addComponent(txfdNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFecha)
                    .addComponent(LabFechaHasta)
                    .addComponent(dateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaciarFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        tablaHistorial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (!rbTurno.isSelected() && !rbPedido.isSelected())
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
                if (rbPedido.isSelected())
                {
                    llenarTabla("Pedido");
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

    private void btnMenuPrincipalHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalHistorialActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalHistorialActionPerformed

    private void btnVisualizarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarHistorialActionPerformed
        if (rbTurno.isSelected())
        {
            ventanaVisualizarHistorial.tablaSelec = "Turno";         
        }
        if (rbPedido.isSelected())
        {
            ventanaVisualizarHistorial.tablaSelec = "Pedido";
        }
        
        ventanaVisualizarHistorial.idSelec = Integer.parseInt(tablaHistorial.getValueAt(tablaHistorial.getSelectedRow(),0).toString());
        
        ventanaVisualizarHistorial vVisualizarHistorial = new ventanaVisualizarHistorial();
        vVisualizarHistorial.setVisible(true);
    }//GEN-LAST:event_btnVisualizarHistorialActionPerformed

    private void txfdNroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdNroKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9') && (c != java.awt.event.KeyEvent.VK_BACK_SPACE))         
            evt.consume();         
    }//GEN-LAST:event_txfdNroKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        int filaSelec = tablaHistorial.getSelectedRow();
        
        if (filaSelec >= 0)
        {
            btnVisualizarHistorial.setEnabled(true);
        }
        else
        {
            btnVisualizarHistorial.setEnabled(false);
        }                
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnVaciarFechaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarFechaHastaActionPerformed
        dateHasta.setDate(null);
    }//GEN-LAST:event_btnVaciarFechaHastaActionPerformed

    private void rbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTurnoActionPerformed
        txfdNro.setText("");
        dateDesde.setDate(null);
        dateHasta.setDate(null);        
        cbBuscarPor.setSelectedItem("Seleccionar");        

        tablaVacia();
    }//GEN-LAST:event_rbTurnoActionPerformed

    private void rbPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPedidoActionPerformed
        txfdNro.setText("");
        dateDesde.setDate(null);
        dateHasta.setDate(null);        
        cbBuscarPor.setSelectedItem("Seleccionar");        

        tablaVacia();
    }//GEN-LAST:event_rbPedidoActionPerformed

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
            else    //pedido
            {   
                if (clase.equals("Pedido"))
                {
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Número");
                    modelo.addColumn("Fecha y hora");
                    modelo.addColumn("Proveedor");

                    if (cbBuscarPor.getSelectedItem().equals("Fecha"))
                    {
                        if (nro.equals("") && fechaDesde != null)
                        {
                            List<Pedido> listaPedidos = pDAO.buscarPorFecha(fechaDesde, fechaHasta);

                            if (listaPedidos.isEmpty()) 
                            {
                                JOptionPane.showMessageDialog(null, "No hay pedidos registrados.");
                            } 
                            else 
                            {
                                String[] datos = new String[3];

                                for (Pedido p : listaPedidos) 
                                {
                                    datos[0] = String.valueOf(p.getId());
                                    datos[1] = String.valueOf(fechaHoraFormat.format(p.getFechaHora()) + "hs.");
                                    datos[2] = String.valueOf(p.getProveedor().getRazonSocial());

                                    modelo.addRow(datos);
                                    this.tablaHistorial.setModel(modelo);
                                    tcm.getColumn(0).setPreferredWidth(100);
                                    tcm.getColumn(1).setPreferredWidth(200);
                                    tcm.getColumn(2).setPreferredWidth(200);
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
                                Pedido p = pDAO.buscarPorID(Integer.parseInt(txfdNro.getText()));

                                if (p == null) 
                                {
                                    JOptionPane.showMessageDialog(null, "No hay pedidos registrados.");
                                } 
                                else 
                                {
                                    String[] datos = new String[3];

                                    datos[0] = String.valueOf(p.getId());
                                    datos[1] = String.valueOf(fechaHoraFormat.format(p.getFechaHora()) + "hs.");
                                    datos[2] = String.valueOf(p.getProveedor().getRazonSocial());

                                    modelo.addRow(datos);
                                    this.tablaHistorial.setModel(modelo);
                                    tcm.getColumn(0).setPreferredWidth(100);
                                    tcm.getColumn(1).setPreferredWidth(200);
                                    tcm.getColumn(2).setPreferredWidth(200);
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
                    btnVisualizarHistorial.setEnabled(true);
                }
                else
                {
                    btnVisualizarHistorial.setEnabled(false);
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
    private javax.swing.JButton btnMenuPrincipalHistorial;
    private javax.swing.JButton btnVaciarFechaHasta;
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
