package OOP;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNumber;
    private String name;
    private byte std;
    
    public Student(){ //default constructor defined by the user
        rollNumber = 0;
        name = "";
        std = 0;
    }
    
    //parametrized constructor, used to initialize instance variable of object
    public Student(int rn, String nm, byte std){
        this.rollNumber = rn;
        this.name = nm;
        this.std = std;
    }
    
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    
    public void setName(String nm){
        this.name = nm;
    }
    
    public void setStd(byte std){
        this.std = std;
    }
    
    public int getRollNumber(){
        return this.rollNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public byte getStd(){
        return this.std;
    }
}