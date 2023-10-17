package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda3 extends BasePage {
    public Lambda4 test13()
    {
        List<String> thirdMethod = new ArrayList<>();
        thirdMethod.add("rock");
        thirdMethod.add("puck");
        thirdMethod.add("apple");
        thirdMethod.add("google");
        thirdMethod.add("forest");
        thirdMethod.add("lidl");
        thirdMethod.add("chocolate");
        thirdMethod.removeIf(word -> word.length()>5);
        System.out.println("Lambda3: " + thirdMethod);
        return new Lambda4();
    }
}
