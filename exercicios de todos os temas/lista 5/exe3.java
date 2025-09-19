
import java.util.Scanner;

/*SOLICITAR QUANTOS NÚMEROS O USÚARIO DESEJA INFORMAR, RECEBER CADA UM DELES E MOSTRAR A MÉDIA ARTIMÉTICA DOS VALORES POSITIVOS NO FINAL. */

public class exe3 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);
          
          int numero;
          int p;
          int media = 0;
          int soma = 0;

          System.out.println("QUANTOS NÚMEROS VOCÊ DESEJA?");
          p = scn.nextInt();

          for(int i = 1; i <= p;i++){

               System.out.println("DIGITE O " + i + " NÚMERO ");
               numero = scn.nextInt();
               soma = soma + numero;
          } for(int i = 1;  i <= p; i++ ){
               
               System.out.println();
          }
          media = (soma)/p;
          System.out.println("A MÉDIA DOS " + p + " DIGITADOS É " + media );
          System.out.println("Os números digitados foram:");
     }
}
