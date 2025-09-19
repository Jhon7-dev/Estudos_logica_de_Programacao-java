
import java.util.Scanner;

 

/*ESCREVA UM ALGORITMO QUE LEIA QUANTOS NÚMEROS INTEIROS O USUÁRIO QUISER
INFORMAR, E OS ARMAZENE EM UM VETOR. EM SEGUIDA, O PROGRAMA DEVE EXIBIR A
SOMA DOS NÚMEROS PARES E A SOMA DOS NÚMEROS ÍMPARES.
 */

 public class exercicio5 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);
          int pares = 0;
          int impares = 0;
          int p;
          int somapares = 0;
          int somaimpares = 0;

          System.out.println("quantos números você deseja digitar?");
          p=scn.nextInt();

          int [] numero = new int [p];
          
          for(int i = 0; i < numero.length; i++){
               System.out.println("DIGITE O " +   (i+1) + " NÚMERO ");
               numero[i]=scn.nextInt();

               if(numero[i] % 2  == 0){ 
                  
                    pares++;
                    somapares = somapares + numero[i];

               } else {

                    impares++;
                    somaimpares = somaimpares + numero[i];

               }             
          
          }System.out.println("OS NÚMEROS DIGITADOS FORAM");
           for (int i = 0; i < numero.length; i++){
               System.out.println(numero[i]);

          }

          System.out.println("A QUANTIDADE DE NÚMEROS PARES SÃO " + pares + " E A SOMA É " + somapares);
          System.out.println("A QUANTIDADE DE NÚMEROS ÍMPARES SÃO " + impares + " E A SOMA É " + somaimpares);
     } // FEITO!!!!!!!
 }

 