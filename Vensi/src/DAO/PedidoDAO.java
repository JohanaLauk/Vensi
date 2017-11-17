package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Pedido;
import java.util.*;
import javax.swing.*;

public class PedidoDAO 
{            
    public void alta(Pedido p)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
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
        session.close();
        JOptionPane.showMessageDialog(null, "Pedido creado");
    }
    
    public List<Pedido> listar()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Pedido").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return lista;
    }
    
    public List<Pedido> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Pedido p WHERE p.fechaHora BETWEEN :fechaInicio AND :fechaFin");
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
    
    public List<Pedido> buscarPorNumero(int nro)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Pedido p WHERE p.id = :nro");
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
    public Pedido buscarPorID(int nro)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Pedido p = null;
        try
        {
            Transaction tx = session.beginTransaction();
            p = (Pedido)session.get(Pedido.class, nro);
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return p;
    }
}
