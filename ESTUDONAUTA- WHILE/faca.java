import java.util.Scanner;

public class faca  {
     public static void main(String[] args) {
          
          char resp;

          int n; 

          Scanner scn = new Scanner (System.in);


          do {
               System.out.println("digite um número : ");
                
               n=scn.nextInt();


               System.out.println("QUER CONTINUAR? [S/N]");
               resp = scn.next().charAt(0);


          }while ( resp =='S');

     }
     
}
