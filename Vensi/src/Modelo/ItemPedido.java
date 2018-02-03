package Modelo;

public class ItemPedido  implements java.io.Serializable 
{
    private int id;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private double precioCostoItem;

    public ItemPedido() 
    { }

    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioCostoItem() {
        return this.precioCostoItem;
    }
    
    public void setPrecioCostoItem(double precioCostoItem) {
        this.precioCostoItem = precioCostoItem;
    }
}


