package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda9 extends BasePage {
    public Lambda10 test19()
    {
        List<String> ninthMethod = new ArrayList<>();
        ninthMethod.add("Hello");
        ninthMethod.add("World!");
        ninthMethod.add("Java");
        ninthMethod.add("Lambda");
        final int[] count = {0};
        ninthMethod.forEach(word -> count[0]++);
        System.out.println("Lambda9: " + count[0]);
        return new Lambda10();
    }
}
