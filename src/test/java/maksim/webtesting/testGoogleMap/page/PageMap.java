package maksim.webtesting.testGoogleMap.page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class PageMap extends BasePage {

    public PageMap openGoogle() {
        DriverPoll.getDriver().get("https://www.google.com/");
        return this;
    }

    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement search;
    String map = "Google Map";

    public PageMap clicSearch() {
        click(search);
        return this;
    }
    public PageMap sendkeyMap(){
        search.sendKeys(map);
        return this;
    }

    @FindBy(xpath = "//input[@class='gNO89b']")
    private List<WebElement> searchGoogle;

    public SearchGoogleMap clicSearchGoodle(){
        click(searchGoogle.get(0));
        return new SearchGoogleMap();
    }

}
