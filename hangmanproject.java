import java.util.Scanner;
import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.*;
import java.io.*;

import java.io.File;


public class HangmanProject {//opens HangmanProject class

   public static String word;
   
   public static void main(String[] args) {//opens main method
      
      String[] bank = readFile();
      
      System.out.print(bank);
      String word = wordStuff.pickWord(bank);
       
      int guessAttempts = 6;
      
      // splits the word into array of characters
      char[] charArray = wordStuff.splitString(word);
      // creates array to be populated by underscores correlating
      //to number of letters in the word
      char[] blanks = new char[charArray.length];
      // creates local array from the array made in drawDiagram, contains
      // the diagrams of each attempt
      String[] hang = wordStuff.drawDiagram();
      // welcome screen
      System.out.printf("Welcome to the game of Hangman!%n"
         +"The word you must guess has %d letters."
         +"%n%n>Please enter a lowercase letter.%n%n    ", charArray.length);
      
    
      // displays underscores for amuont of letters in random word
      for(int i = 0; i<charArray.length; i++){
         blanks[i] = '_';
         System.out.printf(" %c ", blanks[i]);
      }// for
    
      // display diagram
      System.out.printf("%n%s",hang[guessAttempts]);
    
      // prompts users for input for as long as there are remaining guesses,
      // and shows how many guesses remain. lets the user know if
      // they have run out of guesses then ends the program.
      do{
         try{
            // boolean that is equal to the returned boolean from inoutEval
            // this will determine if guess was correct or incorrect.
            // if incorrect, guess attempts will be reduced by 1.
            boolean continuee = wordStuff.inputEval(charArray, blanks, guessAttempts, word);
            
            if(continuee == false){
               guessAttempts --;
            } //if
            
            // displays the hangman diagram based on guess attempts left,
            // and also displays the number of attempts left numerically
            System.out.printf("%n%s",hang[guessAttempts]);
            System.out.printf("%n%n                    %d tries remaining.%n", guessAttempts);
            
            if(guessAttempts == 0){
               System.out.printf("%n*You have run out of attempts. The man has been hung.");
               System.exit(1);
            } //if
         
         } //try
         
         catch(InputMismatchException ime){
            System.err.printf("%n**Please enter a letter.%n");
         } // ime catch
         
         catch(IllegalArgumentException iae){
            System.err.printf("%n**Please enter one letter.%n");
         }
      
      } while(guessAttempts >= 0);
    
   } // main

   public static String[] readFile(){
   
      try{
         Scanner fileRead = new Scanner(Paths.get("wordbank.txt"));
         int wordRead = 0;
         String wordbank[] = new String [5];
         while (fileRead.hasNext() && wordRead < wordbank.length) {
            wordbank[wordRead] = fileRead.next();
         }
      
      }
      catch (IOException ioe) {
         System.err.println("Error opening file. Program will terminate");
         System.exit(1);
      }
      //int wordRead = 0;
      //String wordbank[] = new String [5];
      
      
      //while (fileRead.hasNext() && wordRead < wordbank.length) {
         //wordbank[wordRead] = fileRead.next();
      //}
   
      readFile.fileRead.close();
      return wordbank;
   }
   
   
} // Hangman Project
   
////////////////////////////////////////////////////////////////////////   
   
class wordStuff {

   private static char[] guessedLetters = new char [26];
   private static int numIncorrect = 0;


   // splits the random word into a char array and return it
   public static char[] splitString(String word) {//opens splitString
      char [] charArray = word.toCharArray();
      return charArray;
   }//closes splitString

   // checks if the guess inputted is in the char array
   public static boolean checkGuess(char guess, char indexed){
     
      boolean result = false;
      // correct guess
      if(guess == indexed){
         result = true;
      }    
      // incorrect guess
      else if(guess != indexed){
         result = false;    
      }
      else{
         result = false;
      }
      return result;
   } // checkGuess
  
   // picks random word word array ***** WILL BE FROM TEXT FILE*******
   public static String pickWord(String[] wordbank) {//opens pickWord
   
      SecureRandom randNums = new SecureRandom();
      int result = randNums.nextInt(5);
      String word = wordbank[result];
      return word;   
   
   }//closes pickWord
  
  
   public static boolean letterGuessed(char guess){
      
      boolean alreadyGuessed = false;
      
      for (int k = 0 ; k< guessedLetters.length; k++){
         if (guess == guessedLetters[k]){
            alreadyGuessed = true;
            break;
         }// if
      }// for
     
      if (alreadyGuessed) {
         return true;
      } // if
      else {
         guessedLetters[numIncorrect] = guess;
         numIncorrect++;
         return false;
      } // else
   
   }//closes letterGuess


