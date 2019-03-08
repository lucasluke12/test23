
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        System.out.println("N: ");
        int n = t.nextInt();
        
        int[][] matriz = new int[n][n];
        for(int i=0; i<n; i++){
            for(int ii=0; ii<n; ii++){
                matriz[i][ii] = t.nextInt();
            }
        }
        int negativo = 0;
        for(int i=0; i<n; i++){
            
                System.out.print(matriz[i][i]+", ");
                
                
            
        }
      
        for(int i=0;i<n;i++){
            for(int ii=0;ii<n;ii++){
                if(matriz[i][ii] < 0){
                    negativo++;
                }
            }
        }
        System.out.println("");
        System.out.println("Negativos1 "+negativo);
        
        t.close();
}
    
}
