package Modelo;

import java.util.Date;
import java.util.List;

public class Turno  implements java.io.Serializable 
{
    private int id;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private List<ItemVenta> listaVentasTurno;

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
    
    public List<ItemVenta> getListaVentasTurno() 
    {
        return listaVentasTurno;
    }
    public void setListaVentasTurno(List<ItemVenta> listaVentasTurno)
    {
        this.listaVentasTurno = listaVentasTurno;
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
}
