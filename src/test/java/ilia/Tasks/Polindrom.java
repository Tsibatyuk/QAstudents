package ilia.Tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Polindrom {

    /*public static void main(String[] args)
    {
        String word = "rever";
        boolean Palindrome = PalindromeMethod1(word);

        if(Palindrome)
        {
            System.out.println(word + " is Palindrome");
        }
        else
        {
            System.out.println(word + " is not Palindrome");
        }
    }
    public static boolean PalindromeMethod1(String str)
    {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());

    }*/

    public static void main(String[] args) {
        Map<Integer, String> palindrome1 = new HashMap<>();
        palindrome1.put(1, "L");
        palindrome1.put(2, "E");
        palindrome1.put(3, "V");
        palindrome1.put(4, "E");
        palindrome1.put(5, "L");
        StringBuilder word= new StringBuilder();
        for(int i = 1; i <= palindrome1.size() ;i++)
        {
            word.append(palindrome1.get(i));
        }

        String original = word.toString();
        String reversed = word.reverse().toString();

        if(original.equals(reversed))
        {
            System.out.println(original + " is Palindrome");
        }
        else
        {
            System.err.println(original + "is not Palindrome");
        }
    }


}

