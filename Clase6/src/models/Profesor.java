
package models;
public class Profesor extends Humano{
    //declara atributos
    private String asignatura;
    private int suledo;

    public Profesor(String asignatura, int suledo, String nombre, String apellido, String sexo, String direccion, String telefono) {
        super(nombre, apellido, sexo, direccion, telefono);
        this.asignatura = asignatura;
        this.suledo = suledo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getSuledo() {
        return suledo;
    }

    public void setSuledo(int suledo) {
        this.suledo = suledo;
    }
    
    
}
