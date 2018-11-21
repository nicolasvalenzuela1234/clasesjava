
package clase7;

import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);        
        int pene;
        int poto =(int)Math.floor(Math.random()*100);        
        
        System.out.println("ADIVINA EL NUMERO\nIngrese un numero entre 0 y 100");
        pene=entrada.nextInt();
        while(poto!=pene){
            if (pene<poto) {
                System.out.println("Ingresa un numero mayor que "+pene);                
            }else
                System.out.println("Ingrese un numero menor que "+pene);
                pene=entrada.nextInt();
        }
        System.out.println("FELICIDADES");
        
        
    }
    
}
