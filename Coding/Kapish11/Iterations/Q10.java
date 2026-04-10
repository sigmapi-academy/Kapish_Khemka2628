package Iterations;
import java.util.*;


/**
 * Write a description of class Q10 here.
 * Frequency of each digit present in the number.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q10
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num, countFreq = 0, i, t, d;
        System.out.print("\fEnter any positive integer value: ");
        num = sc.nextLong();
        
        for(i = 0; i < 10; i++){
            for(countFreq = 0, t = num; t > 0; t/=10){
                d = t % 10;
                if(d == i){
                    countFreq++;
                }
            }
            if(countFreq > 0){
                System.out.print("\nThe frequency of " + i + " = " + countFreq);
            }
        }
    }
}