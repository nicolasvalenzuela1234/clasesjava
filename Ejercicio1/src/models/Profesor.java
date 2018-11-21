
package models;
public class Profesor extends Humanos{
    
    
    private String asignatura;
    private int sueldo;

    public Profesor(String asignatura, int sueldo, String nombre, String apellido, String genero, String direccion, String telefono) {
        super(nombre, apellido, genero, direccion, telefono);
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}
