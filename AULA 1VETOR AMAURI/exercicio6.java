
import java.util.Scanner;

/*Crie um algoritmo que leia 5 valores inteiros e os armazene em um
vetor. Em seguida, o programa deve encontrar e exibir o maior e o
menor valor presente no vetor. */

public class exercicio6 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int [] valor = new int[5];

          int maior = 0;
          int menor = 0;

          for (int i = 1; i < valor.length; i++){
               System.out.println("DIGITE O " + i + " NÚMERO ");
               valor[i]=scn.nextInt();
               
               if(valor[i] == 1){

                    maior = valor[i];
                    menor = valor[i];

               } else
                     if (valor[i] > maior){

                    maior = valor[i];

               } if (valor[i] < menor){

                   menor = valor[i];
               }
               
          }

               System.out.println(" O MAIOR NÚMERO DIGITADO FOI " + maior);
               System.out.println(" O MENOR NÚMERO DIGITADO FOI " + menor);
          
     }
}
// CONSERTAR O MENOR