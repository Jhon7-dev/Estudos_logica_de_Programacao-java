
/*ANALISADOR DE NUMEROS 
REPOSTA COM O TOTAL DE PARES E FALAR QUAL MENOR VALOR ÍMPAR
*/

import java.util.Scanner;

public class exe43 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner ( System.in);

          
          char resposta;
          int n = 1;
          int p = 0;
          int i = 0;
          int maior = 0;
          int menor = 0;
          int soma = 0;
          int cont = 1;

          
          do {
              
               System.out.println("DIGITE O " + n + " NÚMERO");
               cont = scn.nextInt();

               System.out.println("QUER CONTINUAR ?");
               resposta = scn.next(). charAt(0);

               n++;

               menor = i;
               maior = i;

              if ( cont % 2 == 0){
            
               p++;

              }if (cont != 0){
                   
                   i++;


              } else if (i < menor ) {

               menor = i;

          } else if (i > maior ){

               maior = i;
          }
               
          }while(resposta=='S'|| resposta == 's');

          System.out.println("AO TODO VOCÊ DIGITOU " + cont + "NÚMEROS");

          System.out.println("O TOTAL DOS DE NÚMEROS PARES SÃO " + p);

          System.out.println("O MENOR DOS ÍMAPARES É " + menor);

     }
     
}
