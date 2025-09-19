
import java.util.Scanner;

public class exercicio3 {
     public static void main(String[] args) {

        Scanner scn = new Scanner ( System.in);

          System.out.println("digite um número:");

          int c; 
          int soma=0;
          c=scn.nextInt();  
          
          for ( int i = 1 ; i <= c ; i++) {
              
        
               if   ( i % 2 == 0) { // ta correto 

                    soma  +=i; 
                    
               
           System.out.println("a soma dos números pares de 1 até " + c + " é : "  + soma );
                     

               }

          }


     }
}
