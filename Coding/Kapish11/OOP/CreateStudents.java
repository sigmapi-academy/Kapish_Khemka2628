package OOP;
import java.util.*;


/**
 * Write a description of class CreateStudents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateStudents
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        Student s1 = new Student(); //by calling default constructor
        System.out.print("Enter roll number: ");
        s1.setRollNumber(sc.nextInt());
        sc.nextLine(); //to remove the keyboard buffer
        System.out.print("Enter name of student: ");
        s1.setName(sc.nextLine());
        System.out.print("Enter standard of student: ");
        s1.setStd(sc.nextByte());
        
        //Another object of student
        // using parameterized constructor to initialize it
        System.out.print("\nEnter roll number, name, and standard of student: \n");
        int r = sc.nextInt();
        sc.nextLine();
        String nm = sc.nextLine();
        byte std = sc.nextByte();
        Student s2 = new Student(r, nm, std);
        
        System.out.print("\nStudent 1 info:");
        System.out.print("\nRoll number: " + s1.getRollNumber());
        System.out.print("\nName: " + s1.getName());
        System.out.print("\nStandard: " + s1.getStd());
        
        
        System.out.print("\nStudent 2 info:");
        System.out.print("\nRoll number: " + s2.getRollNumber());
        System.out.print("\nName: " + s2.getName());
        System.out.print("\nStandard: " + s2.getStd());
    }
}