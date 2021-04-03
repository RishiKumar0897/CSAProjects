//******************************************************************** 
//  Hourly.java       Author: Lewis/Loftus/Cocking 
// 
//  Represents an employee that gets paid by the hour. 
//******************************************************************** 
 
public class Hourly extends Employee 
{ 
   private int hoursWorked; 
 
   //----------------------------------------------------------------- 
   //  Sets up this hourly employee using the specified information. 
   //----------------------------------------------------------------- 
   public Hourly (String eName, String eAddress, String ePhone, 
                  String socSecNumber, double rate) 
   { 
      super (eName, eAddress, ePhone, socSecNumber, rate); 
 
      hoursWorked = 0; 
   } 
 
   //----------------------------------------------------------------- 
   //  Adds the specified number of hours to this employee's 
   //  accumulated hours. 
   //----------------------------------------------------------------- 
   public void addHours (int moreHours) 
   { 
      hoursWorked += moreHours; 
   } 
 
   //----------------------------------------------------------------- 
   //  Computes and returns the pay for this hourly employee. 
   //----------------------------------------------------------------- 
   public double pay() 
   { 
      double payment = getPayRate() * hoursWorked; 
      
      int extraHours = hoursWorked - 40;
      double overtimeRate = getPayRate() * 1.5;
      
      if (hoursWorked > 40) {
        
        payment = payment + (extraHours * overtimeRate);
        
      }
      
 
      hoursWorked = 0; 
      
 
      return payment; 
   } 
   
 
   //----------------------------------------------------------------- 
   //  Returns information about this hourly employee as a string. 
   //----------------------------------------------------------------- 
   public String toString() 
   { 
      String result = super.toString(); 
 
      result += "\nCurrent hours: " + hoursWorked; 
 
      return result; 
   } 
} 

