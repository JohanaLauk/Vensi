package Modelo;

public class Usuario  implements java.io.Serializable 
{
     private int id;
     private String nombreUsuario;
     private int pin;

    public Usuario() 
    { }

    public Usuario(int id, String nombreUsuario, int pin) 
    {
       this.id = id;
       this.nombreUsuario = nombreUsuario;
       this.pin = pin;
    }
   
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getNombreUsuario() 
    {
        return this.nombreUsuario;
    }    
    public void setNombreUsuario(String nombreUsuario) 
    {
        this.nombreUsuario = nombreUsuario;
    }
    
    public int getPin() 
    {
        return this.pin;
    }    
    public void setPin(int pin) 
    {
        this.pin = pin;
    }
}