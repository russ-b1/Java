/*ITM 251-Spring 2017
Date: 4/5/17
Topic:HW 6
 */

public class RussellHW6Grades { //opens RussellHW6Grades class

   //declares and initializes variables
   private String assignment;
   private int points=0, total=0;
   
   
   public RussellHW6Grades(String assignment, int points) {//opens constructor  
      this.assignment = assignment;
      this.points = points;
   } //closes constructor
   
   public String getAssignment() {//opens getAssignment
      return assignment;
   }//closes getAssignment
   
   public String getPoints() {//opens getPoints
      return points;
   }//closes getPoints
   
   public void setAssignment(String assignment){// opens setAssignment
      this.assignment = assignment;
   }//closes setAssignment
   
   //method to add up the student's score
   public int getTotal() {//opens getTotal
      return total;
   }//closes getTotal
   
   public void setTotal(int points) {//opens setTotal
      this.points = points;
   	// validates if the points entered are valid for the assignment type
   	// if the points entered are not valid, an exception will be thrown
      if (points < 0 || points > 100) {
         throw new IllegalArgumentException();
         throw new InputMismatchException();
      }	
      total += points; // adds to total number of points
   } //closes setTotal
   
}//closes class RussellHW6Grades 

