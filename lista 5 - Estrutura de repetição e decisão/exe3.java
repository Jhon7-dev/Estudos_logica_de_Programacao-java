
import java.util.Scanner;


/*SOLICITAR QUANTOS NÚMEROS O USÚARIO DESEJA INFORMAR, RECEBER CADA UM DELES E MOSTRAR A MÉDIA ARITMÉTICA DOS VALORES POSITIVOS NO FINAL. */

public class exe3 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int a;
          int soma = 0;
          int p = 0;
          int positivo = 0;
           

          System.out.println("QUANTOS NÚMEROS VOCÊ DESEJA INFORMAR?");
          a = scn.nextInt();

          for ( int cont = 1; cont <= a; cont++){

               System.out.println("DIGITE" + cont + " NÚMERO");
               p = scn.nextInt();
               
               
               if (p > 0){
               soma = soma + p;
               positivo++;
               System.out.println("número positivo informado:" + p);
          }
     }

          if (positivo > 0){

               int mediapositivos = soma / positivo++;
               System.out.println("A MÉDIA ARITMÉTICA DOS NÚMEROS POSITIVOS É " + mediapositivos);

          }else {
               System.out.println("NÃO FORAM INFORMADOS NÚMEROS POSITIVOS");
               
          }

          







     }
}
