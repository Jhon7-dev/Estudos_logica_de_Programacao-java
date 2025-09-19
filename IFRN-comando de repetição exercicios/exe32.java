
/*ESCREVA UM ALGORITMO QUE LEIA O NOME E A IDADE DE 10 PESSOAS E EXIBA: O NOME E A IDADE DA PESSOA MAIS
NOVA */

import java.util.Scanner;

public class exe32 {
     public static void main(String[] args) {
          
          Scanner snc = new Scanner (System.in);

          int idade;

          int maisnova;
          int maisvelha;
          int cont = 1 ;


          String nome ;
           
          System.out.println("DIGITE SUA IDADE ");
          idade = snc.nextInt();

          System.out.println("DIGITE SEU NOME ");
          nome = snc.nextLine();
          

    for(cont = 1;cont <= 10;cont++){
          
          System.out.println("DIGITE SUA IDADE ");
          idade = snc.nextInt();

          System.out.println("DIGITE SEU NOME ");
          nome = snc.nextLine();
          
     }
           









     }     
}
