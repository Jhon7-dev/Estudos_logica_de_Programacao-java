import java.util.Scanner;


public class exe5 { 

     
     
     
     public static void main(String[] args) { 
          
          
          Scanner scn = new Scanner (System.in);
          
          double altura,peso,imc;
          
          System.out.println("digite seu peso:");
          peso=scn.nextDouble(); 
          
          System.out.println("digite sua altura:");
          altura=scn.nextDouble();
          
          imc = peso / altura * altura;
          
          if( imc < 16.9){
               
               System.out.println("muito abaixo do peso!");
               
          }if (imc >= 17.00 && imc<= 18.4){
               
               System.out.println(" abaixo do peso!"); 
                    
               }else if  (imc >= 18.5 && imc <= 24.9){
                    
                    System.out.println("peso normal!");
                    
                    
               }else{
                    System.out.println("OBESIDADE!");
               }
          }
          
     }
          
          
          
          
     
