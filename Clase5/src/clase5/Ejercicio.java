package clase5;
import java.text.ParseException;
import models.Libros;
import models.Persona;
import models.Prestamo;
import java.util.Date;
public class Ejercicio {
    public static void main(String[] args) throws ParseException {
        Libros miLibro = new Libros (1,"luna de pluton","dross",true,"en tu poto","historia");
        Prestamo miPrestamo = new Prestamo (1,1,"4018-12-12",3);
        Persona miPersona = new Persona ("Marcos","tu mama a poto pelao",31312312);
        
        
    }
    
}
