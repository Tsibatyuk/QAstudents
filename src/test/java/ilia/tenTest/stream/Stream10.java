package ilia.tenTest.stream;

import ilia.tenTest.lambda.Lambda1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Stream10 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> tenthMethod;

    public Lambda1 test10()
    {
        List<String>method5 = tenthMethod.stream()
                .map(WebElement::getText)
                .distinct()
                .limit(6)
                .collect(Collectors.toList());
        System.out.println("Stream10: " + method5);
        return new Lambda1();
    }
}
