package funciones;

import clase4.metodos;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class menu {
    public void menu() throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        int seleccion = 0;
        do{
        System.out.println(":: MENU ::\n1. suma\n2. resta\n3. multiplicacion\n4. division\n5. resto\n0. salir\nSeleccione una opcion:");
        seleccion = entrada.nextInt();
        switch (seleccion){
            case 1:
                System.out.println(":: SUMA ::\ningrese el primer numero");
                int num1 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num2 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.suma(num1, num2));
                break;
            case 2:
                System.out.println(":: RESTA ::\ningrese el primer numero");
                int num3 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num4 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.resta(num3, num4));
                break;
            case 3:
                System.out.println(":: MULTIPLICACION ::\ningrese el primer numero");
                int num5 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num6 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.multiplicacion(num5, num6));
                break;
            case 4:
                System.out.println(":: DIVISION ::\ningrese el primer numero");
                int num7 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num8 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.division(num7, num8));
                break;
            case 5:
                System.out.println(":: RESTO ::\ningrese el primer numero");
                int num9 = entrada.nextInt();
                System.out.println("ingrese el segundo numero");
                int num10 = entrada.nextInt();
                System.out.println("el resultado es :"+metodos.division(num9, num10));
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                break;
       }
        TimeUnit.SECONDS.sleep(3);
        respuesta = consulta();
        }while (respuesta.equals("no"));
    }
    public static String consulta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("salir? (si/no)");
        return entrada.nextLine();
        
    }
}

