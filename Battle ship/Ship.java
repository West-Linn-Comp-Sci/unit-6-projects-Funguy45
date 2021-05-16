
/**
 * Write a description of class Ship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Ship
{
    int[] ship1 = new int[] {0,0,0,1,1};
        
    int [] ship2 = new int []{1,1,0,0,0};
    int turn = 1;
    public void game(int d){
        player1(d);
        player2(d);
        System.out.println("Turn " + turn);
        turn++;
    }
       
    
    
    public void player1(int c){
        int count = 0;
        if (ship1[c] == 1){
            ship1[c]=0;
            System.out.println("hit for p1");
            System.out.println(Arrays.toString(ship1)+"p1");
        }else{
            System.out.println("miss for p1");   
            System.out.println(Arrays.toString(ship1)+"p1");
        }
        
        for(int i =0;i<ship1.length;i++){
            if (ship2[i] == 0){
                count++;
            
            }
        } 
           System.out.println(count);
        if (count == 5){
           System.out.println("Battle ship sunk, player 1 wins");  
           System.exit(1);
         }
    }
    public void player2(int c){
        int count = 0;
        if (ship2[c] == 1){
            ship2[c]=0;
            System.out.println("hit for p2");
            System.out.println(Arrays.toString(ship2)+"p2");
        }else{
            System.out.println("miss for p2");   
            System.out.println(Arrays.toString(ship2)+"p2");
        }
        
        for(int i =0;i<ship2.length;i++){
            if (ship1[i] == 0){
                count++;
                
            }
           }    
           System.out.println(count);
        if (count == 5){
           System.out.println("Battle ship sunk, player 2 wins");  
           System.exit(1);
         }
    }
}
