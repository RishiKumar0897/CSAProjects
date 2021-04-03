// *************************************************************** 
//   PitchCount.java 
//   Shows the data for 5 different pitchers during a season.
//   Also will get individual statistics if user asks for it.
// *************************************************************** 
import java.util.Scanner; 
 
public class PitchCount { 
   
  public static void main(String[] args) { 
    
    int[][] pitchArray = {{45,105,67}, {81,100,93,25,128, 88}, {45,53}, {79,107,53,79}, {11,9,3,63,20,18,3}}; 
     
    boolean pitchers = true; 
    Scanner scan = new Scanner (System.in); 
    int pitcher; 
    int sumOfPitch = 0; 
    int min; 
    int max; 
    int avg = 0; 
    for (int i = 0; i<pitchArray.length;i++) 
    { 
      sumOfPitch = 0; 
      for (int j=0; j<pitchArray[i].length;j++) 
      { 
        sumOfPitch+=pitchArray[i][j]; 
      } 
      avg = (int)(sumOfPitch)/pitchArray[i].length; 
      
      max = pitchArray[i][0]; 
      min = pitchArray[i][0]; 
      for (int l=0; l<pitchArray[i].length;l++) 
      { 
        if (max < pitchArray[i][l]) 
          max = pitchArray[i][l]; 
        if (min > pitchArray[i][l]) 
          min = pitchArray[i][l]; 
      } 
      System.out.println("\nPitcher #" + (i+1) + " pitched " + pitchArray[i].length + " games. His largest "+ "pitch count was: " + max + ", smallest was: " + min + ", total was: " + sumOfPitch + ", " + "and average pitch count was: " + avg); 
    } 
    System.out.println ("Please input the pitcher's stats you'd like displayed:"); 
      pitcher = scan.nextInt(); 
      int cont = 1; 
    while (cont>0) 
    { 
      sumOfPitch = 0; 
      for (int i=0; i<pitchArray[pitcher-1].length;i++) 
      { 
        sumOfPitch+=pitchArray[pitcher-1][i]; 
      } 
      avg = (int)(sumOfPitch)/pitchArray[pitcher-1].length; 
      
      max = pitchArray[pitcher-1][0]; 
      min = pitchArray[pitcher-1][0]; 
      for (int i=0; i<pitchArray[pitcher-1].length;i++) 
      { 
        if (max < pitchArray[pitcher-1][i]) 
          max = pitchArray[pitcher-1][i]; 
        if (min > pitchArray[pitcher-1][i]) 
          min = pitchArray[pitcher-1][i]; 
      } 
      System.out.println("\nPitcher #" + pitcher + " pitched " + pitchArray[pitcher-1].length + " games. His largest "+ "pitch count was: " + max + ", smallest was: " + min + ", total was: " + sumOfPitch + ", "+ "and average pitch count was: " + avg); 
      System.out.println("Would you like to continue viewing statistics? If yes, then enter the number of the " + "pitcher you'd like to view. If not, then enter a negative value"); 
      cont = scan.nextInt(); 
     pitcher = cont; 
    } 
  } 
}