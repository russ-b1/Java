/* 
Chapter 6
3/2/17
Exception Handling*/

   
public class SurveyResults {//opens class
   
   public static void main(String[] args)  {//opens method main
   //populate array with suvery scores from students
      int [] results = {3, 4, 5, 4, 13, 4, 3, 2, 5, 1, 4, 5};   
      //declare new array of length 6 to store frequencies of different scores
      int [] frequency = new int [6];
      int total = 0, num = 0, errors = 0;
      double avg;
      
      for (int j = 0; j < results.length; j++) {//opens for loop
      
         try {//opens try 
            //adds one to the element of the frequency array
            //for the value of the element in the results array
            //at this iteration [j] of the for loop 
            ++frequency[results[j]];   
         }//closes try
         
         catch (ArrayIndexOutOfBoundsException e){//opens catch
            System.out.println(e);
            System.out.printf(" results[%d] = %d%n%n", j, results[j]);
            errors++;
         
         }//closes catch
        
         
      }//closes for loop
      
      System.out.printf("%8s%10s%n", "Score", "Freuquency");
      
      for (int j = 1; j < frequency.length; j++) {//opens output for loop
         //go line by line through frequency array
         //and print the score and number of students who gave that score
         System.out.printf("%8d%10d%n", j, frequency[j]);
         total += j * frequency[j];
         num += frequency[j];
      
      
      }//closes output for loop
      avg =(double) total / num;
      System.out.printf("%n The average score of %d evaluations was %.2f", num, avg);
      System.out.printf("%n There were %d errors encountered", errors);
   
   }//closes method main
   
}//closes class
