import java.util.Scanner;

public class exe4 {
     public static void main(String[] args) {

          Scanner scn = new Scanner (System.in);
          
          int idade;

          System.out.println(" DIGITE A SUA IDADE:");

          idade=scn.nextInt();

          if(idade<= 12){
               System.out.println("Você é criança.");
          }if(idade >= 13 && idade <= 17 ){
               System.out.println("Adolescente.");
          }if (idade>=18 && idade<= 35){
               System.out.println("Adulto.");
          }else if(idade >= 36 && idade<= 60){
               System.out.println("adulto jovem");
          }else{
               System.out.println("Idoso.");
          }
     }
}
