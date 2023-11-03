package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Maxelementofprotein extends BasePage {
    @FindBy(xpath = "//div[@class = 'product-item-info']")
    private List<WebElement> stream4;

    public Limitlistofprotein outPutMaxElementOfProtein()
    {
        Optional<String> longestWord = stream4.stream()
                .map(WebElement::getText)
                .max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(word-> System.out.println("Stream4: " + word));
        System.out.println("-----------------------------------");
        return new Limitlistofprotein();
    }
}
