// **************************************************************** 
// DogTest.java 
// 
// A simple test class that creates a Dog and makes it speak. 
//           
// **************************************************************** 
 
public class DogTest 
{ 
    public static void main(String[] args) 
    { 
      Dog dog = new Dog("Spike"); 
      System.out.println(dog.getName() + " says " + dog.speak()); 
      
      Labrador labrador = new Labrador("Lab");
      System.out.println(dog.getName() + "says " + dog.speak());
      
      Yorkshire yorkshire = new Yorkshire("York");
      System.out.println(dog.getName() + "says " + dog.speak());
 
    } 
} 
 
