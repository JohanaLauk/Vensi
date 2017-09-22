/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.*;
import Modelo.Historial;
import Conexion.Sesion;
import javax.swing.JOptionPane;

/**
 *
 * @author Bian
 */
public class HistorialDAO {
    
    Sesion nuevaSesion = new Sesion();
    Session session = nuevaSesion.iniciarSesion();
    
    public void alta(Historial h)
    {
        Transaction tx = session.beginTransaction();
        try{
            session.save(h);
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
        JOptionPane.showMessageDialog(null,"Historial creado");
    }
    
    public Historial obtener()
    {
        Historial h = null;
        try
        {
        Transaction tx = session.beginTransaction();                
        h = (Historial)session.get(Historial.class,1);
        tx.commit();
        session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Historial no encontrado");
        }
       return h;
    }
}
