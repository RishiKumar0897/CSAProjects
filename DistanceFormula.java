import java.util.Scanner;

public class DistanceFormula 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   double x1;
   double y1;
   double x2;
   double y2;
   double distance;
   
   Scanner scan = new Scanner(System.in); 
 
   System.out.println("Please enter a coordinate"); 
  
   x1 = scan.nextDouble();
   y1 = scan.nextDouble();
   
   System.out.println("Please enter another coordinate");
   
   x2 = scan.nextDouble();
   y2 = scan.nextDouble();
  
   distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + (y2 - y1)*(y2 - y1));
   
   
   System.out.println("The distance is: " + distance);  
    
    
} 
  
}