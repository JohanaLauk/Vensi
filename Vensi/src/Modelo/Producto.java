package Modelo;

import java.util.List;

public class Producto  implements java.io.Serializable 
{
     private int id;
     private String codigo;
     private String descripcion;
     private double precioCosto;
     private double precioVenta;
     private double precioVentaXPeso;
     private double stock;
     private double stockMinimo;
     private int pesoEnvase;
     private boolean porPeso = false;   //es por unidad
     private boolean estado = true;
     private List<Proveedor> proveedor;

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
    
    public double getPrecioCosto() 
    {
        return this.precioCosto;
    }    
    public void setPrecioCosto(double precioCosto) 
    {
        this.precioCosto = precioCosto;
    }       
    
    public double getPrecioVenta() 
    {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta)
    {
        this.precioVenta = precioVenta;
    }   
    
    public double getPrecioVentaXPeso() 
    {
        return precioVentaXPeso;
    }
    public void setPrecioVentaXPeso(double precioVentaXPeso) 
    {
        this.precioVentaXPeso = precioVentaXPeso;
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
    
    public int getPesoEnvase() 
    {
        return this.pesoEnvase;
    }    
    public void setPesoEnvase(int pesoEnvase) 
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
    
    public boolean isPorPeso() 
    {
        return this.porPeso;
    }    
    public void setPorPeso(boolean porPeso) 
    {
        this.porPeso = porPeso;
    }

    public List<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }
    
    
}