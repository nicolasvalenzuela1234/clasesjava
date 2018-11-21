package clase6;
import models.Bicicleta;
import models.MountainBike;
import models.Pistera;
public class Clase6 {
    public static void main(String[] args) {
        
        Pistera pistera= new Pistera("liso","fijo","cuerno de toro","mango","modelo",2.0,"naranja",18);
        MountainBike mountainBike= new MountainBike(12,23,"fdasdf","efwe","pico","modelo",2.0,"naranja",18);
        System.out.println(pistera.getMarca());
        System.out.println(mountainBike.getMarca());
    }    
}