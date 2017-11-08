package Modelo;

public class ItemPedido  implements java.io.Serializable 
{
     private int id;
     private Producto producto;
     private double cantidad;

    public ItemPedido() 
    { }    
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Producto getProducto() 
    {
        return this.producto;
    }    
    public void setProducto(Producto producto) 
    {
        this.producto = producto;
    }
    
    public double getCantidad() 
    {
        return this.cantidad;
    }    
    public void setCantidad(double cantidad) 
    {
        this.cantidad = cantidad;
    }
}