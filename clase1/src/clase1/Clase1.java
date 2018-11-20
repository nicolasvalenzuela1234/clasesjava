package clase1;
public class Clase1 {
    public static void main(String[] args) {  
        //tipo de dato numerico
        byte num1;
        short num2;
        int num3;
        long num4;
        //tipo de dato decimal
        double decimal1;
        float decimal2;
        //tipo de dato caracter
        char caracter1;
        //tipo de dato booleano
        boolean decision;
        
        //inicializacion de variables
        int n1 = 5;
        int n2 = 10, n3 = 15;
        
        double d1 = 13.56;
        
        char char1 = 'a', char2 ='b';
        
        boolean verdad = true;
        boolean si = true, no = false;
        
        //reasignar una variable
        String perro = "firulais";
        System.out.println(perro);
        perro = "pichula";
        System.out.println(perro);
        
        //concatenar y guardar en la misma variable
        String oracion = "habia una vez";
        oracion = oracion + " truz";
        System.out.println(oracion);
        
        String oracion2 = "habia una vez";
        oracion2 += " un pequeño manati";
        System.out.println(oracion2);
        
        //metodo length
        String cuento="habia una vez un ornitorrinco en zancos";
        System.out.println(cuento.length());
        int cantidadCaracteres= cuento.length();
        System.out.println(cantidadCaracteres);
        
   
        
        //metodo upper and lower case
        String cuento4="una legion de ardillas ninjas";
        cuento4=cuento4.toUpperCase();
        System.out.println(cuento4);
        System.out.println(cuento4.toLowerCase());
        
        
        //metodo charAt
        String juego = "World of warcraft";
        System.out.println(juego.charAt(0));     
    
        
        //operadores aritmeticos
        int nul1=4, nul2=2, nul3=1;
        double do1=35.8, do2=254.52431;
            //suma
            System.out.println(nul1+nul2);
            System.out.println(nul1+nul3);
            System.out.println(do1+nul2);
            double res= nul1+nul2;
            System.out.println(res);
            
            
            
            //mod
            System.out.println(nul1%nul2 == 0);
            System.out.println(nul1%nul3 == 0);
            System.out.println(do1%nul2 == 0);
            
        
    }
}
