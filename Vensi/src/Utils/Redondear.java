package Utils;

public class Redondear 
{    
    public double RedondearAIntArriba(double precio)    //redondea en un entero (para arriba) (los pesos)
    {                                                   //Usado en nuevoProd y EditarProd (precio_venta_x_kilo)
        precio = Math.ceil(precio); 
        
        return precio;
    }    
    
    public double RedondearCentavos(double precio)    //redondea para arriba los centavos
    {
        return Math.rint(precio*100)/100;
    }     
}
