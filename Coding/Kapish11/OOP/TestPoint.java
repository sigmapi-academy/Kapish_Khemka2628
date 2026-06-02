package OOP;
import java.util.*;


/**
 *
 * Object Copying (Copy Constructor Scenario)
 * Create a class Point (x, y).
 * Requirements:
 * • Implement a constructor that initializes x and y.
 * • Implement a copy constructor that copies coordinates 
 *      from another Point object.
 * • Add a method to move the point by dx, dy.
 * • In main, create a point, create its copy, 
 *    modify the original, and show how the copy behaves.

 * @author (your name)
 * @version (a version number or a date)
 */
class Point
{
    private int x, y;
    
    public Point(int dx, int dy){ //parameterized constructor
        this.x = dx;
        this.y = dy;
    }
    
    public Point(Point pt){ //copy constructor
        this(pt.x, pt.y);
    }
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    @Override
    public String toString(){
        return "("+x+", "+y+")";
    }
}

public class TestPoint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter two coordinate points: ");
        Point pt1 = new Point(sc.nextInt(), sc.nextInt());
        System.out.print("\nPoint 1: " + pt1);
        Point pt2 = new Point(pt1); //calling copy constructor
        System.out.print("\nPoint 2: " + pt2);
        System.out.print("\nEnter the value of dx and dy: ");
        pt1.move(sc.nextInt(), sc.nextInt());
        System.out.print("\nPoint 1 move to: " + pt1);
    }
}