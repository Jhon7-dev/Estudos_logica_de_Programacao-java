
import java.util.Scanner;


/* LER EM CELSIUS E MOSTRAR EM FAHRENHEIT. PERGUNTAR SE O USUÁRIO QUER REPETIR (S/N).
 * FÓRMULA : F = 9*C/5 + 32
 */

public class exe3 {
   public static void main(String[] args) {
       
          Scanner scn = new Scanner (System.in);

               char opcao;

          double temperatura ;

          double celsius;

          double fh;

          
         
         

          do { 
               System.out.println("DIGITE A TEMPERATURA EM CELSIUS:");
               celsius = scn.nextInt();
     
               fh = 9 * celsius / 5 + 32;
               
             
               System.out.println("A TEMPERATURA EM FAHRENHEIT É " + fh);

               System.out.println("DESEJA REPETIR ? [S/N]");
               opcao = scn.next().charAt( 0);
               
               
          } while (opcao == 's'|| opcao == 'S');
               if(opcao=='n'|| opcao == 'N'){
                    System.out.println("BYE,BYE!");
               }

   }  

} 
