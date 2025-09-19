import java.util.Scanner;

/*ELABORE UM ALGORITMO QUE SOLICITE UM NÚMERO N AO USUÁRIO E CALCULE
A SOMA DOS NÚMEROS PARES DE 1 ATÉ N. */


public class for6 {


     public static void main(String[] args) {
         
          Scanner scn = new Scanner ( System.in);

          int i = 1; 
          
          int n ;
          
          System.out.println("DIGITE O VALOR : ");
          n=scn.nextInt();

 
          int soma = 0;

          int cont;

          for (  cont = 1; cont <= n; cont++){

               if(cont%2==0){
                    soma=soma+cont;

                  
               }
               soma+=cont;
          }


                }
               
          }

