package clase7;


import java.util.concurrent.TimeUnit;

public class tres {
    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 1; i < 11; i++) {
            System.out.println("La tabla del "+i);
            for (int j = 0; j < 13; j++) {
                System.out.println(i+"x"+j+"="+(i*j));
            }
            TimeUnit.SECONDS.sleep(2);
        }
    }
    
}
