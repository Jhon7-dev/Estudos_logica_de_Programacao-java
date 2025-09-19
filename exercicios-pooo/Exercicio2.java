import java.util.Scanner;


public class Exercicio2{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Número: ");
        int numero =scn.nextInt();
        scn.nextLine();

        System.out.print("Nome: ");
        String nome =scn.nextLine();

        System.out.print("Idade: ");
        int idade =scn.nextInt();

        System.out.print("Sexo (M/F): ");
        char sexo =scn.next().charAt(0);

        System.out.print("Valor do Automóvel: ");
        double valorAutomovel =scn.nextDouble();

        double valorApolice = (sexo == 'M' && idade <= 25) ? valorAutomovel * 0.10 :
         (sexo == 'M') ? valorAutomovel * 0.05 :
          valorAutomovel * 0.02;

        System.out.println("\nDados da Apólice:");
        System.out.println("Número: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Valor Automóvel: " + valorAutomovel);
        System.out.println("Valor Apólice: " + valorApolice);
        
       scn.close();
    }
}
 