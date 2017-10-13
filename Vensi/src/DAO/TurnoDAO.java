package DAO;

import Conexion.Sesion;
import org.hibernate.*;
import Modelo.Turno;
import java.util.*;
import javax.swing.*;

public class TurnoDAO 
{    
    Sesion nuevaSesion = new Sesion();
    Session session = nuevaSesion.iniciarSesion();
    
    public void alta(Turno t)
    {
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(t);
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
        JOptionPane.showMessageDialog(null, "Turno creado");
    }
    
    public List<Turno> listar()
    {
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            lista = session.createQuery("FROM Turno").list();
            tx.commit();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
    
    public List<Turno> buscarPorFecha(Date fechaInicio, Date fechaFin)
    {
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t WHERE t.fecha_hora_inicio BETWEEN :fechaInicio AND :fechaFin");
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
    
    public List<Turno> buscarPorNumero(int nro)
    {
        List<Turno> lista = null;
        try
        {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("FROM Turno t WHERE t.nro_turno LIKE :nro");
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
