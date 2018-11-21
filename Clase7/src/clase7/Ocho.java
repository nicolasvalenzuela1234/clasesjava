package clase7;

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length-2; i++) {
            System.out.println("ingrese el numero de la posicion "+(i+1));
            int sapo= entrada.nextInt();
            numeros[i]=sapo;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("("+numeros[i]+")");
        }
    }
    
}
