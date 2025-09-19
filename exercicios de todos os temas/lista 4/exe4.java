
import java.util.Scanner;


/*RECEBER TRÊS NÚMEROS E DIZER SE EXISTE ALGUM NÚMERO REPETIDO ENTRE ELES. EM CASO AFIRMATIVO, MOSTRE QUAL O NÚMERO */

public class exe4 {

     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);


          int a,b,c;

          System.out.println("DIGITE O PRIMEIRO NÚMERO");
          a = scn.nextInt();

          System.out.println("DIGITE O SEGUNDO NÚMERO");
          b = scn.nextInt();

          System.out.println("DIGITE O TERCEIRO NÚMERO");
          c = scn.nextInt();

          if (a == b || a == c    ){

               System.out.println(" O NÚMERO " + a +  " REPETIU ");

          } if( b == a || b == c){

               System.out.println(" O NÚMERO " + b + " REPETIU ");

          } if  (c==a || c==b){

               System.out.println(" O NÚMERO " + c + " REPETIU ");

          }

     }
     
}
