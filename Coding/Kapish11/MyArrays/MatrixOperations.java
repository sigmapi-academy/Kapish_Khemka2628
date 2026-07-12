package MyArrays;
import java.util.*;


/**
 * Write a description of class MatrixOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatrixOperations
{
    public static int[][] transpose(int A[][]){
        int i, j;
        int At[][] = new int[A[0].length][A.length];
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                At[j][i] = A[i][j];
            }
        }
        return At;
    }
    
    public static void printArray(int A[][], String msg){
        System.out.print("\n" + msg + "\n");
        int i, j;
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                System.out.print("\t"+A[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] createMatrix(int m, int n){
        Random r = new Random();
        int A[][] = new int[m][n];
        int i, j;
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = r.nextInt(10, 100);
            }
        }
        return A;
        
    }
}