/*ESCREVA UM ALGORITMO QUE LEIA 5 NÚMEROS DO USUÁRIO E EXIBA QUANTOS NÚMEROS SÃO PARES. */

import java.util.Scanner;

public class exe33 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);

          int i=1;
          int cont = 0;
          int par = 0 ;


          do {
               cont ++;
               System.out.println("DIGITE O " + cont + " NÚMERO ");
               i=scn.nextInt();
               
               if (i % 2==0){
                    par++;
               }
               
          }while(cont < 5);
               System.out.println(" DOS 5 NÚMEROS CITADOS " + par + " SÃO PARES");
          }
     }
