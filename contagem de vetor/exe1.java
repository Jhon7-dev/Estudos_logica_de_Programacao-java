import java.util.Random;
import java.util.Scanner;

public class exe1 {
     public static void main(String[] args) {
          // PREENCHIMENTO DO VETOR
          int p = 0;
          int [] vet =  new int [9];
          Random sorteia = new Random();
          Scanner scanner = new Scanner(System.in);


          // SORTEADO 10 ELEMENTOS
          for (p = 0; p < vet.length; p++){ 

               vet [p] = sorteia.nextInt(10);
                // GERA NÚMEROS ALEATÓRIOS DE 1 A 10
          }
          // EXIBIÇÃO DO VETOR
          System.out.println("Os vslores sorteados são:");
          for(p = 0; p < vet.length; p++){
               System.out.println(vet[p] + "->");

          }
          System.out.println("FIM\n");
          // BUSCA PELA CHAVE 
          int chave = 0;
          int tot = 0;
          System.out.println("Está proucurando por qual valor?");
          chave = scanner.nextInt();
          System.out.println("Proucurando pela chave" + chave + "\n");
          for (p = 0; p < vet.length;p++){
               if(vet[p] == chave){
                    tot ++;
                    System.out.println("Achado na posição " + p + " \n"); 
                    // SE EU QUISER ACHAR A POSIÇÃO DO VETOR 
               }
          }
          // RESULTADO FINAL
          if (tot == 0){
               System.out.println(" O valor " + chave + " não foi encontrado dentro do vetor \n");
          }else {
              System.out.println(" O VALOR " + chave+ " FOI ENCONTRADO " + tot + " VEZES DENTRO DO VETOR\n ");
          }
     }
}
