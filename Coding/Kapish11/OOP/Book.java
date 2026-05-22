package OOP;

import java.util.*;
 
/**
 * Write a description of class P1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    String t,a;
    double p;
    long Id;
    static int c;
    public Book()
    {
        this("", "");
    }

    public Book(String T,String A)
    {
        this(T, A, 0, 0L);
    }

    public Book(String Tt,String Aa, double P, long id)
    {
        t=Tt;
        a=Aa;
        p=p;
        Id=id;
        c++;
    }

    public void applyDiscount(double percent)
    {
        p=(100-percent)*p*1.0/100;
    }

    public void display()
    {
        System.out.println("Title: "+t);
        System.out.println("Author: "+a);
        System.out.println("Price: "+p);
        System.out.println("Unique Id: "+Id);
        System.out.println("No. of books: "+c);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        Book ob=new Book();
        System.out.println("Enter title, author, price and unique id");
        String t,a;
        double p;
        long Id;
        t=sc.next();
        a=sc.next();
        p=sc.nextInt();
        Id=sc.nextLong();
        Book ob2=new Book(t,a);
        Book ob3=new Book(t,a,p,Id);
        System.out.println("Enter the discount percent");
        double P=sc.nextDouble();
        ob3.applyDiscount(P);
        ob3.display();
    }
}