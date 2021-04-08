/*
4-18-17
Topic: Chapter 15 -Reading data from a text file
*/

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProcessGrades { //opens ProcessGrades

   private static Scanner x;

   public static void main(String[] args) {//opens main
      openFile();
      readRecords();
      closeFile();
        
   }//closes main
   
   public static void openFile() {//opens OpenFile
   
      try {//opens try 
      
      //creates a new sscanner object that is linked to the file specified
      //in the Paths.get() method
         input = new Scanner(Paths.get("grades.txt"));
      
      }//closes try
      catch (IOException ioe) {//opens IOE catch
         System.err.println("Error opening file. Program will terminate.");
         System.exit(1);
      }//closes IOE catch
   
   }//closes OpenFile
   
   public static void readRecords() {//opens ReadRecords
      System.out.printf("%-20s%-20s%-8s%-8s%-12s%n", "First name", "Last name", "Exam 1", "Exam 2", "Exam Average");
      String fName[] = new String[3];
      String lName[] = new String[3];
      double exam1[] = new double [3];
      double exam2[]= new double[3];
      double examAvg[] = new double[3];
      int i = 0;  
      
      try {//opens try 
         while(input.hasNext()) {//opens while
            fName[i] = input.next();
            lName[i] = input.next();
            exam1[i] = input.nextDouble();
            exam2[i] = input.nextDouble();
         
            examAvg[i] = (exam1[i] + exam2[i])/ 2;
            System.out.printf("%-20s%-20s%-8.2f%-8.2f%-12.2f%n", fName[i], lName[i], exam1[i], exam2[i], examAvg[i]);
            i++;
         }//closes while
            
         double exam1Sum =0, exam2Sum=0, examAvgSum=0;
         for (int j = 0; j < exam1.length; j++);
         { //opens for
            exam1Sum += exam1[j];
            exam2Sum += exam2[j];
            examAvgSum += examAvg[j];
         }//closes for
            
         System.out.printf("%-20s%-20s%-8.2f%-8.2f%-12.2f%n", "", "Class Averages", exam1Sum/3, exam2Sum/3, examAvgSum/3);
            
      }//closes try
      
      catch (NoSuchElementException nsee) {//opens NSEE catch
         System.err.println("File is improperly formed, terminating program");
         System.exit(1);
      }//closes NSEE catch
      catch(IllegalStateException ise) {//opens ISE catch
         System.err.println("Error reading from file, terminating program");
         System.exit(1);
      }//closes ISE catch
   }//closes ReadRecords
   
   public static void closeFile() {//opens CloseFile
      if (input != null)
         input.close();
      
      
   }//closes CloseFile


}//closes ProcessGrades
