
import java.util.Scanner;


/*ESCREVE UM PROGRAMA QUE REPITA A LEITURA DE UMA SENHA ATÉ QUE ELA SEJA VÁLIDA. PARA CADA LEITURA DE SENHA INCORRETA INFORMADA , ESCREVER A MENSAGEM "SENHA INVÁLIDA!TENTE NOVAMENTE". QUANDO A SENHA FOR INFORAMADA CORRETAMENTE DEVE SER IMPRESSA A MENSAGEM "ACESSO PERMITIDO" E O ALGORITMO ENCERRADO. SENHA CORRETA É 27080300 */

public class exe4 {
     /**
      * @param args
      */
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int i ;
          int senha = 27080300;

         

          do {
               System.out.println("DIGITE A SENHA:");
               i = scn.nextInt();
               
               if (i == senha){
                    System.out.println("ACESSO PERMITIDO!");
               }
               else  {
                    System.out.println("ACESSO NEGADO!");
               } 
          } while( i != senha );   
          
         
     }          
}


        
                                                            
 
               
