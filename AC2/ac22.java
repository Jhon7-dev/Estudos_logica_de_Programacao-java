
import java.util.Scanner;

public class ac22 {
     public static void main(String[] args) {
         
              Scanner scn = new Scanner(System.in);
          
         double ac1;
         double ac2;
         double ag;
         double af;
         double nota_minima = 5.0;
         double media;
         double peso,peso2,peso3,peso4;
          
         int cont = 1;
         int i;
         Character opcao = 0;
          
          do { 
               System.out.println("DIGITE O PESO DA AC1");
               peso = scn.nextDouble();

               System.out.println("DIGITE O PESO DA AC2");
               peso2 = scn.nextDouble();

               System.out.println("DIGITE O PESO DA AG");
               peso3 = scn.nextDouble();

               System.out.println("DIGITE O PESO DA AF");
               peso4 = scn.nextDouble();
               
               cont++;

          } while (cont <= 1);{

               
                
                    do {
                          System.out.println("DIGITE SUA AC1:");
                    ac1 = scn.nextDouble();
                    
                    System.out.println("DIGITE SUA AC2:");
                    ac2 = scn.nextDouble();
                    
                    System.out.println("DIGITE SUA AG:");
                    ag = scn.nextDouble();
                    
                    System.out.println("DIGITE SUA AF:");
                    af = scn.nextDouble();
                    
                    media = (ac1 * peso) + (ac2 * peso2) + (ag * peso3 ) + (af * peso4)/4;
                    
                    
                    if (media > nota_minima || media == nota_minima){
                         
                         System.out.println("PARABÉNS, VOCÊ FOI APROVADO! SUA MÉDIA FOI DE " + media );
                         
                    }else{
                         
                         System.out.println("VOCÊ FOI REPROVADO! SUA MÉDIA FOI DE " + media);
                         
                    }
                    
                    System.out.println(" DESEJA REALIZAR UM NOVO CÁLCULO DE NOTA ? [S/N] ");
                    opcao = scn.next().charAt( 0);

                    }while (opcao == 's' || opcao == 'S');
                    
                      if (opcao == 'n' || opcao != 'N'){

                         System.out.println("TCHAU! ATÉ BREVE!");
                    }
               }
          }
     }
 
