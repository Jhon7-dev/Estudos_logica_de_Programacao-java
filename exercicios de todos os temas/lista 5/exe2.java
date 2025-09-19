
import java.util.Scanner;

/*RECEBER 10 NÚMEROS E, AO FINAL, INFORMAR QUANTOS SÃO POSITIVOS E QUANTOS SÃO NEGATIVOS */

public class exe2 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int numero = 0;
         int positivo = 0;
         int negativo = 0;
         for(int i = 1; i <= 4; i++){

          System.out.println("DIGITE O " + i + " NÚMERO");
          numero = scn.nextInt();
          if(numero > 0){
               
               positivo++;
               
          }else if (numero < 0) {
               
               negativo++;
           }
     }
       
      System.out.println("OS NÚMEROS POSITIVOS FORAM:"+ positivo);
      System.out.println("OS NÚMEROS NEGATIVOS FORAM:" + negativo);
   

     }
 }
 