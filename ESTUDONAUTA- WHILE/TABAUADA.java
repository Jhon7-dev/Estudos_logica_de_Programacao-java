
import java.util.Scanner;



public class TABAUADA{

      public static void main (String []args){
          
          Scanner scn = new Scanner ( System.in );
          int p;
          System.out.println("\nDIGITE UM NÚMERO");
          p=scn.nextInt();

          int c = 10;
          
          int cont = 1;

         while ( cont <= 10) {
                        System.out.println( p + " x " +  cont + " = " + p*cont    );
              
              cont++;
               
          }
               System.out.println("\n FIM !");
     }
}
 