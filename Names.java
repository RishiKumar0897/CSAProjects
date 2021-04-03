 
 
public class Names { 
   
  private String first; 
  private String middle; 
  private String last; 
   
  public Names(String first, String middle, String last) { 
    this.first = first; 
    this.middle = middle; 
    this.last = last; 
  } 
   
  public String getFirst() { 
    return first; 
  } 
   
  public String getMiddle() { 
    return middle; 
  } 
   
  public String getLast() { 
    return last; 
  } 
   
  public String firstMiddleLast() { 
    return first + " " + middle + " " + last; 
  } 
   
  public String lastFirstMiddle() { 
    return last + " " + first + " " + middle; 
  } 
   
  public boolean equals(Names otherName) { 
    return otherName.firstMiddleLast().equalsIgnoreCase(this.firstMiddleLast()); 
  } 
   
  public String initials() { 
    String f = first.substring(0,1).toUpperCase(); 
    String m = middle.substring(0,1).toUpperCase(); 
    String l = last.substring(0, 1).toUpperCase(); 
    return f.toUpperCase() + "" + m.toUpperCase() + "" + l.toUpperCase(); 
  } 
   
  public int length() { 
    return firstMiddleLast().length(); 
  } 
   
}