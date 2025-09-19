
import java.util.Scanner;

/*RECEBER 10 NÚMEROS E, AO FINAL INFORMAR QUAL É O MAIOR E O MENOR DELES. */

public class exe4 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int maior = 0;
          int menor = 0;
          int numero = 0;

          for (int i = 1; i <= 4; i++){

               System.out.println("DIGITE O " + i + "NÚMERO");
                    numero = scn.nextInt();
                    
                    if(numero > maior){
                         
                         maior ++;
                         

                    }if(numero < menor){
                         
                         menor++;

                    }else if (numero == 0){

                         maior = numero;
                         menor = numero;
                        
                    }
               }
                    System.out.println("O MAIOR NÚMERO FOI " + maior);
                    System.out.println("O MWNOR NÚMERO FOI " + menor);
          }
     }

