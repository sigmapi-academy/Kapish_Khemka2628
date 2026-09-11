package MyStrings;
import java.util.*;

/**
 * Write a description of class Mix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mix
{
    String word;
    int len;
    Mix()
    {
        word="";
        len=0;
    }

    void feedword()
    {
        System.out.println("Enter the Word");
        word=new Scanner (System.in).next();
        len=word.length();
    }

    void mix_word(Mix P, Mix Q)
    {
        char[] d1=P.word.toCharArray();
        char[] d2=Q.word.toCharArray();
        int i, j;
        for(i = j = 0; i < d1.length && j < d2.length;)
        {
            word+=d1[i++];
            word+=d2[j++];
        }

        for(;i < d1.length;i++){
            word+=d1[i];
        }
        for(;j < d2.length; j++){
            word+=d2[j];
        }
    }

    void display()
    {
        System.out.println("The Mixed Word: "+word);
    }

    public static void main()
    {
        System.out.println("\f");
        Mix ob=new Mix();
        Mix P=new Mix();
        Mix Q=new Mix();
        P.feedword();
        Q.feedword();
        ob.mix_word(P,Q);
        ob.display();
    }
}

