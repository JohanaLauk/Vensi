package DAO;

import Conexion.NewHibernateUtil;
import Modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class ProductoDAO 
{           
    Session session;
    Transaction tx;
    
    public void alta(Producto p)
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
                    //JOptionPane.showMessageDialog(null, "El código del nuevo producto que desea registrar ya existe.\n" +
                    //                                    "Corrobore en el inventario para mayor seguridad y control.");
		throw e;
        }
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Producto agregado");
    }
    
    public void modificar(Producto p, int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Producto prod = null;
                   
        prod = (Producto)session.get(Producto.class, id);
        prod.setCodigo(p.getCodigo());
        prod.setDescripcion(p.getDescripcion());
        prod.setPrecioCosto(p.getPrecioCosto());
        prod.setPrecioVenta(p.getPrecioVenta());
        prod.setPrecioVentaXKilo(p.getPrecioVentaXKilo());        
        prod.setStock(p.getStock());
        prod.setStockMinimo(p.getStockMinimo());
        prod.setPesoEnvase(p.getPesoEnvase());
        prod.setEstado(p.isEstado());
        prod.setSuspendido(p.isSuspendido());               
        prod.setOferta(p.isOferta());
        prod.setPorPeso(p.isPorPeso()); 
        prod.setProveedors(p.getProveedors());
            
        tx = session.beginTransaction();
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
                    //JOptionPane.showMessageDialog(null, "El código del nuevo producto que desea registrar ya existe.\n" +
                    //                                    "Corrobore en el inventario para mayor seguridad y control.");
		throw e;
        }        
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Producto modificado");
    }         
    
    public boolean encontrarProv(String cuitProv)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Producto> lista = null;
        boolean existe = false; 
        
        try
        {      
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = TRUE AND pv.cuit LIKE :cuitProv");            
            query.setParameter("cuitProv", cuitProv);
            lista = query.list(); 
            
            if (lista.size() > 0)   //El producto TIENE al menos 1 prov
            {
                existe = true;
            }
            else
            {
                existe = false;
            }
            tx.commit();      
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Al buscar el proveedor en el producto");
        }        
        finally
        {
            session.close();
        }       
        return existe;        
    }
        
    public Producto buscarPorId(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        Producto p = null;
        try
        {                       
            tx = session.beginTransaction();
            p = (Producto)session.get(Producto.class,id);            
            tx.commit();
            
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }       
        finally
        {
            session.close();
        }
        return p;
    }
    
    public Producto buscarPorCodigo(String codigo)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Producto p = null;
        try
        {            
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :codigo AND p.estado = TRUE");
            query.setParameter("codigo", codigo);
            p = (Producto)query.uniqueResult();
            tx.commit();            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo");
        }     
        finally
        {
            session.close();
        }
        return p;
    }
    
    public Producto buscarPorCodigo2(String codigo)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Producto p = null;
        try
        {            
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :codigo");
            query.setParameter("codigo", codigo);
            p = (Producto)query.uniqueResult();
            tx.commit();            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo");
        }     
        finally
        {
            session.close();
        }
        return p;
    }
    
    public Producto buscarPorCodigo(String codigo, int proveedor)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Producto p = null;
        try
        {            
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :codigo AND p.estado = TRUE AND p.proveedor.id = :proveedor");
            query.setParameter("codigo", codigo);
            query.setParameter("proveedor", proveedor);
            p = (Producto)query.uniqueResult();
            tx.commit();            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo");
        }        
        finally
        {
            session.close();
        }
        return p;
    }
    
    public List<Producto> buscarPorCodigoNombre(String cadena, String filtro, String situacion)  //para ventanaProducto
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Producto> lista = null;
        try
        {            
            tx = session.beginTransaction();
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
                    if (situacion.equals("Todos"))
                    {
                        Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena AND estado = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        lista = query.list();
                    }                    
                    if (situacion.equals("Oferta"))
                    {
                        Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena AND estado = true AND oferta = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        lista = query.list();
                    }                    
                    if (situacion.equals("Suspendido"))
                    {
                        Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena AND estado = true AND suspendido = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        lista = query.list();
                    }                            
                    if (situacion.equals("Habilitado"))
                    {
                        Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena AND estado = true AND suspendido = false AND oferta = false ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        lista = query.list();
                    }
                    if (situacion.equals("HabOferta"))
                    {
                        Query query = session.createQuery("FROM Producto p WHERE p.codigo LIKE :cadena OR p.descripcion LIKE :cadena AND estado = true AND suspendido = false ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        lista = query.list();
                    }
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
        finally
        {
            session.close();
        }
        return lista;
    }
    
    public List<Producto> buscarPorCodigoNombre(String cadena, String filtro, String situacion, int idProveedor)  //para ventanaProducto
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Producto> lista = null;
    
        try
        {            
            tx = session.beginTransaction();
            if (filtro.equals("Todos"))
            {
                Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) ORDER BY descripcion");
                query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                query.setParameter("proveedor", idProveedor);
                lista = query.list();                               
            }
            else
            {
                if (filtro.equals("Habilitados"))
                {
                    if (situacion.equals("Todos"))
                    {
                        Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        query.setParameter("proveedor", idProveedor);
                        lista = query.list();
                    }
                    if (situacion.equals("Oferta"))
                    {
                        Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = true AND p.oferta = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        query.setParameter("proveedor", idProveedor);
                        lista = query.list();
                    }
                    if (situacion.equals("Suspendido"))
                    {
                        Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = true AND p.suspendido = true ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        query.setParameter("proveedor", idProveedor);
                        lista = query.list();                    
                    }                    
                    if (situacion.equals("Habilitado"))
                    {
                        Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = true AND p.suspendido = false AND p.oferta = false ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        query.setParameter("proveedor", idProveedor);
                        lista = query.list();
                    }
                    if (situacion.equals("HabOferta"))
                    {
                        Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = true AND p.suspendido = false ORDER BY descripcion");
                        query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                        query.setParameter("proveedor", idProveedor);
                        lista = query.list();
                    }
                }
                else
                {
                    Query query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor AND (p.codigo LIKE :cadena OR p.descripcion LIKE :cadena) AND p.estado = false ORDER BY descripcion");
                    query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
                    query.setParameter("proveedor", idProveedor);
                    lista = query.list();
                }
            }
            
            tx.commit();  
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Producto por codigo o descripcion");
        }
        finally
        {
            session.close();
        }
        
        return lista;        
    }
            
    public List<Producto> listar(String[] datos)  //ordenado por descripcion ASC
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        String filtro = datos[0];
        String situacion = datos[1];
        String ordenCampo = datos[2];
        String tipoOrden = datos[3];
        
        List<Producto> lista = null;
        try
        {            
            tx = session.beginTransaction();
            
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
                    if (situacion.equals("Todos"))
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
                        if (situacion.equals("Habilitado"))
                        {
                            switch (ordenCampo)
                            {
                                case "descripcion":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY descripcion").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY descripcion DESC").list();
                                    }
                                } break;

                                case "codigo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY codigo").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY codigo DESC").list();
                                    }
                                } break;

                                case "precio_costo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY precio_costo").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY precio_costo DESC").list();
                                    }
                                } break;

                                case "precio_venta":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY precio_venta").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY precio_venta DESC").list();
                                    }
                                } break;

                                case "stock":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY stock").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY stock DESC").list();
                                    }
                                } break;

                                case "stock_minimo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY stock_minimo").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY stock_minimo DESC").list();
                                    }
                                } break;

                                case "peso_envase":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY peso_envase").list();
                                    }
                                    else
                                    {
                                        lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = false AND suspendido = false ORDER BY peso_envase DESC").list();
                                    }
                                } break;
                            }
                        }
                        else
                        {
                            if (situacion.equals("Oferta"))                    
                            {
                                switch (ordenCampo)
                                {
                                    case "descripcion":
                                    {
                                         if (tipoOrden.equals("ASC"))
                                         {
                                             lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY descripcion").list();
                                         }
                                         else
                                         {
                                             lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY descripcion DESC").list();
                                         }
                                    } break;

                                    case "codigo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY codigo").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY codigo DESC").list();
                                        }
                                    } break;

                                    case "precio_costo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY precio_costo").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY precio_costo DESC").list();
                                        }
                                    } break;

                                    case "precio_venta":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY precio_venta").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY precio_venta DESC").list();
                                        }
                                    } break;

                                    case "stock":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY stock").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY stock DESC").list();
                                        }
                                    } break;

                                    case "stock_minimo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY stock_minimo").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY stock_minimo DESC").list();
                                        }
                                    } break;

                                    case "peso_envase":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY peso_envase").list();
                                        }
                                        else
                                        {
                                            lista = session.createQuery("FROM Producto WHERE estado = true AND oferta = true ORDER BY peso_envase DESC").list();
                                        }
                                    } break;
                                }                            
                            }
                            else
                            {
                                if (situacion.equals("Suspendido"))
                                {
                                    switch (ordenCampo)
                                    {
                                        case "descripcion":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY descripcion").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY descripcion DESC").list();
                                            }
                                        } break;

                                        case "codigo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY codigo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY codigo DESC").list();
                                            }
                                        } break;

                                        case "precio_costo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY precio_costo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY precio_costo DESC").list();
                                            }
                                        } break;

                                        case "precio_venta":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY precio_venta").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY precio_venta DESC").list();
                                            }
                                        } break;

                                        case "stock":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY stock").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY stock DESC").list();
                                            }
                                        } break;

                                        case "stock_minimo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY stock_minimo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY stock_minimo DESC").list();
                                            }
                                        } break;

                                        case "peso_envase":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY peso_envase").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = true ORDER BY peso_envase DESC").list();
                                            }
                                        } break;
                                    }
                                }
                                else
                                {   //"HabOferta"
                                    switch (ordenCampo)
                                    {
                                        case "descripcion":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY descripcion").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY descripcion DESC").list();
                                            }
                                        } break;

                                        case "codigo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY codigo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY codigo DESC").list();
                                            }
                                        } break;

                                        case "precio_costo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY precio_costo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY precio_costo DESC").list();
                                            }
                                        } break;

                                        case "precio_venta":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY precio_venta").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY precio_venta DESC").list();
                                            }
                                        } break;

                                        case "stock":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY stock").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY stock DESC").list();
                                            }
                                        } break;

                                        case "stock_minimo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY stock_minimo").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY stock_minimo DESC").list();
                                            }
                                        } break;

                                        case "peso_envase":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY peso_envase").list();
                                            }
                                            else
                                            {
                                                lista = session.createQuery("FROM Producto WHERE estado = true AND suspendido = false ORDER BY peso_envase DESC").list();
                                            }
                                        } break;
                                    }
                                }
                            }
                        }                        
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
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos");
        }
        finally
        {
            session.close();
        }
        
        return lista;        
    }
    
    public List<Producto> listar(String[] datos, int idProveedor) //ordenado por descripcio ASC
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
 
        String filtro = datos[0];
        String situacion = datos[1];
        String ordenCampo = datos[2];
        String tipoOrden = datos[3];
        
        Query query = null;
        List<Producto> lista = null;
        
        try 
        {
            tx = session.beginTransaction();

            if (filtro.equals("Todos")) 
            {
                switch (ordenCampo) 
                {
                    case "descripcion": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY descripcion");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY descripcion DESC");
                        }
                    }
                    break;

                    case "codigo": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY codigo");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY codigo DESC");
                        }
                    }
                    break;

                    case "precio_costo": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY precio_costo");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY precio_costo DESC");
                        }
                    }
                    break;

                    case "precio_venta": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY precio_venta");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY precio_venta DESC");
                        }
                    }
                    break;

                    case "stock": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY stock");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY stock DESC");
                        }
                    }
                    break;

                    case "stock_minimo": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY stock_minimo");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY stock_minimo DESC");
                        }
                    }
                    break;

                    case "peso_envase": 
                    {
                        if (tipoOrden.equals("ASC")) 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY peso_envase");
                        } 
                        else 
                        {
                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE pv.id = :proveedor ORDER BY peso_envase DESC");
                        }
                    }
                    break;
                }
            } 
            else 
            {
                if (filtro.equals("Habilitados")) 
                {
                    if (situacion.equals("Todos"))
                    {
                        switch (ordenCampo)
                        {
                            case "descripcion":
                            {
                                if (tipoOrden.equals("ASC"))   
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY descripcion");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY descripcion DESC");
                                }
                            } break;

                            case "codigo":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY codigo");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY codigo DESC");
                                }
                            } break;

                            case "precio_costo":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY precio_costo");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY precio_costo DESC");
                                }
                            } break;

                            case "precio_venta":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY precio_venta");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY precio_venta DESC");
                                }
                            } break;

                            case "stock":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY stock");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY stock DESC");
                                }
                            } break;

                            case "stock_minimo":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY stock_minimo");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                                }
                            } break;

                            case "peso_envase":
                            {
                                if (tipoOrden.equals("ASC"))
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY peso_envase");
                                }
                                else
                                {
                                    query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND pv.id = :proveedor ORDER BY peso_envase DESC");
                                }
                            } break;
                        }
                    }
                    else
                    {
                        if (situacion.equals("Habilitado"))
                        {
                            switch (ordenCampo)
                            {
                                case "descripcion":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY descripcion");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY descripcion DESC");
                                    }
                                } break;

                                case "codigo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY codigo");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY codigo DESC");
                                    }
                                } break;

                                case "precio_costo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY precio_costo");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY precio_costo DESC");
                                    }
                                } break;

                                case "precio_venta":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY precio_venta");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY precio_venta DESC");
                                    }
                                } break;

                                case "stock":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY stock");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY stock DESC");
                                    }
                                } break;

                                case "stock_minimo":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY stock_minimo");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                                    }
                                } break;

                                case "peso_envase":
                                {
                                    if (tipoOrden.equals("ASC"))
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY peso_envase");
                                    }
                                    else
                                    {
                                        query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND p.oferta = false AND pv.id = :proveedor ORDER BY peso_envase DESC");
                                    }
                                } break;
                            }
                        }
                        else
                        {
                            if (situacion.equals("Oferta"))                    
                            {
                                switch (ordenCampo)
                                {
                                    case "descripcion":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY descripcion");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY descripcion DESC");
                                        }
                                    } break;

                                    case "codigo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY codigo");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY codigo DESC");
                                        }
                                    } break;

                                    case "precio_costo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY precio_costo");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY precio_costo DESC");
                                        }
                                    } break;

                                    case "precio_venta":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY precio_venta");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY precio_venta DESC");
                                        }
                                    } break;

                                    case "stock":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY stock");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY stock DESC");
                                        }
                                    } break;

                                    case "stock_minimo":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY stock_minimo");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                                        }
                                    } break;

                                    case "peso_envase":
                                    {
                                        if (tipoOrden.equals("ASC"))
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY peso_envase");
                                        }
                                        else
                                        {
                                            query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.oferta = true AND pv.id = :proveedor ORDER BY peso_envase DESC");
                                        }
                                    } break;
                                }                            
                            }
                            else
                            {
                                if (situacion.equals("Suspendido"))
                                {
                                    switch (ordenCampo)
                                    {
                                        case "descripcion":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY descripcion");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY descripcion DESC");
                                            }
                                        } break;

                                        case "codigo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY codigo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY codigo DESC");
                                            }
                                        } break;

                                        case "precio_costo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY precio_costo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY precio_costo DESC");
                                            }
                                        } break;

                                        case "precio_venta":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY precio_venta");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY precio_venta DESC");
                                            }
                                        } break;

                                        case "stock":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY stock");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY stock DESC");
                                            }
                                        } break;

                                        case "stock_minimo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY stock_minimo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                                            }
                                        } break;

                                        case "peso_envase":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY peso_envase");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = true AND pv.id = :proveedor ORDER BY peso_envase DESC");
                                            }
                                        } break;
                                    }
                                }
                                else
                                {   //"HabOferta"
                                    switch (ordenCampo)
                                    {
                                        case "descripcion":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY descripcion");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY descripcion DESC");
                                            }
                                        } break;

                                        case "codigo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY codigo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY codigo DESC");
                                            }
                                        } break;

                                        case "precio_costo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY precio_costo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY precio_costo DESC");
                                            }
                                        } break;

                                        case "precio_venta":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY precio_venta");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY precio_venta DESC");
                                            }
                                        } break;

                                        case "stock":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY stock");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY stock DESC");
                                            }
                                        } break;

                                        case "stock_minimo":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY stock_minimo");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                                            }
                                        } break;

                                        case "peso_envase":
                                        {
                                            if (tipoOrden.equals("ASC"))
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY peso_envase");
                                            }
                                            else
                                            {
                                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = true AND p.suspendido = false AND pv.id = :proveedor ORDER BY peso_envase DESC");
                                            }
                                        } break;
                                    }
                                }                                
                            }
                        }                        
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
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY descripcion");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY descripcion DESC");
                            }
                        }
                        break;

                        case "codigo": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY codigo");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY codigo DESC");
                            }
                        }
                        break;

                        case "precio_costo": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY precio_costo");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY precio_costo DESC");
                            }
                        }
                        break;

                        case "precio_venta": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY precio_venta");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY precio_venta DESC");
                            }
                        }
                        break;

                        case "stock": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY stock");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY stock DESC");
                            }
                        }
                        break;

                        case "stock_minimo": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY stock_minimo");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY stock_minimo DESC");
                            }
                        }
                        break;

                        case "peso_envase": 
                        {
                            if (tipoOrden.equals("ASC")) 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY peso_envase");
                            } 
                            else 
                            {
                                query = session.createQuery("FROM Producto p JOIN FETCH p.proveedors pv WHERE p.estado = false AND pv.id = :proveedor ORDER BY peso_envase DESC");
                            }
                        }
                        break;
                    }
                }
            }
            query.setParameter("proveedor", idProveedor);
            lista = query.list();
            tx.commit();
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Listar productos");
        }
        finally
        {
            session.close();
        }
        return lista;
    }
    
    public List<Producto> alarma() 
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Producto> lista = null;
        try 
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Producto p WHERE p.stock <= p.stockMinimo AND p.estado = TRUE");
            lista = query.list();
            tx.commit();            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error. Lista stock minimo");
        }
        finally
        {
            session.close();
        }
        return lista;
    }  
    
    public void restarStock(int id, int cantidad)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        Producto p = null;
        
        p = (Producto)session.get(Producto.class, id);
        p.setStock(p.getStock() - cantidad); 
        
        tx = session.beginTransaction();
        try
        {
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
        finally
        {
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Stock de producto modificado");
    }
    
    public void sumarStock(int id, int cantidad)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Producto p = null;
        
        p = (Producto)session.get(Producto.class, id);
        p.setStock(p.getStock() + cantidad); 
        
        tx = session.beginTransaction();
        try
        {
            session.merge(p);
            tx.commit();
            
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
        //JOptionPane.showMessageDialog(null, "Stock de producto modificado");
    }
    
    public void setearPreciosUnidad(int id, double precioCostoU, double precioVentaU, double precioVentaXkilo)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        
        Producto p = null;
        
        p = (Producto)session.get(Producto.class, id);
        if (precioCostoU != 0)
        {
            p.setPrecioCosto(precioCostoU);
        }
        if (precioVentaU != 0)
        {
            p.setPrecioVenta(precioVentaU);
        }        
        if (precioVentaXkilo != 0)
        {
            p.setPrecioVentaXKilo(precioVentaXkilo);
        }
                
        tx = session.beginTransaction();
        try
        {
            session.merge(p);
            tx.commit();            
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
    }
}