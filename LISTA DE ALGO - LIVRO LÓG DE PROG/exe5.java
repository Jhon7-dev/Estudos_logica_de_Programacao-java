
import java.util.Scanner;

/* A SEQUÊNCIA DE FIBONACCI, ESCREVE UM ALGORITMO PARA GERAR ESTA SEQUÊNCIA ATÉ O "ENÉSIMO" TERMO FORNECIDO PELO USUÁRIO */ 

public class exe5 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int formula = 0;
          int num = 0;

          System.out.println("SEQUÊNCIA DE FIBONACCI\n");
          //System.out.println("\n============");
          System.out.println("DIGITE A POSIÇÃO DO NÚMERO QUE VOCÊ QUER");
          num = scn.nextInt();
          formula = (num - 1) + (num - 2);

          for ( int i = 1; i <= num; i ++){

                 formula = (num - 1) + ( num - 2);

               System.out.println(i + " ");
             
              
         

            
          }  

     }
}
