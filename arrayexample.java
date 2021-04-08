/*Arrays chapter 6
*/


public class ArrayExample  {//opens class

   public static void main(String[] args) {//opens main
   
      int [] multiplyTable = new int[10];
      
      for (int j = 0; j < multiplyTable.length; j++) {//opens for loop to populate array
         multiplyTable[j] = 6 * j; 
      }//closes for loop to populate array
   
      System.out.printf("Multiplication tables for 6%n");
      System.out.printf("%7s%8s%n", "6 times", "Result");
   
      for (int i = 0; i < multiplyTable.length; i++)  {//opens for loop to print results
      //for each element in the array,
      //print the index position (i) and the value stored in the array
      //at that index position
      
         System.out.printf("%7d%8d%n", i, multiplyTable[i]);
      }//closes for loop to print results
      
      //System.out.print(multiplyTable.length);
   
   
   }//closes main


}//closes class
