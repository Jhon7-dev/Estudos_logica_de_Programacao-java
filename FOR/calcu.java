
import java.util.Scanner;

public class  calcu {

     public static void main (String [] args ){

          Scanner scn = new Scanner(System.in);
          
          
          
          System.out.println(" ESOLHA UMA OPERAÇÃO : 1-SOMA , 2-PRODUTO , 3-DIVISÃO,4-SUBTRAÇÃO ");



          int a,b,produto;




          System.out.println("DIGITE UM NÚMERO : ");
          a=scn.nextInt();

          System.out.println("DIGITE OUTRO NÚMERO : ");
          b=scn.nextInt();

          produto = a * b;

          System.out.println("O VALOR É : " + produto);

     }
     
}
