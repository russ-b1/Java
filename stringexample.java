/*
ITM 251
Date: 4/25/17
Topic: Chapter 14 - String methods
*/

public class StringExample {//opens StringExample

   public static void main(String[] args) {//opens main
   
      char[] charArray = {'H','e','l', 'l', 'o', ' ', 'w', 'o', 'r','l','d'};
      String s = "Goodbye";
      char[] charArray2 = new char[2];
      
      String s1 = new String();//default constructor. empty value
      String s2 = new String(charArray); //value will be hello world
      String s3 = new String(charArray, 6, 5); //extracts 5 characters beginning w/ position 6
      String s4 = new String(s);//passes it another string
      
      System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
      System.out.printf("The length of s2 is: %s%n", s2.length());
      System.out.printf("The third character in s3 is: %s%n", s3.charAt(2));
      //Extract the 4th and 5th characters from s4 and put it into charArray2. Print contents of charArray2
      s4.getChars(3,5,charArray2,0);
      System.out.print("The values in charArray2 are: ");
      for(char character: charArray2)
         System.out.print(character);
      
     
      
   
   }//closes main 


}//closes StringExample

