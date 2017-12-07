package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemVenta;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVentaDAO 
{        
    public void alta(ItemVenta i)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(i);
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
        JOptionPane.showMessageDialog(null, "ItemVenta agregado");
    }
    
    public void modificar(ItemVenta i, int id)  //i = recibe la fecha y la cantidad nueva   |   id = id_ItemVenta existente
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        ItemVenta item = null;
        item = (ItemVenta)session.get(ItemVenta.class, id);
        item.setCantidad(i.getCantidad());  //guarda la nueva cantidad
        item.setFecha_hora(i.getFecha_hora());  //guarda la nueva fechaHora
                  
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(item);
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
        JOptionPane.showMessageDialog(null, "ItemVenta modificado");
    }
    
    public ItemVenta buscar(String cadena)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        ItemVenta it = null;
        
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta it WHERE it.producto.codigo LIKE :cadena OR it.producto.descripcion LIKE :cadena");
            query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");
            it = (ItemVenta)query.uniqueResult();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Buscar itemVenta");
        }
        
        return it;
    }
    
    public List<ItemVenta> listar(int nroTurno)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<ItemVenta> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta iv WHERE iv.turno.id = :nroTurno ORDER BY iv.producto.descripcion");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemVenta del turno");
        }        
        return lista;
    }
}