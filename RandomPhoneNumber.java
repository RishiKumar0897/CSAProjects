public class RandomPhoneNumber 
{ 
    // -------------------------------------
    // main prints an expression about birds 
    // -------------------------------------
  public static void main (String[] args) {
   int num1;
   int num2;
   int num3;
   int num4;
   
   
   int max = 7; 
   int min = 1; 
   int range = max - min + 1; 
        
   num1 = (int)(Math.random() * range) + min;
   num2 = (int)(Math.random() * range) + min; 
   num3 = (int)(Math.random() * range) + min;

   System.out.print(num1*100 + num2 * 10 + num3 + "-"); 
   
           
   num1 = (int)(Math.random() * range) + min;
   num2 = (int)(Math.random() * range) + min; 
   num3 = (int)(Math.random() * range) + min; 
   
   System.out.print(num1*100 + num2 * 10 + num3 + "-");
   
   
   num1 = (int)(Math.random() * range) + min;
   num2 = (int)(Math.random() * range) + min; 
   num3 = (int)(Math.random() * range) + min;
   num4 = (int)(Math.random() * range) + min; 
   
   System.out.print(num1*1000 + num2 * 100 + num3 * 10 + num4);
   
    
    
} 
  
}