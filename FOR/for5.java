
import java.util.Scanner;



/*DESENVOLVA UM ALGORITMO QUE IMPRIMA A TABUADA DE UM NÚMERO
FORNECIDO PELO USUÁRIO, INDO DE 1 A 10. */

public class for5 {

     public static void main(String[] args) {
         

          Scanner scn = new Scanner(System.in);


          int n ;
          System.out.println("DIGITE UM NÚMERO ");
         
          n=scn.nextInt();


          int i =10 ; 

          int produto = n * i;

        
       
          for ( i=1; i<=10;   ){
             
               
               System.out.println( i + " x " + n + " = " + produto);
               
               
               
               
          }
     }
}
