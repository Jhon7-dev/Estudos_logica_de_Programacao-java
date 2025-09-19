
import java.util.Scanner;



//CONTAGEM PERSONALIZADA.


 public class  exe29 {
     public static void main (  String [] args ){

          Scanner scn = new Scanner (System.in);



          System.out.println("WELCOME!");
          
          int a1,an,razao ;

          System.out.println("ONDE COMEÇA A CONTAGEM ?");
          a1=scn.nextInt();

          System.out.println("ONDE TERMINA A CONTAGEM?");
          an=scn.nextInt();

          System.out.println(" QUAL INCREMENTO?");
          razao=scn.nextInt();
 
         int  cont = a1;
          
          while ( cont <= an) {
               
               System.out.println("resultado é " + cont);
               
               cont += razao;               
               
          }
          
     }
}