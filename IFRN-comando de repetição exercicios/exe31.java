
/*ESCREVA UM ALGORITMO QUE LEIA 10 NÚMEROS DO USUÁRIO E CALCULE A SOMA DESSES NÚMEROS. UTILIZE O COMANDO DE
REPETIÇÃO ENQUANTO (WHILE) */

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class exe31 {
     
     public static void main(String[] args) {
     
          int i = 1;
          int cont = 0;
          int soma = 0;
          

          Scanner scn = new Scanner (System.in);
          System.out.println("\nDIGITE 10 NÚMEROS");

          while(cont < 10){
               
               cont++;
               
               System.out.println("\nDIGITE UM NÚMERO");

               i=scn.nextInt();

                i++;
                
               soma = soma + i;
               
          }
               System.out.println("A SOMA DOS NÚMEROS DIGITADOS SÃO " + soma);

     }
     
}
