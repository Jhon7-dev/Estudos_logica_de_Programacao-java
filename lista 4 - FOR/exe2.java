
import java.util.Scanner;

/* RECEBER UM NÚMERO E MOSTRAR SUA TABUADA DO 1 AO 10 */

public class exe2 {
     
     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);
          
          int i = 0 ; 
          int p = 10;
          int cont = 1;

          System.out.println("DIGITE O NÚMERO");
          i = scn.nextInt();

          for(cont = 1; cont <= p; cont ++){

               System.out.println(i + " x " + cont + " = " + i * cont);
               
          }
               System.out.println("FIM!");
      }
 }







