import java.util.Scanner;
import java.lang.Math;



public class VolumeAndSurfaceAreaOfSphere 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   
   int r;
   double volume;
   double surfaceArea;
   
   
   Scanner scan = new Scanner(System.in); 
 
   System.out.println("Please enter a radius"); 
  
   r = scan.nextInt();
   
   
   volume = 4/3*(Math.PI)*(r^3);
   surfaceArea = 4*(Math.PI)*(r^2);
   
   
   System.out.println("The volume is: " + volume); 
   System.out.println("The surface area is: " + surfaceArea);
   
    
    
} 
  
}