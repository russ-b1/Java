/*
ITM 251
Date: 4-6-17
Topic: chapter 12 GUI layout
*/

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//extends keyword will create a subclass of the superclass
//listed after it

public class FrameLayout extends JFrame {//opens FrameLayout Class
   private final JLabel label1;
   private final JLabel label2;
   private final JTextField textField1, textField2, textField3;
   private final JPasswordField passwordField1;
  
   
   //define the constructor that will build the GUI layout upon program execution
   public FrameLayout() {//opens constructor
     //sends app title back to the superclass constructor
      super("My First GUI Appp");
      //tell the program we are going to design using the FlowLayout approach
      setLayout(new FlowLayout());
      
      
            
      //declare a new variable of icon type
      //create a new object that consists of the image file specified as a string
      Icon logo = new ImageIcon(getClass().getResource("logo.png"));
      label1 = new JLabel("The University of Tampa", logo, SwingConstants.LEFT);
      label1.setHorizontalTextPosition(SwingConstants.CENTER);
      label1.setVerticalTextPosition(SwingConstants.BOTTOM);
      add(label1);
      
      
      label2 = new JLabel("Enter text in any box and press enter");
      //asign a toolTipText to this label
      //it will appear to the user when he/she hovers over the label
      label2.setToolTipText("Instructions");
      //insert this label into the FlowLayout
      add(label2);
      
      //creates a new text field that is 15 characters wide
      //and adds it to the flow layout
      textField1 = new JTextField(15);//constructor call
      add (textField1);
      
      //creates a new text field that contains the default text
      //'Enter text here' and add to flow layout
      textField2 = new JTextField("Enter text here");
      add (textField2);
      
      //create an uneditable textfield that has default text 
      //that says 'uneditable text field' and a width of 15
      textField3 = new JTextField("Uneditable text field", 15);
      textField3.setEditable(false);
      add (textField3);
      
      //creates a password field that contains the default text
      //'hidden text' and add to the layout
      passwordField1 = new JPasswordField("Hidden text");
      add (passwordField1);
      
      //create new object of my text field handler
      TextFieldHandler handler = new TextFieldHandler();
      //attach the handler object to all text fields that I want to listen for actions on 
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField1.addActionListener(handler);
      
      
   }//closes constructor

//nested inner class that will provide instructions on what to do when events are
//registered by the user in this example, and event will be the user pressing enter   
   private class TextFieldHandler implements ActionListener {//opens nested class TextFieldHandler
   
      @Override 
      //method requires an ActionEvent as a parameter
      //meaning that the user must hit enter in order for this method
      //to execute. Inside the method are instructions on what to do 
      //when the user pressses enter.
      public void actionPerformed(ActionEvent event) {//opens method actionPerformed
         String message = "";
      //if the enter key was presses when user was in textField1
         if (event.getSource() == textField1)
         //take what user entered in textField1 and concatenate to the end of 
         //the string 'textField1: '
            message = String.format("textField1: %s", event.getActionCommand());
      
         if (event.getSource() == textField2)
            message = String.format("textField2: %s", event.getActionCommand());
      
      
         if (event.getSource() == textField3)
            message = String.format("textField3: %s", event.getActionCommand());
      
         if (event.getSource() == passwordField1)
            message = String.format("textField1: %s%npasswordField1: %s",textField1.getText(), event.getActionCommand());
            
            //displays value of the message string to user in message dialog box 
         JOptionPane.showMessageDialog(null, message);
      
      }//closes acitonPerformed
   
   }//closes nested class TextFieldHandler

}// closes class FrameLayout


class FrameApp {//opens class FrameApp

   public static void main(String[] args) {//opens main
      //create a new object of the FrameLayout class
      //once created, we can display it to the user
      FrameLayout frame = new FrameLayout();
      //define the size of the application window
      //first number is width, second number is height
      frame.setSize(250,300);
      //give instructions to exit the program when the user 
      //clicks on the x or red circle in the application window
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //display the window to the user
      frame.setVisible(true);
   
   }//closes main

}// closes class FrameApp
