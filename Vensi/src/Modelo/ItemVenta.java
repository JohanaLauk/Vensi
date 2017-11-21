package Modelo;

import java.util.Date;

public class ItemVenta  implements java.io.Serializable 
{    
     private int id;
     private Producto producto;     
     private double cantidad;
     private Date fecha_hora;

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

    public Date getFecha_Hora() 
    {
        return fecha_hora;
    }
    public void setFecha_Hora(Date fecha_hora) 
    {
        this.fecha_hora = fecha_hora;
    }   
}