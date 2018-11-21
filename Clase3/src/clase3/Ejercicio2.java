package clase3;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        int acum=0;
        System.out.println("ingrese la cardinalidad del conjunto");
        int cant = entrada.nextInt();
        int [] numeros=new int[cant];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)Math.floor(Math.random()*9);
            System.out.println(numeros[i]+" ");
            acum=acum+numeros[i];            
        }
        System.out.println("el total es "+acum);
    }
    
}
