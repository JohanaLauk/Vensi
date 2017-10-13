package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

public class ItemPedido  implements java.io.Serializable 
{
     private int id;
     private Producto producto;
     //private Serializable producto;
     private BigDecimal cantidad;
     //private Set pedidos = new HashSet(0);

    public ItemPedido() 
    { }
	
    public ItemPedido(int id, Producto producto, BigDecimal cantidad) 
    {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public ItemPedido(int id, Producto producto, BigDecimal cantidad, Set pedidos) {
       this.id = id;
       this.producto = producto;
       this.cantidad = cantidad;
       //this.pedidos = pedidos;
    }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Serializable getProducto() 
    {
        return this.producto;
    }    
    public void setProducto(Producto producto) 
    {
        this.producto = producto;
    }
    
    public BigDecimal getCantidad() 
    {
        return this.cantidad;
    }    
    public void setCantidad(BigDecimal cantidad) 
    {
        this.cantidad = cantidad;
    }
    
    /*public Set getPedidos() 
    {
        return this.pedidos;
    }    
    public void setPedidos(Set pedidos) 
    {
        this.pedidos = pedidos;
    }*/
}