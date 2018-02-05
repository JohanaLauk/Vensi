package Modelo;

import java.util.Date;

public class Turno  implements java.io.Serializable 
{
    private int id;
    private Usuario usuario;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private double montoVentas;
    private double montoEntradas;
    private double montoSalidas;
    private double montoAnuladas;
    private double efectivoHay;
    private int cantVentas;
    private int cantEntradas;
    private int cantSalidas;
    private int cantAnuladas;

    public Turno() 
    { }
	
    public int getId() 
    {
        return this.id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public Usuario getUsuario() 
    {
        return this.usuario;
    }    
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }
    
    public Date getFechaHoraInicio() 
    {
        return this.fechaHoraInicio;
    }    
    public void setFechaHoraInicio(Date fechaHoraInicio) 
    {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    
    public Date getFechaHoraFin() 
    {
        return this.fechaHoraFin;
    }    
    public void setFechaHoraFin(Date fechaHoraFin) 
    {
        this.fechaHoraFin = fechaHoraFin;
    }  

    public double getMontoVentas() 
    {
        return montoVentas;
    }
    public void setMontoVentas(double montoVentas) 
    {
        this.montoVentas = montoVentas;
    }

    public double getMontoEntradas() 
    {
        return montoEntradas;
    }
    public void setMontoEntradas(double montoEntradas) 
    {
        this.montoEntradas = montoEntradas;
    }

    public double getMontoSalidas() 
    {
        return montoSalidas;
    }
    public void setMontoSalidas(double montoSalidas) 
    {
        this.montoSalidas = montoSalidas;
    }

    public double getMontoAnuladas() 
    {
        return montoAnuladas;
    }
    public void setMontoAnuladas(double montoAnuladas) 
    {
        this.montoAnuladas = montoAnuladas;
    }

    public double getEfectivoHay() 
    {
        return this.efectivoHay;
    }    
    public void setEfectivoHay(double efectivoHay) 
    {
        this.efectivoHay = efectivoHay;
    }
    
    public int getCantVentas() 
    {
        return cantVentas;
    }
    public void setCantVentas(int cantVentas) 
    {
        this.cantVentas = cantVentas;
    }

    public int getCantEntradas() 
    {
        return cantEntradas;
    }
    public void setCantEntradas(int cantEntradas) 
    {
        this.cantEntradas = cantEntradas;
    }

    public int getCantSalidas() 
    {
        return cantSalidas;
    }
    public void setCantSalidas(int cantSalidas) 
    {
        this.cantSalidas = cantSalidas;
    }

    public int getCantAnuladas() 
    {
        return cantAnuladas;
    }
    public void setCantAnuladas(int cantAnuladas) 
    {
        this.cantAnuladas = cantAnuladas;
    }
}


