/*
2-23-17
Topic: Overload methods */

public class OverloadExample {//opens class
   public static void main(String[] args) {//opens main
   
      double big;
   
      big = biggerNum(34.123, 12.44);
      System.out.printf("The bigger number is %f%n", big);
   
      big = biggerNum(34.123, 12.44, 65.33);
      System.out.printf("The bigger number is %f%n", big);
   
   }//closes main
   
   public static double biggerNum(double a, double b)  {//opens biggerNum with 2 parameters
      double big;
      if (a>=b)
         big = a;
      else 
         big = b;
      return big;
   }//closes method biggerNum with 2 parameters
   
   public static double biggerNum(double a, double b, double c) {//opens biggerNum with 3 parameters
      double big;
      if (a>=b)
         big = a;
      else
         big = b;
      if (big < c)
         big = c;
      return big;
   }//closes biggerNum with 3 parameters
   
}//closes class
