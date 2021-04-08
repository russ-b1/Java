/*
Dice 
Methods and Random Numbers
2-21-17*/

import java.security.SecureRandom;

public class diceSimArray {//opens class
   
   public static void main(String[] args)  {//opens method main
          
      int [] frequency = new int[6];
      
      for(int i=1; i<=1000; i++) {//opens for loop
         ++frequency[genNum()]; 
      } //closes for loop
      
     //prints results of 1000 trials to screen
     // %8s creats an 8 character wide "column" to place a string into
      System.out.printf("%n%nYou rolled the die 1,000 times.%n");
      System.out.printf("%8s%12s%n","Value", "Frequency");
      
      for(int i = 0; i < frequency.length; i++) {//opens for loop
         System.out.printf("%8d%12d%n", i+1, frequency[i]);
      }//closes for loop
      
              
      //need to add code to print frequency table of results
      //System.out.printf("You just rolled a %d", genNum(sides));
      
      /*genNum(sides);
      System.out.printf("Outside the method, the value of sides is %d%n",sides);*/ 
   
   }//closes method main
   
   public static int genNum() {//opens method genNum
   
      SecureRandom randNums = new SecureRandom();
      //declares new variable called randNums
   //and assigns a SecureRandom object to it
     //generate a new random number using between 0 and 5
      int result = randNums.nextInt(6);
      
      return result; //send the random number back to method main
   
   
   }// closes method genNum
   
   
   
   
}//closes class 
   

