package Impresion;

import Conexion.NewHibernateUtil;
import Modelo.Producto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.SessionFactory;

public class Generar 
{    
    public void notaPedido(List<Producto> listaProdPedido)
    {
        try
        {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
                        
            JasperReport jr = (JasperReport)JRLoader.loadObject("notaPedido.jasper");
            Map parametro = new HashMap();
            
            parametro.put("listaProdPedido", listaProdPedido);
                        
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, sesion);    //el 3° parametro es el del error
            //JasperPrint jp = JasperFillManager.fillReport(jr, parametro, connection);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Nota de pedido");
            jv.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en Generar.notaPedido()"+e);
        }       
    }
}
