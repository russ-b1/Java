// ITM 251-Spring 2017
// Date; 3/30/17
// Topic: Ch11 - Arithmetic and InputMismatch exception handling
// Dependencies: None


import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZero {
	
   public static void main (String[] args) {
   	
      int numerator, denominator, result;
      boolean continueLoop=true;
   	
      Scanner input = new Scanner(System.in);
   	
      do{//opens do
         try {//opens try block
            System.out.println("Please enter a numerator: ");
            numerator = input.nextInt();
            System.out.println("Please enter a denominator: ");
            denominator = input.nextInt();
            result = quotient(numerator, denominator);
            System.out.printf("%d/%d = %d", numerator, denominator, result);
         
            continueLoop = false;
         }//closes try block 
         catch (InputMismatchException ime){//opens catch for ime
         //System.err.printf works same way as System.out.printf
            //but is used when displaying error messages
            System.err.printf("%nException: %s%n", ime);
            //we need to clear out the memory of the input scanner
            //so it doesn't continue to read the value that caused the exception
            //input.nextLine() clears this memory and allows user to enter a new value
            input.nextLine();
            System.out.printf("You must enter an integer, please try again%n");
         }//closes catch for ime
         catch(ArithmeticException ae) {//opens catch for ae
            System.err.printf("%nException: %s%n", ae);
            //don't need input.nextLine() here because the previous input statement
            //ran to completion before the exception was thrown
            System.out.printf("Cannot divide by zero. Please try again%n");
         }//closes catch for ae
      }while(continueLoop); 
   
   	
   } // main

   public static int quotient(int top, int bottom)
   throws ArithmeticException{//opens method quotient
      return top / bottom;
   } // quotient
	
	
} // DivideByZero

