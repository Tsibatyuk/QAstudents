package ilia.gymBeam.supplements.protein;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.Random;

public class Randomprotein extends BasePage {
    @FindBy(xpath = "//div[@class = 'product-item-info']")
    private List<WebElement> stream6;

    public Minelementofprotein outPutRandomProtein()
    {
        Random random = new Random();
        String randomWord = stream6.stream()
                .map(WebElement::getText)
                .skip(random.nextInt(stream6.size()))
                .findFirst()
                .orElse(" ");
        System.out.println("Stream6: " + randomWord);
        System.out.println("-----------------------------------");
        return new Minelementofprotein();
    }
}
