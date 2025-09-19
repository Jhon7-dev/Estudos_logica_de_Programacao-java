
import java.util.Scanner;

/*ESCREVA UM ALGORITMO QUE SOLICITE AO USUÁRIO QUE INSIRA 5 NÚMEROS INTEIROS E
ARMAZENE ESSES NÚMEROS EM UM VETOR. EM SEGUIDA, O PROGRAMA DEVE EXIBIR A
MÉDIA DOS NÚMEROS INSERIDOS. */


public class exercicio1 {
     
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

        
          int [] numero = new int [5];
          int soma = 0;
          int media = 0;
          int cont = 0;


          
          
          for (int i = 0; i < numero.length; i++){ 
               
               System.out.println("DIGITE UM NÚMERO");
               numero[i]  = scn.nextInt();


               soma = soma + numero[i];

               cont = numero[i];
               
               media = media + soma;  
               
          } for ( int i = 0; i < numero.length; i++){
               
               System.out.println( numero[i]);
               
          }
          
          
          System.out.println("A MÉDIA É " + media / numero.length );
          
     }
}              /*FEITO!!! */
          
 