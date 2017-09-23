/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Sesion;
import org.hibernate.*;
import Modelo.Usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author Bian
 */
public class UsuarioDAO {
    
    Sesion nuevaSesion = new Sesion();
    Session session = nuevaSesion.iniciarSesion();
    
    public void alta(Usuario u)
    {
        Transaction tx = session.beginTransaction();
        try
        {
            session.save(u);
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
        JOptionPane.showMessageDialog(null, "Usuario creado");
    }
    
    public void modificarContraseña(int id, int pin)
    {
        Usuario u = null;
        
        Query query = session.createQuery("FROM Usuario u WHERE u.pin LIKE :pin");
        query.setParameter("pin", pin+"%");
        u = (Usuario) query.uniqueResult();
            
        u.setPin(pin);
        
        Transaction tx = session.beginTransaction();
        try
        {
            session.merge(u);
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
        JOptionPane.showMessageDialog(null,"Contraseña modificada");
    }
}
