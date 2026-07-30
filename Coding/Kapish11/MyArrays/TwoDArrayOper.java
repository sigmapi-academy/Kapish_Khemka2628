package MyArrays;


/**
 * Write a description of class TwoDArrayOper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrayOper
{
    public static void main(String[] args){
        
        int[][] arr = {{1,2}, {3,4}};
        
        //Default value of elements in an array is 0. 
        int[][] arr1 = new int[3][3];
        long[][] arr2 = new long[3][3];
        char[][] arr3 = new char[3][3];
        
        int[][] arr4 = {{1}, {2,3}, {3,4,5}, {5},{6,7,8,9,10}};
        int i, j;
        System.out.print("\fTechnique-1\n");
        for(i = 0; i < arr4.length; i++, System.out.println()){
            for(j = 0; j < arr4[i].length; j++){
                System.out.print("\t"+arr4[i][j]);
            }
        }
        
        System.out.print("\nTechnique-2\n");
        //for each loop only applicalable for collection(Array, list,...)
        for(int[] x: arr4){ 
            for(i = 0; i < x.length; i++){
                System.out.print("\t"+x[i]);
            }
            System.out.println();
        }
        
        System.out.print("\nTechnique-3\n");
        //for each loop only applicalable for collection(Array, list,...)
        for(int[] x: arr4){ 
            System.out.println(java.util.Arrays.toString(x));
        }
        
        System.out.print("\nTechnique-4\n");
        //for each loop only applicalable for collection(Array, list,...)
        for(i = 0; i < arr4.length; i++){ 
            System.out.println(java.util.Arrays.toString(arr4[i]));
        }
    }
}