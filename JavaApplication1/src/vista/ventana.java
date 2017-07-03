/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Operacion;
import java.awt.event.*;
import javax.swing.*;
import modelo.Producto;
import modelo.ProductoId;

/**
 *
 * @author Bian
 */
public class ventana extends JFrame{
    
    JPanel panel;
    JTextField txfCodigo, txfNombre;
    JLabel lbCodigo, lbNombre;
    JButton btnAgregar, btnConsultar, btnBorrar;
    
    public ventana(){
        
        final Operacion op = new Operacion();
        
        lbCodigo = new JLabel("Codigo: ");
        lbCodigo.setBounds(10, 40, 80, 30);
        txfCodigo = new JTextField();
        txfCodigo.setBounds(70, 45, 100, 20);
        
        lbNombre = new JLabel("Nombre: ");
        lbNombre.setBounds(10, 70, 80, 30);
        txfNombre = new JTextField();
        txfNombre.setBounds(70, 75, 100, 20);
        
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(10, 100, 80, 30);
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try{
                    
                    Producto p = new Producto();
                    ProductoId pId = new ProductoId();
                    pId.setCodigo(Integer.parseInt(txfCodigo.getText()));
                    pId.setId(1);
                    p.setNombre(txfNombre.getText());
                    p.setId(pId);
                    
                    op.alta(p);            
                } 
                catch(Exception ex){
                    
                }
                
            }
        });
        
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(txfCodigo);
        panel.add(lbCodigo);
        panel.add(txfNombre);
        panel.add(lbNombre);
        panel.add(btnAgregar);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,300);
        setResizable(false);
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[]args)
    {
        new ventana();
    }
}
