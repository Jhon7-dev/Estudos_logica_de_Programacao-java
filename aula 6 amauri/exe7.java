
import java.util.Scanner;

public class exe7 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);
          
          int dia,mes;
          System.out.println("DIGITE O DIA : " );

           dia=scn.nextInt();

       
                             

             switch(dia){

                  case 1:  case 2 :  case 3 :   case 4 :  case 5 :   case 6 : case 7 : case 8 : case 9 : case 10 : case 11 : case 12 : case 13 : case 14 : case 15 : 
               System.out.println("PRIMEIRA QUINZENA DO MÊS!");
                  break;
                  
                  case 16:  case 17 :  case 18 :   case 19 :  case 20 :   case 21 : case 22 : case 23 : case 24 : case 25 : case 26 : case 27: case 28 : case 29 : case 30 : 
                 System.out.println("SEGUNDA QUINZENA DO MÊS!");
                 break;

                    default: 
                    System.out.println("SOLUÇÃO INVÁLIDA!");
                   break;
                   

                 
                   

                
                   
                   

               }
     }
     
}
