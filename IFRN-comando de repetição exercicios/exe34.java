/*Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 e o
número informado pelo usuário */
import java.util.Scanner;

public class exe34 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner ( System.in);

          int n = 0;

          int i = 0;
          
          int cont = 0;

          System.out.println("ESCOLHA UM NÚMERO ? ");
          n = scn.nextInt();

          for ( cont = 2; cont <= n; cont++){

               
               if (cont != 0 ){
                    
                    i++;
                    
               }

               
               System.out.println(i++);

          }
     }
}