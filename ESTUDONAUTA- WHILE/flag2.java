
import java.util.Scanner;

public class flag2 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in); 
          int s = 0;
          int n;
          char r = 'S';
          
          while(r == 'S' || r == 's'){
               System.out.println("digite um número:");
               n=scn.nextInt();
               s+=n;
               System.out.println("DESEJA CONTINUAR ? [S/N] " );
           r=scn.next().charAt(0);

          }
               System.out.println("a soma dos valores é " + s);

     }
}
