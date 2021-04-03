import java.util.Scanner;

public class TempConverter 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   double F;
   double C; 
   
   Scanner scan = new Scanner(System.in); 
 

   
   System.out.println("Please enter the temperature in Fahrenheit and " + 
                       "I will compute the temperature in Celsius"); 
   F = scan.nextDouble();

   
   C = (F - 32)*5/9;
   
   System.out.println("The temperature in Fahrenheit is: " + F);  
   System.out.println("The temperature in Celsius is: " + C); 
    
} 
  
}