/*ITM 251: Application Development
Date: 1/31/17
Topic:Chapter 3- If and IfElse
*/

import java.util.Scanner; //imports Java package to receive input from user

public class GradeCalc { //opems class GradeCalc
   
   public static void main(String[] args) { //opens method main
   
      Scanner input = new  Scanner(System.in);
      
      System.out.println ("Please enter student's first name: ");
      String theFirstName = input.nextLine();//nextLine reads values as strings
      
      System.out.println ("Please enter student's last name: ");
      String theLastName = input.nextLine();
      
      System.out.println ("Please enter student's grade: ");
      double theGrade = input.nextDouble();
      
      
      System.out.printf(theGrade>=60? "Pass%n" : "Fail%n");
      
      if (theGrade >=90)
         System.out.printf("%s %s has received an A",theFirstName, theLastName);
      else if(theGrade >=80)
         System.out.printf("%s %s has received a B", theFirstName, theLastName); 
      else if(theGrade >=70)
         System.out.printf("%s %s has received a C", theFirstName, theLastName);
      else if(theGrade >=60) 
         System.out.printf("%s %s has received a D", theFirstName, theLastName);
      else
         System.out.printf("%s %s has received a F", theFirstName, theLastName);
               
     
     
     
     
     
     
   } //closes method main

} //closes class GradeCalc 
