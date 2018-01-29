 package Modelo;

import java.util.Date;

public class Turno  implements java.io.Serializable 
{
    private int id;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Usuario usuario;
    private double montoVenta;
    private double montoES;
    private double efectivoHay;
           
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
    
    public Usuario getUsuario() 
    {
        return this.usuario;
    }    
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    public double getMontoVenta() 
    {
        return montoVenta;
    }
    public void setMontoVenta(double montoVenta) 
    {
        this.montoVenta = montoVenta;
    }

    public double getMontoES() 
    {
        return montoES;
    }
    public void setMontoES(double montoES) 
    {
        this.montoES = montoES;
    }
    
    public double getEfectivoHay() 
    {
        return efectivoHay;
    }
    public void setEfectivoHay(double efectivoHay) 
    {
        this.efectivoHay = efectivoHay;
    }
}
