/*
ITM 251
Date: 4/25/17
Topic: Chapter 14 - Comparing strings
*/

public class StringCompare {//opens StringExample

   public static void main(String[] args) {//opens main
   
      String s1 = new String("hello");
      String s2 = new String("goodbye"); 
      String s3 = new String("Happy Birthday"); 
      String s4 = new String("happy birthday");
      String s5 = new String("goodby");
      
      System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
      
      if(s1.equals("hello"))
         System.out.printf("Strings s1 is equal to \"hello\"%n");
      else 
         System.out.printf("Strings s1 is not equal to \"hello\"%n");
         
         
      if (s1=="hello")
         System.out.printf("Strings s1 is the same object as \"hello\"%n");
      else 
         System.out.printf("Strings s1 is not the same object as \"hello\"%n");
         
      if (s3.equalsIgnoreCase(s4))
         System.out.printf("s3 and s4 are identical if you ignore case%n");
      else 
         System.out.printf("s3 and s4 are different%n");
   
   
      System.out.printf("%n%ns1.compareTo(s2) is %d%n",s1.compareTo(s2));
      System.out.printf("s2.compareTo(s1) is %d%n",s2.compareTo(s1));
      System.out.printf("s1.compareTo(s1) is %d%n",s1.compareTo(s1));
      System.out.printf("s3.compareTo(s4) is %d%n",s3.compareTo(s4));
      System.out.printf("s5.compareTo(s2) is %d%n",s5.compareTo(s2));
       
       
       
      if (s3.regionMatches(true,0,s4,0,5))
         System.out.println("First five chars of s3 and s4 are the same");
      else
         System.out.println("First five chars of s3 and s4 do not match");
       
       
      if (s1.regionMatches(true,4,s2,1,1))
         System.out.println("The last char in s1 is the same as the 2nd char in s2");
      else
         System.out.println("The last char in s1 is the same as the 2nd char in s2");
       
   
       
   
   }//closes main 


}//closes StringCompare

