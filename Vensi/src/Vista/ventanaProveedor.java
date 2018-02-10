package Vista;

import DAO.ProveedorDAO;
import Modelo.Proveedor;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaProveedor extends javax.swing.JFrame 
{    
    ProveedorDAO pDAO = new ProveedorDAO();
    DefaultTableModel modelo, modelo2;
    TableColumnModel tcm, tcm2;
    
    String filtroSelec = "Todos";
    String ordenSelec = "razonSocial";
    String tipoSelec = "ASC";
    
    ImageIcon icono;
    
    public ventanaProveedor() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);     //centra la ventana        
        this.setExtendedState(MAXIMIZED_BOTH);  //maximiza la ventana al abrir        
        //this.setMinimumSize(new Dimension(2147483647, 2147483647));  //al minimizar la ventana no permite que sea mas chico que esa medida        
        //this.setPreferredSize(new Dimension(2147483647, 2147483647));    //al minimizar la ventana aparece con esa medida
         
        //Al hacer click en el JFrame se quita la seleccion en el JTable
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {                
                tablaProv.clearSelection();
            } 
        });
        
        llenarTabla();          
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTodo = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbFiltroCampoProv = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txfdBuscarProv = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        cbCampoOrden = new javax.swing.JComboBox<>();
        cbTipoOrden = new javax.swing.JComboBox<>();
        panelTabla = new javax.swing.JPanel();
        btnNuevoProv = new javax.swing.JButton();
        btnEditarProv = new javax.swing.JButton();
        btnMenuPpal = new javax.swing.JButton();
        btnVolverProv = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión del Proveedor");
        setResizable(false);
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

        panelBusqueda.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");

        cbFiltroCampoProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbFiltroCampoProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Habilitados", "Deshabilitados" }));
        cbFiltroCampoProv.setNextFocusableComponent(btnNuevoProv);
        cbFiltroCampoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCampoProvActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtrar por:");

        txfdBuscarProv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txfdBuscarProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txfdBuscarProv.setPrompt("Busque por código o por descripción");
        txfdBuscarProv.setPromptForeground(new java.awt.Color(51, 51, 51));
        txfdBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfdBuscarProvKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ordenar por:");

        cbCampoOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbCampoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Razón social", "Cuit" }));
        cbCampoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCampoOrdenActionPerformed(evt);
            }
        });

        cbTipoOrden.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cbTipoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cbTipoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfdBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFiltroCampoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfdBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFiltroCampoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(cbCampoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTipoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelTabla.setOpaque(false);

        btnNuevoProv.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnNuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vProveedor/prov+_50.png"))); // NOI18N
        btnNuevoProv.setText("Nuevo");
        btnNuevoProv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoProv.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevoProv.setIconTextGap(50);
        btnNuevoProv.setNextFocusableComponent(btnEditarProv);
        btnNuevoProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoProvMouseExited(evt);
            }
        });
        btnNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProvActionPerformed(evt);
            }
        });

        btnEditarProv.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnEditarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vProducto/editarProd_50.png"))); // NOI18N
        btnEditarProv.setText("Editar");
        btnEditarProv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarProv.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditarProv.setIconTextGap(50);
        btnEditarProv.setNextFocusableComponent(btnVolverProv);
        btnEditarProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarProvMouseExited(evt);
            }
        });
        btnEditarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProvActionPerformed(evt);
            }
        });

        btnMenuPpal.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMenuPpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vProducto/home_50.png"))); // NOI18N
        btnMenuPpal.setText("Menú principal");
        btnMenuPpal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenuPpal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenuPpal.setIconTextGap(10);
        btnMenuPpal.setNextFocusableComponent(txfdBuscarProv);
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

        btnVolverProv.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVolverProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vProducto/volver_50.png"))); // NOI18N
        btnVolverProv.setText("Volver");
        btnVolverProv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverProv.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolverProv.setIconTextGap(40);
        btnVolverProv.setNextFocusableComponent(btnMenuPpal);
        btnVolverProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverProvMouseExited(evt);
            }
        });
        btnVolverProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverProvActionPerformed(evt);
            }
        });

        tablaProv = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProv.setFocusable(false);
        tablaProv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProv.getTableHeader().setResizingAllowed(false);
        tablaProv.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaProv);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProv, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverProv, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuPpal))
            .addComponent(jScrollPane3)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoProv)
                    .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenuPpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverProv)
                        .addComponent(btnEditarProv))))
        );

        javax.swing.GroupLayout panelTodoLayout = new javax.swing.GroupLayout(panelTodo);
        panelTodo.setLayout(panelTodoLayout);
        panelTodoLayout.setHorizontalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTodoLayout.setVerticalGroup(
            panelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodoLayout.createSequentialGroup()
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

    private void btnMenuPpalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPpalActionPerformed
        ventanaPrincipal vPrincipal = new ventanaPrincipal();
        vPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPpalActionPerformed

    private void btnVolverProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverProvActionPerformed
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverProvActionPerformed

    private void btnNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvActionPerformed
        ventanaNuevoProv vNuevoProv = new ventanaNuevoProv();
        vNuevoProv.setVisible(true);
    }//GEN-LAST:event_btnNuevoProvActionPerformed

    private void btnEditarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProvActionPerformed
        int filaSelec = tablaProv.getSelectedRow();
        
        if (filaSelec >= 0)   //corrobotamos si seleccionó una fila
        {
            //GUARDAMOS EL ID EN LA VARIABLE DE LA VENTANA_EDITAR_PROV, DEL PROVEEDOR SELECCIONADO EN LA TABLA
            ventanaEditarProv.id_recibido = Integer.parseInt((String) tablaProv.getValueAt(filaSelec, 6));

            ventanaEditarProv vEditarProv = new ventanaEditarProv();
            vEditarProv.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
        }             
    }//GEN-LAST:event_btnEditarProvActionPerformed

    private void txfdBuscarProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdBuscarProvKeyReleased
        String cadena = txfdBuscarProv.getText();
        
        List<Proveedor> listaPB = pDAO.buscarPorCuitNombre(cadena, filtroSelec);
        
        llenarTablaBusqueda(listaPB);
        
        if (txfdBuscarProv.getText().equals("") || txfdBuscarProv.getText() == null)
        {
            cbFiltroCampoProv.setEnabled(true); 
            llenarTabla();
        }
        else
        {
            cbFiltroCampoProv.setEnabled(false);
        }
    }//GEN-LAST:event_txfdBuscarProvKeyReleased

    private void cbFiltroCampoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCampoProvActionPerformed
        if (cbFiltroCampoProv.getSelectedItem().equals("Todos"))
        {
            filtroSelec = "Todos";
        }
        else
        {
            if (cbFiltroCampoProv.getSelectedItem().equals("Habilitados"))
            {
                filtroSelec = "Habilitados";
            }
            else
            {
                filtroSelec = "Deshabilitados";
            }
        }
        llenarTabla();
    }//GEN-LAST:event_cbFiltroCampoProvActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenarTabla();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnNuevoProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProvMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vProveedor/prov+_lleno_50.png"));     
        btnNuevoProv.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProvMouseEntered

    private void btnNuevoProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProvMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vProveedor/prov+_50.png"));     
        btnNuevoProv.setIcon(icono);
    }//GEN-LAST:event_btnNuevoProvMouseExited

    private void btnEditarProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProvMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/editarProd_lleno_50.png"));     
        btnEditarProv.setIcon(icono);
    }//GEN-LAST:event_btnEditarProvMouseEntered

    private void btnEditarProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProvMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/editarProd_50.png"));     
        btnEditarProv.setIcon(icono);
    }//GEN-LAST:event_btnEditarProvMouseExited

    private void btnVolverProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverProvMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/volver_lleno_50.png"));     
        btnVolverProv.setIcon(icono);
    }//GEN-LAST:event_btnVolverProvMouseEntered

    private void btnVolverProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverProvMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/volver_50.png"));     
        btnVolverProv.setIcon(icono);
    }//GEN-LAST:event_btnVolverProvMouseExited

    private void btnMenuPpalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseEntered
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/home_lleno_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseEntered

    private void btnMenuPpalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPpalMouseExited
        icono = new ImageIcon(getClass().getResource("/Recursos/vProducto/home_50.png"));     
        btnMenuPpal.setIcon(icono);
    }//GEN-LAST:event_btnMenuPpalMouseExited

    private void cbCampoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCampoOrdenActionPerformed
        if (cbCampoOrden.getSelectedItem().equals("Razón social"))
        {
            ordenSelec = "razonSocial";
        }
        if (cbCampoOrden.getSelectedItem().equals("Cuit"))
        {
            ordenSelec = "cuit";
        }
        llenarTabla();
    }//GEN-LAST:event_cbCampoOrdenActionPerformed

    private void cbTipoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoOrdenActionPerformed
        if (cbTipoOrden.getSelectedItem().equals("Descendente"))
        {
            tipoSelec = "DESC";
        }
        else
        {
            tipoSelec = "ASC";
        }
        llenarTabla();
    }//GEN-LAST:event_cbTipoOrdenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaAdministracion vAdministracion = new ventanaAdministracion();
        vAdministracion.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaProveedor().setVisible(true);
            }
        });
    }
    
    public void llenarTabla()
    {        
        modelo = new DefaultTableModel();
        List<Proveedor> lista = pDAO.listar(filtroSelec, ordenSelec, tipoSelec);  
        String[] datos = new String[7]; 
        
        modelo.addColumn("Razón social");
        modelo.addColumn("Cuit");
        modelo.addColumn("Direción");
        modelo.addColumn("Lugar");        
        modelo.addColumn("Contacto");
        modelo.addColumn("Estado");
        modelo.addColumn("ID");
        
        for (Proveedor p : lista)
        {
            datos[0] = p.getRazonSocial();
            datos[1] = p.getCuit();
            
            if (p.getDireccion().equals(""))
            {
                datos[2] = String.valueOf("---");
            }
            else
            {
                datos[2] = String.valueOf(p.getDireccion());
            }            
            
            if (p.getLocalidad().equals("") && p.getProvincia().equals("") && p.getPais().equals(""))
            {
                datos[3] = String.valueOf("---");                
            }
            else
            {   
                if (!p.getLocalidad().equals("") && !p.getProvincia().equals("") && !p.getPais().equals(""))
                {
                    datos[3] = String.valueOf(p.getLocalidad() + ", " + p.getProvincia() + " (" + p.getPais() + ")");
                }
                else
                {
                    if (!p.getLocalidad().equals("") && p.getProvincia().equals("") && p.getPais().equals("")) //localidad
                    {
                        datos[3] = String.valueOf(p.getLocalidad());
                    }
                    if (p.getLocalidad().equals("") && !p.getProvincia().equals("") && p.getPais().equals("")) //localidad
                    {
                        datos[3] = String.valueOf(p.getProvincia());
                    }
                    if (p.getLocalidad().equals("") && p.getProvincia().equals("") && !p.getPais().equals("")) //localidad
                    {
                        datos[3] = String.valueOf(p.getPais());
                    }
                    
                    if (!p.getLocalidad().equals("") && !p.getProvincia().equals("") && p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getLocalidad() + ", " + p.getProvincia());
                    }
                    if (!p.getLocalidad().equals("") && p.getProvincia().equals("") && !p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getLocalidad() + ", " + p.getPais());
                    }
                    
                    if (!p.getLocalidad().equals("") && !p.getProvincia().equals("") && p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getLocalidad() + ", " + p.getProvincia());
                    }
                    if (p.getLocalidad().equals("") && !p.getProvincia().equals("") && !p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getProvincia() + " (" + p.getPais() + ")");
                    }                    
                    
                    if (!p.getLocalidad().equals("") && p.getProvincia().equals("") && !p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getLocalidad() + " (" + p.getPais() + ")");
                    }
                    if (p.getLocalidad().equals("") && !p.getProvincia().equals("") && !p.getPais().equals(""))
                    {
                        datos[3] = String.valueOf(p.getProvincia() + " (" + p.getPais() + ")");
                    }
                }    
            }
            
            if (p.getContacto().equals(""))
            {
                datos[4] = String.valueOf("---");
            }
            else
            {
                datos[4] = String.valueOf(p.getContacto());
            }            

            if (p.isEstado())
            {
                datos[5] = "Habilitado";
            }
            else
            {
                datos[5] = "Deshabilitado";
            }
            datos[6] = String.valueOf(p.getId());   
            
            modelo.addRow(datos);
        }    
        
        tablaProv.setModel(modelo);
        
        tcm = tablaProv.getColumnModel();        
        tcm.getColumn(0).setPreferredWidth(250);
        tcm.getColumn(1).setPreferredWidth(120);
        tcm.getColumn(2).setPreferredWidth(250);
        tcm.getColumn(3).setPreferredWidth(200);
        tcm.getColumn(4).setPreferredWidth(150);
        tcm.getColumn(5).setPreferredWidth(50);
        tcm.getColumn(6).setPreferredWidth(0);
        tcm.getColumn(6).setMaxWidth(0);
        tcm.getColumn(6).setMinWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        
        tablaProv.addFocusListener(new FocusListener() 
        {
            @Override
            public void focusGained(FocusEvent fe)  //recupera el foco
            {
                tablaProv.setRowSelectionAllowed(true);     //permitir seleccion
            }

            @Override
            public void focusLost(FocusEvent fe)    //pierde el foco
            {                
                tablaProv.setRowSelectionAllowed(false);    //no permitir seleccion
            } 
        });
        
        tablaProv.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                tablaProv.setRowSelectionAllowed(true);
            } 
        });
    }    
    
    public void llenarTablaBusqueda(List<Proveedor> listaBusqueda)
    {        
        modelo2 = new DefaultTableModel();
        String [] datos = new String[7]; 
        
        modelo2.addColumn("Razón social");
        modelo2.addColumn("Cuit");
        modelo2.addColumn("Direción");
        modelo2.addColumn("Lugar");
        modelo2.addColumn("Contacto");
        modelo2.addColumn("Estado");
        modelo2.addColumn("ID");
        
        for (Proveedor p : listaBusqueda)
        {
            datos[0] = p.getRazonSocial();
            datos[1] = p.getCuit();
            datos[2] = String.valueOf(p.getDireccion());
            datos[3] = String.valueOf(p.getLocalidad() + ", " + p.getProvincia() + " (" + p.getPais() + ")");
            datos[4] = String.valueOf(p.getContacto());

            if (p.isEstado())
            {
                datos[5] = "Habilitado";
            }
            else
            {
                datos[5] = "Deshabilitado";
            }
            datos[6] = String.valueOf(p.getId());
            
            modelo2.addRow(datos);
        }        
        tablaProv.setModel(modelo2);
        
        tcm2 = tablaProv.getColumnModel();        
        tcm2.getColumn(0).setPreferredWidth(250);
        tcm2.getColumn(1).setPreferredWidth(120);
        tcm2.getColumn(2).setPreferredWidth(250);
        tcm2.getColumn(3).setPreferredWidth(200);
        tcm2.getColumn(4).setPreferredWidth(150);
        tcm2.getColumn(5).setPreferredWidth(50);
        tcm2.getColumn(6).setPreferredWidth(0);
        tcm2.getColumn(6).setMaxWidth(0);
        tcm2.getColumn(6).setMinWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tablaProv.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarProv;
    private javax.swing.JButton btnMenuPpal;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnVolverProv;
    private javax.swing.JComboBox<String> cbCampoOrden;
    private javax.swing.JComboBox<String> cbFiltroCampoProv;
    private javax.swing.JComboBox<String> cbTipoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTodo;
    private javax.swing.JTable tablaProv;
    private org.jdesktop.swingx.JXTextField txfdBuscarProv;
    // End of variables declaration//GEN-END:variables
}