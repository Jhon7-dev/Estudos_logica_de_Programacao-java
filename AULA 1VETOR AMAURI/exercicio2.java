
import java.util.Arrays;
import java.util.Scanner;

/*FAÇA UM ALGORITMO QUE LEIA 10 NÚMEROS INTEIROS E ARMAZENE-OS EM UM VETOR. EM
SEGUIDA, O PROGRAMA DEVE ORDENAR O VETOR EM ORDEM CRESCENTE E EXIBIR O
RESULTADO. */
public class exercicio2 {
     public static void main(String[] args) {
         

          
          Scanner scn = new Scanner(System.in);
          
          int [] n = new int [5];
          

          for (int i = 0; i < n.length; i++){

               System.out.println("DIGITE O " + (i + 1)+ " NÚMERO");
               n[i] = scn.nextInt();
               

                
          }

                Arrays.sort(n);

               System.out.println("OS NÚMEROS DIGITADOS FORAM:");
               for(int i = 0; i < n.length ;i++ ){

                    System.out.println(n[i]);

           }
     }
}                /*FEITO!!! */