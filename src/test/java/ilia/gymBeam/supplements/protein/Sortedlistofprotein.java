package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortedlistofprotein extends BasePage {
    @FindBy(xpath = " //div [@class = 'product-item-info'] ")
    private List<WebElement> stream2;

    public Filteredlistofprotein outPutSortedListOfProtein()
    {
        List<String> output = stream2.stream()
                .map(WebElement::getText)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        output.forEach(o-> System.out.println("Stream2: " + o));
        System.out.println("-----------------------------------");
        return new Filteredlistofprotein();
    }
}
