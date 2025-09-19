/*CADASTRO */

import java.util.Scanner;
 

public class exe35{
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);


         double peso;
         double pesolimite;
          int idade;

          int cont = 1 ;
          int c ;
          int i=1;
          char sx;
          int m=0;
          int f=0;
          System.out.println("QUANTAS PESSOAS VAMOS CADASTRAR?");
          c=scn.nextInt();
          System.out.println("QUAL SERÁ O PESO DE REFERÊNCIA?");
          pesolimite=scn.nextDouble();

          while(cont <= c ){
               
               System.out.println(" PESSOA " + cont + " de " + c);
               
               System.out.println("PESO:");
               peso=scn.nextDouble();
               System.out.println("SEXO:");
               sx=scn.next().charAt(0);
               cont++;
               m++;
               f++;
               

               if ( peso > pesolimite ){
                    
                    System.out.println("==== PESO ACIMA DO LIMITE ====");
                    
               }
                         
               if(peso < pesolimite){
                    
                    System.out.println("====PESO DENTRO DO LIMITE====");
               }  else if (peso == pesolimite){
                    System.out.println("===== LIMITE =====");

               }
               
          }

          System.out.println("AO TODO, TEMOS " + c + " PESSOAS ACIMA DO LIMITE DE " + pesolimite + " E DESSAS PESSOAS," + m + "SÃO HOMENS  E " + f + " SÃO MULHERES ");      
     }
}


               
                    
                    
