//******************************************************************** 
//  Staff.java       Author: Lewis/Loftus/Cocking 
// 
//  Creates the array and calls the methods for the staff 
//******************************************************************** 

import java.text.DecimalFormat;


public class Staff {
  
  final int ARRAYSIZE = 11;
  
  private StaffMember[] staffList;
  
  public Staff() {
    
    staffList = new StaffMember[ARRAYSIZE];
    
    staffList[0] = new Executive("Mr. Hatcher", "100 New Street, Alpharetta, GA", "770-123-1111", "000-11-1111", 100000.00);
    staffList[1] = new Employee("Ms. Xie", "101 New Street, Alpharetta, GA", "770-123-2222", "000-11-2222", 100000.00);
    staffList[2] = new Employee("Mr. Ruppel", "102 New Street, Alpharetta, GA", "770-123-333", "000-11-333", 45000.00);
    staffList[3] = new Hourly("Mr. Niverthi", "103 New Street, Alpharetta, GA", "770-123-4444", "000-11-4444", 10.00);
    staffList[4] = new Hourly("Mr. Gokare", "104 New Street, Alpharetta, GA", "770-123-5555", "000-11-5555", 12.00);
    staffList[5] = new Commission("Mr. Pujari", "105 New Street, Alpharetta, GA", "770-123-6666", "000-11-6666", 75000.00);
    staffList[6] = new Commission("Mr. Juang", "106 New Street, Alpharetta, GA", "770-123-7777", "000-11-7777", 125000.00);
    staffList[7] = new Volunteer("Ms. McLelland", "107 New Street, Alpharetta, GA", "770-123-8888");
    staffList[8] = new Volunteer("Mr. Sanchez", "108 New Street, Alpharetta, GA", "770-123-9999");
    staffList[9] = new Commission("Ms. Petry", "109 New Street, Alpharetta, GA", "770-123-0000", "000-11-0000", 85000.00);
    staffList[10] = new Employee("Mr. Kumar", "110 New Street, Alpharetta, GA", "770-123-1234", "000-11-1234", 30000.00);
    
  
    ((Executive)staffList[0]).awardBonus(25000.00);
    ((Hourly)staffList[3]).addHours(41);
    ((Hourly)staffList[4]).addHours(38);
    ((Commission)staffList[5]).awardCommission(1500);
    ((Commission)staffList[6]).awardCommission(12000);
    ((Commission)staffList[9]).awardCommission(1000);
    
  }
  
  
  
  public void payday() {
    
    DecimalFormat df2 = new DecimalFormat("#.00");
    
    double amount;
    
    for(int count = 0; count < staffList.length; count++) {
      
      System.out.println(staffList[count]);
      
      amount = staffList[count].pay();
      
      if (amount == 0.0) {
        System.out.println("Thanks!");
      } else {
        System.out.println("Paid: " + df2.format(amount));
      }
      System.out.println("-----------------------------------------------------");
    }
    
  }

}