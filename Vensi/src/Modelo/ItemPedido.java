package Modelo;

public class ItemPedido  implements java.io.Serializable 
{
    private int id;
    private Producto producto;
    private int cantidad;
    private Pedido pedido;
    private double precioCostoItem;

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

    public int getCantidad() 
    {
        return cantidad;
    }
    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() 
    {
        return pedido;
    }
    public void setPedido(Pedido pedido) 
    {
        this.pedido = pedido;
    }   

    public double getPrecioCostoItem() 
    {
        return precioCostoItem;
    }
    public void setPrecioCostoItem(double precioCostoItem)
    {
        this.precioCostoItem = precioCostoItem;
    }
    
}