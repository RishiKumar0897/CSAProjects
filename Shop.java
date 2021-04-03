// *************************************************************** 
//   Shop.java 
// 
//   Rishi Kumar            Period 3
//
//   Uses the Item class to create items and add them to a shopping 
//   cart stored in an ArrayList instead of an array. 
// *************************************************************** 
import java.util.ArrayList; 
import java.util.Scanner; 
import java.text.NumberFormat; 
 
public class Shop 
{ 
public static void main (String[] args) 
  { 
    NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
    Item item; 
    String itemName; 
    double itemPrice; 
    int quantity; 
    double totalPrice = 0.0, sum = 0.0; 
    ArrayList<Item> cart = new ArrayList<Item>(); 
    Scanner scan = new Scanner(System.in); 
    String keepShopping = "yes"; 
    
    while (keepShopping.equalsIgnoreCase("y")){ 
      System.out.println("Enter the name of the item: "); 
      itemName = scan.next(); 
      System.out.println("Enter the unit price: "); 
      itemPrice = scan.nextDouble(); 
      System.out.println("Enter the quantity: "); 
      quantity = scan.nextInt(); 
      
      System.out.println("\t\t\tShopping Cart\nItem\t\tUnit Price\tQuantity\t\tTotal"); 
      // *** create a new item and add it to the cart 
      item = new Item(itemName, itemPrice, quantity); 
      cart.add(item);   
      
      
      // *** print the contents of the cart object using println 
      for (int i=0; i < cart.size(); i++){ 
        Item item2 = cart.get(i); 
        System.out.println(item2); 
        totalPrice = itemPrice * quantity; 
      } 
      sum += totalPrice; 
      System.out.print ("Continue shopping? (Yes/No)"); 
      keepShopping = scan.next(); 
    } 
    System.out.println("Total Price of cart: " + fmt.format(sum)); 
    System.out.println("Please head to the cashier to pay! Thank you for shopping!"); 
    
  } 
}