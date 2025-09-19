
import java.util.Scanner;

//  OBETER "N" NÚMEROS FORNECIDOS PELO USUÁRIO,CALCULAR E EXIBIR A MÉDIA.

public class facto {
     public static void main(String[] args) {
          
          
          Scanner scn = new Scanner(System.in);


          
          
          int soma,num,cont,media;

          soma = 0;

          cont = 0;

          while(cont < 3){
          
               System.out.println("DIGITE UM NÚMERO:");
               num=scn.nextInt();

               soma = soma + num;

               cont = cont + 1 ;
          }
          media = soma / cont;
         
          System.out.println("MÉDIA = " + media);     
     }
     
}


 