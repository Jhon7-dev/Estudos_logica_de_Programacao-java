
import java.util.Scanner;


//   FAZER UM PROGRAMA QUE LÊ UM VALOR INTEIRO  NEDEPOISNNÚMEROS INTEIROS. AO FINAL, MOSTRA A  SOMA DOS N NÚMEROS LIDOS


public class exe2 {
     
     public static void main(String[] args) {
         

          Scanner scn = new Scanner (System.in);

          System.out.println(" quantos números serão digitados? ");

          int n = 0; 

          n=scn.nextInt();



          int i = 0; // NUMEROS QUE ESTÃO SENDO DIGITADOS !!!

          int  cont = 0;

          int soma = 0;


         for ( i = 0 ; i < n ; i ++ ){  // TEM QUE SER < E NÃO <= A n SE NÃO VAI CONTAR UM A MAIS!!!!


          System.out.println(" digite um número : ");

          cont=scn.nextInt();

               soma = soma + cont ;

          }

              System.out.println("SOMA = " + soma); 

     }
}