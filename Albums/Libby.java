
/**
 * Makes all the vars and stores the data.
 *
 * @author Ethan Dean Roumeliotis
 * @version 5/2/21
 */
import java.util.*;
public class Libby{
    Scanner input = new Scanner(System.in);
    //initalize vars
    String[] album= new String[3];
    int i = 0;
    String str;    
    String[] al= new String[6];
    public void list(){
        for(int j = 0;j<album.length;j++){
            //writes them down
        System.out.println("Album: "+ album[j]);
        System.out.println("*****************************");
        }
    }
    
    
    
    public void makeAl(String name, String artist, String tracknum, String runtime){
        //makes the allbum
        String[] al = {name,artist ,tracknum,runtime};
        for(int j = 0;j<al.length;j++){
            album [i] += al[j];
            }
        
        i++;
        
    }
    
    public void delete(int c){
        album[c] = "";
        //deletes the album
    }
    
    public void multi(int c){
        //duplicates chosen album
        album[c+1] = album[c];
    }
    
    public void sort(int c){
        al[4]=al[0];
        al[0]=al[c];
        
    }
    
}
