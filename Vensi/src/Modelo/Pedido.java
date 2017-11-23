package Modelo;

import java.util.*;

public class Pedido  implements java.io.Serializable 
{
    private int id;
    //private List<ItemPedido> itemPedido;
    private Proveedor proveedor;
    private Date fechaHora;

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

    /*public List<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }*/
        
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
    
}