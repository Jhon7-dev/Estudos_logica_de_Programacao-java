
import java.util.Scanner;

public class exe {
     public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);
 
        int num,soma,cont,resultado;
        
        
        cont = 0;

        soma = 0 ;


       

          while(  cont < 3){
               
             System.out.println("digite um numero ");
               
        
                  num = scn.nextInt();

                  soma= soma + num;
               
                  cont ++;
                  
               }       if ( soma   <=  0 ){
                    System.out.println("PROCESSO PARADO!");
               }
               
               resultado = soma;
               
               System.out.println("resultado é :" + resultado);
          }
}




         
