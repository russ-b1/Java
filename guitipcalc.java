/*
ITM 251
4/11/17
Chapter 12 Buttons
*/

import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import javax.swing.JOptionPane;

public class GUITipCalc extends JFrame {

   private final JLabel appTitle, entryLabel, tipAmtLabel, totalAmtLabel;
   private final JTextField billEntry;
   private final JButton submit;
   private final JRadioButton avgTip, goodTip, greatTip;
   private final ButtonGroup tipSelect;
  
   
   public GUITipCalc() {
      super("Tip Calculator");
      setLayout(new FlowLayout()); 
    
      appTitle = new JLabel();
      appTitle.setText("Awesome Tip Calculator");
      appTitle.setHorizontalTextPosition(SwingConstants.CENTER);
      appTitle.setVerticalTextPosition(SwingConstants.BOTTOM);
      add(appTitle); 
      
      entryLabel = new JLabel("Enter your total bill amount ");
      add(entryLabel);
      
      billEntry = new JTextField(15); 
      add(billEntry); 
      
      avgTip = new JRadioButton("15%");
      add(avgTip);
      
      goodTip = new JRadioButton("18%");
      add(goodTip);
      
      greatTip = new JRadioButton("20%");
      add(greatTip);
      tipSelect = new ButtonGroup();
      tipSelect.add(avgTip);
      tipSelect.add(goodTip);
      tipSelect.add(greatTip);
      
     
      submit = new JButton("     Calculate Tip     ");
      add(submit);
     
      tipAmtLabel = new JLabel("");
      add (tipAmtLabel);
     
      totalAmtLabel = new JLabel("");
      add(totalAmtLabel);
      
      ButtonHandler handler = new ButtonHandler();
      submit.addActionListener(handler);
      billEntry.addActionListener(handler);
      avgTip.addActionListener(handler);
      goodTip.addActionListener(handler);
      greatTip.addActionListener(handler);
      
   } 
 
   private class ButtonHandler implements ActionListener {
   
      @Override
      public void actionPerformed(ActionEvent event){     
      //reads what the user entered into billEntry 
      //as a string, but then parses into a double
      //and stores result into double variable called billAmt
         try{ 
            double billAmt = Double.parseDouble(billEntry.getText());
            double tipPerc;
            if(avgTip.isSelected())
               tipPerc=0.15;
            else if(goodTip.isSelected())
               tipPerc=0.18;
            else if(greatTip.isSelected())
               tipPerc=0.20;
            else {
               JOptionPane.showMessageDialog(null, "You must select a tip", "Warning", JOptionPane.WARNING_MESSAGE); 
               return;
            }
            tipAmtLabel.setText(String.format("Tip amount is: $%.2f     ", billAmt*tipPerc));
            totalAmtLabel.setText(String.format("Total amount with tip: $%.2f     ", billAmt*(1+tipPerc)));
         }
         //if the user enters a non-numeric value, NumberFormatException
         //will be thrown and we catch it to present an error message to user
         catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value", "Error", JOptionPane.ERROR_MESSAGE);
         }
           
      }
   
   }
} 
 
class FrameApp 
{
   public static void main(String[] args)
   { 
      GUITipCalc frame = new GUITipCalc(); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(225, 300); 
      frame.setVisible(true); 
   } 
} 