   // evaluates the input guess, telling the user if they were right or wrong.
   // displays correct letters in correct index position of the underscores.
   public static boolean inputEval(char[] charArray, char[] blanks, int guessAttempts, String word){
   
      boolean match = false;
      Scanner input = new Scanner(System.in);
      boolean guessInWord = false;
    
      System.out.printf("%n>Your guess: " );
    
      //change this for better input handling and add exceptions
      String sGuess = input.next().toLowerCase();
      char guess = sGuess.charAt(0);
    
      // throws ime exception if the user enters anything but a letter
      if(Character.isLetter(guess) == false){
         throw new InputMismatchException();    
      } // if
      // throws iae if user enters more than one character
      else if (sGuess.length() > 1){
         throw new IllegalArgumentException();
      } // else if
    
      if (letterGuessed(guess)) {
         System.out.printf("**You already guessed that letter!%n");
         
         // displays the underscores
         for(int i = 0; i < blanks.length; i++){
            System.out.printf(" %c ", blanks[i]);
         } // for
         guessInWord = true;
         return guessInWord;
      }
      
      else {
         
         for(int i = 0; i < charArray.length; i++){
            // boolean for if the character guessed was in the char array
            boolean checkedChar = wordStuff.checkGuess(guess, charArray[i]);
         
            if(checkedChar == true){
               match = true;
               blanks[i]= guess;
            } // if
         
         } // for
      
         if(match){
            System.out.printf("%nYour guess of %c was correct!%n    ", guess);
         
            for(int i = 0; i < blanks.length; i++){
               System.out.printf(" %c ", blanks[i]);
            } // for
            if(word.equals(String.valueOf(blanks))){
               System.out.printf("%n%n*Congratulations, you have guessed the entire word! You win!%n");
               System.exit(1);
            } // if
            guessInWord = true;
         } // if
         
         else {
            System.out.printf("%nYour guess of %c was incorrect!%n    ", guess);
         
            for(int i = 0; i < blanks.length; i++){
               System.out.printf(" %c ", blanks[i]);
            } // for    
            guessInWord = false;    
         } // else
         
      } // else
      return guessInWord;
   } // input Eval


   // creates an string array for each diagram based on amount of guesses
   // the user has left. example: having 5 guesses left means only a head was drawn
   public static String[] drawDiagram(){
    
      String[] hang = new String[7];
    
      // 0 attempts left
      hang[0] =(" _____\n"+
                  "|    |\n" +
                  "|    o\n"+
                  "|   /|\\\n"+
                  "|    |\n"+
                  "|   / \\\n"+
                  "|___\n"+
                  "|   |______\n"+
                  "|          |\n"+
                  "|__________|\n");
                    
    // 1 attempt left
      hang[1] =(" _____\n"+
                      "|    |\n" +
                      "|    o\n"+
                      "|   /|\\\n"+
                      "|    |\n"+
                      "|   / \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");
    // 2 attempts left
      hang[2] =(" _____\n"+
                      "|    |\n" +
                      "|    o\n"+
                      "|   /|\\\n"+
                      "|    |\n"+
                      "|    \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");                    
    
      // 3 attempts left
      hang[3] =(" _____\n"+
                      "|    |\n" +
                      "|    o\n"+
                      "|   /|\n"+
                      "|    |\n"+
                      "|    \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");    
                        
                        
      // 4 attempts left
      hang[4] =(" _____\n"+
                      "|    |\n" +
                      "|    o\n"+
                      "|    |\n"+
                      "|    |\n"+
                      "|    \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");    
      // 5 attempts left
      hang[5] =(" _____\n"+
                      "|    |\n" +
                      "|    o\n"+
                      "|   \n"+
                      "|    \n"+
                      "|    \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");    
      // 6 attempts left
      hang[6] =(" _____\n"+
                      "|    |\n" +
                      "|    \n"+
                      "|   \n"+
                      "|    \n"+
                      "|    \n"+
                      "|___\n"+
                      "|   |______\n"+
                      "|          |\n"+
                      "|__________|\n");    
                        
      return hang;
   }
  
}//wordStuff





