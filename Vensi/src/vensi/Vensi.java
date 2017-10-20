package vensi;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Vista.ventanaPrincipal;

public class Vensi 
{
    public static void main(String[] args) 
    {
        UsuarioDAO uDAO = new UsuarioDAO();
        if(uDAO.listarDetalles().isEmpty())
        {
            Usuario general = new Usuario();
            general.setNombreUsuario("General");
            general.setPin(0000);
            Usuario sistemaVentas = new Usuario();
            sistemaVentas.setNombreUsuario("Sistema de ventas");
            sistemaVentas.setPin(0000);
            uDAO.alta(general);
            uDAO.alta(sistemaVentas);
        }
        
        new ventanaPrincipal().setVisible(true);
        
    }    
}
