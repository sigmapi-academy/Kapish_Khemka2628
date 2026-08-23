package Class11Practicals;


/**
 * Write a description of class TestStringBuffer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStringBuffer
{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(args[0]);
        System.out.print("\f");
        String str = sb.toString();
        System.out.print("\n" + str);
        
        sb.insert(4, "Java");
        System.out.print("\n"+sb);
        
        StringBuffer st = sb.delete(4, 8);
        System.out.print("\n"+sb);
        System.out.print("\nst = " + st);
        sb.delete(3, 5);
        System.out.print("\nst = " + st);
    }
}