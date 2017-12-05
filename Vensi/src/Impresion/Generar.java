package Impresion;

import Modelo.ItemImprimir;
import java.sql.Connection;

import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Generar 
{    
    public void notaPedido(List<ItemImprimir> listaProdImprimir, List<String> datosProv)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5445/Vensi");
                        
            JasperReport jr = (JasperReport)JRLoader.loadObject("notaPedido.jasper");
            Map parametro = new HashMap();
            
            parametro.put("listaProdImprimir", listaProdImprimir);
            parametro.put("datosProv", datosProv);
                        
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro,con);   
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
