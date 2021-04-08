/*ITM 251-Spring 2017
Date; 1/26/17
Topic: Chapter 2- basic user input and arithmetic
*/

import java.util.Scanner; //imports Scanner class to read input from user

public class Arithmetic { // opens class Arithmetic

   public static void main(String[] args) { // opens method main
   
      // declares a new variable of type Scanner called input
      // Instantiates an object and assigns it to that variable
      Scanner input = new Scanner(System.in); 
      int number1, number2; //declare two integer variables called number1 and number2
      
      System.out.print("Please enter an integer: "); 
      //wait for user to enter an integer
      //store the integer value into variable called number1
      number1 = input.nextInt(); 
      
      
      System.out.print("Please enter an integer: "); 
      //wait for user to enter an integer
      //store the integer value into variable called number2
      number2 = input.nextInt(); 
    
      System.out.printf("Difference is: %d%n", number1-number2);
     
      System.out.printf("Product is: %d%n", number1*number2);
      
      System.out.printf("Quotient is: %d%n", number1/number2);
      
      System.out.printf("Remainder is: %d%n", number1%number2);
      
     
      /*int a=12; //declares new variable named a of type int and initialize
      System.out.printf("The number is:%d", a);*/
      
   } // closes method main 
} // closes class Arithmetic
