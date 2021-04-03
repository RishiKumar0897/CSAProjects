// **************************************************************** 
//   Grades.java 
// 
//   Rishi Kumar         Period 3
//
//   Use Student class to get test grades for two students 
//   and compute averages 
//           
// **************************************************************** 
public class GradesCh4 
{ 
    public static void main(String[] args) 
    { 
 Student student1 = new Student("Mary"); 
 Student student2 = new Student("Mike"); 
 
 System.out.println("Student 1: " + student1.getName()); 
 student1.inputGrades(); 
 System.out.println("Student 2: " + student2.getName()); 
 student2.inputGrades(); 
  
  System.out.println("The average of the 2 test grades for " + student1.getName() + " is " + student1.getAverage()); 
 
 System.out.println("The average of the 2 test grades for " + student2.getName() + " is " + student2.getAverage()); 
  
 System.out.println(student1.toString()); 
 System.out.println(student2.toString()); 
    } 
} 
