package OOP;


/**
 * Write a description of class TestShap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestShape
{
    public static void main(String[] args){
        Shape myshape = new Shape();
        System.out.print("\fArea of Rectangle: " +myshape.area(10, 5));
        System.out.print("\nArea of Square: " +myshape.area(10, 10));
        System.out.print("\nArea of Circle: " +myshape.area(10));
    }
}