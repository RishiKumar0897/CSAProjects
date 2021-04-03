// **********************************************************
//   Count.java
//   
//   Rishi Kumar        Period 3
// 
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
   public static void main (String[] args)
   {
       String phrase;    // a string of characters
       int countBlank;   // the number of blanks in the phrase 
       int length;       // the length of the phrase
       char ch;          // an individual character in the string
       int countA, countE, countS, countT;
       String response;
       boolean x;
       

  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter a phrase or 'quit' to quit.");
  response = scan.nextLine();
  
  System.out.println(response);
  while(response != "quit"){
       // Print a program header
       System.out.println ();
       System.out.println ("Character Counter");
       System.out.println ();

       // Read in a string and find its length
       System.out.print ("Enter a sentence or phrase: ");
       phrase = scan.nextLine();
       length = phrase.length();
       
       // Initialize counts
       countBlank = 0;
       countA = 0;
       countE = 0;
       countS = 0;
       countT = 0;

       for(int i = 0; i < length; i++){
         ch = phrase.charAt (i);
         switch(ch){
           case 'a':
           case 'A': countA++;
           break;
           
           case 'e':
           case 'E': countE++;
           break;
           
           case 's':
           case 'S': countS++;
           break;
           
           case 't':
           case 'T': countT++;
           break;

           case ' ': countBlank++;
           break;
         //if(ch == ' '){
          // countBlank++;
       }
       }
       // Print the results
       System.out.println ();
System.out.println ("Number of blank spaces: " + countBlank);
System.out.println ("Number of letter A: " + countA);
System.out.println ("Number of letter E: " + countE);
System.out.println ("Number of letter S: " + countS);
System.out.println ("Number of letter T: " + countT);
  }     
}
}