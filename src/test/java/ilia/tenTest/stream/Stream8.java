package ilia.tenTest.stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Stream8 extends BasePage {
        @FindBy(xpath = "//h3[@class='video-title card-content-title ']")
        private List<WebElement> eighthMethod;

        public Stream9 test8()
        {
            boolean method4 = eighthMethod.stream()
                    .map(WebElement::getText)
                    .allMatch((words-> words.contains("А")));
            System.out.println("Stream8: " + method4);
            System.out.println("-----------------------------------");
            return new Stream9();
        }

}
