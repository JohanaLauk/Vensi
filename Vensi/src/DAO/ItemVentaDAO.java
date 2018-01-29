package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemVenta;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVentaDAO 
{        
    Session session;
    Transaction tx;
            
    public void alta(ItemVenta i)
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
        //JOptionPane.showMessageDialog(null, "ItemVenta agregado");
    }
    
    public void modificar(ItemVenta i, int id)  //i = recibe la fecha y la cantidad nueva   |   id = id_ItemVenta existente
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        ItemVenta item = null;
        
        item = (ItemVenta)session.get(ItemVenta.class, id);
        item.setCantidad(i.getCantidad());
        item.setMonto(i.getMonto());
        item.setHora(i.getHora());
                  
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
        //JOptionPane.showMessageDialog(null, "ItemVenta modificado");
    }
    
    public void borrar(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        ItemVenta item = null;                    
        item = (ItemVenta)session.get(ItemVenta.class, id);
        
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
    
    public List<ItemVenta> buscar(String cadena, int nroTurno)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<ItemVenta> lista = null;
        
        try
        {            
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta iv WHERE iv.producto.codigo LIKE :cadena OR iv.producto.descripcion LIKE :cadena AND iv.turno.id = :nroTurno");
            query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");        
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Buscar itemVenta");
        }        
        finally
        {
            session.close();
        }
        return lista;
    }
    
    public List<ItemVenta> listar(int nroTurno)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<ItemVenta> lista = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta iv WHERE iv.turno.id = :nroTurno ORDER BY iv.producto.descripcion");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemVenta del turno");
        }        
        finally
        {
            session.close();
        }
        return lista;
    }
}