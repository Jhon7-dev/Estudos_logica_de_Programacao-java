
import java.util.Scanner;

public class ac2 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          System.out.println("BEM VINDO À FACENS");

         double ac1;
         double ac2;
         double ag;
         double af;
         double nota_minima = 5.0;
         double media;

         System.out.println("DIGITE SUA AC1:");
         ac1 = scn.nextDouble();

         System.out.println("DIGITE SUA AC2:");
         ac2 = scn.nextDouble();

         System.out.println("DIGITE SUA AG:");
         ag = scn.nextDouble();

         System.out.println("DIGITE SUA AF:");
         af = scn.nextDouble();

          media = (ac1 * 0.15) + (ac2 * 0.30) + (ag + 0.10) + (af * 0.45) / 4;
          

         if( media > nota_minima || media == nota_minima ){
          System.out.println("PARABÉNS,SUA MÉDIA FOI DE " + media + " VOCÊ FOI APROVADO!");
         }else {
          System.out.println(" INFELIZMENTE, SUA MÉDIA FOI DE " + media + " VOCÊ REPROVOU!");
         }

          








     }
}