package ilia.gymBeam.supplements.protein;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Minelementofprotein extends BasePage {
    @FindBy(xpath = "//div[@class = 'product-item-info']")
    private List<WebElement> stream7;

    public Minelementofprotein outPutMineElementOfProtein()
    {
        Optional<String> shortWord = stream7.stream()
                .map(WebElement::getText)
                .min(Comparator.comparingInt(String::length));
        shortWord.ifPresent(word-> System.out.println("Stream7: " + word));
        return this;
    }
}
