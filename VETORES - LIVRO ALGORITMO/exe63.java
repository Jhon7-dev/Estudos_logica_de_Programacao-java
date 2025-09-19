
import java.util.Random;

/*DESENVOLVER UM ALGORITMO QUE EFETUE A ENTRADA DE 5 ELEMENTOS INTEIROS PARA UM VETOR A. E AO FINAL, APRESENTAR A SOMA DE TODOS OS ELEMENTOS CUJO VALOR SEJA ÍMPAR */
public class exe63 {
     public static void main(String[] args) {
         System.out.println("hello world");

         Random sorteio = new Random();

         int [] vet = new int [5];
         int soma = 0;
         int impar = 0;
        
        
         // SORTEAR E PREENCHER O VETOR
         for (int p = 0; p < vet.length;p++){
            vet[p] = sorteio.nextInt(10);
         }
         // MOSTRAR O VETOR
         for(int p = 0; p < vet.length; p++){
            System.out.println(vet[p]);
         }
         for (int p = 0; p < vet.length; p++){

            if(vet[p] % 2 != 0){

                impar = impar + vet[p]; // SE EU TIVER SÓ O "ÍMPAR" ELE VAI APENAS CONTAR QUANTOS NÚMEROS ÌMPARES TEM, MAS SE EU COLOCAR "ÍMPAR = IMPAR + VET[P], ELE VAI ME DAR A SOMATÓRIA TODA QUE EU PRECISO"
            }
       
            }
             System.out.println("A SOMA DOS NÚMEROS Ímpares" + impar);    
         }
     }    
 

