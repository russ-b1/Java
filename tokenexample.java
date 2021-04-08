/*
ITM 251
Date: 4/27/17
Topic: Chapter 14 - string tokenizing
*/


import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenExample {//opens StringExample

   public static void main(String[] args) {//opens main
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter all of your grades, separated by a comma.");
      String entry = input.nextLine();
       
      String[] grades = entry.split(",");
      System.out.printf("Number of grades entered: %d%nIndividual grades are: %n", grades.length);
       
      for(String grade: grades)
         System.out.println(grade);
         
   }//closes main 

}//closes StringCompare

