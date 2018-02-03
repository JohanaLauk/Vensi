package Modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Turno  implements java.io.Serializable 
{
    private int id;
    private Usuario usuario;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private double montoVenta;
    private double montoES;
    private double efectivoHay;
    private Set entradaSalidas = new HashSet(0);
    private Set itemVentas = new HashSet(0);

    public Turno() 
    { }
	
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Usuario getUsuario() 
    {
        return this.usuario;
    }    
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }
    
    public Date getFechaHoraInicio() 
    {
        return this.fechaHoraInicio;
    }    
    public void setFechaHoraInicio(Date fechaHoraInicio) 
    {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    
    public Date getFechaHoraFin() 
    {
        return this.fechaHoraFin;
    }    
    public void setFechaHoraFin(Date fechaHoraFin) 
    {
        this.fechaHoraFin = fechaHoraFin;
    }
    
    public double getMontoVenta() 
    {
        return this.montoVenta;
    }
    public void setMontoVenta(double montoVenta) 
    {
        this.montoVenta = montoVenta;
    }
    
    public double getMontoES() 
    {
        return this.montoES;
    }    
    public void setMontoES(double montoES) 
    {
        this.montoES = montoES;
    }
    
    public double getEfectivoHay() 
    {
        return this.efectivoHay;
    }    
    public void setEfectivoHay(double efectivoHay) 
    {
        this.efectivoHay = efectivoHay;
    }
    
    public Set getEntradaSalidas() 
    {
        return this.entradaSalidas;
    }    
    public void setEntradaSalidas(Set entradaSalidas) 
    {
        this.entradaSalidas = entradaSalidas;
    }
    
    public Set getItemVentas() 
    {
        return this.itemVentas;
    }    
    public void setItemVentas(Set itemVentas) 
    {
        this.itemVentas = itemVentas;
    }
}


