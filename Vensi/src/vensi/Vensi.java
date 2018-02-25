package vensi;

import DAO.ProductoDAO;
import DAO.UsuarioDAO;
import Modelo.Producto;
import Modelo.Usuario;
import Vista.ventanaPrincipal;
import java.util.List;
import javax.swing.JOptionPane;

public class Vensi 
{
    public static void main(String[] args) 
    {
        UsuarioDAO uDAO = new UsuarioDAO();
        ProductoDAO pDAO = new ProductoDAO();
        
        if (uDAO.listar().isEmpty())
        {
            Usuario propietario = new Usuario();
            propietario.setNombreUsuario("Propietario");
            propietario.setPin(0);
            
            Usuario empleado = new Usuario();
            empleado.setNombreUsuario("Empleado");
            empleado.setPin(0);
            
            uDAO.alta(propietario); 
            uDAO.alta(empleado);
        }
        
        List<Producto> listaProdReponer = pDAO.alarma();
        if (listaProdReponer.size() > 0)
        {
            JOptionPane.showMessageDialog(null, "¡ALERTA!\nTiene productos agotados o próximos a agotarse.\nCorrobore su inventario.");
        }
        
        new ventanaPrincipal().setVisible(true);        
    }    
}
