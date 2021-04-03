// **************************************************************** 
//   Student.java 
// 
//   Rishi Kumar     Period 3
//
//   Define a student class that stores name, score on test 1, and 
//   score on test 2.  Methods prompt for and read in grades,  
//   compute the average, and return a string containing student’s info.  
// **************************************************************** 
import java.util.Scanner; 
 
public class Student 
{ 
    //declare instance data  
   
  private String name; 
  private double test1; 
  private double test2; 
 
    //----------------------------------------------- 
    //constructor 
    //----------------------------------------------- 
    public Student(String studentName) 
    { 
      name = studentName; 
    } 
 
    //----------------------------------------------- 
    //inputGrades: prompt for and read in student's grades for test1 and test2. 
    //Use name in prompts, e.g., "Enter's Joe's score for test1". 
    //----------------------------------------------- 
    public void inputGrades() 
    { 
      Scanner scan = new Scanner(System.in); 
      System.out.println("Enter " + name + "'s grade for test 1"); 
      test1 = scan.nextInt(); 
      System.out.println("Enter " + name + "'s grade for test 2"); 
      test2 = scan.nextInt(); 
      scan.close(); 
    } 
 
    //----------------------------------------------- 
    //getAverage: compute and return the student's test average 
    //----------------------------------------------- 
     
    public double getAverage() { 
      return (test1+test2) / 2; 
    } 
     
    public String getName() { 
      return name; 
    } 
     
    public double getTest1() { 
      return test1; 
    } 
     
    public double getTest2() { 
      return test2; 
    } 
     
    public String toString() { 
      return "Name: " + name + "\nTest1: " + test1 + "\nTest2: " + test2 + "\nAverage: " + getAverage(); 
    } 
 
} 
