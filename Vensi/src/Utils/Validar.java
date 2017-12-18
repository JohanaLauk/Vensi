package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar 
{    
    Pattern pat;
    Matcher mat;
    
    public boolean validarCUIT(String cadena)
    {
        boolean validado = false;
        pat = Pattern.compile("^\\d{2}\\-\\d{8}\\-\\d{1}$");
        mat = pat.matcher(cadena);
        
        if (mat.matches()) 
        {
            validado = true;
        }
        return validado;
    }
    
    public boolean validarPrecio(String cadena)
    {
        boolean validado = false;
        pat = Pattern.compile("^\\d+\\.{0,1}\\d{0,2}");
        mat = pat.matcher(cadena);
        
        if (mat.matches())
        {
            validado = true;
        }
        return validado;
    }
}
