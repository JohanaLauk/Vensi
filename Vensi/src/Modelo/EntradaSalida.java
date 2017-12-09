package Modelo;

import java.util.*;

public class EntradaSalida 
{    
    private int id;
    private String nombre;
    private String descripcion;
    private int cantProd;
    private double monto;
    private boolean tipo;
    private Date hora;
    private Turno turno;

    public EntradaSalida() 
    { }

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    
    public int getCantProd() 
    {
        return cantProd;
    }
    public void setCantProd (int cantProd) 
    {
        this.cantProd = cantProd;
    }

    public double getMonto() 
    {
        return monto;
    }
    public void setMonto(double monto) 
    {
        this.monto = monto;
    }

    public boolean isTipo() 
    {
        return tipo;
    }
    public void setTipo(boolean tipo) 
    {
        this.tipo = tipo;
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
