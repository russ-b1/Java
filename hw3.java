/*ITM 251-Spring 2017
Date; 2/22/17
Topic:HW3
*/

import java.util.Scanner; //imports scanner for user input

public class HW3 { //opens class HW3

   public static void main(String[] args) { //opens method main
   
      System.out.println("Welcome to the song lyric generator! \n"); // opens menu for user to read
   
      boolean replay = true; //creates boolean statement
      while (replay = true) { //opens while loop
      
         Scanner input = new Scanner(System.in); //create Scanner to obtain input from command window
         System.out.println("\n \nEnter 1 to see the lyrics for 99 bottles of beer on the wall \n"); //prompts the user for input
         System.out.println("Enter 2 to see the lyrics for 10 little monkeys \n"); //prompts the user for input
         System.out.println("Enter any other number to exit this program \n"); //prompts the user for input
         
      
         int num = input.nextInt(); //declares variable for 99 Bottles of Beer song   
         int beerNum = 99; //declares variable for 99 Bottles of Beer song
         String word = " bottles "; //declares string for 99 Bottles of Beer song
         
                    
         switch (num) {//perform different actions based on value of the 'num' variable
            case 1: //starts case 1 from menu
               System.out.println("\n \n99 Bottles of Beer on the Wall");
               do{//opens while loop
                  System.out.print(beerNum +  "" + word + "of beer on the wall," + beerNum + "" + word + " of beer, take one down, pass it around," );
                  beerNum -= 1;
                  System.out.println(beerNum +  "" + word + "of beer on the wall") ;
                  if (beerNum == 1)
                  {//opens if statement
                     word = " bottle ";} //closes if statement
               }while (beerNum > 0); //closes while loop
               break; //stops case 1
               
            case 2://starts case 2 from menu
               System.out.println("\n \n10 Little Monkeys");
               for(int i=10; i>0; i--){ //opens for loop
                  if (i == 1)
                  {//opens if statement
                     System.out.print(i+ " little monkeys jumping on the bed, one fell off and bumped his head,"+
                        "Momma called the doctor and the doctor said, Put those monkeys straight to bed!" ); 
                  }//closes if statement
                  else
                     System.out.println(i+ " little monkeys jumping on the bed, one fell off and bumped his head,"+
                        "Momma called the doctor and the doctor said, No more monkeys jumping on the bed!" );
               }//closes for loop
               break;//closes case 2 from menu
               
            default://option if any other number is entered at the menu
               System.out.println("Program exited"); 
               replay = false; 
         } //closes switch
      
      } //closes while loop
             
   } //closes method main
      
} //closes class HW3
