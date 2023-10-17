package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 extends BasePage {
    public Lambda5 test14()
    {
        List<String> fourthMethod = new ArrayList<>();
        fourthMethod.add("Ilia");
        fourthMethod.add("Mark");
        fourthMethod.add("Zhenya");
        fourthMethod.add("Venya");
        fourthMethod.add("Sasha");
        fourthMethod.add("Olenka");
        fourthMethod.add("Maks");
        fourthMethod.add("Vlad");
        fourthMethod.sort((s1,s2)-> Integer.compare(s1.length(),s2.length()));
        System.out.println("Lambda4: " + fourthMethod);
        return new Lambda5();
    }
}
