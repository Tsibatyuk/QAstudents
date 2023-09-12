package maksim.webtesting.optimove.page;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import javax.swing.*;
import java.util.List;

public class MainPage extends BasePage {

    public MainPage openOptimove() {
        DriverPoll.getDriver().get("https://www.optimove.com/");
        return this;
    }

    @FindBy(xpath = "//div[@class='header-nav__item header-nav__item--has-children d-mobile  d-desktop ']")
    private List<WebElement> company;

    //a[@class='header-nav__link ']//*[.='Careers']
    public MainPage cursor(int index) {
        if (index >= 0 && index < company.size()) {
            WebElement elementToHover = company.get(index);

            Actions actions = new Actions(DriverPoll.getDriver());
            actions.moveToElement(elementToHover).perform();
        } else {
            System.out.println("Invalid index provided.");
        }
        return this;
    }
    @FindBy(xpath = "//div[@class='select select--job-locations']")
    private WebElement all;
    @FindBy(xpath = "//div[@class='header-nav__item  header-nav__item--is-child  d-mobile  d-desktop ']")
    private List<WebElement>carer;
    @FindBy(xpath = "//*[@id='hubspot-conversations-iframe']")
    private WebElement ifremeClose;
    @FindBy(xpath = "//*[@class='site-logo entered lazyloaded']")
    private WebElement move;
    public MainPage careers(){
        click(carer.get(24));
        scroll(4400);
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(move).perform();
        sleep(5);


        return this;
    }
    @FindBy(xpath = "//li[@class='selected highlighted']")
    private WebElement tab;
    @FindBy(xpath = "//button[@aria-label='Dismiss']")
    private WebElement close;
    @FindBy(xpath = "//li[@data-index='8']")
    private List<WebElement>ukr;
    public MainPage closeIframe(){
        DriverPoll.getDriver().switchTo().frame(ifremeClose);
        click(close);
        DriverPoll.getDriver().switchTo().defaultContent();
        click(all);
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(tab).perform();
        scroll(10);
        click(ukr.get(0));
        return this;
    }

    }


