package Modelo;

import java.util.Date;

public class ItemVenta  implements java.io.Serializable 
{    
    private int id;
    private Producto producto;     
    private int cantidad;
    private Date fecha_hora;
    private Turno turno;    

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

    public int getCantidad() 
    {
        return cantidad;
    }
    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }    
    
    public Date getFecha_hora() 
    {
        return fecha_hora;
    }
    public void setFecha_hora(Date fecha_hora) 
    {
        this.fecha_hora = fecha_hora;
    }

    public Turno getTurno() 
    {
        return turno;
    }
    public void setTurno(Turno turno) 
    {
        this.turno = turno;
    }    
}