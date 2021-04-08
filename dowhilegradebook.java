/*ITM 251-Spring 2017
Date; 2/7/17
Topic: Do While loop
*/

import java.util.Scanner;

public class DoWhileGradeBook{//opens up class DoWhileGradebook

   public static void main (String[] args) {//opens method main
   
      Scanner input = new Scanner(System.in);
      int counter = 1;
      int runningTotal = 0;
      double classAverage = 0;
      
   
      do {//opens while loop
         System.out.println("Please enter a student grade: ");//prompt user for grade (integer)
         runningTotal += input.nextInt();//increase runningTotal by value entered by user
         counter++;
      }while (counter <5); //closes while loop
             
      classAverage = runningTotal / counter;
      System.out.printf("%nClass average is: %,.2f", classAverage);
   
   
   
   } //closes method main
   
}//closes class 

