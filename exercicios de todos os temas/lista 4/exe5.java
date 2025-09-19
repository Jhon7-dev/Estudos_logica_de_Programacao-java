
import java.util.Scanner;

/*RECEBER TRÊS NÚMEROS E MOSTRAR QUAL MAIOR ENTRE ELES  */

public class exe5 {
     
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int a = 0;
          int maior = 0;
          int menor = 0;
          int cont  = 0;

         while(cont < 3 ){

          cont++;
               
               System.out.println("DIGITE O " + cont + " NÚMERO");{
               a = scn.nextInt();

          }
               if ( a == 1 ){

                    maior = a;
                    menor = a;
               } else {
                    
                    if ( a < menor){
                          
                         menor = a;

                    }

                    if ( a > maior ){

                         maior = a;

                    }
               }
               
          }
          
          
          System.out.println(" O MAIOR NÚMERO É " + maior);
         

     }
     
}
