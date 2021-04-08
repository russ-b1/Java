/*
Dice 
Methods and Random Numbers
2-21-17*/

import java.util.Scanner;
import java.security.SecureRandom;

public class diceSim {//opens class
   
   public static void main(String[] args)  {//opens method main
           
      Scanner input = new Scanner(System.in);
      System.out.println("How many sides does your die have?");
      int sides = input.nextInt();
      int one=0, two=0, three=0, four=0, five=0, six=0, thisRoll;
        
      for(int i=1; i<=1000; i++) {//opens for loop
         thisRoll = genNum(sides); //generate a random number for this iteration
         
         //values for random numbers rolled on the dice
         switch(thisRoll)  { //opens switch
            case 1:
               one++;
               break;
            case 2:
               two++;
               break;
            case 3:
               three++;
               break;
            case 4:
               four++;
               break;
            case 5:
               five++;
               break;
            case 6:
               six++;
               break;
            default:
               break;
         
         }// closes switch
         
      } //closes for loop
      
      
     //prints results of 1000 trials to screen
     // %8s creats an 8 character wide "column" to place a string into
      System.out.printf("%n%nYou rolled the die 1,000 times.%n");
      System.out.printf("%8s%12s%n","Value", "Frequency");
      System.out.printf("%8s%12s%n","1", one);
      System.out.printf("%8s%12s%n","2", two);
      System.out.printf("%8s%12s%n","3", three);
      System.out.printf("%8s%12s%n","4", four);
      System.out.printf("%8s%12s%n","5", five);
      System.out.printf("%8s%12s%n","6", six);
   
      
      //need to add code to print frequency table of results
      //System.out.printf("You just rolled a %d", genNum(sides));
      
      /*genNum(sides);
      System.out.printf("Outside the method, the value of sides is %d%n",sides);*/ 
   
   }//closes method main
   
   public static int genNum(int sides) {//opens method genNum
   
      SecureRandom randNums = new SecureRandom();
      //declares new variable called randNums
   //and assigns a SecureRandom object to it
     //generate a new random number using sides as a max possible value
      /*sides++;
      System.out.printf("Inside the method, value of sides is %d%n",sides);*/
      int result = randNums.nextInt(sides+1);
      
      
      return result; //send the random number back to method main
   
   
   }// closes method genNum
   
}//closes class 
   

