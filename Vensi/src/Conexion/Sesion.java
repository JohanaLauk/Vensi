/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Bian
 */
public class Sesion {
    
    public Session iniciarSesion()
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        return session;
    }
    
    public Sesion()
    {
        
    }
}
