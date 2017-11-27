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
            tx.commit();
            session.close();
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }        
        return p;
    }
    
    public Producto buscarPorCodigo(String codigo)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Producto p = null;
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :codigo AND p.estado = TRUE");
            query.setParameter("codigo", codigo);
            p = (Producto)query.uniqueResult();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo");
        }        
        return p;
    }
    
    public List<Producto> buscarPorCodigoNombre(String cadena, String filtro)  //para ventanaProducto
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<Producto> lista = null;
    
        try
        {            
            Transaction tx = session.beginTransaction();
            if (filtro.equals("Todos"))
            {
                Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena ORDER BY descripcion");
                query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                lista = query.list();
            }
            else
            {
                if (filtro.equals("Habilitados"))
                {
                    Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena and estado = true ORDER BY descripcion");
                    query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                    lista = query.list();
                }
                else
                {
                    Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena and estado = false ORDER BY descripcion");
                    query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                    lista = query.list();
                }
            }
            
            tx.commit();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo o descripcion");
        }        
        return lista;
    }
            
    public List<Producto> listar(String[] datos)  //ordenado por descripcio ASC
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        String filtro = datos[0];
        String ordenCampo = datos[1];
        String tipoOrden = datos[2];
        
        List<Producto> lista = null;
        try
        {            
            Transaction tx = session.beginTransaction();
            
            if (filtro.equals("Todos"))
            {
                switch (ordenCampo)
                {
                    case "descripcion":
                    {
                         if (tipoOrden.equals("ASC"))
                         {
                             lista = session.createQuery("FROM Producto ORDER BY descripcion").list();
                         }
                         else
                         {
                             lista = session.createQuery("FROM Producto ORDER BY descripcion DESC").list();
                         }
                    } break;
                    
                    case "codigo":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY codigo").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY codigo DESC").list();
                        }
                    } break;
                    
                    case "precio_costo":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY precio_costo").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY precio_costo DESC").list();
                        }
                    } break;
                    
                    case "precio_venta":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY precio_venta").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY precio_venta DESC").list();
                        }
                    } break;
                    
                    case "stock":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY stock").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY stock DESC").list();
                        }
                    } break;
                    
                    case "stock_minimo":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY stock_minimo").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY stock_minimo DESC").list();
                        }
                    } break;
                    
                    case "peso_envase":
                    {
                        if (tipoOrden.equals("ASC"))
                        {
                            lista = session.createQuery("FROM Producto ORDER BY peso_envase").list();
                        }
                        else
                        {
                            lista = session.createQuery("FROM Producto ORDER BY peso_envase DESC").list();
                        }
                    } break;
                }
            }
            else
            {
                if (filtro.equals("Habilitados"))
                {
                    switch (ordenCampo)
                    {
                        case "descripcion":
                        {
                             if (tipoOrden.equals("ASC"))
                             {
                                 lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY descripcion").list();
                             }
                             else
                             {
                                 lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY descripcion DESC").list();
                             }
                        } break;

                        case "codigo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY codigo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY codigo DESC").list();
                            }
                        } break;

                        case "precio_costo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY precio_costo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY precio_costo DESC").list();
                            }
                        } break;

                        case "precio_venta":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY precio_venta").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY precio_venta DESC").list();
                            }
                        } break;

                        case "stock":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY stock").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY stock DESC").list();
                            }
                        } break;

                        case "stock_minimo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY stock_minimo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY stock_minimo DESC").list();
                            }
                        } break;

                        case "peso_envase":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY peso_envase").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = true ORDER BY peso_envase DESC").list();
                            }
                        } break;
                    }
                }
                else
                {
                    switch (ordenCampo)
                    {
                        case "descripcion":
                        {
                             if (tipoOrden.equals("ASC"))
                             {
                                 lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY descripcion").list();
                             }
                             else
                             {
                                 lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY descripcion DESC").list();
                             }
                        } break;

                        case "codigo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY codigo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY codigo DESC").list();
                            }
                        } break;

                        case "precio_costo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY precio_costo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY precio_costo DESC").list();
                            }
                        } break;

                        case "precio_venta":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY precio_venta").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY precio_venta DESC").list();
                            }
                        } break;

                        case "stock":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY stock").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY stock DESC").list();
                            }
                        } break;

                        case "stock_minimo":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY stock_minimo").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY stock_minimo DESC").list();
                            }
                        } break;

                        case "peso_envase":
                        {
                            if (tipoOrden.equals("ASC"))
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY peso_envase").list();
                            }
                            else
                            {
                                lista = session.createQuery("FROM Producto WHERE estado = false ORDER BY peso_envase DESC").list();
                            }
                        } break;
                    }
                }
            }            
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos");
        }        
        return lista;
    }
    
    public List<Producto> alarma() {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Producto> lista = null;
        try {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.stock <= p.stockMinimo AND p.estado = TRUE");
            lista = query.list();
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. Lista stock minimo");
        }
        return lista;
    }
    
    public void restarStock(int id, int cantidad)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Producto p = null;
        p = (Producto)session.get(Producto.class, id);
        p.setStock(p.getStock() - cantidad); 
        
        Transaction tx = session.beginTransaction();
        try{
            session.merge(p);
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
        JOptionPane.showMessageDialog(null, "Stock de producto modificado");
    }
    
    public void sumarStock(int id, int cantidad)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Producto p = null;
        p = (Producto)session.get(Producto.class, id);
        p.setStock(p.getStock() + cantidad); 
        
        Transaction tx = session.beginTransaction();
        try{
            session.merge(p);
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
        JOptionPane.showMessageDialog(null, "Stock de producto modificado");
    }
}