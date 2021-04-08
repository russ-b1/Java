/*ITM 251-Spring 2017
Date; 3/21/17
Topic:Project 5
*/

import java.util.Scanner;//imports Scanner to accept user input

public class RussellHW5Driver {//opens class RussellHW5Driver

   public static void main(String[] args) {//opens main method
      Scanner input = new Scanner(System.in);
      
      System.out.println("Football Scorekeeper Application");
      
      //initializes variables
      boolean repeat = true;
      int points=0, whoScored=0;
      
      System.out.printf("Please enter the name of the home team:%n");//prompts user for input
      RussellHW5Team homeTeam = new RussellHW5Team(input.nextLine(), true, points);//constructs object named homeTeam
   
   
      System.out.printf("Please enter the mascot of the away team:%n");//prompts user for input
      RussellHW5Team awayTeam = new RussellHW5Team(input.nextLine(), false, points);//constructs object named awayTeam
   
   
      while (repeat==true){//opens while loop
         System.out.printf("%nEnter 1 if %s just scored, enter 2 if %s just scored, or enter any other number to denote the game has ended %n", homeTeam.getMascot(), awayTeam.getMascot());//prompts user for input
         whoScored = input.nextInt();
      
        
         switch (whoScored) {//opens switch
            case 1: 
            //case 1 for home team
            //adds to total points for home team
               System.out.printf("How many points did %s score? %n", homeTeam.getMascot());
                
               try{//sends value to setTotal
                  homeTeam.setTotal(input.nextInt());
               }
               catch(IllegalArgumentException e){//if invalid number is entered, exception will be thrown and caught and will inform the user to input a different value
                  System.out.printf("%nThat is not a valid number of points that can be scored in American Football, please enter a different number%n");
               }
               break;//stops code from continuing on in switch
            
            case 2: 
            //case 2 for away team
            //adds to total points for away team
               System.out.printf("How many points did %s score? %n", awayTeam.getMascot()); 
               try{//sends value to setTotal
                  awayTeam.setTotal(input.nextInt());
               }  
               catch(IllegalArgumentException e){//if invalid number is entered, exception will be thrown and caught and will inform the user to input a different value
                  System.out.printf("%nThat is not a valid number of points that can be scored in American Football, please enter a different number%n");
               }
               break;//stops code from continuing on in switch
            
            default:
            //default case if 1 or 2 are not entered by user
            //ends the game
            //prints the team names and final score
               System.out.printf("%nThe final score was: %n"+
                  "%20s%8d%n%20s%8d", homeTeam.getMascot(), homeTeam.getTotal(), awayTeam.getMascot(), awayTeam.getTotal());
               repeat = false; // stops the loop
               break; // prevents code from continuing on in switch
            
         }//closes switch
      
         if (whoScored==1 || whoScored==2) //if statement to display current score if 1 or 2 is entered and a new score is added
            System.out.printf("%nThe current score is: %n"+
                  "%20s%8d%n%20s%8d", homeTeam.getMascot(), homeTeam.getTotal(), awayTeam.getMascot(), awayTeam.getTotal());
          
      }//closes while
      
   } //closes for loop
     
}//closes main method
   
   
            
