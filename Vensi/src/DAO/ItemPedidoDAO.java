package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemPedido;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemPedidoDAO 
{
    SessionFactory sesion = null;
    Session session = null;
    
    public void alta(ItemPedido i)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession(); 
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(i);
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }        
        //JOptionPane.showMessageDialog(null, "Item agregado");
    }
    
    public void modificar(ItemPedido i, int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession(); 
        
        ItemPedido item = null;
        item = (ItemPedido)session.get(ItemPedido.class, id);
        item.setCantidad(i.getCantidad());
                  
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(item);
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }
        //JOptionPane.showMessageDialog(null, "Item de pedido modificado");
    }
    
    public void borrar(int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
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
            session.close();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        }        
        //JOptionPane.showMessageDialog(null, "Item eliminado");
    }
    
    public List<ItemPedido> listar(int nroPedido)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<ItemPedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemPedido ip WHERE ip.pedido.id = :nroPedido");
            query.setParameter("nroPedido", nroPedido);
            lista = query.list(); 
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemPedido del pedido");
        }       
        return lista;
    }
}
