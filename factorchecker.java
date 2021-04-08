/*ITM 251

Topic: while loops w boolean */

import java.util.Scanner;

public class FactorChecker {//opens class
   
   public static void main(String[] args) {//opens method
   
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a positive integer");
   
      int num = input.nextInt();
      int countdown = num - 1;
      boolean prime = true;
   
   //continue the loop so long as we still think the number is prime
      while (prime) {//opens while loop
         if (num % countdown == 0)
            prime = false;
            
         if (countdown <= 2)
            break;
      
         countdown--; //decrease countdown by one 
      
      
      } //closes while loop
      
      System.out.print(prime);
      
   } //closes method
   
}//closes class
