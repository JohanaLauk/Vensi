package DAO;

import Conexion.NewHibernateUtil;
import Modelo.EntradaSalida;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntradaSalidaDAO 
{    
    Session session;
    Transaction tx;
    
    public void alta(EntradaSalida es)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        try
        {
            session.save(es);
            tx.commit();
        }
        catch(Exception e)
        {
            if (tx.isActive())
		tx.rollback();
                    e.printStackTrace();
		throw e;
        } 
        finally{
            session.close();
        }
        //JOptionPane.showMessageDialog(null, "Entrada/Salida agregada");
    }
    
    public void modificar(EntradaSalida es, int id) //creo que no lo vamos a necesitar
    {
        session = NewHibernateUtil.getSessionFactory().openSession();               
        EntradaSalida ensa = null;
                   
        ensa = (EntradaSalida)session.get(EntradaSalida.class, id);        
        ensa.setDescripcion(es.getDescripcion());
        ensa.setCantProd(es.getCantProd());
        ensa.setMonto(es.getMonto());        
        ensa.setTipo(es.isTipo());
        ensa.setHora(es.getHora());
        ensa.setTurno(es.getTurno());
            
        tx = session.beginTransaction();
        try
        {
            session.merge(ensa);
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
        //JOptionPane.showMessageDialog(null, "Entrada/Salida modificada");
    }    
       
    public EntradaSalida buscarPorId(int id)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();       
        EntradaSalida ensa = null;
        try
        {                       
            Transaction tx = session.beginTransaction();
            ensa = (EntradaSalida)session.get(EntradaSalida.class,id);            
            tx.commit(); 
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Entrada/Salida no encontrada");
        } 
        finally{
            session.close();
        }
        
        return ensa;          
    }
    
    public List<EntradaSalida> listar(int nroTurno)
    {
        session = NewHibernateUtil.getSessionFactory().openSession();        
        List<EntradaSalida> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM EntradaSalida en WHERE en.turno.id = :nroTurno");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();
            
        }
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar Entrada/Salida");
        }        
        finally{
            session.close();
        }
        return lista;
    }
}
