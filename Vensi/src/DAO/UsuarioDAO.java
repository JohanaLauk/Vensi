package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{        
    SessionFactory sesion = null;
    Session session = null;
    
    public void alta(Usuario u)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(u);
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
        //JOptionPane.showMessageDialog(null, "Usuario creado");
    }
    
    public void modificarContraseña(String usuario, int pin)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Usuario u = null;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.nombreUsuario LIKE :usuario");
        query.setParameter("usuario", usuario);
        u = (Usuario) query.uniqueResult();
            
        u.setPin(pin);
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(u);
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
        //JOptionPane.showMessageDialog(null, "Contraseña modificada");
    }
    
    public boolean verificar(String usuario, int pin )
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        boolean verificado = false;
        Usuario u;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.nombreUsuario LIKE :usuario");
        query.setParameter("usuario", usuario+"%");
        u = (Usuario) query.uniqueResult();
        
        if(u.getPin() == pin)
        {
            verificado = true;
        }
        session.close();
        
        return verificado;        
    }
    
    public List<Usuario> listar()
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Usuario> lista = null;
        
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Usuario");            
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Listar usuarios");
        }        
        return lista;
    }
}