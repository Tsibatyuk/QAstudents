package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Stream9 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> ninthMethod;

    public Stream10 test9()
    {
        boolean method5 = ninthMethod.stream()
                .map(WebElement::getText)
                        .noneMatch("S"::equals);
        System.out.println("Stream9: " + method5);
        System.out.println("---------------------------------");
        return new Stream10();
    }
}
