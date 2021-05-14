
/**
 * tests program
 *
 * @author Ethan Dean Roumeliotis
 * @version 5/2/21
 */
public class Albums
{
  public static void main(String[] args){
     Libby j = new Libby();
     j.makeAl("birdy, ","Jsause, ","34, ","45.");
     j.makeAl("son, ","lord, ","5, ","56.");
     j.list();
     j.sort(1);
     j.list();
     j.multi(1);
     j.list();
     j.delete(2);
     j.list();
     
    }
}
