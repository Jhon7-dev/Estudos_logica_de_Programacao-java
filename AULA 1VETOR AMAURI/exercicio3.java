
import java.util.Arrays;
import java.util.Scanner;

/*CRIE UM ALGORITMO QUE LEIA 10 NOMES DE PESSOAS E OS ARMAZENE EM UM VETOR. EM
SEGUIDA, O PROGRAMA DEVE EXIBIR ESSES NOMES EM ORDEM INVERSA, OU SEJA, DO
ÚLTIMO AO PRIMEIRO.*/

public class exercicio3 {

     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);
          
          String [] nome = new String[4];

          for(int i = 0; i < nome.length; i++){

               System.out.println("DIGITE O NOME:");          
               nome[i] = scn.nextLine();
          }

               Arrays.sort(nome);
           
          for (int i = 0; i < nome.length; i++ ){
               System.out.println();
               System.out.println(nome[i]);

          }
                              // FEITO!!!
   }
}
 