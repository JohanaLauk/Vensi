package Utils;

public class Redondear 
{    
    public double RedondearPesos(double precio)    //redondea en un entero (para arriba) (los pesos)
    {
        precio = Math.ceil(precio);
        
        return precio;
    }    
    
    public double RedondearCentavos(double precio)    //redondea para arriba los centavos
    {
        return Math.rint(precio*10)/10;
    }     
}
