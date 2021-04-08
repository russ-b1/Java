/*ITM 251-Spring 2017
Date; 1/24/17
Topic: Chapter 3- Sentinel Controlled Loops
*/

import java.util.Scanner;
   
public class SentinelLoop {// opens class SentinelLoop
   
   public static void main(String[] args) {//opens method main
      
      Scanner input = new Scanner(System.in);
      int curGrade;
      int counter = 0;
      int runningTotal = 0;
      double classAverage = 0;
       
       //prompt user for initial entry of grade and store into curGrade
      System.out.println("Please enter a student grade or enter a -1 to finish grade entry: ");//prompt user for grade (integer)
      curGrade = input.nextInt();
         
        //so long as the value entered by the user is not equal to -1
        //continue to iterate the loop. if itis = -1, loop will end 
      while (curGrade != -1) {//opens while loop
       
         System.out.print("You are inside the loop");
         
         //add the grade entered by the user to the running total
         runningTotal += curGrade;
         counter++;//increment counter by 1
         //before iterating the loop
         //ask user for another grade entry
         System.out.println("Please enter a student grade or enter a -1 to finish grade entry: ");//prompt user for grade (integer)
         curGrade = input.nextInt();
      }//closes while loop
      
      //calculate class average by dividing runningTotal by the number of grades
      classAverage = runningTotal / counter;
      //print results to the screen
      System.out.printf("%nThere are %d students in this class", counter);
      System.out.printf("%nThe class average was %.2f", classAverage);
      System.out.printf("%nIF I square the average it is %.2f", Math.pow(classAverage,2));
      
   } //closes method main 
}//closes class
   

