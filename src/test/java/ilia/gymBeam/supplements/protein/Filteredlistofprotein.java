package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Filteredlistofprotein extends BasePage {
    @FindBy(xpath = " //div [@class = 'product-item-info'] ")
    private List<WebElement> stream3;

    public Maxelementofprotein outPutFilteredListOfProtein()
    {
        List<String> output = stream3.stream()
                .map(WebElement::getText)
                .filter(f->f.length()<50)
                .collect(Collectors.toList());
        output.forEach(o-> System.out.println("Stream3: " + o));
        System.out.println("-----------------------------------");
        return new Maxelementofprotein();
    }
}
