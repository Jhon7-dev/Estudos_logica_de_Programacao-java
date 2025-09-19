
import java.util.Scanner;

/* ESCREVA UM ALG QUE CALCULE E EXIBA A TABUADA, ATÉ UM  DETERMINADO NÚMERO "N", FORNECIDO PELO USUÁRIO, LEMBRANDO QUE, SE O NÚMERO FORNECIDO É 4, DEVE SER GERADA A TABUADA DO 1,2,3,4...*/

     public class exe3{  
          public static void main(String[] args) {
               
               Scanner scn = new Scanner (System.in);

               int p = 0;
               int z = 0;
               
               System.out.println("DIGITE O NÚMERO DA TABUADA INICIAL:");
               p=scn.nextInt();
          
               for ( int i = 1; i <= p; i++){

                    System.out.println(" TABUADA DO " + i + ":");

                          for(int j = 0; j <= 10; j++){
                   
                              System.out.println(i + "x" + j + "=" + (i*j));

                    }
               }
          }
     }