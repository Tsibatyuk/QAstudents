package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Stream2 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> secondMethod;

    public Stream3 test2()
    {
        List<String> method2 = secondMethod.stream()
                .map(WebElement::getText)
                .distinct()
                .skip(50)
                .collect(Collectors.toList());
        method2.forEach(p -> System.out.println("Stream2: " + p));
        System.out.println("-------------------------------");
        return new Stream3();
    }
}
