package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Usuario;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{    
        
    public void alta(Usuario u)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(u);
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
        JOptionPane.showMessageDialog(null, "Usuario creado");
    }
    
    public void modificarContraseña(int id, int pin)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Usuario u = null;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.pin LIKE :pin");
        query.setParameter("pin", pin+"%");
        u = (Usuario) query.uniqueResult();
            
        u.setPin(pin);
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(u);
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
        JOptionPane.showMessageDialog(null,"Contraseña modificada");
    }
}