package OOP;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Cloneable
{
    private int rollNumber;
    private String name;
    private byte std;
    private static String schoolName;
    static{
        System.out.print("\fSet your school name");
    }
    public static void setSchoolName(String sn){
        schoolName = sn;
    }
    //Constructor Chaining
    public Student(){ //default constructor defined by the user
        this(0,"",(byte)0); //calling parametrized constructor
    }

    //parametrized constructor, used to initialize instance variable of object
    public Student(int rn, String nm, byte std){
        this.rollNumber = rn;
        this.name = nm;
        this.std = std;
    }

    public Student(Student st){   //copy constructor
        this(st.rollNumber, st.name, st.std); //calling parametrized constructor
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

    // Overriding the clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Returning a clone of the current object
        return super.clone(); 
    }

    //factory method
    public static Student newStudent(){
        return new Student();
    }

    @Override
    public String toString(){
        return "\nRoll number: " + rollNumber + 
        "\nName " + name + "\nStd: " + std +
        "\nSchool name: " + schoolName;
    }
}