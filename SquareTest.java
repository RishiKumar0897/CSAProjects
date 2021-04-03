// **************************************************************** 
// SquareTest.java 
// 
// Uses the Square class to read in square data and tell if  
// each square is magic. 
//           
// **************************************************************** 
 
import java.util.Scanner; 
import java.io.*; 
 
public class SquareTest 
{ 
    public static void main(String[] args) throws IOException 
    { 
Scanner scan = new Scanner(new File("magicData.txt")); 
 
 int count = 1;                 //count which square we're on 
 int size = scan.nextInt();     //size of next square 
 
 //Expecting -1 at bottom of input file 
 while (size != -1) 
     { 
 
  Square s = new Square(size); 
 
  s.readSquare(scan); 
   
 
  System.out.println("\n******** Square " + count + " ********"); 
  s.printSquare(); 
   
  System.out.println(""); 
   
  for (int i = 0; i < size; ++i) 
    System.out.println("The sum of row " + (i + 1) + " is " + s.sumRow(i)); 
   
  System.out.println(""); 
 
    for (int i = 0; i < size; ++i) 
    System.out.println("The sum of column " + (i + 1) + " is " + s.sumCol(i)); 
     
    System.out.println(""); 
 
  System.out.println("The sum of the main diagonal is " + s.sumMainDiag()); 
   
  System.out.println(""); 
 
  System.out.println("The sum of the alternate diagonal is " + s.sumAltDiag()); 
   
  System.out.println(""); 
 
  if (s.magic()) 
    System.out.println("This square is a magic square!"); 
  
  else 
    System.out.println("Sorry, this square is not a magic square"); 
 
  count++; 
    size = scan.nextInt(); 
  
     } 
 
   } 
} 
