// **************************************************************** 
//   PowersOf2.java 
//   Rishi Kumar        Period 3 
//   Print out as many powers of 2 as the user requests 
// **************************************************************** 
import java.util.Scanner; 
 
public class Powersof2 
{ 
    public static void main(String[] args) 
    { 
        int counter = 0; 
        int numPowersOf2;      //How many powers of 2 to compute 
        int nextPowerOf2 = 1;  //Current power of  2 
        int exponent = 0;          //Exponent for current power of 2, this 
                             //also serves as a counter for the loop 
        Scanner scan = new Scanner(System.in); 
        System.out.println("How many powers of 2 do you want?"); 
        numPowersOf2 = scan.nextInt(); 
         
        while (numPowersOf2 > 30) { 
                  System.out.println("That number is going to be too high. Please reenter the value."); 
             numPowersOf2 = scan.nextInt(); 
        } 
                 
        //print a message saying how many powers of 2 will be printed 
        //initialize exp.,the first thing printed is 2 to the what? 
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2:"); 
        while (counter <= numPowersOf2) 
        { 
            System.out.println("2^" + exponent + " = " + nextPowerOf2); 
            exponent++; 
            nextPowerOf2 = nextPowerOf2 * 2; 
            counter++; 
 
      } 
    } 
} 
