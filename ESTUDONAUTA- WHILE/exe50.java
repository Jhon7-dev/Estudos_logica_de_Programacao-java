import java.util.Scanner;

public class exe50 {
     public static void main(String[] args) {
          
          int x = 1;
          int y = 1;
          int mult ;
          int q;
         
          int p;

          Scanner scn = new Scanner(System.in);

          System.out.println("TABUADA INICIAL: ");

          p=scn.nextInt();

          System.out.println("TABUADA FINAL: ");

          q = scn.nextInt();

        // for ( int i = 0;i<=10;i++){

        
        //}
    
          for (x = 1; p <= q ; p++){

               System.out.println("== TABUADA DO " + p + " == " + "\n");

               for (y = 1; y <= 10; y++){
                    
                    mult = p * y;
                   
                    System.out.println( p + " x " + y + " = " +  mult + "\n");
               }
               
          } 


     }
     
}
