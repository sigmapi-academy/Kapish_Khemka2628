package OOP;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    //instance variables
    int engineNum;
    String model;
    double price;
    
    public void display(){
        System.out.print("\nEngine number: " + engineNum
                            + "\nModel: " + model+
                            "\nPrice: " + price);
    }
}