package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Pedido;
import java.util.*;
import javax.swing.*;

public class PedidoDAO 
{            
    Session session;
    Transaction tx;
    
    public void alta(Pedido p)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        try
        {
            session.save(p);
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
        //JOptionPane.showMessageDialog(null, "Pedido creado");
    }
    
    public List<Pedido> listar()
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Pedido> lista = null;
        try
        {
            tx = session.beginTransaction();
            lista = session.createQuery("FROM Pedido").list();
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        finally{
            session.close();
        }
        return lista;
    }
    
    public List<Pedido> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Pedido> lista = null;
        Query query;
        try
        {
            tx = session.beginTransaction();
            if(fechaFin == null)
            {
                query = session.createQuery("FROM Pedido p WHERE p.fechaHora = fechaInicio");
                query.setParameter("fechaInicio", fechaInicio);
            }
            else
            {
                query = session.createQuery("FROM Pedido p WHERE p.fechaHora BETWEEN :fechaInicio AND :fechaFin");
                query.setParameter("fechaInicio", fechaInicio);
                query.setParameter("fechaFin", fechaFin);
            }
    
            lista = query.list();
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }        
        finally{
            session.close();
        }
        return lista;
    }
    
    /*public List<Pedido> buscarPorNumero(int nro)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Pedido p WHERE p.id = :nro");
            query.setParameter("nro", "%"+nro+"%");
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return lista;
    }*/
    
    public Pedido buscarPorID(int nro)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Pedido p = null;
        try
        {
            tx = session.beginTransaction();
            p = (Pedido)session.get(Pedido.class, nro);
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        finally{
            session.close();
        }
        return p;
    }
}
