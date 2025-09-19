
import java.util.Scanner;

public class exe36 {
     public static void main(String[] args) {
         
     Scanner scn = new Scanner(System.in);

          System.out.println(" \n MAIS VELHO E MAIS NOVO \n");

          int cont = 1;
          int idade = 0 ;
          String nome = "nome";


          while (cont <=2  ){

               System.out.println(cont + " * PESSOA");
               System.out.println("---------------------\n");
               
               System.out.println("NOME:");
               nome=scn.nextLine();
               System.out.println("IDADE:");
               idade=scn.nextInt();
               
               
               
               
               
               cont++;
          }





     }
}
