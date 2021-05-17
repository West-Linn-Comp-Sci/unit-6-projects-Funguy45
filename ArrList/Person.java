
/**
 * Write a description of class Person here.
 * Love that we have to make another class just to test the other thing we have to do.
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.*;
public class Person {
  private int age;
  private String name;
    public Person(int ag, String nam){
       this.name=nam;
       this.age=ag;
       
    }

  // Getter
  public String getName() {
    return name;
  }
  
  public int getAge(){
      return age;
    }
    
    
}
