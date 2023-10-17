package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda5 extends BasePage {
    public Lambda6 test15()
    {
        StringBuilder result = new StringBuilder();
        List<String> fifthMethod = new ArrayList<>();
        fifthMethod.add("Zhenya");
        fifthMethod.add("Is");
        fifthMethod.add("The");
        fifthMethod.add("Best");
        fifthMethod.add("Mentor");
        fifthMethod.add(":)");
        fifthMethod.forEach(string -> result.append(string));//(result::append)
        System.out.println("Lambda5: " + result.toString());
        return new Lambda6();
    }
}
