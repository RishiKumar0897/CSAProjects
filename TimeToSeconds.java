import java.util.Scanner;

public class TimeToSeconds 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   int hours;
   int minutes;
   int seconds;
   int hourSeconds;
   int minuteSeconds;
   int totalSeconds;
   
   Scanner scan = new Scanner(System.in); 
 

   
   System.out.println("Please enter a time in hours, minutes, and seconds " + 
                       "I will compute the time in seconds"); 
   hours = scan.nextInt();
   minutes = scan.nextInt();
   seconds = scan.nextInt();
   
  
   
   hourSeconds = hours * 3600;
   minuteSeconds = minutes * 60;
   totalSeconds = hourSeconds + minuteSeconds + seconds;
   
   System.out.println("The time in seconds is: " + totalSeconds + " seconds");  
    
    
} 
  
}