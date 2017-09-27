/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Sesion;
import org.hibernate.*;
import Modelo.ItemPedido;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bian
 */
public class ItemPedidoDAO {
    
    Sesion nuevaSesion = new Sesion();
    Session session = nuevaSesion.iniciarSesion();
    
    public void alta(ItemPedido i)
    {
        Transaction tx = session.beginTransaction();
        try{
            session.save(i);
            tx.commit();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }
        session.close();
        //JOptionPane.showMessageDialog(null, "Item agregado");
    }
    
    public void modificar(ItemPedido i, int id)
    {
        ItemPedido item = null;
        item = (ItemPedido)session.get(ItemPedido.class, id);
        item.setCantidad(i.getCantidad());
                  
        Transaction tx = session.beginTransaction();
        try
        {
          session.merge(item);
          tx.commit();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }
            session.close();
            //JOptionPane.showMessageDialog(null, "Item de pedido modificado");
    }
    
    public void borrar(int id)
    {
        ItemPedido item = null;
                    
        item = (ItemPedido)session.get(ItemPedido.class, id);
        
        Transaction tx = session.beginTransaction();
        try
        {
            if(item != null)
            {
                session.delete(item);
            }
          tx.commit();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }
            session.close();
            //JOptionPane.showMessageDialog(null, "Item eliminado");
    }
    
    public List<ItemPedido> listar()
    {
        List<ItemPedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM ItemPedido").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
}
