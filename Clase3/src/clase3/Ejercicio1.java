package clase3;
public class Ejercicio1 {
    public static void main(String[] args) {
        int [] numeros=new int[100];
        int acum=0;
        
        for (int i = 0; i < numeros.length; i++) {
        numeros[i]=i+1;
        acum+=numeros[i];
        }
        
        System.out.println("el total es "+acum);
        System.out.println("la media es "+(acum/numeros.length));
    }
    
}
