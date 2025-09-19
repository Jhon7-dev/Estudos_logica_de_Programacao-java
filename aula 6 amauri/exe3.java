
import java.util.Scanner;

public class exe3 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          int km,mts,cm;

          System.out.println("digite quantos metros:"); 
          mts=scn.nextInt();

          km = mts/1000; 
          System.out.println("em km fica :" + km + " kms");

          cm = mts * 10000;

          System.out.println(" em Cm fica :" + cm + "cms");
     }
}
