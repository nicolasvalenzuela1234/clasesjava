package models;

import java.util.Scanner;

public class Estudiantes extends Humanos{
    
    private int id;
    private int[] notas;

    public Estudiantes(int id, int[] notas, String nombre, String apellido, String genero, String direccion, String telefono) {
        super(nombre, apellido, genero, direccion, telefono);
        this.id = id;
        this.notas = notas;
    }

 
   

    public int getId() {
        return id;
    }

    

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    public void setNotas(int i, int nota) {
        this.notas[i] = nota;
    }
    public void setNotas(int nota) {
        for (int i = 0; i < notas.length; i++) {
            Scanner entrada= new Scanner (System.in);
            int poto = entrada.nextInt();
            nota = poto;
            this.notas[i] = nota;
        }
        
       
        
    }
    
    
    
}
