
import java.util.Scanner;

/*SOLICITAR QUANTOS NÚMEROS O USÚARIO DESEJA INFORMAR, RECEBER CADA UM DELES E MOSTRAR A MÉDIA ARITMÉTICA NO FINAL. */

public class exe1{
     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);

          int i;
          int p ;
          int soma = 0;
          int media;
          int cont = 1;

          System.out.println("DIGITE QUANTOS NÚMEROS VOCÊ QUER DIGITAR");
          i = scn.nextInt();  

          do {

               System.out.println("DIGITE UM NÚMERO");
               p = scn.nextInt();
               
               cont ++; // A VARIÁVEL CONT TEM A FUNÇÃO DE CONTAR AS INTERAÇÕES DO BLOCO 

               soma = soma + p; // A VARIÁVEL SOMA TEM A FUNÇÃO DE ACUMULAR TODOS OS VALORES DIGITADOS DE "P"

          }while(cont <= i);
                
          media = soma / i;

          System.out.println(" A MÉDIA NO FINAL É " + media );
           






     }
}