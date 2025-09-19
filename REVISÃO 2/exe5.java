
import java.util.Scanner;


/*UM POSTO DE COMBUSTÍVEIS DESEJA DETERMINAR QUAL DE SEUS PRODUTOS TEM A PREFERÊNCIA DE SEUS CLIENTES.
 * ESCREVA UM ALGORITMO PARA LER O TIPO DE COMBUSTÍVEL ABASTECIDO (1- ÁLCOOL 2- GASOLINA 3-DIESEL 4-FIM). CASO O USUÁRIO INFORME UM CÓDIGO INVÁLIDO DEVE SER SOLICITADO UM NOVO COD ATÉ QUE SEJA VÁLIDO. O PROGRAMA SERA ENCERRADO QUANDO O CÓDIGO FOR O NÚMERO 4, DEVENDO ENTÃO MOSTRAR A MENSAGEM "MUITO OBRIGADO",BEM COMO AS QUANTIDADES DE CADA COMBUSTÍVEL.
  */

public class exe5 {

     public static void main (String []args){

          Scanner scn = new Scanner(System.in);


          int gaso = 0;
          int alcool = 0;
          int diesel = 0  ;
          int opcao;
          int maior = 0;
          int menor = 0;


               do{

                    
                    //System.out.println("DIGITE A OPÇÃO:");
                   // System.out.println("\n==========\n");
                    System.out.println("1- ÁLCOOL ");
                    System.out.println("2- GASOLINA ");
                    System.out.println("3- DIESEL ");
                    System.out.println("4- PARA PARAR ");
                    System.out.println("DIGITE A OPÇÃO:");
                    opcao = scn.nextInt();
                    System.out.println("A OPÇÃO SELECIONADA FOI " + opcao);
                    
                    
                    switch(opcao) {
                         case 1:System.out.println("ÁLCOOL");
                              break;
                         case 2: System.out.println("GASOLINA");
                              break;
                         case 3: System.out.println("DIESEL");
                               break;
                         case 4: System.out.println("SAIR");
                         break;
                         default: System.out.println("ERROR!");
                              break;
                    }

                    if (opcao == 1) {
                         
                         alcool++;

                    } if ( opcao == 2 ){
                          gaso++;
                    } else if (opcao == 3){
                         diesel++;
                    }
                    } while (opcao != 4);
                    System.out.println(" MUITO OBRIGADO! ");
                    System.out.println(" ÁLCOOL " + alcool);
                    System.out.println(" GASOLINA " + gaso);
                    System.out.println(" DIESEL " + diesel);
                     
               }

               



    }
 
