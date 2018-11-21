
package models;
public class Pistera extends Bicicleta {
    
    //declara atributos
    private  String tipoNeumatico;
    private  String tipoPiñon;
    private  String tipoManubrio;

    public Pistera(String tipoNeumatico, String tipoPiñon, String tipoManubrio, String marca, String modelo, double talla, String color, int peso) {
        super(marca, modelo, talla, color, peso);
        this.tipoNeumatico = tipoNeumatico;
        this.tipoPiñon = tipoPiñon;
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }

    public String getTipoPiñon() {
        return tipoPiñon;
    }

    public void setTipoPiñon(String tipoPiñon) {
        this.tipoPiñon = tipoPiñon;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }
    
    @Override
    public String getMarca() {
        return "este es el principio de polimorfismo";
    }
    
    
}
