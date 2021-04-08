/*ITM 251-Spring 2017
Date; 2/7/17
Topic:Project 2
*/

import java.util.Scanner; //imports Scanner class to read input from user

public class Project2 { //opens class Project2
   
   public static void main(String[] args) { //opens method main
      
      Scanner input = new Scanner(System.in); //create Scanner to obtain input from command window
     
     //initializing phase
      int sales = 0; //initialize monthly sales
      int salesCounter = 0; //initialize number of sales entered so far
      int basePay = 1000; //declares integer variable BasePay at $1,000
      double commissionRate = 0.0; //declares double variable commissionRate 
        
      //processing phase
      //prompt for input and read sales amount from user
      System.out.print("Please enter a sale amount or enter -1 to finish entering sales  and calculate gross pay: ");//prompts user to enter sale amount for employee
      int sold = input.nextInt();
      
      //loop until sentinel value read from user
      while (sold > 0)
      {
         sales = sales + sold; //add sold to total
         
         //prompt for input and read sale from user
         System.out.print("Please enter a sale amount or enter -1 to finish entering sales and calculate gross pay: ");//prompts user to enter sale amount for employee
         sold = input.nextInt(); //store integer as variable sold unless value -1 is entered
      }
        
      if (sales > 10000) 
         commissionRate=.10; //if the total sales value is greater than $10,000, then the commission rate is 10% 
      else if (sales > 5000)
         commissionRate=.08; //if the total sales value is less than or equal to $10,000, then the commission rate is 8%
      else
         commissionRate=.06; //if the total sales value is less than $5,000, then the commission rate is 6%
          
          
              
      System.out.printf("Monthly sales total: %d%n", sales); //display monthly sales total equal to sum of all sales for employee to screen
      System.out.printf("Commission rate: %.2f%n", commissionRate); //display commission rate calculated from if else statement for employee to screen  
      System.out.printf("Base pay: %d%n", basePay); //display base pay of commission for employee to screen
      System.out.printf("Commission amount: %.2f%n",(double)sales* commissionRate); //display commission amount which equals sales times commission rate for employee to screen 
      System.out.printf("Total gross pay: %.2f%n",(double) sales * commissionRate + (double)basePay); //display total gross pay which equals base plus commission value for employee to screen
      
      
      
   } //closes method main
      
      
} //closes class Project2

