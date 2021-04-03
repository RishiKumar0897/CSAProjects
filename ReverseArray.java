import java.util.Scanner; 
 
public class ReverseArray{ 
  public static void main(String []args){ 
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the size of the array: "); 
    int numValues = scan.nextInt(); 
    int arr[] = new int[numValues]; 
    System.out.println("Enter " + numValues + " numbers."); 
    for(int i = 0; i < arr.length; i++){ 
      arr[i] = scan.nextInt(); 
    } 
    int temp; 
    for(int i = 0; i < arr.length/2; i++){ 
      temp = arr[i]; 
      arr[i] = arr[arr.length - 1 - i]; 
      arr[arr.length - 1 - i] = temp; 
    } 
    for(int i = 0; i < arr.length; i++){ 
      System.out.print(arr[i] + " "); 
    } 
  } 
}