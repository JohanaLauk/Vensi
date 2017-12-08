package Modelo;

import java.util.*;

public class Producto  implements java.io.Serializable 
{
    private int id;
    private String codigo;
    private String descripcion;
    private double precioCosto;
    private double precioVenta;
    private double precioVentaXPeso;
    private int stock;
    private int stockMinimo;
    private int pesoEnvase;
    private boolean porPeso = false;   //es por unidad
    private boolean estado = true;
    private boolean situacion = false;   // false = suspendido   |   true = oferta
    private Set<Proveedor> proveedor = new HashSet<Proveedor>();

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

    public int getStock() 
    {
        return stock;
    }
    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    public int getStockMinimo() 
    {
        return stockMinimo;
    }
    public void setStockMinimo(int stockMinimo) 
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
    
    public boolean isSituacion() 
    {
        return this.situacion;
    }    
    public void setSituacion(boolean situacion) 
    {
        this.situacion = situacion;
    }
    
    public boolean isPorPeso() 
    {
        return this.porPeso;
    }    
    public void setPorPeso(boolean porPeso) 
    {
        this.porPeso = porPeso;
    }

    public Set<Proveedor> getProveedor() 
    {
        return proveedor;
    }
    public void setProveedor(Set<Proveedor> proveedor) 
    {
        this.proveedor = proveedor;
    }    
    public void addProveedor(Proveedor p)
    {
        this.proveedor.add(p);
    }   
}