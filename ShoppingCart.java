import java.text.NumberFormat; 
 
public class ShoppingCart 
{ 
    private int itemCount;      // total quantity of items in the cart 
    private double totalPrice;  // total price of items in the cart 
    private int capacity;       // current cart capacity 
    private Item[] cart;        // cart array 
 
    
     
    public ShoppingCart() 
    { 
 capacity = 5; 
 itemCount = 0; 
 totalPrice = 0.0; 
 cart = new Item[capacity]; 
    } 
 
     
    
    public void addToCart(String itemName, double price, int quantity) 
    { 
      cart[itemCount++] = new Item(itemName, price, quantity); 
      totalPrice += price*quantity; 
      if(itemCount==cart.length) 
        increaseSize(); 
    } 
     
     
    public double getTotalPrice() 
    { 
      return totalPrice; 
    } 
 
  
   
    public String toString() 
    { 
 NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
 
 String contents = "\nShopping Cart\n"; 
 contents += "\nItem\t\t\tUnit Price\t\t\tQuantity\t\t\tTotal\n"; 
 
 for (int i = 0; i < itemCount; i++) 
     contents += cart[i].toString() + "\n"; 
 
 contents += "\nTotal Price: " + fmt.format(totalPrice); 
 contents += "\n"; 
 
 return contents; 
    } 
 
    private void increaseSize() 
    { 
      Item[] temp = new Item[capacity + 3]; 
      for (int i = 0; i <itemCount; i++) 
        temp[i] = cart[i]; 
      cart = temp; 
    } 
} 
