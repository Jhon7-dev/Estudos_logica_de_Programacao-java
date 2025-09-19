
import java.util.Scanner;

 //Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
//Na construção do Algoritmo, utilize os seguintes conteúdos:
//Entrada e Saída de dados
//Operadores
//Laços Condicionais
//Laço de Repetição WHILE 

public class exe4{
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          int w,x,y,z,id;

          System.out.println("DIGITE A  IDADE : ");
          w=scn.nextInt();

          System.out.println("DIGITE A  IDADE : ");
          x=scn.nextInt();

          System.out.println("DIGITE A IDADE : ");
          y=scn.nextInt();

          System.out.println("DIGITE A IDADE : ");
          z=scn.nextInt();


          if ( id <= 21 && id >= 50){

               System.out.println("VOCÊ ESTÁ DENTRO!");

          }else{
               System.out.println("GET OUT!");
          }

          while ( id < 21){
               System.out.println( id ++ );
          }

     }
}