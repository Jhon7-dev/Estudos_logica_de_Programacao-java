import java.util.Scanner;

public class wl2{

     public static void main (String [] args ){

          Scanner scn = new Scanner ( System.in); 

          int numerosecreto = 7;
          int palpite = 0; 
           
           
          System.out.println("vou escolher um número entre 1 e 10. tente adivinhar!");

          while ( palpite != numerosecreto){
               System.out.println("qual é o seu palpite ?");

               palpite = scn.nextInt();

               if( palpite == numerosecreto){
                    System.out.println("parabéns! você acertou!");
               }else{
                    System.out.println("ops, try again");
               }
               
         
          }
          System.out.println("FIM DO JOGO!");    
     }
}