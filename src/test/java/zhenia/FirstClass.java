package zhenia;

import abstractpages.BaseTest;
import org.testng.annotations.Test;

public class FirstClass {


    int x = 1;

    @Test
    public void cold() {
        while (x <= 10) {
            x++;
            System.out.println(x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(x);
        }
    }
}
