
import java.util.Scanner;

public class simulado {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          System.out.println("=== STOCK - TOOK ===");


          
          int produtos_no_estoque = 1 ;
          int quantidade = 0;
          int limite;
          int quantidade_total;
          int maior = 0;
          int menor = 0;
          int status;

          String nome_produto;

          Character opcao;

          System.out.println("QUANTOS PRODUTOS TEM NO SEU ESTOQUE ?");
          produtos_no_estoque = scn.nextInt();

          do {

               
               System.out.println(" QUAL O NOME DO " + produtos_no_estoque  );
               nome_produto = scn.nextLine();

          }while (produtos_no_estoque <= quantidade );
















     }
}
