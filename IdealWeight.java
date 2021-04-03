//*************************************************************** 
//File: IdealWeight.java 
// 
// Rishi Kumar AP Comp Sci Period 3
//
//Purpose: Compute the ideal weight for males and females 
//*************************************************************** 

import java.util.Scanner;

public class IdealWeight
{
public static void main (String[] args)
{
int feet, inches;
double mweight, fweight;

Scanner scan = new Scanner (System.in);

System.out.print ("Enter feet: ");
feet = scan.nextInt();
System.out.print ("Enter inches: ");
inches = scan.nextInt();

mweight = 106 + 6*((feet*12 + inches)- 60); //Calculates Ideal male weight using height
fweight = 100 + 5*((feet*12 + inches) - 60); //Calculates Ideal female weight using height

System.out.println ("Ideal Female Weight: " + fweight); //Displays ideal female weight.
System.out.println ("Ideal Male Weight: " + mweight); //Displays ideal male weight.
}
}
