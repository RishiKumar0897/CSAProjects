// **************************************************************** 
//   Guess.java 
//   Rishi Kumar        Period 3 
//   Play a game where the user guesses a number from 1 to 10 
// **************************************************************** 
import java.util.Scanner; 
 
public class GuessingGame 
{ 
  public static void main(String[] args) 
     { 
    boolean replay = true; 
    while (replay) { 
       int numToGuess;       //Number the user tries to guess 
       int guess;            //The user's guess 
       int highGuesses = 0; 
       int lowGuesses = 0; 
 
  Scanner scan = new Scanner(System.in); 
 
  numToGuess = (int)((Math.random() * 100) + 1); 
 
  System.out.println("Please try and guess a number from 1 to 100"); 
 
  guess = scan.nextInt(); 
                 
  while (guess != numToGuess)  //keep going as long as the guess is wrong 
       { 
    if (numToGuess > guess) { 
      System.out.println("That guess is too low try again:"); 
    lowGuesses++; 
    } 
    else { 
      System.out.println("That guess is too high, please try again."); 
    highGuesses++; 
    } 
 
  guess = scan.nextInt(); 
  } 
 
  System.out.println("Your guess was right, the number was " + numToGuess); 
  System.out.println("You guessed higher than the number " + highGuesses + " times. You guessed lower than the number " + lowGuesses + " times. You guessed a total of " + (highGuesses + lowGuesses + 1) + " times."); 
   
  System.out.println("Do you want to play again? (Yes or No)"); 
   
  if (scan.next().equalsIgnoreCase("Yes")) 
        replay = true; 
      else  
        replay = false; 
    } 
     } 
   
     
} 
