package olena.webtesting.superLiga;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class FootballBallsPage extends BasePage {
    @FindBy(xpath = "//h2[@class='categories-name']")
    private List<WebElement> listCatalog;

    public PriceChecke selectFootballBalls() {
        click(listCatalog.get(1));
        return new PriceChecke();
    }
}
