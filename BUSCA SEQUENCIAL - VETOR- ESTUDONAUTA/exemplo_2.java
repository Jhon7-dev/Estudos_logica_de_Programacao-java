
import java.util.Random;
import java.util.Scanner;



// FAZER UMA BUSCA SEQUÊNCIAL COM SORTEIO
public class exemplo_2 {
     public static void main(String[] args) {
         Random sorteio = new Random();
         Scanner scn = new Scanner(System.in);

         int [] vet = new int [9];
         int chave;

         for(int p = 0; p<vet.length;p++){
          vet[p] = sorteio.nextInt(20);
          System.out.println("OS NÚMEROS SORTEADOS SÃO " + vet[p] );
         }

         System.out.println("DIGITE A CHAVE ");
         chave = scn.nextInt();
         for(int p = 0;p<vet.length;p++){
               if(chave == vet[p]){
                    System.out.println("OS NÚEMEROS ESTÃO NA POSIÇÃO " + p);
               }
             
              
          }
     }
     
}
