package Modelo;

import java.util.Date;

public class ItemVenta  implements java.io.Serializable 
{    
    private int id;
    private Producto producto;     
    private int cantidad;
    private double monto;
    private Date hora;
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
    
    public double getMonto() 
    {
        return monto;
    }
    public void setMonto(double monto) 
    {
        this.monto = monto;
    } 
    
    public Date getHora() 
    {
        return hora;
    }
    public void setHora(Date hora) 
    {
        this.hora = hora;
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