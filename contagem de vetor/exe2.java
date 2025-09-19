
import java.util.Random;
import java.util.Scanner;

public class exe2 {
     public static void main(String[] args) {
         
          
          Random sorteia = new Random();
          Scanner scn = new Scanner(System.in);

          int vet [] = new int[9];
          int s = 0;

          // GERA NÚMEROS PARA O VETOR
          for(int p = 0; p < vet.length; p++){
               vet [p] = sorteia.nextInt(10);
          }
          // MOSTRAR O  VETOR NA TELA
          for(int p = 0; p < vet.length; p++){
               System.out.println(vet[p]);
          }
          System.out.println("FIM\n");
          System.out.println("QUER SOMAR ACIMA DE QUAL VALOR ?");
          int chave;
          chave =scn.nextInt();
          // RESULTADOS 
          for(int p =0; p<vet.length;p++){
               if (vet[p] >= chave ){
                    
                s = s + vet[p];
               }
          }
          System.out.println("A SOMA DE TODOS OS VALORES MAIORES OU IGUAIS A " + " CHAVE " + s);
     }
     
}
