package DAO;

import Conexion.NewHibernateUtil;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class ProveedorDAO 
{    
        
    public void alta(Proveedor p)
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
        JOptionPane.showMessageDialog(null, "Proveedor agregado");
    }
    
    public void modificar(Proveedor p, int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Proveedor prov = null;
                    
        prov = (Proveedor)session.get(Proveedor.class, id);
        prov.setRazonSocial(p.getRazonSocial());
        prov.setCuit(p.getCuit());
        prov.setDireccion(p.getDireccion());
        prov.setEstado(p.isEstado());
        prov.setContacto(p.getContacto());
            
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(prov);
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
        JOptionPane.showMessageDialog(null, "Proveedor modificado");
    }
    
   /* public void baja(int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Proveedor prov = null;
                    
        prov = (Proveedor)session.get(Proveedor.class, id);
        prov.setEstado(false);
            
        Transaction tx = session.beginTransaction();
        try
        {
            session.update(prov);
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
        JOptionPane.showMessageDialog(null, "Proveedor dado de baja");
    }
    */
    
    public Proveedor buscarPorId(int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Proveedor p = null;
        try
        { 
            Transaction tx = session.beginTransaction();
            p = (Proveedor)session.get(Proveedor.class,id);
            /*if(p != null)
            {
                JOptionPane.showMessageDialog(null, "Proveedor encontrado");
            }*/
            tx.commit();
            session.close();
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
        }        
        return p;
    }
    
    public List<Proveedor> listar()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Proveedor").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public List<Proveedor> buscarPorCuit(String cuit)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cuit");
            query.setParameter("cuit", "%"+cuit+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
   
    public List<Proveedor> buscarPorCuitNombre(String cadena)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cadena OR p.nombre_completo LIKE :cadena");
            query.setParameter("cadena", "%"+cadena+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
}
