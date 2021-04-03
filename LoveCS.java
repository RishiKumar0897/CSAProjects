// **************************************************************** 
//   LoveCS.java 
//   Rishi Kumar        Period 3
//   Use a while loop to print many messages declaring your  
//   passion for computer science 
// **************************************************************** 
 
import java.util.Scanner; 
public class LoveCS 
{ 
    public static void main(String[] args) 
    { 
      Scanner scan = new Scanner(System.in); 
       
      System.out.println("How many times do you want this to loop?"); 
      int LIMIT = scan.nextInt(); 
       
      int sum = 0; 
  int count = 1; 
  while (count <= LIMIT) 
{ 
       System.out.println(count + " I love Computer Science!!"); 
       sum += count; 
       count++; 
  } 
  System.out.println("Printed this message " + (count - 1) + " times"); 
  System.out.println("The sums of 1 to " + (count - 1) + " is " + sum); 
   
    } 
     
}