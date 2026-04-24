package OOP;
import java.util.*;


/**
 * Write a description of class CreatingDogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreatingDogs
{
    public static void main(String[] args){
        Dog d1 = new Dog(); 
        Dog d2 = new Dog(); 
        Dog d3 = new Dog(); 
        Dog d4 = new Dog(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the name of dog-1: ");
        d1.name = sc.nextLine();
        System.out.print("Enter the name of dog-2: ");
        d2.name = sc.nextLine();
        System.out.print("Enter the name of dog-3: ");
        d3.name = sc.nextLine();
        System.out.print("Enter the name of dog-4: ");
        d4.name = sc.nextLine();
        
        System.out.print("\nDog-1 name is : " + d1.name);
        System.out.print("\nDog-2 name is : " + d2.name);
        System.out.print("\nDog-3 name is : " + d3.name);
        System.out.print("\nDog-4 name is : " + d4.name);
    }
}