/*ITM 251-Spring 2017
Date; 1/31/17
Topic:Project 1
 */

import java.util.Scanner; //imports Scanner class to read input from user

public class Project1{ // opens class Project1    

   public static void main(String[] args) { // opens method main
      
      Scanner input = new Scanner(System.in);
      int t = 8;//declares integer variable
      int u = 3;//declares integer variable
      double x = 3.14;//declares double variable
      double y = 1.88;//declares double variable   
         
      System.out.println ("Please enter an integer: ");//wait for user to enter integer
      int userInt = input.nextInt();//declares variable of type integer
               
      System.out.println ("Please enter a number with two decimals: ");//wait for user to enter double
      double userDouble = input.nextDouble();//declares variable of type double
      
      
      System.out.printf("t plus u= %d%n", t + u);
      
      System.out.printf("userInt minus u= %d%n", userInt - u);
      
      System.out.printf("u divided by userInt= %d%n",u / userInt); 
      
      System.out.printf("The remainder after dividing u by t= %d%n",u % t);
      
      System.out.printf("userInt times t= %d%n", userInt * t);
      
      System.out.printf("x plus userDouble= %f%n", x + userDouble);
      
      System.out.printf("x minus y= %f%n ", x - y);
      
      System.out.printf("userDouble divided by x= %f%n", userDouble / x);
      
      System.out.printf("y times x= %f%n", y * x);
      
      System.out.printf("multiply x times the remainder after dividing y by userDouble= %f%n",(y % userDouble)*x);
      
     
   } // closes method main
             
}  //closes class Project1
 
 
 
 
