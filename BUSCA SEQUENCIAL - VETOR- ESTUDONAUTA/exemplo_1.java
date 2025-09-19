
import java.util.Scanner;

// EXEMPLO DEMOSTRAÇÃO DE UMA BUSCA SEQUÊNCIAL

public class exemplo_1{
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          boolean  achei = false;
          int chave;
          int [] vet = {2,5,7,3,2,9,4,2};

          // LER A CHAVE PELO USUÁRIO

          System.out.println("QUAL É A CHAVE?");
          chave = scn.nextInt();

          // O FOR É PARA PERCORRER O VETOR E EM SEGUIDA ACHAR A CHAVE

          for(int p = 0; p<vet.length;p++){
               if(vet[p]== chave){
                    System.out.println("\n ECONTREI A CHAVE NA POSIÇÃO " + p );

               }              
          }
                            
     }
}