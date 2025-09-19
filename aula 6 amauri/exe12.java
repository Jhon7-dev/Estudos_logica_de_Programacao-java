
import java.util.Scanner;

public class exe12 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner ( System.in);

          String cor;
          int nome;

          System.out.println("1-vermelho");
          System.out.println("2-verde");
          System.out.println("3-amarelo");
          System.out.println("selecione umas cor: ");

          nome=scn.nextInt();
          cor=scn.nextLine();
           

          switch (nome) {
              case 1 :
              System.out.println("A COR SELECIONADA FOI A VERMELHA E O SIGINIFICADO  É PAIXÃO");
              break;
              
              case 2 : 
              System.out.println("A COR COR SELECIONADA FOI VERDE E O SIGNIFICADO  É NATUREZA");
              break;

              case 3: 
              System.out.println(" A COR COR SELECIONADA FOI AMARELA E O SIGNIFICADO É RIQUEZA");
              break;

              default:
              System.out.println("ERRO!");
                   break;

          }

     }     
}
