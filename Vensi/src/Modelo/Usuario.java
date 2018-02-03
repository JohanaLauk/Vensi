package Modelo;

import java.util.HashSet;
import java.util.Set;

public class Usuario  implements java.io.Serializable 
{
    private int id;
    private String nombreUsuario;
    private int pin;
    private Set turnos = new HashSet(0);

    public Usuario() 
    { }
   
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
    
    public Set getTurnos() 
    {
        return this.turnos;
    }    
    public void setTurnos(Set turnos) 
    {
        this.turnos = turnos;
    }
}


