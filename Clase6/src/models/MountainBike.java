package models;
public class MountainBike extends Bicicleta {
    
    //declara atributos
    private  int cantidadSuspecion;
    private  int cantidadCambios;
    private  String tipoFreno;
    private String tipoNeumatico;

    public MountainBike(int cantidadSuspecion, int cantidadCambios, String tipoFreno, String tipoNeumatico, String marca, String modelo, double talla, String color, int peso) {
        super(marca, modelo, talla, color, peso);
        this.cantidadSuspecion = cantidadSuspecion;
        this.cantidadCambios = cantidadCambios;
        this.tipoFreno = tipoFreno;
        this.tipoNeumatico = tipoNeumatico;
    }

    public int getCantidadSuspecion() {
        return cantidadSuspecion;
    }

    public void setCantidadSuspecion(int cantidadSuspecion) {
        this.cantidadSuspecion = cantidadSuspecion;
    }

    public int getCantidadCambios() {
        return cantidadCambios;
    }

    public void setCantidadCambios(int cantidadCambios) {
        this.cantidadCambios = cantidadCambios;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }
    
    @Override
    public String getMarca(){
        return "pene";
    }
    
}
