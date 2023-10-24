package olena.webtesting.superLiga;

import driver.DriverPoll;
import olena.webtesting.planetakino.MainpagePlanetakino;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class MainPageSuperLiga extends BasePage {
    @FindBy(xpath = "//h2[@class='categories-name']")
    private List<WebElement> listCategories;
    public MainPageSuperLiga openSuperLigaWebsite(){
        DriverPoll.getDriver().get("https://superliga.com.ua/ua/");
        return this;
    }
    public FootballBallsPage navigateToBallsSection(){
        click(listCategories.get(4));
        return new FootballBallsPage();
    }

}
