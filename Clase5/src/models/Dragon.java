
package models;

public class Dragon {
     //declarar atributos
    private String nombre;
    private String raza;
    private double tamano;
    private int edad;
    private String color;
    private String sexo;  

    public Dragon(String nombre, String raza, double tamano, int edad, String color, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
        this.color = color;
        this.sexo = sexo;
    }
    public String getNombre(){
       return this.nombre;
   }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
    
    
