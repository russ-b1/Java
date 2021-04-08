/*ITM 251
Topic: chapter 4- switch*/

import java.util.Scanner;

public class Translator {//opens class
   
   public static void main(String[] args) {//opens method
   
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a number between 1 and 5");
      int num = input.nextInt();
      
      switch(num)  {//perform different actions based on value of the 'num' variable
         case 1:
            System.out.println("The Spanish word for 1 is uno");
            break;
         case 2:
            System.out.println("The Spanish word for 2 is dos");
            break;
         case 3:
            System.out.println("The Spanish word for 3 is tres");
            break;
         case 4:
            System.out.println("The Spanish word for 4 is quatro");
            break;
         case 5:
            System.out.println("The Spanish word for 5 is cinco");
            break;
         default:
            System.out.println("N/A");
            
      }
   
      
   } //closes method main
       
} //closes class main
