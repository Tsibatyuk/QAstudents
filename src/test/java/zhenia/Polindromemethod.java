package zhenia;

import org.testng.Assert;
import org.testng.annotations.Test;

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

}
