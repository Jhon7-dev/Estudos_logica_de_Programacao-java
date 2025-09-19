
import java.util.Scanner;

/*RECEBER 5 NUMEROS E AO FINAL INFORMAR QUANTOS SÃO POSITIVOS E QAUNTOS SÃO NEGATIVOS */

public class exe2 {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

          int a = 4 ;
          int cont = 1;
          int i = 1;
          int positivo = 0 ;
          int negativo = 0 ;


          while(cont <= a){

               System.out.println("DIGITE O NÚMERO DESEJADO");
               i = scn.nextInt();
               cont ++;
               
          }  if (i > 0){
                
               positivo++;

          } else if ( i < 0 ){

               negativo++;
               
          }

               System.out.println(" OS NÚMEROS POSITIVOS AO TOTAL FORAM " + positivo++ );

               System.out.println(" OS NÚMEROS NEGATIVOS AO TOTAL FORAM " + negativo++);

     }
}
