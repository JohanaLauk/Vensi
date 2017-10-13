package Modelo;

import java.util.Date;
import java.util.Set;

public class Turno  implements java.io.Serializable 
{
     private int id;
     private ItemVenta itemVenta;
     private int nroTurno;
     private Date fechaHoraInicio;
     private Date fechaHoraFin;
     //private Set historials = new HashSet(0);

    public Turno() 
    { }
	
    public Turno(int id, int nroTurno, Date fechaHoraInicio, Date fechaHoraFin) 
    {
        this.id = id;
        this.nroTurno = nroTurno;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }
    
    public Turno(int id, ItemVenta itemVenta, int nroTurno, Date fechaHoraInicio, Date fechaHoraFin, Set historials) 
    {
       this.id = id;
       this.itemVenta = itemVenta;
       this.nroTurno = nroTurno;
       this.fechaHoraInicio = fechaHoraInicio;
       this.fechaHoraFin = fechaHoraFin;
       //this.historials = historials;
    }
   
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
    
    public int getNroTurno() 
    {
        return this.nroTurno;
    }    
    public void setNroTurno(int nroTurno) 
    {
        this.nroTurno = nroTurno;
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


