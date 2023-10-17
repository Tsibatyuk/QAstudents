package ilia.tenTest.stream;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Stream3 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> thirdMethod;
    public Stream4 test3()
    {
        boolean wordWithC = thirdMethod.stream()
                .map(WebElement::getText)
                .anyMatch(word->word.contains("C"));
        System.out.println("Stream3: " + wordWithC);
        System.out.println("---------------------------------------");
        return new Stream4();
    }
}
