package clase3;

public class Clase3 {  
    public static void main(String[] args) {
     
        //
        int [][] matriz1 = {{1,2,3},{3,4,5}};
        String [][] matriz2 ={
            {"jose","pedro","juan"},
            {"judas","mateo","lucas"},
            {"felipe","santiago","matias"}
        };
        for(int i = 0; i < matriz2.length; i++) {
            String linea="";
            for (int j = 0; j < matriz2[i].length; j++) {
                linea+="["+matriz2[i][j]+"]";
            }
            System.out.println(linea);
            
        }
    }    
}
