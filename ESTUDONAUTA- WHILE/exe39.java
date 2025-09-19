
import java.util.Scanner;

public class exe39 {
     public static void main(String[] args) {


         Scanner scn = new Scanner(System.in);

          int cont = 4;

          int soma = 0;

          int maior = 0;
          int menor = 0;
          int n = 0;


         // int media;

          int p = 1; // O "P" VAI SER O NÚMERO QUE VAI IR DE 1 ATÉ O CONTADOR QUE É 9.

          double c = 1;
        
               while (p <= cont ){

                    System.out.println("digite o " + p + " número");

                    c=scn.nextDouble();//O "C" VAI SER O NÚMERO QUE EU VOU DIGITAR!!!!
                    p++;

                    soma +=p  ;
                }
                    
                    
                    if( p!=9999){

                         soma+=p;

                    } if (p == 1 ){
                         maior = p;
                         menor = p;

                    } else if ( p < menor ){
                         menor = p ;
                    } if (  p >  maior ){
                         
                         maior = p ;
                    }
                         
                    System.out.println(" AO TODO VOCÊ DIGITOU " + p + " valores ");
                    System.out.println("A SOMA É " + soma);
                    System.out.println("A MÉDIA FOI " + soma/p );
                    System.out.println("O MAIOR NÚMERO DIGITADO FOI " + p);
                    
                       
                    
               }
   }      
     
 