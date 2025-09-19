import java.util.Scanner;

 
/* RECEBER 10 NÚMEORo E MOSTAR O DOBRO DE CADA UM DELES */

public class exe1 {

          public static void main(String[] args) {

               Scanner scn = new Scanner(System.in);
               int i = 0;
               
               
               for (int cont = 1; cont <= 2; cont ++ ){
                    
                    
                    System.out.println("DIGITE UM NÚMERO");
                    i = scn.nextInt();
                    int dobro = 2 *i;

                    System.out.println("o dobro de " + i + " é " + dobro);
               }
               
          }
     
}