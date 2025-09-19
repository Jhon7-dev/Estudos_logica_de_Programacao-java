
import java.util.Scanner;

public class exe9 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
       
         System.out.println("selecione o numero ");
         
         int dia;

        dia=scn.nextInt();
        
        switch (dia) {
             case 1:
               System.out.println("DOMINGO");
               break;

                 case 2 :
                System.out.println("SEGUNDA-FEIRA");
                break;
               
                case 3 :
                System.out.println("TERÇA-FEIRA");
                 break; 

             case 4 :
             System.out.println("QUARTA-FEIRA");
             break;
             
             case 5:
             System.out.println("QUINTA-FEIRA");
             break;

             case 6: 
             System.out.println("SEXTA-FEIRA");
             break;

             case 7 :
               System.out.println("SÁBADO");
               
             default:
             System.out.println("OPÇÃO INVÁLIDA!");
                throw new AssertionError();
        }
        
     
     
     
     
     }
     
}
