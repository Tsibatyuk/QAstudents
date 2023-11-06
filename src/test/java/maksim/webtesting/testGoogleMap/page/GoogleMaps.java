package maksim.webtesting.testGoogleMap.page;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

@Log4j
public class GoogleMaps extends BasePage {

    @FindBy(xpath = "//button[@id='hArJGc']")
    private WebElement route;

    public GoogleMaps clickButtonRoute() {
        log.info("click button route");
        click(route);
        return this;
    }

    @FindBy(xpath = "//div[@data-travel_mode='0']")
    private WebElement car;

    public GoogleMaps chooseCar() {
        click(car);
        return this;
    }

    @FindBy(xpath = "//input[@class='tactile-searchbox-input']")
    private List<WebElement> where;

    public GoogleMaps clicWhere() {
        click(where.get(0));
        sleep(3);
        return this;
    }

    String bro = "Бровари";

    public GoogleMaps sendkeysWhere() {
        where.get(0).sendKeys(bro);
        return this;
    }

    @FindBy(xpath = "//input[@class='tactile-searchbox-input']")
    private List<WebElement> whereWeGo;

    public GoogleMaps clicWhereWeGo() {
        click(whereWeGo.get(1));
        return this;
    }

    String kiev = "Київ";

    public GoogleMaps sendKeysWhereWeGo() {
        whereWeGo.get(1).sendKeys(kiev + "\n");
        return this;
    }


    @FindBy(xpath = "//*[@id='section-directions-trip-title-0']")
    private WebElement fastRoute;

    public GoogleMaps clicFastRoute() {
        click(fastRoute);
        return this;
    }

}
