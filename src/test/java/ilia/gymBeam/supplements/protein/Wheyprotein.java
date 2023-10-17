package ilia.gymBeam.supplements.protein;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Wheyprotein extends BasePage {
    @FindBy(xpath = "//li[@class = 'level2 nav-1-1-1 category-item first parent']")
    private List<WebElement> toClick;

    public Listofprotein openWheyProtein()
    {
        click(toClick.get(1));
        sleep(2);
        return new Listofprotein();
    }
}
