/*ITM 251-Spring 2017
Date; 3/21/17
Topic:Project 5
 */

public class RussellHW5Team { //opens RussellHW5Team class

   //declares and initializes variables
   private String mascot;
   private boolean home;
   private int points=0, total=0;
  
   public RussellHW5Team(String mascot, boolean home, int points) {//opens constructor  
      this.mascot = mascot;
      this.home = home;
      this.points = points;
   } //closes constructor

   public String getMascot() {//opens getMascot
      return mascot;
   }//closes getMascot
  
   public boolean getHome() {//opens getHome
      return home;
   } //closes getHome
  
   public int getPoints(){//opens getPoints
      return points;
   }//closes getPoints
   
   public void setMascot(String mascot){// opens setMascot
      this.mascot = mascot;
   }//closes setMascot
  
   //method to add up the team's score
   public int getTotal() {//opens getTotal
      return total;
   }//closes getTotal
      
   public void setTotal(int points) {//opens setTotal
      this.points = points;
   	// validates if the points entered are valid for American football
   	// if the points entered are not valid, an exception will be thrown
      if (points < 1 || points == 4 || points == 5 || points > 6){
         throw new IllegalArgumentException();
      }	
      total += points; // adds to total number of points
   } //closes setTotal
       
} //closes RussellHW5Team class
