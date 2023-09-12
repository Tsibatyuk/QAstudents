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

    public OptimoveNew howerOverCompany() {
        WebElement companyElement = DriverPoll.getDriver().findElement(By.xpath("//*[text()='Company']"));
        Actions action = new Actions(DriverPoll.getDriver());
        action.moveToElement(company.get(3)).perform();
        return this;
    }

    public OptimoveNew clikcareers() {
        click(her23);
        sleep(3);
        return this;
    }



@FindBy(xpath = "//*[@id='hubspot-conversations-iframe']")
    private WebElement frame;
@FindBy(xpath = "//div[@class='VizExIcon__IconWrapper-sc-1qu9za0-0 kximul']")
private WebElement close;
    public OptimoveNew iframedroch(){
        sleep(3);
        DriverPoll.getDriver().switchTo().frame(frame);
        click(close);
        DriverPoll.getDriver().switchTo().defaultContent();
        return this;
    }

    public OptimoveNew ckrol3(){
        scroll(4200);
       sleep(5);
        return  this;

}
@FindBy(xpath = "//div[@class='selectric-wrapper']")
    private WebElement all;
    public OptimoveNew allin(){
        click(all);
        return this;
    }
}





