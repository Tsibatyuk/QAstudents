package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Listofprotein extends BasePage {
    @FindBy(xpath = "//div[@class='product-item-info']")
    private List<WebElement> stream1;

    public Sortedlistofprotein outPutListOfProtein()
    {
        List<String> output = stream1.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        output.forEach(o-> System.out.println("Stream1: " + o));
        System.out.println("------------------------------------");
        return new Sortedlistofprotein();
    }
}
