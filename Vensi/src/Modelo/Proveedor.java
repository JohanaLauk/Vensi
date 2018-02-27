package Modelo;

import java.util.HashSet;
import java.util.Set;

public class Proveedor  implements java.io.Serializable 
{
    private int id;
    private String razonSocial;
    private String cuit;
    private String direccion;
    private String localidad;
    private String provincia;
    private String pais;
    private String contacto;
    private Boolean estado = true;
    private Set<Producto> misProductos = new HashSet<Producto>(0);

    public Proveedor() 
    { }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getRazonSocial() 
    {
        return this.razonSocial;
    }    
    public void setRazonSocial(String razonSocial) 
    {
        this.razonSocial = razonSocial;
    }
    
    public String getCuit() 
    {
        return this.cuit;
    }    
    public void setCuit(String cuit) 
    {
        this.cuit = cuit;
    }
    
    public String getDireccion() 
    {
        return this.direccion;
    }    
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    
    public String getLocalidad() 
    {
        return this.localidad;
    }
    public void setLocalidad(String localidad) 
    {
        this.localidad = localidad;
    }
    
    public String getProvincia() 
    {
        return this.provincia;
    }    
    public void setProvincia(String provincia) 
    {
        this.provincia = provincia;
    }
    
    public String getPais() 
    {
        return this.pais;
    }    
    public void setPais(String pais) 
    {
        this.pais = pais;
    }
    
    public String getContacto() 
    {
        return this.contacto;
    }
    public void setContacto(String contacto) 
    {
        this.contacto = contacto;
    }
    
    public Boolean isEstado() 
    {
        return this.estado;
    }    
    public void setEstado(Boolean estado) 
    {
        this.estado = estado;
    }
    
    public Set<Producto> getMisProductos() 
    {
        return this.misProductos;
    }    
    public void setMisProductos(Set<Producto> misProductos) 
    {
        this.misProductos = misProductos;
    }
    /*public void addMisProductos(Producto p)
    {
        this.misProductos.add(p);
    }*/
}


