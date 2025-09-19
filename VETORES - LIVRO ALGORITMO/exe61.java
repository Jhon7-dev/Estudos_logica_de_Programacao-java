
import java.util.Random;

/*O PROGRAMA A SEGUIR FAZ A LEITURA DE DEZ VALORES EM UM VETOR E APRESENTA SUA MÉDIA  */

public class exe61{
     public static void main(String[] args) {
          
          Random sorteio = new Random();

          int [] vet = {2,4,6,8,10};
          int soma = 0;
          int media = 0;        

          for (int p = 0; p < vet.length; p++){

               System.out.println(vet[p]);
               soma = soma + vet[p];
          }
               media = soma/vet.length;
               System.out.println(" A MÉDIA É " + media);
     }
}