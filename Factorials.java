// *************************************************************** 
//   Factorials.java
//   Rishi Kumar        Period 3
//   Calculate the factorials of a certain number. 
// *************************************************************** 
import java.util.Scanner; 
 
public class Factorials { 
   
  public static void main(String[] args) { 
     
    Scanner scan = new Scanner(System.in); 
     
    System.out.println("Please enter the number you would like the factorial of."); 
    int number = scan.nextInt(); 
    while (number < 0 || number > 19) { 
      System.out.println("Please enter the number again (Negative number or number above 19)"); 
      number = scan.nextInt(); 
    } 
     
    int count = 1; 
    int factorial = 1; 
     
    while (count <= number) { 
      factorial *= count; 
      count++; 
    } 
     
    if (number != 0) 
    System.out.println("The factorial of "+ number +" is: "+ factorial);    
    else 
    System.out.println("The factorial of 0 is: 0"); 
       
  }  
}