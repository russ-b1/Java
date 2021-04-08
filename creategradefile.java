/*
4-13-17
Chapter 15: Writing Records to a File
*/

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateGradeFile { //opens class CreateGradeFile
   
   private static Formatter output;//formatter establishes a connection and formats output to be sent out to an external file
   
   public static void main(String[] args) {//opens main
    
      openFile();
      addRecords();
      closeFile();
     
   }//closes main
     
   public static void openFile() {//opens OpenFile
     
      try {//opens try
      //link the output object to a text file named "grades.txt"
      //that file will be located in the same directory as this .java file
         output = new Formatter("grades.txt");
      }//closes try
      catch(SecurityException se) {//opens catch
         System.err.println("Write permissions denied. Terminating program");
         System.exit(1);//forces program to close
      }//closes catch
      catch(FileNotFoundException fnfe) {//opens catch
         System.err.println("Error opening file. Terminating program.");
         System.exit(1);//forces the program to close
      }//closes catch
     
   }//closes OpenFile
     
   public static void addRecords() {//closes addRecords
      Scanner input = new Scanner(System.in);
     
      System.out.printf("Enter the student's first name, last name, exam 1 score, and exam 2 score and hit enter%n");
      //hasNext() will return a boolean to tell you whether the user has entered more information
      
      while(input.hasNext()) {//opens while loop
      
         try{ //opens try
         //reads values entered by user and formats them to be written to the file
            output.format("%s %s %f %f%n", input.next(), input.next(), input.nextDouble(), input.nextDouble());
         }//closes try
         catch (InputMismatchException ime) {//opens IME catch
            System.err.println("Input did not match the format: string, string, double, double");
            input.nextLine();
         }//closes IME catch
         catch (NoSuchElementException nse) {//opens NSE caatch
         //NSE would occur if user does not provide data that matches the 
         //exact format specified above in terms of number and type of data
            System.err.println("Invalid input format, try again");
            input.nextLine();
         }//closes NSE catch
         catch (FormatterClosedException fce) {//opens FCE catch
         //occurs if the output formatter gets closed for some reason
            System.err.println("Error writing to tfile, terminating program");
            break;
         }//closes FCE catch
      }//closes while loop
     
   }//closes addRecords
     
     
   public static void closeFile() {//opens closeFile
   //if output is null then the object has gone away
   //if the object isn't null then we need to detach it from the text file that is is holding onto
      if(output!=null)
         output.close();
     
   }//closes  closeFile


}//closes class CreateGradeFile
