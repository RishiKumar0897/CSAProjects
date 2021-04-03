import java.util.Scanner; 
import java.text.NumberFormat; 
 
public class Shopping 
{ 
   public static void main (String[] args) 
   { 
    Scanner scan = new Scanner(System.in); 
    ShoppingCart shop = new ShoppingCart(); 
    int quantity = 0; 
    double price = 0; 
    String item = new String(); 
     
    String keepShopping = "Yes"; 
     
    while (keepShopping.equals("Yes")) 
    { 
      System.out.println("What item did you purchase?"); 
      item = scan.nextLine(); 
      System.out.println("What is the price of the " + item); 
      price = scan.nextDouble(); 
      System.out.println("How many " + item +"s did you buy?"); 
      quantity = scan.nextInt(); 
       
      shop.addToCart(item, price, quantity); 
      System.out.println(shop); 
      System.out.println("Do you want to add more items to your cart?"); 
      String again = scan.nextLine(); 
       
      System.out.print ("Continue shopping (Yes/No)? "); 
      keepShopping = scan.nextLine(); 
    } 
    NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
    System.out.println("Thank you for shopping with us today!"); 
    System.out.println("Please pay: " + 
                       fmt.format(shop.getTotalPrice())); 
  } 
}