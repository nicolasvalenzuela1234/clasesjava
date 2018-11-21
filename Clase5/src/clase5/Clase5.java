package clase5;
import models.Computador;
public class Clase5 {
    public static void main(String[] args) {
        //declarar el objeto e instanciarlo
        Computador miCompu=new Computador();
        miCompu.id=1;
        miCompu.marca="apple";
        miCompu.modelo="mackbook";
        miCompu.procesador="i5";
        miCompu.cantMemoria=8;
        miCompu.disco=500;
        miCompu.pantalla=13.3;
        
        //declaracion del segundo objeto
        Computador tuCompu = new Computador();
        tuCompu.id=3;
        tuCompu.marca="Asus";
        tuCompu.modelo="NomeAcuerdo";
        tuCompu.procesador="i7";
        tuCompu.cantMemoria=16;
        tuCompu.disco=500;
        tuCompu.pantalla=15.5;
        
        //declarar un objeto e instanciarlo con argumentos
        Computador elCompu = new Computador(5,"lenovo","thinkpad");
        System.out.println(elCompu.id);
        System.out.println(elCompu.marca);
        System.out.println(elCompu.modelo);
        
        Computador suCompu = new Computador("dell","inspiron",13.3);
        System.out.println(suCompu.marca);
        System.out.println(suCompu.modelo);
        System.out.println(suCompu.pantalla);
        
        Computador compu1 = new Computador(7,"hp","pavilion","i7",12,1024,15.1);
        System.out.println(compu1.id);
        System.out.println(compu1.marca);
        System.out.println(compu1.modelo);
        System.out.println(compu1.procesador);
        System.out.println(compu1.cantMemoria);
        System.out.println(compu1.disco);
        System.out.println(compu1.pantalla);
    }
    
}