
import java.util.Scanner;

public class exe11 {
     public static void main (String[]args){

          Scanner scn = new Scanner(System.in);

         int mes;

          System.out.println("digite o mês:");

          mes=scn.nextInt();

          switch(mes){
               case 1 :
               System.out.println("MÊS ESCOLHIDO É JANEIRO, MÊS DE FÉRIAS!");
               break;

               case 2 : 
               System.out.println("MÊS ESCOLHIDO É FEVEREIRO, MÊS DO CARNAVAL!");
               break;

               case 3 : 
               System.out.println("MÊS ESCOLHIDO É MARÇO, MÊS QUE COMEMORA O DIA INTERNACIONAL DA MULHER!");
               break;

               case 4 : 
               System.out.println("MÊS ESCOLHIDO É ABRIL, MÊS EM QUE O BRASSIL FOI DESCOBERTO,MÊS QUE COMEMORA A PÁSCOA");
               break;

               case 5 : 
               System.out.println("MÊS ESCOLHIDO É MAIO, MÊS QUE COMEMORA O DIA DAS MÃES!");
               break;

               case 6 : 
               System.out.println("MÊS ESOCLHIDO É JUNHO, MÊS QUE COMEMORA O SÃO JOÃO, DIAS DOS NAMORADOS E FESTA JUNINAS ");
               break;

               case 7 : 
               System.out.println("MÊS ESCOLHIDO É JULHO, MÊS QUE COMEMORA O DIA DO ROCK, MÊS DA FESTA JULINA E DA REVOLUÇÃO CONSTITUCIONALISTA");
               break;

               case 8: 
               System.out.println("MÊS ESCOLHIDO É AGOSTO, MÊS QUE COMEMORA DIA DOS PAIS");
               break;

               case 9: 
               System.out.println("MÊS ESCOLHIDO É SETEMBRO, MÊS QUE COMEMORA A INDEPENDÊNCIA DO BRASIL E QUE FICOU MARCADO PELO ATENTADO AS TORRES GEMÊAS ");
               break;

               case 10: 
               System.out.println("MÊS ESCOLHIDO É OUTUBRO, MÊS QUE COMEMORA O DIA DAS CRIANÇAS ");
               break;

               case 11:
               System.out.println("MÊS ESCOLHIDO É NOVEMBRO, MÊS QUE COMEMORA A PROCLAMAÇÃO DA REPUBLICA");
               break;

               case 12:
               System.out.println("MÊS ESCOLHIDO É DEZEMBRO, MÊS QUE COMEMORA O NATAL");
               break;

               default:
               System.out.println("ERRO!");
               break;
      
          }
     }
}
