package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Turno;
import java.util.*;
import javax.swing.*;

public class TurnoDAO 
{            
    public void alta(Turno t)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
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
        session.close();
        JOptionPane.showMessageDialog(null, "Turno creado");
    }
    
    public List<Turno> listar()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Turno").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public List<Turno> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t WHERE t.fechaHoraInicio BETWEEN :fechaInicio AND :fechaFin");
            query.setParameter("fechaInicio", "%"+fechaInicio+"%");
            query.setParameter("fechaFin", "%"+fechaInicio+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public List<Turno> buscarPorNumero(int nro)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t WHERE t.nroTurno LIKE :nro");
            query.setParameter("nro", "%"+nro+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public Turno obtenerUltimo()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Turno t = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t ORDER BY t.id DESC LIMIT 1");
            t = (Turno)query.uniqueResult();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al obtener último turno");
        }
        
        return t;
    }
}
