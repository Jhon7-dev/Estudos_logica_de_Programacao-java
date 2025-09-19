import java.util.Scanner;

public class exe2 {
          public static void main(String[] args){

                Scanner scn = new Scanner (System.in);


               int x,y;

               System.out.println("DIGITE UM VALOR :");
               x=scn.nextInt();

               System.out.println("DIGITE OUTRO VALOR :");
               y=scn.nextInt();

               
               while( x <= y){
                    System.out.println("NUMEROS PARES ENTRE X E Y : " + x);
                    
                    x+=2;                
                    
                    
               }
       }
}
