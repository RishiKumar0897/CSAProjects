import java.util.Scanner; 
 
public class Square 
{ 
    int[][] square; 
 
    //-------------------------------------- 
    //create new square of given size 
    //-------------------------------------- 
    public Square(int size) 
    { 
      square = new int[size][size]; 
    } 
 
    //-------------------------------------- 
    //return the sum of the values in the given row 
    //-------------------------------------- 
    public int sumRow(int row) 
    { 
      int sum = 0; 
      for(int i = 0; i < square.length; ++i) { 
        sum += square[row][i]; 
      } 
      return sum; 
    } 
 
    //-------------------------------------- 
    //return the sum of the values in the given column 
    //-------------------------------------- 
    public int sumCol(int col) 
    { 
      int sum = 0; 
      for(int i = 0; i < square.length; ++i) { 
        sum += square[i][col]; 
      } 
      return sum; 
    } 
 
    //-------------------------------------- 
    //return the sum of the values in the main diagonal 
    //-------------------------------------- 
    public int sumMainDiag() 
    { 
      int sum = 0; 
      for (int i = 0; i < square.length; i++) { 
        sum += square[i][i]; 
      } 
      return sum; 
    } 
 
    //-------------------------------------- 
    //return the sum of the values in the other ("reverse") diagonal 
    //-------------------------------------- 
    public int sumAltDiag() 
    { 
      int sum = 0; 
      for (int i = 0; i < square.length; i++) { 
        int j = square.length - 1 - i; 
        sum += square[j][j]; 
      } 
      return sum; 
    } 
 
    //-------------------------------------- 
    //return true if the square is magic (all rows, cols, and diags have 
    //same sum), false otherwise 
    //-------------------------------------- 
    public boolean magic() 
    { 
      int num = sumMainDiag(); 
       
      if (sumAltDiag() != num) 
        return false; 
       
      int colCounter = 0; 
      int rowCounter = 0; 
       
      for (int i = 0; i < square.length; ++i) { 
         
        if (num != sumCol(i)) 
          return false; 
         
      } 
      for (int i = 0; i < square.length; ++i) { 
         
        if (num != sumRow(i)) 
          return false; 
      } 
       
      return true; 
       
    } 
 
    //-------------------------------------- 
    //read info into the square from the input stream associated with the  
    //Scanner parameter 
    //-------------------------------------- 
    public void readSquare(Scanner scan) 
    { 
      for (int row = 0; row < square.length; row++) 
   for (int col = 0; col < square.length; col ++) 
     square[row][col] = scan.nextInt(); 
    } 
 
    //-------------------------------------- 
    //print the contents of the square, neatly formatted 
    //-------------------------------------- 
    public void printSquare() 
    { 
      for (int row = 0; row < square.length; row++) { 
              for (int col = 0; col < square.length; col++) { 
              System.out.print(square[row][col] + "\t"); 
            } 
            System.out.println(""); 
      } 
             
    } 
 
} 
