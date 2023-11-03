package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Limitlistofprotein extends BasePage {
    @FindBy(xpath = "//div[@class = 'product-item-info']")
    private List<WebElement> stream5;

    public Randomprotein outPutLimitlistofprotein()
    {
        List<String> outPutLimitWords = stream5.stream()
                .map(WebElement::getText)
                .limit(5)
                .collect(Collectors.toList());
        outPutLimitWords.forEach(o-> System.out.println("Stream5: " + o));
        System.out.println("-----------------------------------");
        return new Randomprotein();
    }
}
