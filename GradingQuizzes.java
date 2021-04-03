// **************************************************************** 
// GradingQuizzess.java 
//
// Rishi Kumar          Period 3
//
// Provides details about quizzes (grades, percent, etc) 
// **************************************************************** 

import java.util.Scanner; 
 
public class GradingQuizzes{ 
  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    System.out.println("How many questions are on the quiz?"); 
    int numQuestions = sc.nextInt(); 
    
    int []key = new int[numQuestions]; 
    System.out.println("Enter the answers for the key: "); 
    for(int i = 0; i < key.length; i++){ 
     key[i] = sc.nextInt(); 
    } 
    
    int quizNum = 1; 
    while(true){ 
      Scanner sc1 = new Scanner(System.in); 
      System.out.println("Enter the answers for the quiz: "); 
      int curr = 0; 
      int numWrong = 0; 
      for(int i = 0; i < key.length; i++){ 
        curr = sc.nextInt(); 
        if(curr != key[i]){ 
          numWrong++; 
        } 
      } 
      int numRight = numQuestions - numWrong; 
      
      System.out.println("Right answers for quiz " + quizNum + ": " + numRight); 
      System.out.println("Percent right for quiz " + quizNum + ": " + (((double)numRight/numQuestions) * 100) + "%"); 
      System.out.println("Grade another quiz?(yes/no)"); 
      if(sc1.nextLine().equals("no")){ 
        break; 
      } 
      quizNum++; 
    } 
    
    
  } 
}