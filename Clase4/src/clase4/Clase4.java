package clase4;

import java.util.Scanner;

public class Clase4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("seleccione una opcion\n1. suma\n2. resta\n3. multiplicacion\n4. division");     
        int seleccion = entrada.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("ingrese el primer numero");
                int num1 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num2 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.suma(num1, num2));
            case 2:
                System.out.println("ingrese el primer numero");
                int num3 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num4 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.resta(num3, num4));
            case 3:
                System.out.println("ingrese el primer numero");
                int num5 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num6 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.multiplicacion(num5, num6));
            case 4:
                System.out.println("ingrese el primer numero");
                int num7 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num8 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.division(num7, num8));
        }
        
    }
}
