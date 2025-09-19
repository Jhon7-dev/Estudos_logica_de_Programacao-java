
import java.util.Random;
import java.util.Scanner;


// contabilizando elementos na busca de um vetor 
public class exemplol_3 {
     public static void main(String[] args) {
          Random sorteio = new Random();
          Scanner scn = new Scanner(System.in);
          
          int [] vet = new int[10];
          int tot = 0;
          int chave;
          int pares = 0;
          int impar = 0;
          int soma_pares = 0;
          int soma_impar = 0;


          System.out.println("OS NÚMEROS SORTEADOS SÃO " );
          for(int p = 0;p<vet.length;p++){
               vet[p] = sorteio.nextInt(20);
               System.out.println( vet[p]);
          }
          System.out.println("DIGITE A CHAVE ");
          chave = scn.nextInt();
          for(int p =0;p<vet.length;p++){
               if(chave ==vet[p]){
                    tot++;
                    System.out.println(" OS VALORES ESTÃO NAS POSIÇÕES " + p );
          }
     
     }
      System.out.println("AO TOTAL FORAM " +  tot + " VALORES ENCONTRADOS ");
        
     }
}
