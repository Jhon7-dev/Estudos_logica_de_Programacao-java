
import java.util.Scanner;

public class menina {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);



          int c = 1;
          int menino = 0;
          int menina = 0;
          

          while(c <= 5){
               System.out.println("DIGITE O SEXO : [M/F] ");
              
               Character sexo;
               sexo = scn.nextLine().charAt(0);
               
               if(sexo== 'M' || sexo == 'm'){
                   
                    
                    menino++;

               }if (sexo=='F' || sexo == 'f')
               
                  menina ++;       
                  
                  c++;
               }

               System.out.println("O TOTAL DE MENINOS É " + menino);
               System.out.println("\n O TOTAL DE MENINAS É " + menina);
               
     }     
}
