package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.Random;

public class Stream7 extends BasePage {
    @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
    private List<WebElement> seventhMethod;

    public Stream8 test7()
    {
        Random random = new Random();
        String method3 = seventhMethod.stream()
                .map(WebElement::getText)
                .skip(random.nextInt(seventhMethod.size()))
                .findFirst()
                .orElse(" ");
        System.out.println("Stream7: " + method3);
        System.out.println("--------------------------------");
        return new Stream8();
    }
}
