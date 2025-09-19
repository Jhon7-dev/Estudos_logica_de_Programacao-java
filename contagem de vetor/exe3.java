import java.util.Random;

public class exe3 {
     public static void main(String[] args) {
          
          Random sorteia = new Random();

          int [] vet = new int [10];
          // SORTEAR O VETOR 
          for (int p = 0; p < vet.length; p++){
               vet [p] = sorteia.nextInt(10);
               System.out.println(vet[p]);
          }
          // MOSTAR O VETOR 
          System.out.println("O VETOR GERADO FOI");
          for (int p = 0; p < vet.length; p++){

               System.out.println(vet[p]);

          }
          // DESCOBRINDO O MAIOR VALOR 
          int maior = 0;
          int menor = 0;
          for(int p = 0; p < vet.length; p++){
               if(p == 0){
                    maior = vet[0];
                    menor = vet [0];  
           }else{
               if (vet[p]>maior){
                    maior = vet[p];
               }
                if(vet[p] < menor){
                    menor = vet[p];
                }
           }
          }
          System.out.println("O maior valor gerado foi " + maior);
          // POSIÇÕES DE OCORRÊNCIA
          for (int p = 0; p < vet.length;p++){
               if (vet[p] == maior) {
                    System.out.println("\nEncontrei o maior valor na posição " + p);
                    }
              }
              System.out.println("\nEncontrei o menor valor na posição" + menor);
              for(int p = 0;p<vet.length;p++){
               if(vet[p] == menor){
                    System.out.println("\nENCONTREI O MENOR VALOR NA POSIÇÃO" + p);
               }
              }
          }

     }
     
          