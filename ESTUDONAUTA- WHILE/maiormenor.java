
import java.util.Scanner;

public class maiormenor {
     public static void main(String[] args) {

          Scanner scn = new Scanner (System.in);

          int n;
          int c=1;
          int maior = 0;
          int menor = 0;
          

          while(c <= 4){
               System.out.println(" DIGITE UM NÚMERO : ");
               n=scn.nextInt();
               
               if(c==1){
                    maior = n;
                    menor = n;
                    
               }else {
                    if(n < menor){

                     menor = n;    
                    }
                if(n > maior){
                    maior=n;
                }
               }
               c++;     
          }
               System.out.println("O maior valor foi " + maior);
               System.out.println("\nO menor valor foi " + menor );

     }
}


          
          
          
          
          
          
          
          


