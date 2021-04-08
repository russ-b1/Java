/*ITM 251-Spring 2017
Date: 4/5/17
Topic:HW 6
 */

import java.util.Scanner;//imports scanner to read user input
import java.util.InputMismatchException;//imports InputMismatchException for error handling


public class RussellHW6 {//opens class RussellHW6


   public static void main (String[] args) {//opens main method
   
      double pointScored, total = 0; //declares and initializes double variables
      int counter=0;//declares and initializes int variable
      Scanner input = new Scanner(System.in);
   
   
   // creates two arrays that can not be modified
   //one array includes the assignment names
   //the other array includes the possible points that a student can earn
      final String[] assignment = {"HW1", "HW2", "HW3", "HW4", "HW5", "Exam1", "Exam2", "Quiz1", "Quiz2", "Quiz3", "Quiz4"};
      final int[] pointsPossible = {10, 20, 20, 20, 20, 100, 100, 10, 10, 10, 10};
   
   
      System.out.printf("ITM 251 - Spring 2016 Grade Calculator %n For each graded component, enter the number of points you earned.");//greets user and asks them for input
   
   
      //counter is designed to stop once the length of the assignments array is completed
      while(counter < assignment.length) {//opens while loop
         
         // program adds user input to pointScored and total
         //code accounts for exceptions from the user like entering a double outside of the valid points range or if they input the wrong type like a string
         
         try { //opens try block
            System.out.printf("%nPlease enter your score for %s: ", assignment[counter]);//prompts user for input
            pointScored = input.nextDouble();//stores user input 
            
            // uses scoreCheck method to see if input is within valid range
            scoreCheck(pointScored, pointsPossible, counter);
               
            // keeps running total of points
            total += pointScored;
            
            counter++;//adds 1 to the counter after each iteration
         } // closes try block
           
            //catches an IllegalArgumentException thrown from scoreCheck method
            //if IllegalArgumentException is caught, it is because the user input a value outside of the total possible points for the given assignment
         catch(IllegalArgumentException iae){//opens IAE catch
            
            // tells the user there has been an IllegalArgumentException, and shows them the proper range of accepted values for that assignment
            System.out.printf("The assignment %s can only accept values between 0 and %d.%n", assignment[counter], pointsPossible[counter]);
            
         } //closes IAE catch
            
         catch(InputMismatchException ime){//opens IME catch
            
            // tells the user there has been an IME, and prompts them to input a valid numeric score
            System.out.printf("Please enter a valid score in numeric format%n");
            input.nextLine();
            
         } // closes IME catch
         
      } // close while loop
      
      System.out.printf("%nYou have earned a %.2f out of 330 points so far.",total);//prints user's points earned out of 330 possible points so far
      
      double finalGrade = ((total/330)*100);//calculates student's grade
      System.out.printf("%nStudent's current grade is: %.2f%%%n", finalGrade);//displays student's current grade to screen
      
      
      //start of bonus points
      System.out.printf("%nFinal Grade Projections%n");//start of bonus section header
   
      final String[] letterGrade= {"A", "AB", "B", "BC", "C", "CD", "D"};//string array values for bonus 
      final int[] letterScore = {460, 440, 410, 390, 360, 340, 300};//int array values for bonus
   
   
      for (int i = 0; i < letterGrade.length; i++){//opens for loop  
       
         if((letterScore[i]-total) > 170){//if statement for points higher than needed for letter grade
         //tells student the number of points needed exceeds the 170 possible points remaining
            System.out.printf("It is impossible for you to earn a %s%n",letterGrade[i]);
         }
         else {//else statement to print the outcome for the student's possible grade 
         //tells student how many points out of 170 they need to get the letter grade from the bonus points array
            System.out.printf("You need %.2f points out of 170 remaining points to earn a %s%n",((letterScore[i]-total)), letterGrade[i]);
         }
        
      }//closes for loop
      
   } // close main method
	
	// method to check if the score the user input is valid based on the range of maximum possible points
   //exception will be thrown if the input is not valid   
   public static void scoreCheck(double pointScored, int[] pointsPossible, int counter){//opens method scoreCheck
   
      if(pointScored > pointsPossible[counter] || pointScored < 0){//values cannot be higher than possible points or lower than 0
         throw new IllegalArgumentException();//throws IllegalArgumentException
      	
      } // closes if statement
      
   } //closes scoreCheck method
  
} //closes class RussellHW6


