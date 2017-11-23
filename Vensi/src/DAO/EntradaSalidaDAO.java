/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Bian
 */
public class EntradaSalidaDAO {
    
    public void alta(EntradaSalida es)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
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
        session.close();
        JOptionPane.showMessageDialog(null, "Entrada/Salida agregada");
    }
    
    public void modificar(EntradaSalida es, int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
               
        EntradaSalida ensa = null;
                   
        ensa = (EntradaSalida)session.get(EntradaSalida.class, id);
        ensa.setMonto(es.getMonto());
        ensa.setDescripcion(es.getDescripcion());
        ensa.setFechaHora(es.getFechaHora());
        ensa.setTipo(es.isTipo());
            
         Transaction tx = session.beginTransaction();
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
        session.close();
        JOptionPane.showMessageDialog(null, "Entrada/Salida modificada");
    }    
       
    public EntradaSalida buscarPorId(int id)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
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
    
    public List<EntradaSalida> listar()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        List<EntradaSalida> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM EntradaSalida");
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
