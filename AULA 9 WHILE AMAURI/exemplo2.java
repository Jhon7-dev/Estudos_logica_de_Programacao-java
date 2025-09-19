
import java.util.Scanner;

public class exemplo2 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);


          int a,b,c,d,e;

          
          System.out.println("DIGITE UM NÚMERO");
          a=scn.nextInt();

          System.out.println("DIGITE UM NÚMERO");
          b=scn.nextInt();

          System.out.println("DIGITE UM NÚMERO");
          c=scn.nextInt();

          System.out.println("DIGITE UM NÚMERO");

          d=scn.nextInt();
          
          e = (a+b+c+d)/4;
          
          if(e == 0){
               System.out.println("pare!");
          }

          while(e >= 0){
               System.out.println("calcule a média :" + e);
          }
     }
}
