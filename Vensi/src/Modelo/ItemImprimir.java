package Modelo;

public class ItemImprimir implements java.io.Serializable 
{
    private int id;
    private Producto producto;
    private int cantidad;
    
    public ItemImprimir()
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
}
