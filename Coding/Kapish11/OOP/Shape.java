package OOP;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
    /**
     * @param len Radius of a Circle
     */
    public double area(double len){
        return len * Math.PI;
    }
    
    /**
     * @param len Length of the rectangle
     * @param bre Breadth of the rectangle
     */
    public double area(double len, double bre){
        return len * bre;
    }
    
}