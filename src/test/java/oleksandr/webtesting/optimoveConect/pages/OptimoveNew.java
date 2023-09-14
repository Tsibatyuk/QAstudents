package oleksandr.webtesting.optimoveConect.pages;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


public class OptimoveNew extends BasePage {
    public OptimoveNew openOptimove() {
        DriverPoll.getDriver().get("https://www.optimove.com/");
        return this;
    }

    @FindBy(xpath = "//div[@class='header-nav__item header-nav__item--has-children d-mobile  d-desktop ']")
    private List<WebElement> company;
    @FindBy(xpath = "//div[@class='header-nav__item  header-nav__item--is-child  d-mobile  d-desktop ']/a[contains(text(),'Careers')]")
    private WebElement her23;
    @FindBy(xpath = "//a[@class='cookiebanner__close d-block']")
    private WebElement dblok;
    @FindBy(xpath = "//div[@class='selectric']")
    private WebElement selekctric;
    @FindBy(xpath = "//ul/li[contains(text(),'UKR')]")
    private WebElement UKR;
    @FindBy(xpath = "//ul/li[contains(text(),'UKR')]")
    private WebElement UKR2;

    public OptimoveNew howerOverCompany() {
        Actions action = new Actions(DriverPoll.getDriver());
        action.moveToElement(company.get(3)).perform();
        action.moveToElement(her23);
        click(her23);
        sleep(3);
        while (DriverPoll.getDriver().findElements(By.xpath("//iframe")).size() < 6) {
            Actions actions = new Actions(DriverPoll.getDriver());
            actions.moveByOffset(1, 1).perform();
        }
        sleep(3);
        DriverPoll.getDriver().switchTo().frame(frame);
        click(close);
        sleep(2);
        DriverPoll.getDriver().switchTo().defaultContent();

        DriverPoll.getDriver().findElement(By.xpath("//a[@class='cookiebanner__close d-block']")).click();
        DriverPoll.getDriver().findElements(By.xpath("//div[@class='selectric']")).get(0).click();
        action.moveToElement(DriverPoll.getDriver().findElement(By.xpath("//ul/li[contains(text(),'UKR')]")));
        sleep(2);
        DriverPoll.getDriver().findElement(By.xpath("//ul/li[contains(text(),'UKR')]")).click();
        sleep(3);
        return this;
    }


    @FindBy(xpath = "//*[@id='hubspot-conversations-iframe']")
    private WebElement frame;
    @FindBy(xpath = "//div[@class='VizExIcon__IconWrapper-sc-1qu9za0-0 kximul']")
    private WebElement close;

    public OptimoveNew iframedroch() {

        while (DriverPoll.getDriver().findElements(By.xpath("//iframe")).size() < 6) {
            Actions actions = new Actions(DriverPoll.getDriver());
            actions.moveByOffset(1, 1).perform();
        }
        sleep(3);
        DriverPoll.getDriver().switchTo().frame(frame);
        click(close);
        DriverPoll.getDriver().switchTo().defaultContent();
        DriverPoll.getDriver().findElement(By.xpath("//a[@class='cookiebanner__close d-block']")).click();
        return this;
    }

    @FindBy(xpath = "//div[@class='select select--job-locations']")
    private WebElement all;
    @FindBy(xpath = "//div[@class='header-nav__item  header-nav__item--is-child  d-mobile  d-desktop ']")
    private WebElement carrer;
    @FindBy(xpath = "//*[@class='site-logo entered lazyloaded']")
    private WebElement move;

    public OptimoveNew carrers() {
        scroll(4400);
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(move).perform();
        sleep(5);
        return this;
    }
}








