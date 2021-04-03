import java.util.Scanner; 

public class TestNames { 
   
   
  public static void main(String[] args) { 
     
    Scanner scan = new Scanner(System.in); 
     
    System.out.println("Enter the names of the first person (first, middle, then last)"); 
    Names name1 = new Names(scan.next(), scan.next(), scan.next()); 
     
    System.out.println("Enter the names of the second person (first, middle, then last)"); 
    Names name2 = new Names(scan.next(), scan.next(), scan.next()); 
     
    // first name 
    System.out.println("First Middle Last: " + name1.firstMiddleLast() + "\nLast First Middle: " + name1.lastFirstMiddle() + "\nInitials: " + name1.initials() + "\nLength: " + name1.length()); 
     
    System.out.println(); 
     
    System.out.println("First Middle Last: " + name2.firstMiddleLast() + "\nLast First Middle: " + name2.lastFirstMiddle() + "\nInitials: " + name2.initials() + "\nLength: " + name2.length()); 
     
    System.out.println("Are these names the same? " + name1.equals(name2)); 
  } 
}