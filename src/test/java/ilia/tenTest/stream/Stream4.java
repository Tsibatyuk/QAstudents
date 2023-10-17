package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream4 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> fourthMethod;

    public Stream5 test4()
    {
        Optional<String> longestWord = fourthMethod.stream()
                .map(WebElement::getText)
                .max(Comparator.comparingInt(String::length));
        System.out.println("Stream4: " + longestWord);
        System.out.println("-------------------------------------");
        return new Stream5();
    }
}
