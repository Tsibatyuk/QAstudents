package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Stream5 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> fivesMethod;

    public Stream6 test5()
    {
        fivesMethod.stream()
                .map(WebElement::getText)
                .distinct()
                .forEach(word-> System.out.println("Stream5: " + word));
        System.out.println("---------------------------------------");
        return new Stream6();
    }
}
