
/**
 * Catalogs number posiiotns and charts them out
 *
 * @author Ethan Dean Roumeliotis
 * @version 5/1/21
 */
import java.util.*;
public class Array
{
    Scanner input = new Scanner(System.in);
    public void array(){
     //User sets memory length for array
     System.out.println("Please input how many numbers youd like to enter");
     int n = 0;
     n = input.nextInt();  
     int[] nums = new int[n];
     System.out.println("Please enter numbers from 1-100 until you are stopped");
     //create vars
     int count1 = 0;
     int count2 = 0;
     int count3 = 0;
     int count4 = 0;
     int count5 = 0;
     int count6 = 0;
     int count7 = 0;
     int count8 = 0;
     int count9 = 0;
     int count10 = 0;
     //array memory length
     for (int i = 0;i<nums.length;i++){
         nums[i]=input.nextInt();
         System.out.println("Please enter numbers from 1-100 until you are stopped");
        }
     //catalog number positions
     for(int j =0;j<nums.length;j++){
            
        if (nums[j]<11){
              count1++;
             }else if (nums[j]<21){
              count2++ ;     
             }else if (nums[j]<31){
              count3++ ;     
             }else if (nums[j]<41){
              count4++ ;     
             }else if (nums[j]<51){
              count5++ ;     
             }else if (nums[j]<61){
              count6++ ;     
             }else if (nums[j]<71){
              count7++ ;     
             }else if (nums[j]<81){
              count8++ ;     
             }else if (nums[j]<91){
              count9++ ;     
             }else if (nums[j]<=100){
              count10++ ;     
        }
     }
     //create the astrisks
     String[] ar1 = new String[count1];       
     for(int i = 0;i<count1;i++){
         
         ar1[i]= "*";
         
        }
        String[] ar2 = new String[count2];       
     for(int i = 0;i<count2;i++){
         
         ar2[i]= "*";
         
        }
        String[] ar3 = new String[count3];       
     for(int i = 0;i<count3;i++){
         
         ar3[i]= "*";
         
        }
        String[] ar4 = new String[count4];       
     for(int i = 0;i<count4;i++){
         
         ar4[i]= "*";
         
        }
        String[] ar5 = new String[count5];       
     for(int i = 0;i<count5;i++){
         
         ar5[i]= "*";
         
        }
        String[] ar6 = new String[count6];       
     for(int i = 0;i<count6;i++){
         
         ar6[i]= "*";
         
        }
        String[] ar7 = new String[count7];       
     for(int i = 0;i<count7;i++){
         
         ar7[i]= "*";
         
        }
        String[] ar8 = new String[count8];       
     for(int i = 0;i<count8;i++){
         
         ar8[i]= "*";
         
        }
        String[] ar9 = new String[count9];       
     for(int i = 0;i<count9;i++){
         
         ar9[i]= "*";
         
        }
        String[] ar10 = new String[count10];       
     for(int i = 0;i<count10;i++){
         
         ar10[i]= "*";
         
        }
        //Print out the results
     System.out.println("Amount of numbers between 1 and 10: "+Arrays.toString(ar1));   
     System.out.println("Amount of numbers between 11 and 20: "+Arrays.toString(ar2));   
     System.out.println("Amount of numbers between 21 and 30: "+Arrays.toString(ar3));   
     System.out.println("Amount of numbers between 31 and 40: "+Arrays.toString(ar4));   
     System.out.println("Amount of numbers between 41 and 50: "+Arrays.toString(ar5));   
     System.out.println("Amount of numbers between 51 and 60: "+Arrays.toString(ar6));   
     System.out.println("Amount of numbers between 61 and 70: "+Arrays.toString(ar7));   
     System.out.println("Amount of numbers between 71 and 80: "+Arrays.toString(ar8));   
     System.out.println("Amount of numbers between 81 and 90: "+Arrays.toString(ar9));   
     System.out.println("Amount of numbers between 91 and 100: "+Arrays.toString(ar10));   
     
  }
}
