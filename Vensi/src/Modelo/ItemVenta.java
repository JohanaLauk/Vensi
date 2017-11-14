package Modelo;

import java.util.Date;

public class ItemVenta  implements java.io.Serializable 
{    
     private int id;
     private Producto producto;     
     private double cantidad;
     private Date hora;

    public ItemVenta() 
    { }	   
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Producto getProducto() 
    {
        return this.producto;
    }    
    public void setProducto(Producto producto)
    {
        this.producto = producto;
    }
    
    public double getCantidad() 
    {
        return this.cantidad;
    }    
    public void setCantidad(double cantidad) 
    {
        this.cantidad = cantidad;
    }  

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
}