package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Historial;

import javax.swing.JOptionPane;

public class HistorialDAO 
{    
        
    public void alta(Historial h)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(h);
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
        JOptionPane.showMessageDialog(null,"Historial creado");
    }
    
    public Historial obtener()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Historial h = null;
        try
        {
            Transaction tx = session.beginTransaction();                
            h = (Historial)session.get(Historial.class,1);
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Historial no encontrado");
        }        
        return h;
    }
}