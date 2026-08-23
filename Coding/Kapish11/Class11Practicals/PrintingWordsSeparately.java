package Class11Practicals;
import java.util.*;

/**
 * Write a description of class PrintingWordsSeparately here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintingWordsSeparately
{
    public static void main(String[] args){
        System.out.print("\fEnter sentence: ");
        String sentence = new java.util.Scanner(System.in).nextLine();
        String word, maxWord = "";
        int i, index;
        Scanner words = new Scanner(sentence);
        // 213141
        words.useDelimiter("[.? ]");
        while(words.hasNext()){
            word = words.next();
            if(word.length()> maxWord.length()){
                maxWord = word;
            }
        }
        System.out.print("\nWord with maximum alphabets: " + maxWord);

        // sentence = sentence.trim() + " ";
        // for(i = 0 ; i < sentence.length(); i=index+1){
        // index = sentence.indexOf(" ", i);
        // word = sentence.substring(i, index);
        // System.out.print("\n" + word);
        // }
    }
}