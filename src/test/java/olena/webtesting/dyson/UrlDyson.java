package olena.webtesting.dyson;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class UrlDyson extends BasePage {
    @FindBy(xpath = "//li[@class='products-menu__item j-submenu-item'][1]")
    private WebElement submenu;

    @FindBy(xpath = "//div[@class='productsMenu-submenu-image']//img[@alt='Стайлери']")
    private WebElement styler;


    public UrlDyson goToHomePage() {
        DriverPoll.getDriver().get("https://dyson-service.com.ua/");
        sleep(1);
        return new UrlDyson();
    }

    public UrlDyson moveToSubMenu() {
        moveToElement(submenu);
        return new UrlDyson();
    }

    public SectionCareHair clickStyler() {
        click(styler);
        return new SectionCareHair();
    }
}
