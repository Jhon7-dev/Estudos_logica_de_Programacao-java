
import java.util.Scanner;

/*RECEBER DOIS NUMEROS E EXIBIR TODOS OS NÚMEROS INTEIROS ENTRE ELES */


public class exe4 {

     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int i; 
          int p;

          System.out.println("DIGITE UM NÚMERO:");
          i = scn.nextInt();
          System.out.println("DIGITE OUTRO NÚMERO INTEIRO:");
          p = scn.nextInt();


          for (int cont = i + 1;  cont < p; cont++){
               
               System.out.println("OS NÚMEROS INTEIROS ENTRE " + i + " E " + p + " É " + cont );
                
                
          }

     }
     
}
