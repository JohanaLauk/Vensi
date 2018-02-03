package Impresion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Generar 
{    
    public void notaPedido()//List<ItemImprimir> listaProdImprimir, List<String> datosProv)
    {
        try
        {            
            String path = "C:\\Users\\Johana\\Documents\\NetBeansProjects\\Vensi\\Vensi\\src\\Impresion\\prueba.jasper";
            //String path = "C:\\Users\\Johana\\JaspersoftWorkspace\\notaPedido\\notaPedido.jasper";
            JasperReport jr = JasperCompileManager.compileReport(path);
            //JasperReport jr = (JasperReport) JRLoader.loadObject(path);
            
            //JRBeanCollectionDataSource jrbcds = new JRBeanCollectionDataSource(listaProdImprimir);
            //JasperPrint mostrarReporte = JasperFillManager.fillReport(jr, null , jrbcds);
            
            
            //JRBeanCollectionDataSource jrbcds2 = new JRBeanCollectionDataSource(datosProv);
            
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5445/Vensi");
                        
            //JasperReport jr = (JasperReport)JRLoader.loadObject("prueba.jasper");
            //Map parametro = new HashMap();
            
            //parametro.put("listaProdImprimir", listaProdImprimir);
            //parametro.put("datosProv", datosProv);
                        
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jr, null, con);
            
            JasperViewer jv = new JasperViewer(mostrarReporte, false);
            jv.setTitle("Nota de pedido");
            jv.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en Generar.notaPedido()"+e);
        }       
    }
}
