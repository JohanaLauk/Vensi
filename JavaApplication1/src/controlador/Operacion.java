
package controlador;
import javax.swing.JOptionPane;
import modelo.Producto;
import org.hibernate.*;

/**
 *
 * @author Bian
 */
public class Operacion {
    
    public void alta(Producto prod)
    {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(prod);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Producto agregado");
    }
}
