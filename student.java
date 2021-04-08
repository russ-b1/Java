/*
3-14-17
Topic: Chapter 7- Get and set methods
Dependencies:
This File:Student Class 
*/

public class Student {//opens student class 

   private String firstName, lastName;
   private double exam1, exam2, exam3;
   
   public Student(String firstName, String lastName, double exam1, double exam2, double exam3){//opens constructor
      this.firstName = firstName;
      this.lastName = lastName;
      this.exam1 = exam1;
      this.exam2 = exam2;
      this.exam3 = exam3;
   
   }//closes constructor
   
   public String getFirstName() {//opens getFirstName
      return firstName;
   }//closes getFirstName
   
   public String getLastName() {//opens getLastName
      return lastName;
   }//closes getLastName

   public double getExam1() {//opens getExam1
      return exam1;
   }//closes getExam1
   
   public double getExam2() {//opens getExam2
      return exam2;
   }//closes getExam2
   
   public double getExam3() {//opens getExam3
      return exam3;
   }//closes getExam3
   
   public void setFirstName(String fName) {//opens setFirstName
      firstName = fName;
   }//closes setFirstName
      
   public void setLastName (String lastName) {//opens setLastName
      //this keyword points back to the object
      //therefore, code takes the paramter called "lastName"
      //and assigns the value to the instance variable called "lastName"
      this.lastName = lastName;
   }//closes setLastName

   
   public void setExam1 (double exam1) {//opens setExam1
      this.exam1= exam1;
   }//closes setExam1
   
   public void setExam2 (double exam1) {//opens setExam2
      this.exam1= exam2;
   }//closes setExam2
   
   public void setExam3 (double exam1) {//opens setExam3
      this.exam1= exam3;
   }//closes setExam3
   
   //method to calculate and return the student's exam average of three exams
   public double getAvg() {//opens getAvg
      return (exam1 + exam2 + exam3)/3;
   
   }//closes getAvg

}//closes student class
