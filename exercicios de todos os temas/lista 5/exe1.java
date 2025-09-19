
import java.util.Scanner;

 
/* RECEBER 10 NÚMEORo E MOSTAR O DOBRO DE CADA UM DELES */

public class exe1 {

          public static void main(String[] args) {

               Scanner scn = new Scanner(System.in);
               int i = 0;
               int dobro = 0;

               for (int cont = 1;cont <= 10; cont ++ ){

                    dobro = 2 * i;

                    System.out.println("DIGITE UM NÚMERO");
                    i = scn.nextInt();
                    System.out.println("O DOBRO É " + dobro);

               }




          }
     
}
