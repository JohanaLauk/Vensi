package DAO;

import Conexion.Sesion;
import org.hibernate.*;
import Modelo.Pedido;
import java.util.*;
import javax.swing.*;

public class PedidoDAO 
{    
    Sesion nuevaSesion = new Sesion();
    Session session = nuevaSesion.iniciarSesion();
    
    public void alta(Pedido p)
    {
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
        JOptionPane.showMessageDialog(null, "Pedido creado");
    }
    
    public List<Pedido> listar()
    {
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Pedido").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return lista;
    }
    
    public List<Pedido> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Pedido p WHERE p.fecha_hora_inicio BETWEEN :fechaInicio AND :fechaFin");
            query.setParameter("fechaInicio", "%"+fechaInicio+"%");
            query.setParameter("fechaFin", "%"+fechaInicio+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return lista;
    }
    
    public List<Pedido> buscarPorNumero(int nro)
    {
        List<Pedido> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Pedido p WHERE p.nro_pedido LIKE :nro");
            query.setParameter("nro", "%"+nro+"%");
            lista = query.list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }        
        return lista;
    }
}
