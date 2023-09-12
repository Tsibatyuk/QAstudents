package olena.webtesting.optimove.maiven3;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Manpage3 extends BasePage {

    private static Manpage3 MouseHoverUtil;

    public Manpage3 openOptimove() {
        DriverPoll.getDriver().get("https://www.optimove.com/");
        return this;
    }

    @FindBy(xpath = "//div[@class='header-nav__item header-nav__item--has-children d-mobile  d-desktop ']")
    private static List<WebElement> company;

    public void hoverOverCompanyElement(int index) {
        Actions actions = new Actions(DriverPoll.getDriver());
        if (index >= 0 && index < company.size()) {
            WebElement elementToHover = company.get(index);
            actions.moveToElement(elementToHover).perform();
            sleep(5);
        }
        DriverPoll.getDriver().switchTo().frame(iframeElement);
        elementInIframe.click();
        DriverPoll.getDriver().switchTo().defaultContent();
        click(clickX);
        if (index >= 0 && index < company.size()) {
            WebElement elementToHover = company.get(index);
            actions.moveToElement(elementToHover).perform();
            sleep(2);
        }
    }

    @FindBy(xpath = "//div[@class='header-nav__item  header-nav__item--is-child  d-mobile  d-desktop ']")
    private List<WebElement> careers;

    public Manpage3 clickCareers() {
        click(careers.get(24));
        sleep(2);
        scroll(4500);
        sleep(5);
        return this;
    }

    @FindBy(xpath = "//div[@class='select select--job-locations']")
    private WebElement button;
    @FindBy(xpath = "//iframe[@id='hubspot-conversations-iframe']")
    WebElement iframeElement;
    @FindBy(xpath = "//button[@aria-label='Dismiss']")
    WebElement elementInIframe;
    @FindBy(xpath = "//a[@class='cookiebanner__close d-block']")
    WebElement clickX;

    public Manpage3 clickButton() {
        sleep(3);
        click(button);
        sleep(1);
        for (int i = 0; i < 2; i++) {
            try {
                click(ukr);
            } catch (Exception e) {
                click(button);
            }
        }
        return this;
    }

    @FindBy(xpath = "//li[@class='selected highlighted']")
    private WebElement scrool;

    @FindBy(xpath = "//ul/*[contains(text(),'UKR')]")
    private WebElement ukr;
}