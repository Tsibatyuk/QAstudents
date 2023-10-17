package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Stream1 extends BasePage {

    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> firstMethod;

    public Stream2 test1()
    {
        List<String> method1 = firstMethod.stream()
                .map(WebElement::getText)
                .distinct()
                .sorted()
                        .collect(Collectors.toList());
        method1.forEach(p-> System.out.println("Stream1:" + p));
        System.out.println("--------------------------------------");
        return new Stream2();
    }
}
