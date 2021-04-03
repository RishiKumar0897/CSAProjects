public class StarsD { 
  
  public static void main(String[] args) { 
     
    boolean tri = true; 
     
    for (int i = 0; i <= 5; i++) { 
       for (int j = 1; j <= 5 - i; j++) { 
        System.out.print(" "); 
       } 
       for (int d = 0; d < i; ++d) { 
        System.out.print("*"); 
      } 
       for (int d = 1; d < i; ++d) { 
        System.out.print("*"); 
      } 
       System.out.println(); 
    } 
     
      for (int i = 5; i > 0; i--) { 
      for (int j = 1; j <= 5 - i; j++) { 
        System.out.print(" "); 
            } 
      for (int d = 0; d < i; ++d) { 
        System.out.print("*"); 
      } 
      for (int d = 1; d < i; ++d) { 
        System.out.print("*"); 
      } 
       System.out.println(); 
    } 
     
    
  } 
  }