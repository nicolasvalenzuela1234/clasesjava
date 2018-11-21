
package models;
public class Estudiante extends Humano{
    //declara variable
    private int id;
    private double[] notas;
    
    //metodo constructor

    public Estudiante(int id, double[] notas, String nombre, String apellido, String sexo, String direccion, String telefono) {
        super(nombre, apellido, sexo, direccion, telefono);
        this.id = id;
        this.notas = notas;
    }

    public int getId() {
        return id;
    }

    

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void setNotas(int i,double nota) {
        this.notas[i] = nota;
    }
    public void setNotas(double nota1,double nota2,double nota3,double nota4,double nota5) {
        
            this.notas[0]=nota1;
            this.notas[1]=nota2;
            this.notas[2]=nota3;
            this.notas[3]=nota4;
            this.notas[4]=nota5;
            
       
        
    }
}
