package ilia.gymBeam.supplements;

import ilia.gymBeam.supplements.protein.Protein;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
@Log4j
public class sportsSupplements extends BasePage {

    @FindBy(xpath="//li [@class='level0 nav-1 category-item first level-top parent']")
    private List<WebElement> toClick;

    public Protein openSpotsSupplements()
    {
        click(toClick.get(0));
        sleep(2);
        return new Protein();
    }
}
