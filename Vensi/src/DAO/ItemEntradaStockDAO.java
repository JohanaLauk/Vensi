package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemEntradaStock;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemEntradaStockDAO 
{    
    Session session = null;
    Transaction tx;
    
    public void alta(ItemEntradaStock i)
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
    
    public void modificar(ItemEntradaStock i, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        ItemEntradaStock item = null;
        
        item = (ItemEntradaStock)session.get(ItemEntradaStock.class, id);
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Item de EntradaStock modificado");
    }
    
    public void borrar(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        ItemEntradaStock item = null;                    
        item = (ItemEntradaStock)session.get(ItemEntradaStock.class, id);
        
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
    
    public List<ItemEntradaStock> listar(int nroItemES)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<ItemEntradaStock> lista = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemEntradaStock ies WHERE ies.entradastock.id = :nroItemES");
            query.setParameter("nroItemES", nroItemES);
            lista = query.list(); 
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemEntradaStock");
        }      
        finally
        {
            session.close();
        }
        return lista;
    }
}
