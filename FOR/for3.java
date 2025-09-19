
import java.util.Scanner;


/*QUERO SABER QUAIS NÚMEROS NÃO SÃO DIVISÍVEIS POR 7, EM UMA RANGE
INFORMADA PELO USUÁRIO, ATÉ QUE O PRIMEIRO DIVISÍVEL APAREÇA. A
CONDIÇÃO DE PARADA É ATINGIR O RANGE OU ACHAR UM NÚMERO DIVISÍVEL
POR 7.
 */


public class for3 {

     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);


          int i;
         
        //  i=scn.nextInt();

          int p;
          System.out.println("SOLICITE UM NÚMERO : ");
          p=scn.nextInt();

          int cont = 0;

          for(  i = 1 ;  i <= p; i++){
               
               if (i %7==0 ){
                    System.out.println(" o primeiro divisivel por 7 é " + i);
               
             break;
          }else{

               System.out.println( i + " não é divisivel por 7");
          }
               
                     

               
          }
     
     }
}