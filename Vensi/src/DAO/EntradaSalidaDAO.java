package DAO;

import Conexion.NewHibernateUtil;
import Modelo.EntradaSalida;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EntradaSalidaDAO 
{    
    SessionFactory sesion = null;
    Session session = null;
    
    public void alta(EntradaSalida es)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(es);
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
        //JOptionPane.showMessageDialog(null, "Entrada/Salida agregada");
    }
    
    public void modificar(EntradaSalida es, int id) //creo que no lo vamos a necesitar
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
               
        EntradaSalida ensa = null;
                   
        ensa = (EntradaSalida)session.get(EntradaSalida.class, id);
        ensa.setMonto(es.getMonto());
        ensa.setDescripcion(es.getDescripcion());
        ensa.setHora(es.getHora());
        ensa.setTipo(es.isTipo());
        ensa.setTurno(es.getTurno());
            
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(ensa);
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
        //JOptionPane.showMessageDialog(null, "Entrada/Salida modificada");
    }    
       
    public EntradaSalida buscarPorId(int id)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        EntradaSalida ensa = null;
        try
        {                       
            Transaction tx = session.beginTransaction();
            ensa = (EntradaSalida)session.get(EntradaSalida.class,id);            
            tx.commit(); 
            session.close();
        } 
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Entrada/Salida no encontrada");
        } 
        
        return ensa;          
    }
    
    public List<EntradaSalida> listar(int nroTurno)
    {
        sesion = NewHibernateUtil.getSessionFactory();
        session = sesion.openSession();
        
        List<EntradaSalida> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM EntradaSalida en WHERE en.turno.id = :nroTurno");
            query.setParameter("nroTurno", nroTurno);
            lista = query.list();
            tx.commit();
            session.close();
        }
        catch(HibernateException e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar Entrada/Salida");
        }        
        return lista;
    }
}
