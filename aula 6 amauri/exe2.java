
import java.util.Scanner;

public class exe2 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner ( System.in);  
          
          int hora;
          System.out.println("digite um horário :");
          hora=scn.nextInt();

          if(hora >= 6 && hora <= 12){
          System.out.println  ("Manhã!");
     }else if (hora >= 12 && hora <= 18){
          System.out.println("Tarde!");
     }else{
          System.out.println("NOITE!");
     }
                  
    }
}
