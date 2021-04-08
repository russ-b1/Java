/*Chapter 8:*/


public class DateExamples{//opens class DateExamples

   public static void main (String[] args) {
   
      
      Dates d1 = new Dates();
      Dates d2 = new Dates(2016);
      Dates d3 = new Dates(2016, 3);
      Dates d4 = new Dates(2016, 3, 21);
      Dates d5 = new Dates(d3);
           
      System.out.println("Results of different constructors");
      displayDate("d1: default constructor", d1);
      displayDate("d2: Year only", d2);
      displayDate("d3: Month and year",d3);
      displayDate("d4: Month, day, and year", d4);
      displayDate("d5: copy of the d3 object", d5);
      
      try {//opens try
         Dates d6 = new Dates(2000, 2, 30);
         displayDate("d6: obejct inside of try block", d6);
      }//closes try
      catch(IllegalArgumentException e) {//opens catch
         //getMessage method retrieves the string value that
         //was specified when the exception was thrown
         System.out.printf("%nException while initializing object: %s%n", e.getMessage());
      }//closes catch  
   
   } //closes  main
  
   
   public static void displayDate(String header, Dates d) {//opens displayDate
      System.out.printf("%s%n%s%n", header, d.formatDate());
   }//closes displayDate
   
   
}//closes class DateExamples

class Dates {//opens class dates
	
	// decalre instance variables
   private int year, month, day;
   
   public Dates() {//opens default constructor
   //calls the master constructor
   //and provides a default date of Jan 1, 1900
      this(1900,1,1); 
   }//closes default constructor
   
   public Dates(int year) {//opens default constructor
   //takes the year specified and adds Jan 1st for the month and day
   //and sends off to the master constructor 
      this(year, 1,1);
   }//closes default constructor
  
   
   public Dates(int year, int month) {//opens default constructor
   //takes the year and month specified and adds 1st for the day
   //and sends off to the master constructor
      this(year, month, 1);
   }//closes default constructor
   
   public Dates(int year, int month, int day) {//opens master cosntructor
      
      if(year<0) 
         throw new IllegalArgumentException("Year cannot be negative");
      if(month < 1 || month > 12)
         throw new IllegalArgumentException("Month must be between 1 and 12");
      if(day < 1 || day > 31)
         throw new IllegalArgumentException("Day must be between 1 and 31");
   
      this.year = year;
      this.month= month;
      this.day = day;
      
   }//closes master constructor


   public Dates(Dates dateCopy) {//opens constructor that makes copy of existing object
      //need to use get methods to pull values of instance variables
      //tied to the object that was passed to us as a paramter
      this(dateCopy.getYear(), dateCopy.getMonth(), dateCopy.getDay());
   }//closes constructor for making copies


   public int getYear() {//opens getYear
      return year;
   }//closes getYear
   
   
   public int getMonth() {//opens getMonth
      return month;
   }//closes getMonth
   
   
   public int getDay() {//opens getDay
      return day;
   }//closes getDay
   
   
   public String formatDate() {//opens formatDate
   //the 02 in between % and d means that it should
   //force the display of 2 digits, even if the integer only
   //contains one digit
      return String.format("%02d/%02d/%02d", month, day, year);
   }//closes formatDate
  
  
}//closes class Dates
