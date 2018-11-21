package clase7;
public class Cnco {
    public static void main(String[] args) {
        String linea ="";
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            if (i==3) {
                                linea+="("+"E"+"-";
                                
                            }else{
                                linea+="("+i+"-";
                            }
                                
                            if (j==3) {
                                linea+="E"+"-";
                            }else{
                                linea+=j+"-";
                            }
                            if (k==3){
                                linea+="E"+"-";
                            }else{
                                linea+=k+"-";
                            }
                            if (l==3){ 
                                linea+="E"+"-";
                            }else{
                                linea+=l+"-";
                            }
                            if (m==3){  
                                linea+="E"+")";
                            }else{
                                linea+=m+")";
                            
                                
                            }
                        System.out.println(linea);
                        linea= "";
                    }
                    
                }
                
            }
            }
    }
}    
            
        
    
    

