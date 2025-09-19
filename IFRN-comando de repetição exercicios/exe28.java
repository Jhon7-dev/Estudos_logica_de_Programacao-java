/*Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Enquanto
(While). */


public class exe28{

     public static void main(String[] args){

         int i = 1;
         int cont = 0;
         int soma = 0;
          int p = 15;
          
          while(i <= 15){
               
               
               soma = soma + i;
               
               i++;
               
          }
          
          System.out.println("\n A SOMA DOS NÚMEROS DE  1 A 15 É " + soma);      
     }
}