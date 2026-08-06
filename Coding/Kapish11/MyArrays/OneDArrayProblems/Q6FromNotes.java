package MyArrays.OneDArrayProblems;
import java.util.*;


/**
 * Longest Consecutive Increasing Sequence
 * Write a program to input N integers into an array.
 * Determine the longest consecutive increasing sequence present in the array.
 * Print
	• Starting index
	• Ending index
	• Length of the sequence
	• Elements of the sequence
	Example
	Input
	12
	5 8 10 15 3 7 9 11 13 2 4 6
	
	Output
	Longest Consecutive Increasing Sequence
	7 9 11 13
	Starting Index = 5
	Ending Index = 8
	Length = 4
	Example
	Input
	8
	9 8 7 6 5 4 3 2
	Output
	Longest Consecutive Increasing Sequence
	9
	Length = 1
	Restrictions
	• Do not sort the array.
	• Do not use any additional array.
	• Solve using a single traversal.


 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6FromNotes
{
    public static void main(String[] args){
        int i, A[], N;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of elements: ");
        N = sc.nextInt();
        A = new int[N];
        //input values in array
        for(i = 0; i < N; i++){
            System.out.print("Enter value of A["+i+"]: ");
            A[i] = sc.nextInt();
        }
        
        int mlen = 1, currLen = 1, start = 0, end = 0, maxStart = 0, maxEnd = 0;
        for(i = 1; i < N; i++){
            if(A[i] > A[i-1]){
                currLen++;
                end = i;
            }
            else{
                currLen = 1;
                start = i;
                end = i;
            }
            
            if(currLen > mlen){
                mlen = currLen;
                maxStart = start;
                maxEnd = end;
            }
        }
        
        //print the values from maxStart to maxEnd inclusive.
        System.out.print("\nLongest Consecutive Increasing Sequence\n[");
        for(i = maxStart; i < maxEnd; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[i]+"]\n");
        System.out.print("\nStarting Index: " + maxStart);
        System.out.print("\nEnding Index: " + maxEnd);
        System.out.print("\nLength: " + mlen);
    }
}