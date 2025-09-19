import java.util.Scanner;

public class exe1{
     public static void main(String[] args) {
          
           Scanner scn = new Scanner (System.in);
          
          int numero;
          System.out.println("digite um numero:");
          numero=scn.nextInt();

          if(numero>0 ){
               System.out.println("número é positivo !");

          }else if ( numero < 0){
               System.out.println("número é negativo!");
          } else{
               System.out.println("ZERO!");
          }
          
     }
          
}