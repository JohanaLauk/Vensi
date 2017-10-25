package DAO;

import Conexion.NewHibernateUtil;
import Modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class ProductoDAO 
{            
    public void alta(Producto p)
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
        JOptionPane.showMessageDialog(null, "Producto agregado");
    }
    
    public void modificar(Producto p, int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
               
        Producto prod = null;
                   
        prod = (Producto)session.get(Producto.class, id);
        prod.setCodigo(p.getCodigo());
        prod.setDescripcion(p.getDescripcion());
        prod.setPrecioCosto(p.getPrecioCosto());
        prod.setPrecioVenta(p.getPrecioVenta());
        prod.setPrecioVentaXPeso(p.getPrecioVentaXPeso());
        prod.setPesoEnvase(p.getPesoEnvase());
        prod.setStockMinimo(p.getStockMinimo());
        prod.setEstado(p.isEstado());
            
         Transaction tx = session.beginTransaction();
        try
        {
            session.merge(prod);
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
        JOptionPane.showMessageDialog(null, "Producto modificado");
    }    
       
    public Producto buscarPorId(int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Producto p = null;
        try
        {                       
            Transaction tx = session.beginTransaction();
            p = (Producto)session.get(Producto.class,id);
            /*if(p != null)
            {
                JOptionPane.showMessageDialog(null, "Producto encontrado");
            }*/
            tx.commit();
            session.close();
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }        
        return p;
    }
    
    public List<Producto> buscarPorCodigo(String codigo)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Producto> lista = null;
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :codigo");
            query.setParameter("codigo", codigo+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo");
        }        
        return lista;
    }
    
    public List<Producto> buscarPorCodigoNombre(String cadena)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Producto> lista = null;
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena");
            query.setParameter("cadena", "%"+cadena+"%");
            lista = query.list();
            tx.commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo o descripcion");
        }        
        return lista;
    }   
    
    public List<Producto> listarTodo()  //ordenado por descripcio ASC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Producto> lista = null;
        try
        {            
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Producto ORDER BY descripcion").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos");
        }        
        return lista;
    }
    
    public List<Producto> listarHabilitado()    //prod habilitados ordenados por descrip ASC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;

        try 
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto WHERE estado = true ORDER BY descripcion ASC");
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos habilitados");
        }
        return lista;
    }
    
    public List<Producto> listarDeshabilitado()     //prod deshabilitados ordenados por descrip ASC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;

        try 
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto WHERE estado = false ORDER BY descripcion ASC");
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos deshabilitados");
        }
        return lista;
    }
    
    public List<Producto> listarDescripcion(String orden) //prod ordenados por descrip ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY descripcion ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY descripcion DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por descripción");
        }
        return lista;
    }
    
    public List<Producto> listarCodigo(String orden)    //prod ordenados por codigo ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY codigo ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY codigo DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por código");
        }
        return lista;
    }
    
    public List<Producto> listarPCosto(String orden)     //prod ordenados por precioCosto ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY precioCosto ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY precioCosto DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por precio de costo");
        }
        return lista;
    }
    
    public List<Producto> listarPVenta(String orden)    //prod ordenados por precioVenta ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY precioVenta ASC");
                
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY precioVenta DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por precio de venta");
        }
        return lista;
    }
    
    public List<Producto> listarStock(String orden)     //prod ordenados por stock ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY stock ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY stock DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por stock");
        }
        return lista;
    }
    
    public List<Producto> listarStockMinimo(String orden)   //prod ordenados por stockMinimo ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY stockMinimo ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY stockMinimo DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por stock mínimo");
        }
        return lista;
    }
    
    public List<Producto> listarPesoEnvase(String orden)    //prod ordenados por pesoEnvase ASC o DESC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        Query query;
        try 
        {
            Transaction tx = session.beginTransaction();
            
            if (orden.equals("ASC") || orden.equals("asc")) 
            {
                query = session.createQuery("FROM Producto ORDER BY pesoEnvase ASC");
            } 
            else 
            {
                query = session.createQuery("FROM Producto ORDER BY pesoEnvase DESC");
            }
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos por peso de envase");
        }
        return lista;
    }
    
    public List<Producto> alarma() 
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        try 
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.stock <= p.stockMinimo");
            lista = query.list();
            tx.commit();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Lista stock minimo");
        }
        return lista;
    }
}