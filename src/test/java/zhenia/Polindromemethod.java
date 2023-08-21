package zhenia;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Polindromemethod {
    String polin = "Lalual";

    @Test
    public void checktheChars() {
        StringBuilder reversed = new StringBuilder();
        for (int i = polin.length()-1 ; i >= 0; i--) {
            reversed.append(polin.charAt(i));
        }

        String reversedString = reversed.toString();
        System.out.println(reversedString);
        Assert.assertEquals(polin.equalsIgnoreCase(reversedString), true);



    }

    public static void main(String[] args) {
        String level = "lEVEl";
        Map<Integer, Character> palindrome1 = IntStream.range(0, level.length()).boxed().collect(Collectors.toMap(i -> i + 1, level::charAt));

        StringBuilder word= new StringBuilder();

        IntStream.rangeClosed(1, palindrome1.size()).mapToObj(palindrome1::get).forEach(word::append);

        String original = word.toString();
        String reversed = word.reverse().toString();

        Assert.assertEquals(original.equalsIgnoreCase(reversed), true);


        Practicetest p = new Practicetest();

    }

}
