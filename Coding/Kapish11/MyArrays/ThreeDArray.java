package MyArrays;
import java.util.*;


/**
 * Write a description of class ThreeDArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreeDArray
{
    public static void main(String[] args){
        int[][][] arr = new int[2][2][3];
        int i, j, k;
        Random r = new Random();
        for(i = 0; i < arr.length; i++){
            System.out.print("\nLayer-"+i+"\n");
            for(j = 0; j < arr[i].length; j++, System.out.print("\n")){
                for(k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] = r.nextInt(10, 100);
                    System.out.print("\t"+arr[i][j][k]);
                }
            }
        }
    }
}