/*RECEBER UM NÚMERO E INFOPRMAR SE É POSITIVO,NEGATIVO OU NULO */

import java.util.Scanner;

public class exe1{

     public static void main(String[] args) {
         
          int a = 0;

          Scanner scn = new Scanner(System.in);

          System.out.println("digite o número:");
          a = scn.nextInt();

          if (a > 0){

               System.out.println("POSITIVO");

          } if ( a < 0 ){

               System.out.println("NEGATIVO");

          }if  (a == 0){
               
               System.out.println("NULO!");
          }

     }
}