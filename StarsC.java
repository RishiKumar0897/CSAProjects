public class StarsC { 
  
  public static void main(String[] args) { 
    for (int i = 10; i > 0; i--) { 
      for (int j = 1; j <= 10 - i; j++) { 
        System.out.print(" "); 
            } 
      for (int d = 0; d < i; ++d) { 
        System.out.print("*"); 
      } 
        System.out.println(); 
    } 
  } 
  }