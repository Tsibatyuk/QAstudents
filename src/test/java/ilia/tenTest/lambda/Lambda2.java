package ilia.tenTest.lambda;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Lambda2 extends BasePage {
    public Lambda3 test12()
    {
        List<Integer> secondMethod = new ArrayList<>();
        secondMethod.add(1);
        secondMethod.add(38);
        secondMethod.add(94);
        secondMethod.add(4913);
        secondMethod.add(339030);
        long count = secondMethod.stream()
                        .filter(n-> n % 2 == 0)
                                .count();
        System.out.println("Lambda2: " + secondMethod);
        return new Lambda3();
    }
};
