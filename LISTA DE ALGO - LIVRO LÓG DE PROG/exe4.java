
import java.util.Random;
import java.util.Scanner;


/* A PARTIR DE UM CONJ DE NÚMEROS INTEIROS SEQUENCIAIS, OBTIDOS COM BASE EM DADOS FORNECIDOS PELO USUÁRIO ( NÚMERO INCIAL E FINAL),INDENTIFIQUE E APRESENTE: A- A QUANTIDADE DE NÚMEROS INTEIROS E POSITIVOS
 * B- A QAUNTIDADE DE NÚMEROS ÍMPARES E PARES
 * C -  A QUANTIDADE DE NÚMEROS DIVISIVEIS POR 3 E 7
 * D - A MÉDIA PARA CADA UM DOS INTENS
 */
public class exe4 {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          Random random = new Random();

         
          int num1 = 0;
          int num2 = 0;
          int quantidade = 0;
          int par = 0;
          int impar = 0;
          int inteiro = 0;
          int numeroSorteado = 0;
          int divisivel = 0;

          //DIGITANDO O NÚMERO INCIAL E FINAL

          System.out.println("DIGITE O NÚMERO INICIAL:");
          num1 = scn.nextInt();

          System.out.println("DIGITE O NÚMERO FINAL");
          num2 = scn.nextInt();

           // PEDE QUANTOS NÚMEROS VOCÊ QUER SORTEAR

           System.out.print("Quantos números você deseja sortear? ");
           quantidade = scn.nextInt();

          // VERIFICA SE O NÚMERO INICIAL É MENOR QUE O FINAL

          if (num1>= num2){
               
               System.out.println("O número inicial deve ser menor que o número final.");
          } else {
                
          }
                System.out.println("Números sorteados:");
               for (int i = 0; i < quantidade; i++) {

                // Gera um número aleatório entre numeroInicial e numeroFinal

                numeroSorteado=random.nextInt(num2 - num1 + 1) + num1;

                System.out.print(numeroSorteado + " "); // Exibe o número sorteado

                if (numeroSorteado %2 == 0){

                    par++;

                }if (numeroSorteado % 2!= 0){

                    impar++;
               }

                 if(numeroSorteado %3 == 0 &&  numeroSorteado %7 == 0){

                    divisivel++;
               }

        
               }  
               System.out.println("\n=====");
               System.out.println("OS NÚMEROS PARES FORAM:" + par);
               System.out.println("OS NÚMEROS ÍMPARES FORAM:" + impar);
               System.out.println("OS DIVISÍVEIS POR 3 E 7:" + divisivel);
     } 
}
