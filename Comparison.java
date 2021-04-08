/*ITM 251-Spring 2017
Date; 1/26/17
Topic: Chapter 2- basic user input and arithmetic
*/

import java.util.Scanner; //imports Scanner class to read input from user

public class Comparison { // opens class Arithmetic

   public static void main(String[] args) { // opens method main
   
      // declares a new variable of type Scanner called input
      // Instantiates an object and assigns it to that variable
      Scanner input = new Scanner(System.in); 
      int number1, number2; //declare two integer variables called number1
      
      System.out.print("Please enter an integer: ");
         //wait for user to enter an integer
      number1 = input.nextInt();
      System.out.print("Please enter an integer: ");
      number2 = input.nextInt(); 
      
     //evaluate whether the expression enclosed in parentheses is true
     //if so, execute the code that appears on the next line
      if (number1==number2)
         System.out.printf("%d == %d%n", number1, number2);
      if (number1!=number2)
         System.out.printf("%d != %d%n", number1, number2);
      if (number1<number2)
         System.out.printf("%d < %d%n", number1, number2);
      if (number1<=number2)
         System.out.printf("%d <= %d%n", number1, number2);
      if (number1>number2)
         System.out.printf("%d > %d%n", number1, number2);    
            
         
   
   } // closes method main 
} // closes class Comparison
