
import java.util.Scanner;
/*RECEBER NÚMEROS ENQUANTO O USUÁRIO QUISER DIGITÁ-LOS ( A CADA NÚMERO IFNORMADO PEÇA QUE O USUÁRIO DIGITE 1 SE QUISER INFORMAR MAIS UM NÚMERO OU 2 SE QUISER PARAR) NO FINAL EXIBIR O MAIOR NÚMERO E A MÉDIA ARITMÉTICA */

public class exe1{
     public static void main(String[] args) {
         
          Scanner scn = new Scanner ( System.in);

          int i = 1;

          int p;

          int media;

          int soma;

          int n ;

          Character opcao;


          System.out.println("QUANTOS NÚMEROS VOCÊ QUER DIGITAR?");
          p = scn.nextInt();

          do { 
               System.out.println("DIGITE O NÚMERO: ");

               n  = scn.nextInt();

               System.out.println("DESEJA CONTINUAR? [S/N]");

               opcao = scn.next().charAt( 0);

               n++;


               
               
            
              
          } while (n <= p);

          








     }
}    
