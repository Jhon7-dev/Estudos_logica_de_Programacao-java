import java.util.Scanner;

/*receber 5 número e informar qual é o maior e o menor deles */

public class exe4{

     public static void main (String [] args){
     
     Scanner scn = new Scanner (System.in);

          int maior = 0;
          int menor = 0;
          int a;

          for ( int cont = 1; cont <= 5; cont ++){

               System.out.println("DIGITE O " + cont + " NÚMERO");
               a = scn.nextInt();

               if ( a == 0){

                    maior = 0;
                    menor = 0;

               } if (a > maior){

                    maior = a;

               } else {
                    
                    menor = a;
               } 

          }

          System.out.println("o maior número é " + maior );
          System.out.println("o menor número é " + menor);
     }
}