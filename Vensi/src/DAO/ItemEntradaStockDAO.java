package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemEntradastock;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemEntradaStockDAO 
{    
    Session session = null;
    Transaction tx;
    
    public void alta(ItemEntradastock i)
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item agregado");
    }
    
    public void modificar(ItemEntradastock i, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        ItemEntradastock item = null;
        
        item = (ItemEntradastock)session.get(ItemEntradastock.class, id);
        item.setProducto(i.getProducto());
        item.setEntradastock(i.getEntradastock());        
        item.setCantidad(i.getCantidad());        
        item.setPrecioCosto(i.getPrecioCosto());
        item.setPrecioVenta(i.getPrecioVenta());        
        
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item de EntradaStock modificado");
    }
    
    public void borrar(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        ItemEntradastock item = null;                    
        item = (ItemEntradastock)session.get(ItemEntradastock.class, id);
        
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
    
    public List<ItemEntradastock> listar(int nroItemES)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<ItemEntradastock> lista = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemEntradastock ies WHERE ies.entradastock.id = :nroItemES");
            query.setParameter("nroItemES", nroItemES);
            lista = query.list(); 
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemEntradastock");
        }      
        finally
        {
            session.close();
        }
        return lista;
    }
}
