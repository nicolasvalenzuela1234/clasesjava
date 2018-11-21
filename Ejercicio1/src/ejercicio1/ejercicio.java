package ejercicio1;
import models.Estudiantes;
import models.Profesor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ejercicio {
    public static void main(String[] args) throws InterruptedException {
        Estudiantes alumno = new Estudiantes (10001,null,"","","","","");
        Profesor profe =new Profesor("",0,"","","","","");
        int[] notas = new int[6];
        int seleccion;
        Scanner entrada = new Scanner (System.in);
        do{
        System.out.println("...MENU...\n1. Ingresar alumno\n2. Ingresar profesor\n3. Menu notas\n4. Menu promedio\n0. Salir");
        seleccion = entrada.nextInt();
        
        switch(seleccion){
            //(variable)1 corresponde a alumno
                case 1:
                    System.out.println("Ingrese Nombre");
                    String nombre1 = entrada.nextLine();
                    entrada.skip("\n");
                    System.out.println("Ingrese apellido");
                    String apellido1 = entrada.nextLine();
                    entrada.skip("\n");
                    System.out.println("Ingrese Genero");
                    String genero1 = entrada.nextLine();
                    entrada.skip("\n");
                    System.out.println("Ingrese direccion");
                    String direccion1 = entrada.nextLine();
                    entrada.skip("\n");
                    System.out.println("Ingrese telefono");
                    String telefono1 = entrada.nextLine();
                    entrada.skip("\n");  
                    alumno.setApellido(apellido1);
                    alumno.setNombre(nombre1);
                    alumno.setGenero(genero1);
                    alumno.setDireccion(direccion1);
                    alumno.setTelefono(telefono1);
                    
                    break;
                case 2:
                    System.out.println("Ingrese Asignatura");
                    String asignatura = entrada.nextLine();
                    
                    System.out.println("Ingrese Sueldo");
                    int sueldo = Integer.parseInt(entrada.nextLine());
                    
                    System.out.println("Ingrese Nombre");
                    String nombre = entrada.nextLine();
                    
                    System.out.println("Ingrese apellido");
                    String apellido = entrada.nextLine();
                    
                    System.out.println("Ingrese Genero");
                    String genero = entrada.nextLine();
                    
                    System.out.println("Ingrese direccion");
                    String direccion = entrada.nextLine();
                    
                    System.out.println("Ingrese telefono");
                    String telefono = entrada.nextLine();
                    
                    profe.setAsignatura(asignatura);
                    profe.setSueldo(sueldo);
                    profe.setNombre(nombre);
                    profe.setApellido(apellido);
                    profe.setGenero(genero);
                    profe.setDireccion(direccion);
                    profe.setTelefono(telefono);
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
        }
        TimeUnit.SECONDS.sleep(2);
        }while(seleccion!=0);
    }    
}