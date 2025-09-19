
import java.util.Scanner;

public class flag {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);
          int soma = 0;
          int idade = 0;

          while ( idade !=999){
               System.out.println("DIGITE A SUA IDADE: ");
               idade=scn.nextInt();
               if(idade !=999){

                    soma+=idade;
               }
          }
          System.out.println("A SOMA DE TODAS AS IDADES É " + soma);
          System.out.println("====== Programa Encerrado ======");










     }
     
}
