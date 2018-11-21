package clase7;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] numeros= new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese el numero de la posicion "+(i+1));
            int vagina= entrada.nextInt();
            numeros[i]=vagina;
            
        }
        for (int i=4; i>=0; i--) {
            System.out.println("["+numeros[i]+"]");
        }
    }
    
}
