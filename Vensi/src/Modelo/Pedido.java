package Modelo;

import java.util.Date;
import java.util.Set;

public class Pedido  implements java.io.Serializable 
{
     private int id;
     private ItemPedido itemPedido;
     private Proveedor proveedor;
     private int nroPedido;
     private Date fechaHora;
     //private Set historials = new HashSet(0);

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
    
    public ItemPedido getItemPedido() 
    {
        return this.itemPedido;
    }    
    public void setItemPedido(ItemPedido itemPedido) 
    {
        this.itemPedido = itemPedido;
    }
    
    public Proveedor getProveedor() 
    {
        return this.proveedor;
    }    
    public void setProveedor(Proveedor proveedor) 
    {
        this.proveedor = proveedor;
    }
    
    public int getNroPedido() 
    {
        return this.nroPedido;
    }    
    public void setNroPedido(int nroPedido) 
    {
        this.nroPedido = nroPedido;
    }
    
    public Date getFechaHora() 
    {
        return this.fechaHora;
    }    
    public void setFechaHora(Date fechaHora) 
    {
        this.fechaHora = fechaHora;
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