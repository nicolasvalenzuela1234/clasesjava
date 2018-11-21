
package models;
public class Persona {
    private String nombre;
    private String direccion;
    public int numeroSocio;

    public Persona(String nombre, String direccion, int numeroSocio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroSocio=numeroSocio;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
