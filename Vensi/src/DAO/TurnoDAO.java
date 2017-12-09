package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Turno;
import java.util.*;
import javax.swing.*;

public class TurnoDAO 
{         
    SessionFactory sesion = null;
    Session session = null;
    
    public void alta(Turno t)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(t);
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
        //JOptionPane.showMessageDialog(null, "Turno creado");
    }
    
    public void modificar(Turno t, int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
               
        Turno turno = null;
                   
        turno = (Turno)session.get(Turno.class, id);
        turno.setFechaHoraInicio(t.getFechaHoraInicio());
        turno.setFechaHoraFin(t.getFechaHoraFin());
            
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(turno);
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
        //JOptionPane.showMessageDialog(null, "Turno modificado");
    }
    
    public List<Turno> listar()
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Turno").list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public List<Turno> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Turno> lista = null;
        Query query;
        try
        {
            Transaction tx = session.beginTransaction();
            if(fechaFin == null)
            {
                query = session.createQuery("FROM Turno t WHERE t.fechaHoraInicio = :fechaInicio");
                query.setParameter("fechaInicio", fechaInicio);
            }
            else
            {
                query = session.createQuery("FROM Turno t WHERE t.fechaHoraInicio BETWEEN :fechaInicio AND :fechaFin");
                query.setParameter("fechaInicio", fechaInicio);
                query.setParameter("fechaFin", fechaFin);
            }
            
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    /*public List<Turno> buscarPorNumero(int nro)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t WHERE t.nroTurno LIKE :nro");
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
    
    public Turno buscarPorID(int nro)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Turno t = null;
        try
        {
            Transaction tx = session.beginTransaction();
            t = (Turno)session.get(Turno.class, nro);
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al buscar por ID");
        }        
        return t;
    }
    
    public Turno obtenerUltimo()
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Turno t = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t ORDER BY t.id DESC");
            query.setMaxResults(1);
            t = (Turno)query.uniqueResult();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al obtener último turno");
        }
        
        return t;
    }
}
