
import java.util.Scanner;


/*CRIAR UM PROGRAMA DE CALCULADORA QUE VAI REALIZANDO OS CÁLCULOS ENTRE DOIS NÚMEROS ENQUANTO O USUÁRIO DESEJAR. CRIAR UM MENU DE OPÇÕES CONFORME MOSTRADO A SEGUIR 
 * 1- SOMA
 * 2- SUBTRAÇÃO4
 * 3- MULTIPLICAÇÃO
 * 4- DIVISÃO 
 * 5- SAIR
 */

public class exe2 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);
          
          System.out.println("=== CALCULADORA ===");
         
          Character operacao = 0;
          
          int p = 0;
          int i = 0;
          int mult;
          int soma;
          int sub;
          int divi;



          Character escolha;

          System.out.println(" DIGITE UM NÚMERO :");
          p = scn.nextInt();

          System.out.println("DIGITE OUTRO NÚMERO :");
          i = scn.nextInt();

          mult = p * i;
          soma = p + i ;
          sub = p - i;
          divi = p / i;
          do{
                

               System.out.println("ESCOLHA A OPERAÇÃO:");
               System.out.println("+ ADIÇÃO");
               System.out.println("- SUBTRAÇÃO");
               System.out.println("/ DIVISÃO");
               System.out.println("* MULTIPLICAÇÃO");
               operacao = scn.next().charAt(0); 

               switch (operacao){
                    case '+': System.out.println("VOCÊ ESCOLHEU A SOMA " + soma);
                    break;

                    case '-' : System.out.println("VOCÊ ESCOLHEU A SUBTRAÇÃO" + sub);
                    break;

                    case '/': System.out.println("VOCÊ ESCOLHEU A MULTIPLICAÇÃO" + mult);
                    break;

                    case '*': System.out.println("VOCÊ ESCOLHEU A DIVISÃO" + divi);
                    break;

                    default: System.out.println("ERRRORR!!!"); 
                    break;
               }

               System.out.println("DESEJA CONTINUAR ? [S/N]");

               escolha = scn.next().charAt( 0);

               if ( escolha == 'n'|| escolha == 'N'){
                    System.out.println("ATÉ BREVE! TE ESPERO NA PRÓXIMA!");
               }

          }   while(escolha == 's'|| escolha == 'S');


     }
}
