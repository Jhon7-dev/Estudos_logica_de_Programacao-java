
import java.util.Scanner;

public class exe32 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          int cont = 1;

          int soma = 0;

          int soma2 = 0;

          int valor = 1;

          
          

          while(cont <= 5) {
               
               cont ++;
               System.out.println("DIGITE O " + valor + " valor");

               valor=scn.nextInt();
               
               
               
          }if (valor % 2 == 0 ){
               
               soma = soma + valor;
               
          }else{
               
               soma2 = soma2 + valor;
               
          }
            System.out.println("\nsomando todos os pares " + soma);
        
             System.out.println("\nsomando todos os impares " + soma2);
           
 
     }  
     
}
