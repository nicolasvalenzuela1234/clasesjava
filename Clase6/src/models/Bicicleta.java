package models;
public class Bicicleta {
    protected String marca;
    protected String modelo;
    protected double talla;
    protected String color;
    protected int peso;

    public Bicicleta(String marca, String modelo, double talla, String color, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.color = color;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}