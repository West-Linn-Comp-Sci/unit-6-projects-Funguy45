import java.util.*;
public class ArrayTestes{
    
    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();
           
        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();
         
        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();
        
        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " );
        parseIntoArrayList("West Linn");

        System.out.println();
        /*
        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();
        
        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Total of Purse = $" + myPurse.getTotal());
     */
    }
    
    public static void removeZeros(ArrayList<Integer> list) {
        for(int m=0;m<list.size(); m++){
            if ((int)list.get(m)==0){
                list.remove(m);
                //this is a weird one I dont understand why it misses a zero maybe because there's another zero
                //next to it but I dont know how to fix it.
            }
        }
    }

    public static int countLetters(ArrayList list) {
        int count = 0;
        String d;
        for(int m=0;m<list.size(); m++){
            d =list.get(m).toString();
            count+=d.length();
            
        }
        return count;
    }
    
    public static int findPosition(int key, ArrayList k){
        int val = -1;
        for(int m  = 0; m <k.size();m++){
            int d = (int)k.get(m);
            if((int)k.get(m)== key){
                val = m;
            }
        }
        return val;
        //well it works but the weird error from earlier pushed the one up one position farther than it should be.
    }
    
    public static void parseIntoArrayList(String deez){
        ArrayList <String> nits = new ArrayList();
       for(int m  = 0; m <deez.length();m++){
           nits.add(deez.substring(m,m+1));
           
        }
        System.out.println(nits);
    }
    /*
    public static String findMin(ArrayList lol){
        String deez = "";
        int x = 0;
        int y = 100;
        for(int j = 0; j<lol.size();j++){
            x = (int)lol.get(j);
            if (x<y){
                y=x;
            }
                        
        }
        for(int j = 0; j<lol.size();j++){
            
            if ((int)lol.get(j)==y){
               deez = (String)lol.get(j); 
            }
                        
        }
        return deez;
        
    }
    */
    
}