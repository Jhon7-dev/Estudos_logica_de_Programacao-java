
import java.util.Scanner;

 public class exe10 {
      
     public static void main(String[] args) {
         
       Scanner scn = new Scanner(System.in);


       int operacao,soma,multiplicacao,subtracao,divisao,num1,num2;
       
       System.out.println("SELECIONE A OPERAÇÃO: ");
       System.out.println(" 1- adição");
       System.out.println("2-multiplicação");
       System.out.println("3- divisão");
       System.out.println("4-subtração");
       System.out.print(""); 
      
             operacao=scn.nextInt();
       
       System.out.println("digite um número :");
       num1=scn.nextInt();

       System.out.println("digite outro número:");
       num2=scn.nextInt();
     

       soma= num1+ num2;
       multiplicacao= num1*num2;
       divisao =  num1/num2;
       subtracao = num1 - num2;

     switch (operacao){

          case 1: 
          System.out.println("a soma é " + soma );  
          break;

          case 2: 
          System.out.println("a multiplicação é " + multiplicacao);
          break;

          case 3: 
          System.out.println("a divisão é " + divisao);
          break;

          case 4 :
          System.out.println("a subtração é " + subtracao);
          break;

          
      }
          
     } 
 }
 
