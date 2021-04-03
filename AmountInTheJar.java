import java.util.Scanner;

public class AmountInTheJar 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   int numberOfquarters;
   int numberOfdimes;
   int numberOfnickels;
   int numberOfpennies;
   double totalAmount;
   
   
   
   Scanner scan = new Scanner(System.in); 

   
   System.out.println("Please enter the number of quarters, dimes, nickels, and pennies");
   
   numberOfquarters = scan.nextInt();
   numberOfdimes = scan.nextInt();
   numberOfnickels = scan.nextInt();
   numberOfpennies = scan.nextInt();
   
   double quarters = numberOfquarters * .25;
   double dimes = numberOfdimes * .10;
   double nickels = numberOfnickels * .05;
   double pennies = numberOfdimes * .01;
   totalAmount = quarters + dimes + nickels + pennies;
  
   
   
   
   System.out.println("The total amount is: $" + totalAmount);  
    
    
} 
  
}