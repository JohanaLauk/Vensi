package DAO;


import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemPedido;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemPedidoDAO 
{
        
    public void alta(ItemPedido i)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession(); 
        
        Transaction tx = session.beginTransaction();
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
        session.close();
        //JOptionPane.showMessageDialog(null, "Item agregado");
    }
    
    public void modificar(ItemPedido i, int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession(); 
        
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
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
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
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
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
