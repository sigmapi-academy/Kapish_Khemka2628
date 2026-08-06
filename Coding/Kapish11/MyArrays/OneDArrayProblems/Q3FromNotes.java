package MyArrays.OneDArrayProblems;
import java.util.*;

/**
 * Insert an Element at a Given Position
 * Write a program to create an array of N elements.
 * Input a new element X and a position P (0-based index). 
 * Insert the element at the specified position by shifting
 * the remaining elements to the right.
 * If the array is already full, display "Insertion not possible."
 * Example
 * Original Array
 * [10, 20, 30, 40, 50]
 * Enter element : 25
 * Enter position : 2
 * Output
 * Array after insertion
 * [10, 20, 25, 30, 40, 50]
 * Restrictions
• Do not create another array.
• Perform insertion using shifting only.

 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3FromNotes
{
    public static int NE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int A[], N, P;
        System.out.print("Enter number of elements: ");
        N = sc.nextInt();
        A = new int[N];
        while(!false){
            System.out.print("\n1. insert\n2. display\n3. exit");
            System.out.print("\nEnter your choice(1,2,3): ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("\nEnter your element: ");
                    int e = sc.nextInt();
                    System.out.print("\nEnter the position (0 to "
                        + (N-1)+ "): ");
                    P = sc.nextInt();
                    insert(A, e, P);
                    break;
                case 2: 
                    displayArray(A, "Array A[]: ");
                    break;
                case 3:
                    System.out.print("\nGood bye");
                    System.exit(ch);
                default:
                    System.out.print("\nWrong choice!");
            }
        }
    }

    public static void insert(int A[], int e, int position){
        if(!(position > -1 && position < A.length)){
            System.out.print("\nInvalid position in the array.");
            return;
        }
        
        if(A.length == NE ){
            System.out.print("\nArray is full, insertion is not possible.");
            return;
        }
        int i;
        for(i = NE - 1; i >= position; i--){
            A[i+1] = A[i]; //shifting the ith position element to i+1 th position
        }
        A[i+1] = e; //insertion at the end or at appropriate position  
        NE++;
    }

    public static void displayArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[");
        int i;
        for(i = 0; i < A.length-1; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[i]+"]\n");
    }
}