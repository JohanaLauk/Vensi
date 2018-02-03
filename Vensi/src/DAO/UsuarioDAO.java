package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{        
    Session session;
    Transaction tx;
    
    public void alta(Usuario u)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Usuario creado");
    }
    
    public void modificarContraseña(String usuario, int pin)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Usuario u = null;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.nombreUsuario LIKE :usuario");
        query.setParameter("usuario", usuario);
        u = (Usuario) query.uniqueResult();
            
        u.setPin(pin);
        
        tx = session.beginTransaction();
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Contraseña modificada");
    }
    
    public boolean verificar(String usuario, int pin )
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        boolean verificado = false;
        Usuario u;
        
        try
        {
            Query query = session.createQuery("FROM Usuario u WHERE u.nombreUsuario LIKE :usuario");
            query.setParameter("usuario", usuario+"%");
            u = (Usuario) query.uniqueResult();

            if (u.getPin() == pin)
            {
                verificado = true;
            }
        }
        catch (Exception e)
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
        return verificado;        
    }
    
    public List<Usuario> listar()
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Usuario> lista = null;
        
        try
        {            
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Usuario");            
            lista = query.list();
            tx.commit();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Listar usuarios");
        }        
        finally
        {
            session.close();
        }
        return lista;
    }
}