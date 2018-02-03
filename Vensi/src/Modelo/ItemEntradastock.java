package Modelo;

public class ItemEntradastock  implements java.io.Serializable 
{
    private int id;
    private Entradastock entradastock;
    private Producto producto;
    private int cantidad;
    private double precioCostoItem;

    public ItemEntradastock() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Entradastock getEntradastock() 
    {
        return this.entradastock;
    }    
    public void setEntradastock(Entradastock entradastock) 
    {
        this.entradastock = entradastock;
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
        return this.cantidad;
    }    
    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }
    
    public double getPrecioCostoItem() 
    {
        return this.precioCostoItem;
    }    
    public void setPrecioCostoItem(double precioCostoItem) 
    {
        this.precioCostoItem = precioCostoItem;
    }
}


