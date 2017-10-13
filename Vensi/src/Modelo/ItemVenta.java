package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class ItemVenta  implements java.io.Serializable 
{    
     private int id;
     private Producto producto;
     //private Serializable producto;
     private double cantidad;
     private Date hora;
     //private Set turnos = new HashSet(0);

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
    
    public Serializable getProducto() 
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
    
    public Date getHora() 
    {
        return this.hora;
    }    
    public void setHora(Date hora) 
    {
        this.hora = hora;
    }
    
    /*public Set getTurnos() 
    {
        return this.turnos;
    }    
    public void setTurnos(Set turnos) 
    {
        this.turnos = turnos;
    }*/
}