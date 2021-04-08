/*
ITM 251
Date: 4/27/17
Topic: Chapter 14 - regular expression
*/


import java.util.Scanner;
   
public class Validate {//opens StringExample

   public static void main(String[] args) {//opens main
   
      Scanner input = new Scanner(System.in);
      String name, phone;
      
      System.out.println("Please enter your full name");
      name = input.nextLine();
      
      if (name.matches("[A-Z][A-z']* [A-Z][A-z']*"))
         System.out.println("That appears to be a real name");
      else 
         System.out.println("That's not a real name!");
      
      System.out.println("Pleae enter your phone number in the format XXX-XXX-XXXX");
      phone = input.nextLine();
      
      if (phone.matches("\\d{3}[ -]\\d{3}[ -]\\d{4}"))
         System.out.println("Congrats, you can follow instructions");
      else
         System.out.println("What's wrong with you?");
     
   }//closes main 

}//closes StringCompare

