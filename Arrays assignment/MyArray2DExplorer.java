
/**
 * Write a description of class MyArray2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray2DExplorer
{
    public int minRowAssignment(int[][] nums, int row){
        int x = nums[row][0];
        int y = 0;
        for(int i = 0; i<3;i++){
            y=nums[row][i];
            if(x>y){
               x=y; 
            }
        }
        return x;
    }
    
    public int[] colMaxs(int[][] matrix){
        int x = 0;
        int y = 0;
        int [] store = new int[4];
        for(int j = 0; j<4;j++){
            x=0;
            for(int i = 0; i<3;i++){
               
               y=matrix[i][j];
               if (y>x){
                 x=y;  
                }
            }
            store[j]=x;
        }
        return store;
    }
    
    public int[] allRowSums(int[][] data){
        int x = 0;
        int y = 0;
        int [] store = new int[3];
        for(int j = 0; j<3;j++){
            x=0;
            for(int i = 0; i<4;i++){
                x+=data [j][i] ;
            }
            store[j]=x;
        }
        return store;
    }
    
    public double[] averageCol(int[][] nums){
        double x = 0;
        int y = 0;
        double [] store = new double[4];
        
        for(int j = 0; j<4;j++){
            x=0;
            for(int i = 0; i<3;i++){
               x+=nums[i][j] ; 
               
            }
            x/=3;
            store[j]=x;
        }
        return store;
    }
    
    public int smallEven(int[][] matrix){
        int x = 0;
        int y = matrix[0][0];
        int [] store = new int[4];
        for(int j = 0; j<4;j++){
            for(int i = 0; i<3;i++){
               matrix[i][j] = x;
               if (x % 2 == 0 && x<y){
                   y=x;
                }
            }
            
        }
        return y;
    }
    
    public static int biggestRow(int[][] nums){
        int x = 0;
        int y = nums[0][0];
        int [] store = new int[4];
        int b = 0;
        for(int j = 0; j<4;j++){
            for(int i = 0; i<3;i++){
               nums[i][j] += x;
               
            }
            if(y < x){
                b = j;
                
            }
        }
        
        return b;
    }
}
