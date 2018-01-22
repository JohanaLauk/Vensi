package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemPedido;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemPedidoDAO 
{
    Session session = null;
    Transaction tx;
    
    public void alta(ItemPedido i)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        try
        {
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
        finally{
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item agregado");
    }
    
    public void modificar(ItemPedido i, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        ItemPedido item = null;
        item = (ItemPedido)session.get(ItemPedido.class, id);
        item.setCantidad(i.getCantidad());
        tx = session.beginTransaction();
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
        finally{
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item de pedido modificado");
    }
    
    public void borrar(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        ItemPedido item = null;                    
        item = (ItemPedido)session.get(ItemPedido.class, id);
        
        tx = session.beginTransaction();
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item eliminado");
    }
    
    public List<ItemPedido> listar(int nroPedido)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<ItemPedido> lista = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemPedido ip WHERE ip.pedido.id = :nroPedido");
            query.setParameter("nroPedido", nroPedido);
            lista = query.list(); 
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemPedido del pedido");
        }      
        finally{
            session.close();
        }
        return lista;
    }
}
