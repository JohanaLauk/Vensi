package Modelo;

public class Proveedor  implements java.io.Serializable 
{
     private int id;
     private String razonSocial;
     private String cuit;
     private String direccion;
     private String contacto;
     private boolean estado = true;
     private String localidad;
     private String provincia;
     private String pais;
     

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
        return razonSocial;
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
    
    public String getContacto() 
    {
        return this.contacto;
    }    
    public void setContacto(String contacto) 
    {
        this.contacto = contacto;
    }
    
    public boolean isEstado() 
    {
        return this.estado;
    }    
    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}