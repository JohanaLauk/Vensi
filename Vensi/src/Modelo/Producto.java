package Modelo;

import java.util.HashSet;
import java.util.Set;

public class Producto  implements java.io.Serializable 
{
    private int id;
    private String codigo;
    private String descripcion;
    private double precioCosto;
    private double precioVenta;
    private double precioVentaXKilo;
    private int stock;
    private Integer stockMinimo;
    private Integer pesoEnvase;
    private Boolean estado = true;
    private Boolean suspendido = false;
    private Boolean oferta = false;
    private Boolean porPeso;
    private Set<Proveedor> proveedors = new HashSet<Proveedor>(0);
    /*private Set<ItemVenta> itemVentas = new HashSet<ItemVenta>(0);
    private Set<ItemPedido> itemPedidos = new HashSet<ItemPedido>(0);
    private Set<ItemEntradastock> itemEntradastocks = new HashSet<ItemEntradastock>(0);
    private Set<ItemImprimir> itemImprimirs = new HashSet<ItemImprimir>(0);*/

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
        return this.precioVenta;
    }    
    public void setPrecioVenta(double precioVenta) 
    {
        this.precioVenta = precioVenta;
    }
    
    public double getPrecioVentaXKilo() 
    {
        return this.precioVentaXKilo;
    }    
    public void setPrecioVentaXKilo(double precioVentaXKilo) 
    {
        this.precioVentaXKilo = precioVentaXKilo;
    }
    
    public int getStock() 
    {
        return this.stock;
    }    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public Integer getStockMinimo() 
    {
        return this.stockMinimo;
    }    
    public void setStockMinimo(Integer stockMinimo) 
    {
        this.stockMinimo = stockMinimo;
    }
    
    public Integer getPesoEnvase() 
    {
        return this.pesoEnvase;
    }    
    public void setPesoEnvase(Integer pesoEnvase) 
    {
        this.pesoEnvase = pesoEnvase;
    }
    
    public Boolean isEstado() 
    {
        return this.estado;
    }    
    public void setEstado(Boolean estado) 
    {
        this.estado = estado;
    }
    
    public Boolean isSuspendido() 
    {
        return this.suspendido;
    }    
    public void setSuspendido(Boolean suspendido) 
    {        
        this.suspendido = suspendido;
    }
    
    public Boolean isOferta() 
    {
        return this.oferta;
    }    
    public void setOferta(Boolean oferta) 
    {
        this.oferta = oferta;
    }
    
    public Boolean isPorPeso() 
    {
        return this.porPeso;
    }    
    public void setPorPeso(Boolean porPeso) 
    {
        this.porPeso = porPeso;
    }
    
    public Set<Proveedor> getProveedors() 
    {        
        return this.proveedors;
    }    
    public void setProveedors(Set<Proveedor> proveedors) 
    {
        this.proveedors = proveedors;
    }
    public void addProveedors(Proveedor p)
    {
        this.proveedors.add(p);
    }
    
    /*public Set<ItemVenta> getItemVentas() 
    {
        return this.itemVentas;
    }    
    public void setItemVentas(Set<ItemVenta> itemVentas) 
    {
        this.itemVentas = itemVentas;
    }
    
    public Set<ItemPedido> getItemPedidos() 
    {
        return this.itemPedidos;
    }    
    public void setItemPedidos(Set<ItemPedido> itemPedidos) 
    {
        this.itemPedidos = itemPedidos;
    }
    
    public Set<ItemEntradastock> getItemEntradastocks() 
    {
        return this.itemEntradastocks;
    }    
    public void setItemEntradastocks(Set<ItemEntradastock> itemEntradastocks) 
    {
        this.itemEntradastocks = itemEntradastocks;
    }
    
    public Set<ItemImprimir> getItemImprimirs() 
    {
        return this.itemImprimirs;
    }    
    public void setItemImprimirs(Set<ItemImprimir> itemImprimirs) 
    {
        this.itemImprimirs = itemImprimirs;
    }*/
}


