import java.util.Scanner;

public class MPG 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   int start;
   int end;
   int totalGasUsed;
   double gallons = 10.5;
   
   Scanner scan = new Scanner(System.in); 

   
   System.out.println("Please enter the start and end readings");
   
   start = scan.nextInt();
   end = scan.nextInt();
   
   totalGasUsed = end - start;
   
   
  
   
   System.out.println("The MPG is: " + totalGasUsed/gallons);  
    
    
} 
  
}