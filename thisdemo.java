/* ITM 251
Chapter 8: Multiple Classes one java file and this keyword illustration
Dependencies: within this package, ThisDemo serves as the driver class
and TheOther class is a dependent class */


public class ThisDemo {//opens class ThisDemo

   public static void main(String[] args) {//opens main
   //use displayNumber method inside class "ThisDemo" to display a phone number
      System.out.println(displayNumber(774,269,3094));
      //create new object of type"TheOther" and call it "one"
      //use constructor call to initialize it with three integer values
      TheOther one = new TheOther(774,269,6891);
      //call the displayNumber method in class "TheOther" and print result to the screen
      System.out.println(one.displayNumber());
      TheOther two = new TheOther(774,269,3971);
      System.out.println(one.displayNumber());
      
      System.out.println(two.displayNumber());
   }//closes main
   
   public static String displayNumber(int areaCode, int exchangeCode, int subscriberNumber) { //opens displayNumber
      return String.format("%25s:  (%d)%d-%d",  "ThisDemo.displayNumber()", areaCode, exchangeCode, subscriberNumber);
   }//closes method displayNumber in ThisDemo class
   
}//closes class ThisDemo


class TheOther {//opens class TheOther

   private int areaCode, exchangeCode, subscriberNumber;
   
   public TheOther(int areaCode, int exchangeCode, int subscriberNumber) {//opens constructor
      this.areaCode = areaCode;
      this.exchangeCode = exchangeCode;
      this.subscriberNumber = subscriberNumber;
   }//closes constructor
   
   public String displayNumber() {//opens displayNumber
      System.out.println("Processing instance variable values of the object created from TheOther class:");
      return String.format("%25s:  %s%n%25s:  %s%n", "convertString()", "convertString()", "this.convertString()", this.convertString());
   }// closes displayNumber
  
   
   public String convertString() { //opens convertString
      //String.format is a standard method that allows you to create/manipulate Strings
      //It does not need to be imported (just like System.out does not need to be imported)
      //it works in a similar way to System.out.printf, using the same symbols to 
      //concatenate values together into a string. But it does not print anything
      //to the screen, rather it returns a single String value
      return String.format("(%d)%d-%d", areaCode, exchangeCode, subscriberNumber);
      
   }//closes convertString

} //closes class TheOther
