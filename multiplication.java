/*ITM 251: Application Development
Date: 1/31/17
Topic:Chapter 3- While Loops and Breakpoints
*/

public class Multiplication { //opens class Multiplication

   public static void main(String[] args) { //opens method main
   
      int num = 3, counter =1;
      
      //execute the looop so long as the variable counter has a value
      //less than or equal to 10
      while(counter>=10) {//opens while loop
         System.out.println(num*counter);
         counter++;  
      } //closes while loop       
     
   } //closes method main
   
} //closes class Multiplication
