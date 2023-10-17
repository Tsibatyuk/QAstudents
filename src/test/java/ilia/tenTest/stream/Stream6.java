package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream6 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> sixthMethod;

    public Stream7 test6()
    {
        Optional <String> shortWords = sixthMethod.stream()
                .map(WebElement::getText)
                .min(Comparator.comparingInt(String::length));
        System.out.println("Stream6: " + shortWords);
        System.out.println("------------------------------------------");
        return new Stream7();
    }
}
