// **************************************************************** 
// Sales.java 
//
// Rishi Kumar          Period 3
//
// Reads in and stores sales for each of 5 salespeople.  Displays 
// sales entered by salesperson id and total sales for all salespeople. 
// 
// **************************************************************** 
import java.util.Scanner; 
 
public class Sales 
{ 
    public static void main(String[] args) 
    { 
       Scanner scan = new Scanner(System.in); 
      System.out.println("How many sales people are there going to be?"); 
 int SALESPEOPLE = Integer.parseInt(scan.next()); 
 int[] sales = new int[SALESPEOPLE]; 
 int sum; 
 double avg = 0; 
 int max = 0; 
 int min = Integer.MAX_VALUE; 
 int maxSalePerson = 0; 
 int minSalePerson = 0; 
 
 
 for (int i=0; i<sales.length; i++) 
     { 
  System.out.print("Enter sales for salesperson " + (i + 1) + ": "); 
  sales[i] = scan.nextInt(); 
     } 
 
 System.out.println("\nSalesperson   Sales"); 
 System.out.println("--------------------"); 
 sum = 0; 
 for (int i=0; i<sales.length; i++) 
     { 
  System.out.println("     " + (i + 1) + "         " + sales[i]); 
  sum += sales[i]; 
  if (sales[i] > max) { 
    max = sales[i]; 
    maxSalePerson = i + 1; 
 } 
    if (sales[i] < min) { 
    min = sales[i]; 
    minSalePerson = i + 1; 
 } 
     } 
 avg = sum / sales.length; 
 System.out.println("\nTotal sales: " + sum); 
 System.out.println("\nAverage: " + avg); 
 System.out.println("\nMaximum Sale: " + max + " by Salesperson " + maxSalePerson); 
 System.out.println("\nMinimum Sale: " + min + " by Salesperson " + minSalePerson); 
 System.out.println("Please print out the grading number."); 
 int grade = Integer.parseInt(scan.next()); 
 int success = 0; 
 for (int i = 0; i < sales.length; ++i) { 
   if (sales[i] > grade) { 
     System.out.println("Salesperson " + (i + 1) + " passed the goal"); 
     success++; 
   } 
 } 
 System.out.println("There were " + success + " number of salespeople who sold better than the grade."); 
    } 
} 
