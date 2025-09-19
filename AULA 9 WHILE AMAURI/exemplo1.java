
import java.util.Scanner;

public class exemplo1 {
     public static void main(String[] args) {
        
          Scanner scn = new Scanner( System.in); 

          int x,y,z;

          System.out.println("DIGITE UM NÚMERO");

          x=scn.nextInt();

          System.out.println("DIGITE OUTRO NÚMERO");

          y=scn.nextInt();

          z=0;


          while (x <= y ) {
               System.out.println("a soma é " + z );
               z = y + x;
            

          } if( x < 0 && y < 0 ){
           
               System.out.println("PAROU!");
                
              
          }  

     }
}