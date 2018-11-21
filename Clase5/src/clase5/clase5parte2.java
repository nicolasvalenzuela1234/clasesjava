package clase5;
import java.util.Scanner;
import models.Dragon;
public class clase5parte2 {
    public static void main(String[] args) {
        //declara un objeto e instanciarlo con argumentos
        Dragon elDragon = new Dragon("","",0,0,"","");
        Scanner entrada = new Scanner(System.in);
        String num1 = entrada.nextLine();
        elDragon.setNombre(num1);
        elDragon.setColor("Amarillo");
        System.out.println(elDragon.getNombre());
        System.out.println(elDragon.getColor());
    }
    
}
