package Iterations;
import java.util.*;


/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t, num, newNum = 0, digit;
        System.out.print("\fEnter any positive integer: ");
        num = sc.nextLong();
        
        for(t = num; t > 0; t /= 10){
            digit = t % 10;
            if(digit > 0){
                newNum = newNum * 10 + digit;
            }
        }
        for(t = 0; newNum > 0; t = t*10 + newNum%10, newNum /= 10);
        System.out.print("\nThe new number after removing zeros: " + t);
    }
}