package ilia.tenTest.lambda;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lambda1 extends BasePage {
    public Lambda2 test11()
    {
        List<String> firstMethod = new ArrayList<>();
        firstMethod.add("Glory");
        firstMethod.add("Ruler");
        firstMethod.add("Pizza");
        firstMethod.add("cook");
        firstMethod.forEach(element -> System.out.println("Lambda1: " + element));

        return new Lambda2();
    }
}
