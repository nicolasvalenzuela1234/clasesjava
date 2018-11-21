package models;
public class Computador {
    public int id;
    public String marca;
    public String modelo;
    public String procesador;
    public int cantMemoria;
    public int disco;
    public double pantalla;
    
    public Computador(){
        
    }
    
    public Computador(int id, String marca, String modelo){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
    }    
    
    public Computador(String marca, String modelo, double pantalla){
        this.marca=marca;
        this.modelo=modelo;
        this.pantalla=pantalla;
    }

    public Computador(int id, String marca, String modelo, String procesador, int cantMemoria, int disco, double pantalla) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantMemoria = cantMemoria;
        this.disco = disco;
        this.pantalla = pantalla;
    }
    
}
