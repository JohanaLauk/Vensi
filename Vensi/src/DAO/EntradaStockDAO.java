package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import java.util.*;
import javax.swing.*;
import Modelo.Entradastock;

public class EntradaStockDAO 
{            
    Session session;
    Transaction tx;
        
    public void alta (Entradastock es)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        try
        {
            session.save(es);
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
        //JOptionPane.showMessageDialog(null, "Entradastock creado");
    }
    
    public void modificar(Entradastock es, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Entradastock nuevoEStock = null;
                   
        nuevoEStock = (Entradastock)session.get(Entradastock.class, id);
        nuevoEStock.setFechaHora(es.getFechaHora());
        nuevoEStock.setProveedor(es.getProveedor());
        nuevoEStock.setCantidadTotal(es.getCantidadTotal());
        nuevoEStock.setImporteCostoTotal(es.getImporteCostoTotal());
            
        tx = session.beginTransaction();
        try
        {
            session.merge(nuevoEStock);
            tx.commit();            
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
                    //JOptionPane.showMessageDialog(null, "Error al modificar Entradastock");
		throw e;
        }        
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Entradastock modificado");
    }
    
    public List<Entradastock> listar()
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Entradastock> lista = null;
        try
        {
            tx = session.beginTransaction();
            lista = session.createQuery("FROM Entradastock").list();
            tx.commit();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        finally
        {
            session.close();
        }
        return lista;
    }
    
    public List<Entradastock> buscarPorFecha(Date fechaDesde, Date fechaFin)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Entradastock> lista = null;
        Query query;
        try
        {
            tx = session.beginTransaction();
            if(fechaFin == null)
            {
                query = session.createQuery("FROM Entradastock p WHERE date(p.fechaHora) = :fechaDesde");
                query.setParameter("fechaDesde", fechaDesde);
            }
            else
            {
                query = session.createQuery("FROM Entradastock p WHERE p.fechaHora BETWEEN :fechaDesde AND :fechaFin");
                query.setParameter("fechaDesde", fechaDesde);
                query.setParameter("fechaFin", fechaFin);
            }
    
            lista = query.list();
            tx.commit();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }        
        finally
        {
            session.close();
        }
        return lista;
    }
    
    public Entradastock buscarPorID(int nro)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Entradastock es = null;
        try
        {
            tx = session.beginTransaction();
            es = (Entradastock)session.get(Entradastock.class, nro);
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        finally
        {
            session.close();
        }
        return es;
    }
}
