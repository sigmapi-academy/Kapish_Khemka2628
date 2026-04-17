package OOP;


/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    String name; //Field or instance variable
    static String str = "has tail";
    
    {
        //static block
        System.out.print("\nI am a static block");
        System.out.print("\nNotifying you that object is created!");
    }
    public void bark(){ //method or function
        System.out.print("\n" + name + " says Woof!");
        System.out.print("\n" + str);
    }
}