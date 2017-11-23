package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemVenta;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVentaDAO 
{        
    public void alta(ItemVenta i)
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
        JOptionPane.showMessageDialog(null, "ItemVenta agregado");
    }
    
    public void modificar(ItemVenta i, int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        ItemVenta item = null;
        item = (ItemVenta)session.get(ItemVenta.class, id);
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
        JOptionPane.showMessageDialog(null, "ItemVenta modificado");
    }
    
    public void borrar(int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        ItemVenta item = null;                    
        item = (ItemVenta)session.get(ItemVenta.class, id);
        
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
        JOptionPane.showMessageDialog(null, "ItemVenta eliminado");
    }
    
    public List<ItemVenta> listar(int nroTurno)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<ItemVenta> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta iv WHERE iv.turno.id = :nroTurno");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemVenta del turno");
        }        
        return lista;
    }
}