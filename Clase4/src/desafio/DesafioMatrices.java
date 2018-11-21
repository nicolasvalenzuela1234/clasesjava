
package desafio;

import java.util.Scanner;


public class DesafioMatrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el largo de la matriz");
        int num1 = entrada.nextInt();
        
        int[][] matriz1 = new int [num1][num1];
        int cont=1;
        String linea="";
        int fin=matriz1.length-1;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (j==fin) {
                    matriz1[i][j]=cont;
                    cont++;
                    fin--;                    
                }
                linea+="["+matriz1[i][j]+"]";
            }
            linea+="\n";
        }
        System.out.println(linea);
        
        
    }
}
