/* 
ITM 251 F
4-4-17
Chapter 12: DialogBoxes
*/

import javax.swing.JOptionPane;

public class DialogExample {//opens class dialogexample

   public static void main(String[] args) {//opens main
   
   /*
      String firstName = JOptionPane.showInputDialog("Please enter your first name");
      String lastName = JOptionPane.showInputDialog("Please enter your last name");
      
      JOptionPane.showMessageDialog(null, "The full name is: " + firstName + " " + lastName, "Full Name", JOptionPane.ERROR_MESSAGE);
   */
   
   
   //begin section asking for 2 integers, add them together and print result to message dialog box
   
      String firstInt = JOptionPane.showInputDialog("Please enter an integer");
      String lastInt = JOptionPane.showInputDialog("Please enter an integer");
      
      int int1 = Integer.parseInt(firstInt);
      int int2 = Integer.parseInt(lastInt);
   
     
      JOptionPane.showMessageDialog(null, "The first integer is: " + (int1 + int2), "The sum is", JOptionPane.PLAIN_MESSAGE);
   
   }//closes main


}//closes class dialogexample
