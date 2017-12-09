package DAO;

import Conexion.NewHibernateUtil;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class ProveedorDAO 
{      
    SessionFactory sesion = null;
    Session session = null;
                
    public void alta(Proveedor p)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        
        try
        {
            session.save(p);
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
        //JOptionPane.showMessageDialog(null, "Proveedor agregado");
    }
    
    public void modificar(Proveedor p, int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Proveedor prov = null;
                    
        prov = (Proveedor)session.get(Proveedor.class, id);
        prov.setRazonSocial(p.getRazonSocial());
        prov.setCuit(p.getCuit());
        prov.setDireccion(p.getDireccion());
        prov.setEstado(p.isEstado());
        prov.setContacto(p.getContacto());
        prov.setLocalidad(p.getLocalidad());
        prov.setProvincia(p.getProvincia());
        prov.setPais(p.getPais());
            
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(prov);
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
        //JOptionPane.showMessageDialog(null, "Proveedor modificado");
    }  
    
    public List<Proveedor> listar(String filtro)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            if (filtro.equals("Todos"))
            {
                lista = session.createQuery("FROM Proveedor ORDER BY razon_social").list();
            }
            else
            {
                if (filtro.equals("Habilitados"))
                {
                    lista = session.createQuery("FROM Proveedor WHERE estado = true ORDER BY razon_social").list();
                }
                else
                {
                    lista = session.createQuery("FROM Proveedor WHERE estado = false ORDER BY razon_social").list();
                }
            }
            
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. ListarPredeterminado proveedor");
        }
        return lista;
    }        
    
    public Proveedor buscarPorId(int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Proveedor p = null;
        try
        { 
            Transaction tx = session.beginTransaction();
            p = (Proveedor)session.get(Proveedor.class,id);            
            tx.commit();
            session.close();
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
        }        
        return p;
    }
    
    public List<Proveedor> buscarPorCuit(String cuit)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cuit");
            query.setParameter("cuit", "%"+cuit+"%");
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
       
    public List<Proveedor> buscarPorCuitNombre(String cadena, String filtro)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<Proveedor> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            if (filtro.equals("Todos"))
            {
                Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cadena OR p.razonSocial LIKE :cadena ORDER BY razonSocial");
                query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                lista = query.list();
            }
            else
            {
                if (filtro.equals("Habilitados"))
                {
                    Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cadena OR p.razonSocial LIKE :cadena and estado = true ORDER BY razonSocial");
                    query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                    lista = query.list();
                }
                else
                {
                    Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cadena OR p.razonSocial LIKE :cadena and estado = false ORDER BY razonSocial");
                    query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                    lista = query.list();
                }
            }
            
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }    
}