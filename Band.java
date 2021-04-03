// **************************************************************** 
//   Band.java 
// 
//   Rishi Kumar     Period 3
//
//   Invokes the BandBooster class to track the sales of 2 boosters
//   over 3 weeks.  
// ****************************************************************

import java.util.Scanner; 
 
public class Band { 
   
   
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    BandBooster bbj = new BandBooster("Joe"); 
    BandBooster bbg = new BandBooster("Gary"); 
     
    System.out.println("Enter the number of boxes sold by " + bbj.getName() + " in week 1"); 
    bbj.updateSales(scan.nextInt()); 
     
        System.out.println("Enter the number of boxes sold by " + bbj.getName() + " in week 2"); 
    bbj.updateSales(scan.nextInt()); 
     
        System.out.println("Enter the number of boxes sold by " + bbj.getName() + " in week 3"); 
    bbj.updateSales(scan.nextInt()); 
     
            System.out.println("Enter the number of boxes sold by " + bbg.getName() + " in week 1"); 
    bbg.updateSales(scan.nextInt()); 
     
                System.out.println("Enter the number of boxes sold by " + bbg.getName() + " in week 2"); 
    bbg.updateSales(scan.nextInt()); 
     
                System.out.println("Enter the number of boxes sold by " + bbg.getName() + " in week 3"); 
    bbg.updateSales(scan.nextInt()); 
     
    System.out.println(bbj.toString()); 
     
    System.out.println(bbg.toString()); 
     
  } 
}