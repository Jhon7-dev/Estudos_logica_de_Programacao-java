
import java.util.Scanner;

public class algoz2 {
     public static void main (  String [] args ){

          Scanner scn = new Scanner (System.in);

          int s = 0;

          int c = 1;

          int n = 0;


          while(c <= 4){

               System.out.println("DIGITE UM NÚMERO : ");
                
               n=scn.nextInt();

               s = s + n;

               c = c + 1;

          }
     System.out.println("A SOMA FOI DE " + s);               


               
               
     }
}
