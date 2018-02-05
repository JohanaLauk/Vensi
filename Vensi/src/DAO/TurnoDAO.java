package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Turno;
import java.util.*;
import javax.swing.*;

public class TurnoDAO 
{     
    Session session;
    Transaction tx;
    
    public void alta(Turno t)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        try
        {
            session.save(t);
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
        //JOptionPane.showMessageDialog(null, "Turno creado");
    }
    
    public void modificar(Turno t, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();               
        Turno turno = null;
                   
        turno = (Turno)session.get(Turno.class, id);
        turno.setFechaHoraInicio(t.getFechaHoraInicio());
        turno.setFechaHoraFin(t.getFechaHoraFin());
        turno.setUsuario(t.getUsuario());
        turno.setMontoVentas(t.getMontoVentas());
        turno.setMontoEntradas(t.getMontoEntradas());
        turno.setMontoSalidas(t.getMontoSalidas());
        turno.setMontoAnuladas(t.getMontoAnuladas());
        turno.setEfectivoHay(t.getEfectivoHay());    
        turno.setCantVentas(t.getCantVentas());
        turno.setCantEntradas(t.getCantEntradas());
        turno.setCantSalidas(t.getCantSalidas());
        turno.setCantAnuladas(t.getCantAnuladas());
                    
        tx = session.beginTransaction();
        try
        {
            session.merge(turno);
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
        //JOptionPane.showMessageDialog(null, "Turno modificado");
    }
    
    public List<Turno> listar()
    {
        session = NewHibernateUtil.getSessionFactory().openSession();       
        List<Turno> lista = null;
        try
        {
            tx = session.beginTransaction();
            lista = session.createQuery("FROM Turno").list();
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
      
    public List<Turno> buscarPorFecha(Date fechaDesde, Date fechaFin)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<Turno> lista = null;
        Query query;
        try
        {
            tx = session.beginTransaction();
            if(fechaFin == null)
            {
                query = session.createQuery("FROM Turno t WHERE date(t.fechaHoraInicio) = :fechaDesde");
                query.setParameter("fechaDesde", fechaDesde);
            }
            else
            {
                query = session.createQuery("FROM Turno t WHERE t.fechaHoraInicio BETWEEN :fechaDesde AND :fechaFin");
                query.setParameter("fechaDesde", fechaDesde);
                query.setParameter("fechaFin", fechaFin);
            }
            
            lista = query.list();
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
        
    public Turno buscarPorID(int nro)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();      
        Turno t = null;
        try
        {
            tx = session.beginTransaction();
            t = (Turno)session.get(Turno.class, nro);
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al buscar por ID");
        }       
        finally
        {
            session.close();
        }
        return t;
    }
    
    public Turno obtenerUltimo()
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        Turno t = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t ORDER BY t.id DESC");
            query.setMaxResults(1);
            t = (Turno)query.uniqueResult();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al obtener último turno");
        }
        finally
        {
            session.close();
        }        
        return t;
    }   
}
