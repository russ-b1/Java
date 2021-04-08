/*ITM 251-Spring 2017
Date; 2/27/17
Topic: Homework 4
 */

import java.util.Scanner; //imports scanner to read user input
import java.security.SecureRandom; //imports function to generate random number

public class HW4 {//opens class HW4
   
   public static void main (String[] args) {//opens method main
   
      int num=0; //initializes num variable 
      int result = generateAnswer(num); 
      Scanner input = new Scanner(System.in); 
   
      for(int i = 1;; i ++) {//opens for loop
      
         System.out.println("Please enter a number between 1 and 50"); //prompts user for input
      
         int guess = input.nextInt(); 
         int checked = checkGuess(guess, result);
         
      
      //if statements to determine what the program should display to the user based off of their guess in relation to the result
         if (checked==1)//too low
            System.out.printf("That is incorrect, please enter a number higher than %d%n",guess);
         else if (checked==2)//too high
            System.out.printf("That is incorrect, please enter a number lower than %d%n",guess); 
         if (checked==0) {//correct
            System.out.printf("Congratulations, the correct answer was %d. It took you %d attempts", guess,i);
            break;
         }//closes if statement
         
      }//closes for loop
         
   } // closes method main
   
   public static int generateAnswer(int num) { //opens method generateAnswer
   
      SecureRandom randNums = new SecureRandom();
      int result = randNums.nextInt(50);
     
      return result;
      
   }//closes method generateAnswer
   
   public static int checkGuess(int guess, int result) {//opens method checkGuess
   
      int correct = 0, low = 1, high = 2;//declares varibales for guess values in relation to result values
   
   //if statements to determine what value the guess/result relationship gets 
      if (guess > result)
         return high;
      else if (guess < result)
         return low;
      else
         return correct;
      
   } // closes method checkGuess 
   
} // closes class HW4

