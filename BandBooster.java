// **************************************************************** 
//   BandBooster.java 
// 
//   Rishi Kumar     Period 3
//
//   A class created to store the names and sales of 2 boosters 
//     
// **************************************************************** 

public class BandBooster { 
   
  private int boxesSold; 
  private String name; 
   
  public BandBooster(String name) { 
   this.name = name; 
   this.boxesSold = 0; 
  } 
   
  public String getName() { 
    return name; 
  } 
   
  public int getBoxesSold() { 
    return boxesSold; 
  } 
   
  public void updateSales(int boxes) { 
    boxesSold += boxes; 
  } 
   
  public String toString() {  
    return name + ": " + boxesSold; 
  } 
   
   
}