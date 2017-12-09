package DAO;

import Conexion.NewHibernateUtil;
import org.hibernate.*;
import Modelo.ItemVenta;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVentaDAO 
{        
    SessionFactory sesion = null;
    Session session = null;
            
    public void alta(ItemVenta i)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(i);
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
        //JOptionPane.showMessageDialog(null, "ItemVenta agregado");
    }
    
    public void modificar(ItemVenta i, int id)  //i = recibe la fecha y la cantidad nueva   |   id = id_ItemVenta existente
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        ItemVenta item = null;
        item = (ItemVenta)session.get(ItemVenta.class, id);
        item.setCantidad(i.getCantidad());  //guarda la nueva cantidad
        item.setFecha_hora(i.getFecha_hora());  //guarda la nueva fechaHora
                  
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(item);
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
        //JOptionPane.showMessageDialog(null, "ItemVenta modificado");
    }
    
    public List<ItemVenta> buscar(String cadena)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<ItemVenta> lista = null;
        
        try
        {            
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta it WHERE it.producto.codigo LIKE :cadena OR it.producto.descripcion LIKE :cadena");
            query.setParameter("cadena", "%"+cadena.toUpperCase()+"%");            
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error. Buscar itemVenta");
        }        
        return lista;
    }
    
    public List<ItemVenta> listar(int nroTurno)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<ItemVenta> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM ItemVenta iv WHERE iv.turno.id = :nroTurno ORDER BY iv.producto.descripcion");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar los ItemVenta del turno");
        }        
        return lista;
    }
}