package Modelo;

import java.util.Date;
import java.util.List;

public class Turno  implements java.io.Serializable 
{
    private int id;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private List<ItemVenta> listaItemVenta;    //la BD exige un id_itemVenta

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
    
     public List<ItemVenta> getListaItemVenta() {
        return listaItemVenta;
    }

    public void setListaItemVenta(List<ItemVenta> listaItemVenta) {
        this.listaItemVenta = listaItemVenta;
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
