/*Bethany Russell
3-14-17
Topic: Chapter 7- Get and set methods
Dependencies:
This File:Student Driver*/

import java.util.Scanner;

public class StudentDriver {//opens class StudentDriver

   public static void main(String[] args) {//opensmain
      Scanner input = new Scanner(System.in);
      
      //create an array of student objects called 'myStudents'
      Student[] myStudents = new Student[3];
      
      String fName, lName;
      double e1, e2, e3;
      
      //prompt user to enter all information for a student
      //and loop to populate the entire array which is three for this example
      for(int i = 0; i < myStudents.length; i++) {//opens for loop
      //prompt user for input and store to local temp variables
         System.out.println("What is the student's first name?");
         fName = input.nextLine();
         System.out.println("What is the student's last name?");
         lName = input.nextLine();
         System.out.println("What is the student's exam1 score?");
         e1 = input.nextDouble();
         System.out.println("What is the student's exam2 score?");
         e2 = input.nextDouble();
         System.out.println("What is the student's exam3 score?");
         e3 = input.nextDouble();
         String garbage = input.nextLine();
      
      //take the local temp variables and send them to the student constructor to initialize a new object inside the array
         myStudents[i] = new Student(fName, lName, e1, e2, e3);
      }//closes for loop
   
   
      for (int i = 0; i < myStudents.length; i++) {//opens for loop
      
      //prints headers for output
         System.out.printf("%-20s%-20s%-8s%-8s%-10s%n", "First Name", "Last Name", "Exam 1", "Exam 2", "Exam 3", "Average");
      
      //loops through entire array of objects
      //and prints all values of instance variables for those objects
         System.out.printf("%-20s%-20s%-8s%-8s%-10s%n", myStudents[i].getFirstName(), myStudents[i].getLastName(), myStudents[i].getExam1(), myStudents[i].getExam2(), myStudents[i].getExam3(), myStudents[i].getAvg());
      
      }//closes for loop
   //create a new variable ccalled myStudent of type Studemt
   //instantiate a new object and assign it to that variable name
      //Student myStudent = new Student("Bethany","Russell", 75, 80, 85);
      /*
           
      System.out.println("What is the student's first name?");
      myStudent.setFirstName(input.nextLine());
      
      System.out.println("What is the student's last name?");
      myStudent.setLastName(input.nextLine());
      System.out.printf("Student's full name is: %s %s", myStudent.getFirstName(), myStudent.getLastName());
      */
      
      //System.out.printf("%-20s%-20s%-8s%-8s%-10s%n", "First Name", "Last Name", "Exam 1", "Exam 2", "Exam 3", "Average");
      //System.out.printf("%-20s%-20s%-8s%-8s%-10s%n", myStudent.getFirstName(), myStudent.getLastName(), myStudent.getExam1(), myStudent.getExam2(), myStudent.getExam3(), myStudent.getAvg());
      
   }//closes main
   
}//closes class StudentDriver
