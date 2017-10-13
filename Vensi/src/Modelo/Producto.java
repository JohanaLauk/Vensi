package Modelo;

import java.math.BigDecimal;

public class Producto  implements java.io.Serializable 
{
     private int id;
     private String codigo;
     private String descripcion;
     private BigDecimal precioCostoXKilo;
     private BigDecimal precioCostoXUnidad;
     private BigDecimal precioVentaXKilo;
     private BigDecimal precioVentaXUnidad;
     private BigDecimal stock;
     private BigDecimal stockMinimo;
     private BigDecimal pesoEnvase;
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
    
    public BigDecimal getPrecioCostoXKilo() 
    {
        return this.precioCostoXKilo;
    }    
    public void setPrecioCostoXKilo(BigDecimal precioCostoXKilo) 
    {
        this.precioCostoXKilo = precioCostoXKilo;
    }
    
    public BigDecimal getPrecioCostoXUnidad() 
    {
        return this.precioCostoXUnidad;
    }    
    public void setPrecioCostoXUnidad(BigDecimal precioCostoXUnidad) 
    {
        this.precioCostoXUnidad = precioCostoXUnidad;
    }
    
    public void setPrecioVentaXKilo(BigDecimal precioVentaXKilo) 
    {
        this.precioVentaXKilo = precioVentaXKilo;
    }
    public void setPrecioVentaXUnidad(BigDecimal precioVentaXUnidad)
    {
        this.precioVentaXUnidad = precioVentaXUnidad;
    }

    public BigDecimal getPrecioVentaXKilo() 
    {
        return precioVentaXKilo;
    }
    public BigDecimal getPrecioVentaXUnidad() 
    {
        return precioVentaXUnidad;
    }
    
    public BigDecimal getStock() 
    {
        return this.stock;
    }    
    public void setStock(BigDecimal stock)
    {
        this.stock = stock;
    }
    
    public BigDecimal getStockMinimo() 
    {
        return this.stockMinimo;
    }    
    public void setStockMinimo(BigDecimal stockMinimo) 
    {
        this.stockMinimo = stockMinimo;
    }
    
    public BigDecimal getPesoEnvase() 
    {
        return this.pesoEnvase;
    }    
    public void setPesoEnvase(BigDecimal pesoEnvase) 
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