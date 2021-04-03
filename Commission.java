//******************************************************************** 
//  Commission.java       Author: Lewis/Loftus/Cocking 
// 
//  Represents an employee that gets paid a salary + commission 
//******************************************************************** 


public class Commission extends Employee {
  
  private double commissionRate;
  private double payRate;
  
  public Commission (String eName, String eAddress, String ePhone, 
                     String socSecNumber, double rate) 
   { 
      super (eName, eAddress, ePhone, socSecNumber, rate); 
 
      payRate = rate;   
   } 
  
  public void awardCommission (double commission) 
   { 
      commissionRate = commission; 
   } 
 
  
  public double getPayRate() 
   { 
      return payRate; 
   }
  
  public double pay() 
   { 
    double commissionPayment = getPayRate() + commissionRate;
    
    commissionRate = 0;
      
    return commissionPayment; 
    
   } 
  
}