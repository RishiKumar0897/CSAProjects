import java.util.Scanner;

public class MilesToKilometers 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   double miles;
   double kilometers; 
   
   Scanner scan = new Scanner(System.in); 
 

   
   System.out.println("Please enter the distance in miles and " + 
                       "I will compute the distance in kilometers"); 
   miles = scan.nextDouble();

   
   kilometers = miles * 1.60935;
   
   System.out.println("The distance in miles is: " + miles);  
   System.out.println("The distance in kilometers is: " + kilometers); 
    
} 
  
}