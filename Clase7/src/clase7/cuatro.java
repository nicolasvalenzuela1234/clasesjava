package clase7;

import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos");
        int var = entrada.nextInt();
        System.out.println("ingrese la cantidad de elementos");
        int var1 = entrada.nextInt();
        int[][] matriz=new int[var][var1];
        String linea="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                linea+= "*  ";
                
            }
            linea+="\n";
        }
        System.out.println(linea);
    }
    
}
