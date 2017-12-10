package DAO;

import Conexion.NewHibernateUtil;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class ProveedorDAO 
{     
    Session session;
    Transaction tx;
                
    public void alta(Proveedor p)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
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
                    JOptionPane.showMessageDialog(null, "El CUIT del nuevo proveedor que desea registrar ya existe.");
		throw e;
        }
        finally{
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Proveedor agregado");
    }
    
    public void modificar(Proveedor p, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
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
            
        tx = session.beginTransaction();
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
                    JOptionPane.showMessageDialog(null, "El CUIT del nuevo proveedor que desea registrar ya existe.");
		throw e;
        }
        finally{
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Proveedor modificado");
    }  
    
    public List<Proveedor> listar(String filtro)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        List<Proveedor> lista = null;
        try
        {
            tx = session.beginTransaction();
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
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. ListarPredeterminado proveedor");
        }
        finally{
            session.close();
        }
        return lista;
    }        
    
    public Proveedor buscarPorId(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        Proveedor p = null;
        try
        { 
            tx = session.beginTransaction();
            p = (Proveedor)session.get(Proveedor.class,id);            
            tx.commit();
            
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
        }    
        finally{
            session.close();
        }
        
        return p;
    }
    
    public List<Proveedor> buscarPorCuit(String cuit)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Proveedor> lista = null;
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Proveedor p WHERE p.cuit LIKE :cuit");
            query.setParameter("cuit", "%"+cuit+"%");
            lista = query.list();
            tx.commit();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        finally{
            session.close();
        }
        return lista;
    }
       
    public List<Proveedor> buscarPorCuitNombre(String cadena, String filtro)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        List<Proveedor> lista = null;
        try
        {
            tx = session.beginTransaction();
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
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        finally{
            session.close();
        }
        return lista;
    }    
}