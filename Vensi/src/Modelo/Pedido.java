package Modelo;

import java.util.*;

public class Pedido  implements java.io.Serializable 
{
    private int id;
    private Proveedor proveedor;
    private Date fechaHora;
    private double importe;

    
    public Pedido() 
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
        return importe;
    }
    public void setImporte(double importe) 
    {
        this.importe = importe;
    }
    
}