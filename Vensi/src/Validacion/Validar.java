/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Bian
 */
public class Validar {
    
    Pattern pat;
    Matcher mat;
    
    public boolean validarCUIT(String cadena){
        boolean validado = false;
        pat = Pattern.compile("^\\d{2}\\-\\d{8}\\-\\d{1}$");
        mat = pat.matcher(cadena);
        if(mat.matches()) 
            validado = true;
        
        return validado;
    }
    
    public boolean validarPrecio(String cadena){
        boolean validado = false;
        pat = Pattern.compile("^\\d+\\.\\d{1,2}");
        mat = pat.matcher(cadena);
        if(mat.matches())
            validado = true;
        
        return validado;
    }
}
