package olena;

import org.testng.annotations.Test;

@Test
public class Palindromolena {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "level";
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println(input + " true ");
        } else {
            System.out.println(input + " false");
        }

    }

}