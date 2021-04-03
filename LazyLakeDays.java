// *************************************************************** 
//   LazyLakeDays.java 
//   Computes the temperature and decides which activity suits the temperature. 
// ***************************************************************
import java.util.Scanner;


public class LazyLakeDays 
{ 
  int temp;
  Scanner scan = new Scanner(System.in);
  
  
  System.out.println("Enter the temperature: ");
  temp = scan.Int();
  
  
public static void main (String[] args) 
    { 

  if (temp >= 80) {
    System.out.println("Swimming");
  } 
  else if (temp >= 60 && temp <= 80) {
    System.out.println("Tennis");
  }
  else if (temp >= 40 && temp <= 60) {
    System.out.println("Golf");
  }
  else {
    System.out.println("Skiing");
  }
}
}