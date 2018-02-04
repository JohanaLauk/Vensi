package Modelo;

public class ItemEntradaStock  implements java.io.Serializable 
{
    private int id;
    private EntradaStock entradastock;
    private Producto producto;
    private int cantidad;
    private double precioCostoItem;

    public ItemEntradaStock() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public EntradaStock getEntradastock() 
    {
        return this.entradastock;
    }    
    public void setEntradastock(EntradaStock entradastock) 
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


