/*ITM 251-Spring 2017
Date; 2/2/17
Topic: While loops and sentinel control
*/

import java.util.Scanner;

public class GradeBook{//opens up class Gradebook
   
   public static void main (String[] args) {//opwna method main
      
      Scanner input = new Scanner(System.in);
      int counter = 1;
      int runningTotal = 0;
      double classAverage = 0;
      
      
      // demo of while look that executes 5 times
      while (counter <=5) {//opens while loop
         System.out.println("Please enter a student grade: ");//prompt user for grade (integer)
         runningTotal += input.nextInt();//increase runningTotal by value entered by user
         counter++;
      }//closes while loop
         
         
      classAverage = runningTotal / (counter-1);
      System.out.printf("%nClass average is: %,.2f", classAverage);
      
      //end of while loop section
      /*
    //same functionality as the previous while loop
    //but executed using a for loop     
      for (int i = 1; i <= 5; i++){ //opens for loop
         System.out.println("Please enter a student grade: ");
         runningTotal += input.nextInt();
         counter = i;
      } //closes for loop
         
      classAverage = runningTotal / (counter);
      System.out.printf("%nClass average is: %,.2f", classAverage);
      //end for loop demo*/
        
                 
   }//closes method main
         
}//closes class Gradebook
