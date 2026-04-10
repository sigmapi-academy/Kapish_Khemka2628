package Iterations;
import java.util.*;


/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * (1+2)/(1*2) + (1+2+3) / (1*2*3)+ ...+(1+2+...+n)/(1*2*...*n)
 */
public class Q8
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, num = 1, nsum = 1, pdeno = 1, n;
        double sum = 0;
        
        System.out.print("\fEnter the value of n: ");
        n = sc.nextInt();
        
        for(i = 1; i <= n-1; i++){
            num ++;
            nsum += num;
            pdeno *= num;
            sum += nsum/(double)pdeno;
        }
        System.out.print("\nS = " + sum);
    }
}