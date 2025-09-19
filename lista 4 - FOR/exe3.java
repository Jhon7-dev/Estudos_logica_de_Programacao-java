
import java.util.Scanner;

/*receber 5  numeros e infromar se cada um deles é neg,posi ou nulo */

public class exe3 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int i = 0;
          
          for ( int cont = 1; cont < 5; cont++){

               System.out.println("DIGITE UM NÚMERO");
               i = scn.nextInt();
               if(i==0){
                    
                    System.out.println("NULO!");
                    
               } if (i>0){
                    
                    System.out.println("POSITIVO!");
                    
               } else {
                    
                    System.out.println("NEGATIVO!");
                    
               }
        
          }

     }
}
