package Modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Entradastock  implements java.io.Serializable 
{     
    private int id;
    private Proveedor proveedor;
    private Date fechaHora;
    private double importe;
    private Set<ItemEntradastock> itemEntradastocks = new HashSet<ItemEntradastock>(0);

    public Entradastock() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Proveedor getProveedor() 
    {
        return this.proveedor;
    }    
    public void setProveedor(Proveedor proveedor) 
    {
        this.proveedor = proveedor;
    }
    
    public Date getFechaHora() 
    {
        return this.fechaHora;
    }    
    public void setFechaHora(Date fechaHora) 
    {
        this.fechaHora = fechaHora;
    }
    
    public double getImporte() 
    {
        return this.importe;
    }    
    public void setImporte(double importe) 
    {
        this.importe = importe;
    }
    
    public Set<ItemEntradastock> getItemEntradastocks() 
    {
        return this.itemEntradastocks;
    }    
    public void setItemEntradastocks(Set<ItemEntradastock> itemEntradastocks) 
    {
        this.itemEntradastocks = itemEntradastocks;
    }
}


