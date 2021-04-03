import java.util.Scanner;

public class SumDiffProd 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   double num1;
   double num2;
   double sum;
   double diff;
   double prod;
   Scanner scan = new Scanner(System.in); 
 

   
   System.out.println("Please enter two floating point numbers " + 
                       "I will compute their sum, difference, and product"); 
   num1 = scan.nextDouble();
   num2 = scan.nextDouble();
   
   
   sum = num1 + num2;
   diff = num1 - num2;
   prod = num1 * num2;
   
     
   System.out.println("The sum of your two numbers is: " + sum); 
   System.out.println("The difference of your two numbers is: " + diff);
   System.out.println("The product of your two numbers is: " + prod);
    
} 
  
}