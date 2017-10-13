package Modelo;

import java.util.*;

public class Historial  implements java.io.Serializable 
{
    private int id;
    private List<Pedido> pedido;
    private List<Turno> turno;

    public Historial() 
    { }	
    
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public List<Pedido> getPedido() 
    {
        return this.pedido;
    }    
    public void setPedido(List pedido) 
    {
        this.pedido = pedido;
    }
    
    public List<Turno> getTurno() 
    {
        return this.turno;
    }    
    public void setTurno(List turno) 
    {
        this.turno = turno;
    }
}