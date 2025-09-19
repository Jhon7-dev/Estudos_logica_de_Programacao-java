
import java.util.Scanner;

public class exe34 {
     public static void main(String[] args) {

          System.out.println("\n========================\n");
    
          System.out.println("PARES E  ÍMPARES");
         
          Scanner scn = new  Scanner (System.in);


          //char op;
            
          int num;
          int cont = 1;
          int i = 0;
          int p = 0; 
          int sp = 0;
          int imp = 0;

         // media = media/p;
         // mediap = mediap/i;

          while (cont <= 5 ){
               
               System.out.println("DIGITE O " + cont + " VALOR : "   );
               num  = scn.nextInt();
               
               cont ++;
               
               if ( num  %2==0 ){
                    p++;
                    sp += num;
               } else  {
                    i++;
                    imp+=num;
               }
          }
          int mp = sp/p;
          int mi = imp/i;
           System.out.println(" VOCÊ DIGITOU " + p + " NÚMERO PARES. A MÉDIA É " + mp  );    
           System.out.println(" VOCÊ DIGITOU " + i + " NÚMEROS ÍMPARES. A MÉDIA É " + mi);
           System.out.println("\n\n");
     }
}
