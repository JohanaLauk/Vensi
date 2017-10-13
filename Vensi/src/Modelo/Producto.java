package Modelo;



public class Producto  implements java.io.Serializable 
{
     private int id;
     private String codigo;
     private String descripcion;
     private double precioCostoXKilo;
     private double precioCostoXUnidad;
     private double precioVentaXKilo;
     private double precioVentaXUnidad;
     private double stock;
     private double stockMinimo;
     private double pesoEnvase;
     private boolean estado;

    public Producto() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getCodigo() 
    {
        return this.codigo;
    }    
    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }
    
    public String getDescripcion() 
    {
        return this.descripcion;
    }    
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    
    public double getPrecioCostoXKilo() 
    {
        return this.precioCostoXKilo;
    }    
    public void setPrecioCostoXKilo(double precioCostoXKilo) 
    {
        this.precioCostoXKilo = precioCostoXKilo;
    }
    
    public double getPrecioCostoXUnidad() 
    {
        return this.precioCostoXUnidad;
    }    
    public void setPrecioCostoXUnidad(double precioCostoXUnidad) 
    {
        this.precioCostoXUnidad = precioCostoXUnidad;
    }
    
    public void setPrecioVentaXKilo(double precioVentaXKilo) 
    {
        this.precioVentaXKilo = precioVentaXKilo;
    }
    public void setPrecioVentaXUnidad(double precioVentaXUnidad)
    {
        this.precioVentaXUnidad = precioVentaXUnidad;
    }

    public double getPrecioVentaXKilo() 
    {
        return precioVentaXKilo;
    }
    public double getPrecioVentaXUnidad() 
    {
        return precioVentaXUnidad;
    }
    
    public double getStock() 
    {
        return this.stock;
    }    
    public void setStock(double stock)
    {
        this.stock = stock;
    }
    
    public double getStockMinimo() 
    {
        return this.stockMinimo;
    }    
    public void setStockMinimo(double stockMinimo) 
    {
        this.stockMinimo = stockMinimo;
    }
    
    public double getPesoEnvase() 
    {
        return this.pesoEnvase;
    }    
    public void setPesoEnvase(double pesoEnvase) 
    {
        this.pesoEnvase = pesoEnvase;
    }

    public boolean isEstado() 
    {
        return this.estado;
    }    
    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }
}