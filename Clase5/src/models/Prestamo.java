
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
    public int codigo;
    public int numeroSocio;
    private Date fecha;
    private int cantidad;

    public Prestamo(int codigo, int numeroSocio, String fecha, int cantidad) throws ParseException {
        this.codigo = codigo;
        this.numeroSocio = numeroSocio;
        this.fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        this.cantidad=cantidad;
    }
    public int cantidadPrestamos(){
        return cantidad*2;
    }   

    public int getCodigo() {
        return codigo;
    }

    

    public int getNumeroSocio() {
        return numeroSocio;
    }

  

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
