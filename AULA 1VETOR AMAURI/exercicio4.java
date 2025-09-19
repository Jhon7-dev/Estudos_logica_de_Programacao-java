
import java.util.Scanner;

/* FAÇA UM ALGORITMO QUE SOLICITE AO USUÁRIO QUE DIGITE A ALTURA DE 5 PESSOAS.
ARMAZENE ESSAS ALTURAS EM UM VETOR E, EM SEGUIDA, EXIBA A ALTURA MÉDIA */


public class exercicio4{

     public static void main(String[] args) {


          Scanner scn = new Scanner(System.in);

           double soma  = 0;

           double media = 0;

     double [] altura = new double [5];

     for ( int i = 0 ; i < altura.length; i++ ){

          System.out.println("digite a altura:");
          altura[i] = scn.nextDouble();

          soma = soma + altura [i];

     } for ( int i = 0; i < altura.length; i++ ){
          
          System.out.println(" As alturas são " + altura[i]);
          
     }
                    media = soma / altura.length;          

                    System.out.println("A média é " + media);
               
                    // FEITO!!!!
     }
}