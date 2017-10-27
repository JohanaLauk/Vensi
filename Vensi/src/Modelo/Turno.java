package Modelo;

import java.util.Date;
import java.util.Set;

public class Turno  implements java.io.Serializable 
{
     private int id;
     private ItemVenta itemVenta;
     private Date fechaHoraInicio;
     private Date fechaHoraFin;
     //private Set historials = new HashSet(0);

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
    
    public ItemVenta getItemVenta() 
    {
        return this.itemVenta;
    }    
    public void setItemVenta(ItemVenta itemVenta) 
    {
        this.itemVenta = itemVenta;
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
    
    /*public Set getHistorials() 
    {
        return this.historials;
    }    
    public void setHistorials(Set historials) 
    {
        this.historials = historials;
    }*/




}


