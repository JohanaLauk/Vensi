package vensi;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Vista.ventanaPrincipal;

public class Vensi 
{
    public static void main(String[] args) 
    {
        UsuarioDAO uDAO = new UsuarioDAO();
        
        if(uDAO.listar().isEmpty())
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
        
        new ventanaPrincipal().setVisible(true);        
    }    
}
