/* Bethany Russell
Chapter 6
3/2/17
Arrays as arguments and parameters*/

public class ArrayMethods {//opens class
   
   public static void main(String[] args)  {//opens method main
      int[] array = {1, 2, 3, 4, 5};
      
      System.out.printf("Effects of pass entire array to different method%nOriginal array values are: ");
      
      for(int value : array){//opens for loop
         System.out.printf("%d   ", value);
      } //closes for loop
           
      System.out.printf("%nBefore passing element 3 to modifyElement method, its value is: %d%n, array[3]");
      modifyElement(array[3]);
      System.out.printf("%nAfter modifyElement method completes,element 3 value is: %d%n, array[3]"); 
      System.out.printf("%n***********%nSwitching Gears%n************%n");
      System.out.printf("The average of 4 numbers is %.2f", average(3.2222,6.5553,8.6666,2.33));  
      System.out.printf("The average of 5 numbers is %.2f", average(3.2222,6.5553,8.6666,2.33,7.22));  
            
   } // closes main
   
   public static void modifyArray(int[] array2) {//opens modifyArray
      for (int i = 0; i < array2.length; i ++) {//opens for loop
         array2[i] *= 2;
      }//closes for loop
   
   //sends the existing array off to be modified
      modifyArray(array);
   
      System.out.printf("%nAfter passing array as argument, values are: ");
     
      for (int i = 0; i < array2.length; i ++) {//opens for loop
         array2[i] *= 2;
      }//closes for loop
   
   }//closes modifyArray
   
   public static void modifyElement(int element) {//opens modifyElement
      element *= 2;
      System.out.printf("Value of element modified in modifyElement is: %d%n", element);
   
   }//closes modifyElement
   
   public static double average(double...nums)   {//opens method average
   
      double total = 0.0;
   
      for (double d : nums) {
         total += d;
      }
   
      return total / nums.length;
   
   }//closes method average
   
}// closes class

