package JAVA;
import java.util.*;
//. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 
public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();

        if(CheckPangramOrNot(str))
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");


    }
    static boolean CheckPangramOrNot(String str){

        str.toLowerCase();
        boolean[] alphabet = new boolean[26];

        char[] ch = str.toCharArray();

        for(char c : ch)
        {
            if('a' <= c && c <= 'z')
                alphabet[c - 'a'] = true;
            
        }

        for(boolean letters : alphabet)
        {
            if(!letters)
                return false;
        }
        return true;

    }
}
