import java.util.Scanner;

public class TimeToSecondsReverse 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   int seconds;
   int hours;
   int minutes;
   int userSeconds;
   
   Scanner scan = new Scanner(System.in); 
 
   System.out.println("Please enter a time in seconds " + 
                       "I will compute the time in hours, minutes, and seconds"); 
  
   userSeconds = scan.nextInt();
   
  
   hours = userSeconds / 3600;
   int minutesInSeconds = userSeconds - (hours * 3600);
   minutes = minutesInSeconds/60;
   seconds = minutesInSeconds % 60;

   
   System.out.println("The answer is: " + hours + "h " + minutes + "m " + seconds + "s");  
    
    
} 
  
}