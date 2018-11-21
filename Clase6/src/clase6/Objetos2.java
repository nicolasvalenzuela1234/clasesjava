package clase6;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import models.Profesor;
import models.Estudiante;

public class Objetos2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Estudiante alumno;
        Profesor profe;
        int seleccion;
        
        do{
        System.out.println("...MENU...\n1. ingresar alumno\n2. ingresar profesor\n3. ingresar nota.\n4. calcular promedio\n0. salir");
        seleccion = entrada.nextInt();
        switch (seleccion){
                case 1:
                    System.out.println("Ingrese id");
                    int id = entrada.nextInt();
                    System.out.println("ingrese nombre");
                    String nombre = entrada.nextLine();
                    System.out.println("ingrese apellido");
                    String apellido = entrada.nextLine();
                    System.out.println("defina su genero");
                    String sexo = entrada.nextLine();
                    System.out.println("direccion");
                    String direccion = entrada.nextLine();
                    System.out.println("dame tu numero bb");
                    String tefono = entrada.nextLine();
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                 
}
        TimeUnit.SECONDS.sleep(2);
        
        }while(seleccion!=0);
        

    }
}