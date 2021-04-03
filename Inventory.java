public class Inventory {
  
  private int itemNum, quantity;
  private String description, vendor, location;
  private double salesPrice, cost;
  private boolean onSale, over21;


public double getCost() {
  return cost;
}

public  double getPrice() {
  return salesPrice;
}

public double getSalesPrice() {
  return salesPrice;
}

public void setLocation(String newLocation) {
  location = newLocation;
}

public void setItemNum(int newItemNum) {
  itemNum = newItemNum;
}

public void setQuantity(int newQuantity) {
  quantity = newQuantity;
}

public void setDescription(String newDescription) {
  description = newDescription;
}

public void setVendor(String newVendor) {
  vendor = newVendor;
}

public void setOnSale(boolean newOnSale) {
  onSale = newOnSale;
}

public void setOver21(boolean newOver21) {
  over21 = newOver21;
}

public String toString() {
  return "Item#: " + itemNum + "/n" + "Description: " + description + "/n" + "Quantity on hand: " + quantity + "/n" + "Location: " + location;
}
}