package OOP;


/**
 * Write a description of class Doubt1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    private static final double pi = 3.14;
    private double radius;
    
    public void getRadius(double r){
        radius = r;
    }
    public double areaOfCircle(){
        return pi * radius * radius;
    }
    
    public double circumferenceOfCircle(){
        return 2*pi*radius;
    }
}