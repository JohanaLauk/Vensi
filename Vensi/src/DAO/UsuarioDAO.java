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
    
    public void modificarContraseña(String usuario, int pin)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Usuario u = null;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.nombre_usuario LIKE :usuario");
        query.setParameter("usuario", usuario+"%");
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
    
    public boolean verificar(String usuario, int pin )
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        boolean verificado = false;
        Usuario u;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.nombre_usuario LIKE :usuario");
        query.setParameter("usuario", usuario+"%");
        u = (Usuario) query.uniqueResult();
        
        if(u.getPin() == pin)
        {
            verificado = true;
        }
        
        return verificado;        
    }
}