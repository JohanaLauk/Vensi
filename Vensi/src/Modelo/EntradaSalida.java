package Modelo;

import java.util.Date;

public class EntradaSalida  implements java.io.Serializable 
{
    private int id;
    private Turno turno;
    private String nombre;
    private String descripcion;
    private int cantProd;
    private double monto;
    private boolean tipo;
    private Date hora;

    public EntradaSalida() 
    {  }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Turno getTurno() 
    {
        return this.turno;
    }    
    public void setTurno(Turno turno) 
    {
        this.turno = turno;
    }
    
    public String getNombre() 
    {
        return this.nombre;
    }    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getDescripcion() 
    {
        return this.descripcion;
    }    
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    
    public int getCantProd() 
    {
        return this.cantProd;
    }    
    public void setCantProd(int cantProd) 
    {
        this.cantProd = cantProd;
    }
    
    public double getMonto() 
    {
        return this.monto;
    }    
    public void setMonto(double monto) 
    {
        this.monto = monto;
    }
    
    public boolean isTipo() 
    {
        return this.tipo;
    }    
    public void setTipo(boolean tipo) 
    {
        this.tipo = tipo;
    }
    
    public Date getHora() 
    {
        return this.hora;
    }    
    public void setHora(Date hora) 
    {
        this.hora = hora;
    }
}


