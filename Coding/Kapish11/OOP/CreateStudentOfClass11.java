package OOP;
import java.util.*;


/**
 * Write a description of class CreateStudentOfClass11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateStudentOfClass11
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        String nm = sc.nextLine();
        byte std = 11;
        Student st1 = new Student(roll, nm, std);
        Student st2 = st1; //Create the reference of same student object
        System.out.print("\nst2.getName(): "+st2.getName());
        System.out.print("\nst1.getName(): " + st1.getName());
        
        st2.setName("Aaditya");
        System.out.print("\nst1.getName(): " + st1.getName());//Aaditya
        
        
        Student s3 = (Student)st1.clone();
        System.out.print("\ns3.getName(): " + s3.getName());
        System.out.print("\nEnter name for s3 object: ");
        s3.setName(sc.nextLine());
        System.out.print("\ns3.getName(): " + s3.getName());
        System.out.print("\nst1.getName(): " + st1.getName());
        
    }
}